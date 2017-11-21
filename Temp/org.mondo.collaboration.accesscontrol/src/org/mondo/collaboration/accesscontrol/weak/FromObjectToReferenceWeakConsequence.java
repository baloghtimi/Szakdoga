package org.mondo.collaboration.accesscontrol.weak;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.mondo.collaboration.accesscontrol.Asset;
import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.accesscontrol.Asset.ReferenceAsset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;

import com.google.common.collect.Sets;

public class FromObjectToReferenceWeakConsequence implements IConsequence {
	private FromObjectToReferenceWeakConsequence() {
	}
	
	public static IConsequence instance = new FromObjectToReferenceWeakConsequence();
	
	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ObjectAsset) {
			if(judgement.getAccess() != AccessibilityLevel.OBFUSCATE) {
				EObject source = ((ObjectAsset)judgement.getAsset()).getObject();
			    EList<EReference> eReferences = source.eClass().getEAllReferences();
			    for (EReference reference : eReferences) {
				    if(reference.isMany()) {
					    @SuppressWarnings("unchecked")
					    EList<EObject> targets = (EList<EObject>) source.eGet(reference);
					    for (EObject target : targets) {
						    ReferenceAsset refAsset = new Asset.ReferenceAsset(source, reference, target);
						    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, 0, judgement.getResolution()));
					    }
				    } else {
					    EObject target = (EObject) source.eGet(reference);
					    if(target != null){
					        ReferenceAsset refAsset = new Asset.ReferenceAsset(source, reference, target);
					        consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), refAsset, 0, judgement.getResolution()));
					    }
				    }
			    }
		    }
		}
		
		return consequences;
	}
}
