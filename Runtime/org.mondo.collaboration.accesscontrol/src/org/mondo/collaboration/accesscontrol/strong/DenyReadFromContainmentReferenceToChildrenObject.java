package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
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

public class DenyReadFromContainmentReferenceToChildrenObject implements IConsequence{
	private DenyReadFromContainmentReferenceToChildrenObject() {
	}
	
	public static IConsequence instance = new DenyReadFromContainmentReferenceToChildrenObject();
	
	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ReferenceAsset) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				if(judgement.getOperation() == OperationType.READ) {
					EObject source = ((ReferenceAsset) judgement.getAsset()).getSource();
					EReference reference = ((ReferenceAsset) judgement.getAsset()).getReference();
					if(reference.isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> targets = (EList<EObject>) source.eGet(reference);
						for (EObject target : targets) {
							ObjectAsset objAsset = new Asset.ObjectAsset(target);
							consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), objAsset, judgement.getPriority(), judgement.getResolution()));
						}
					}
			    }
		    }
		}
		
		return consequences;
	}

}
