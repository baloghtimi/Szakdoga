package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.accesscontrol.Asset;
import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class AllowWriteFromIDAttributeToContainerReference implements IConsequence{
	private AllowWriteFromIDAttributeToContainerReference() {
	}
	
	public static IConsequence instance = new AllowWriteFromIDAttributeToContainerReference();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof AttributeAsset && judgement.getAccess() == AccessibilityLevel.ALLOW && judgement.getOperation() == OperationType.WRITE){
			EAttribute attribute = ((AttributeAsset) judgement.getAsset()).getAttribute();
        	EObject object = ((AttributeAsset) judgement.getAsset()).getSource();
    		if(attribute.isID() && object.eContainmentFeature() != null){
    			ReferenceAsset refAsset = new Asset.ReferenceAsset(object.eContainer(), object.eContainmentFeature(), object);
    			consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, judgement.getPriority(), judgement.getResolution()));
    		}
		}
		
		return consequences;
	}

}
