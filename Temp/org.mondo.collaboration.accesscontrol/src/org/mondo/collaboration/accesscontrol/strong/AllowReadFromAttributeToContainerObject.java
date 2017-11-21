package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

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

public class AllowReadFromAttributeToContainerObject implements IConsequence{
	private AllowReadFromAttributeToContainerObject() {
	}
	
	public static IConsequence instance = new AllowReadFromAttributeToContainerObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof AttributeAsset){
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if(judgement.getOperation() == OperationType.READ) {
					ObjectAsset objAsset = new Asset.ObjectAsset(((AttributeAsset) judgement.getAsset()).getSource());
					consequences.add(new Judgement(AccessibilityLevel.OBFUSCATE, judgement.getOperation(), objAsset, judgement.getPriority(), judgement.getResolution()));
			    }
		    }
		}
		
		return consequences;
	}

}
