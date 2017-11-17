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

public class DenyWriteFromContainerReferenceToChildrenIDAttribute implements IConsequence{
	private DenyWriteFromContainerReferenceToChildrenIDAttribute() {
	}
	
	public static IConsequence instance = new DenyWriteFromContainerReferenceToChildrenIDAttribute();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();
		
		if(judgement.getAsset() instanceof ReferenceAsset && judgement.getAccess() == AccessibilityLevel.DENY && judgement.getOperation() == OperationType.WRITE){
		    EObject object = ((ReferenceAsset)judgement.getAsset()).getTarget();
		    EList<EAttribute> eAllAttributes = object.eClass().getEAllAttributes();
	        for (EAttribute eAttribute : eAllAttributes) {
	    	    if(eAttribute.isID()){
	    		    AttributeAsset attrAsset = new Asset.AttributeAsset(object, eAttribute);
				    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), attrAsset, judgement.getPriority(), judgement.getResolution()));
	    	    }
	        }
		}
	    return consequences;
	}

}
