package org.mondo.collaboration.accesscontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromAttributeToContainerObject;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromObjectToContainer;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromObjectToIDAttribute;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromReferenceToSourceTargetObject;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromIDAttributeToContainerReference;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromObjectToContainerReference;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromIDAttributeToContainerObject;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromObjectToReference;
import org.mondo.collaboration.accesscontrol.strong.DenyWriteFromContainerReferenceToChildrenIDAttribute;
import org.mondo.collaboration.accesscontrol.strong.FromAllowWriteToAllowRead;
import org.mondo.collaboration.accesscontrol.strong.FromDenyReadToDenyWrite;
import org.mondo.collaboration.accesscontrol.strong.FromObfuscateReadToDenyWrite;
import org.mondo.collaboration.accesscontrol.strong.ObfuscateReadFromObjectToAttribute;
import org.mondo.collaboration.accesscontrol.weak.FromObjectToAttributeWeakConsequence;
import org.mondo.collaboration.accesscontrol.weak.FromObjectToReferenceWeakConsequence;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class Application {
	private static Logger LOGGER = Logger.getLogger(Application.class);

	public static Set<IConsequence> weakConsequences = Sets.newHashSet(
	    FromObjectToAttributeWeakConsequence.instance,
	    FromObjectToReferenceWeakConsequence.instance
	);
	public static Set<IConsequence> strongConsequences = Sets.newHashSet(
	    FromAllowWriteToAllowRead.instance,
	    FromDenyReadToDenyWrite.instance,
	    FromObfuscateReadToDenyWrite.instance,
	    ObfuscateReadFromObjectToAttribute.instance,
		AllowReadFromObjectToContainer.instance,
		AllowReadFromObjectToIDAttribute.instance,
		AllowWriteFromObjectToContainerReference.instance,
		DenyReadFromObjectToReference.instance,
		AllowReadFromReferenceToSourceTargetObject.instance,
		DenyReadFromContainmentReferenceToChildrenObject.instance,
		DenyWriteFromContainerReferenceToChildrenIDAttribute.instance,
		AllowWriteFromContainmentReferenceToChildrenObject.instance,
		AllowReadFromAttributeToContainerObject.instance,
	    AllowWriteFromIDAttributeToContainerReference.instance,
	    DenyReadFromIDAttributeToContainerObject.instance
	);

	public static void main(String[] args) throws ViatraQueryException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        ModelClass modelClass = new ModelClass();
		RuleManager ruleManager = new RuleManager(weakConsequences, strongConsequences);
		ruleManager.initializeWithRulesOnModel(modelClass.getModelResource(), modelClass.getRuleModel());

        // PrincipalEngineer: 0, SubsystemManager: 1, IOManager: 2
		List<Judgement> judgementList = ruleManager
				.getEffectivePermissions((User) modelClass.getRuleModel().getRoles().get(2));

		LOGGER.info(String.format("Number of effective judgements: %d", judgementList.size()));
		
		writeOutJudgements(modelClass.getModelResource(), judgementList);

	}
	
	public static void writeOutJudgements(Resource model, List<Judgement> judgementList) {
		Multimap<Asset, Judgement> judgementMultimap = ArrayListMultimap.create();
		for (Judgement judgement : judgementList) {
			judgementMultimap.put(judgement.getAsset(), judgement);
		}
		
		Set<Asset> keySet = judgementMultimap.keySet();
		for (Asset asset : keySet) {
			Collection<Judgement> collection = judgementMultimap.get(asset);
			System.out.println("\n" + asset);
			for (Judgement judgement : collection) {
				System.out.println(judgement);
			}
		}
	}
}
