package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.accesscontrol.Asset;
import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class AllowReadFromReferenceToSourceTargetObject implements IConsequence{
	private AllowReadFromReferenceToSourceTargetObject() {
	}
	
	public static IConsequence instance = new AllowReadFromReferenceToSourceTargetObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ReferenceAsset && judgement.getAccess() == AccessibilityLevel.ALLOW && judgement.getOperation() == OperationType.READ){
			EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
        	EObject target= ((ReferenceAsset) judgement.getAsset()).getTarget();
        	consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), new Asset.ObjectAsset(source), judgement.getPriority(), judgement.getResolution()));
        	consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), new Asset.ObjectAsset(target), judgement.getPriority(), judgement.getResolution()));
		}
		
		return consequences;
	}

}
