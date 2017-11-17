package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.accesscontrol.Asset;
import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class AllowReadFromObjectToContainer implements IConsequence{
	
	private AllowReadFromObjectToContainer() {
	}
	
	public static IConsequence instance = new AllowReadFromObjectToContainer();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ObjectAsset && judgement.getAccess() == AccessibilityLevel.ALLOW && judgement.getOperation() == OperationType.READ){
			EObject object = ((ObjectAsset) judgement.getAsset()).getObject();
			if(object.eContainer() != null) {
				ObjectAsset objAsset = new Asset.ObjectAsset(object.eContainer());
			    consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), objAsset, judgement.getPriority(), judgement.getResolution()));
			    ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(), object.eContainmentFeature(), object);
			    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority(), judgement.getResolution()));
			}
		}
		
		return consequences;
	}

}
