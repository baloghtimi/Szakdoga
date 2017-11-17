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
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class DenyReadFromIDAttributeToContainerObject implements IConsequence{
	private DenyReadFromIDAttributeToContainerObject() {
	}
	
	public static IConsequence instance = new DenyReadFromIDAttributeToContainerObject();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof AttributeAsset && judgement.getAccess() == AccessibilityLevel.DENY && judgement.getOperation() == OperationType.READ){
			EAttribute attribute = ((AttributeAsset) judgement.getAsset()).getAttribute();
        	EObject object = ((AttributeAsset) judgement.getAsset()).getSource();
    		if(attribute.isID()){
    			ObjectAsset objAsset = new Asset.ObjectAsset(object);
    			consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset, judgement.getPriority(), judgement.getResolution()));
    		}
		}
		
		return consequences;
	}
}
