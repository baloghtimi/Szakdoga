package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.weak.FromObjectToAttributeWeakConsequence;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class FromDenyReadToDenyWrite implements IConsequence{
	
	private FromDenyReadToDenyWrite() {
	}
	
	public static IConsequence instance = new FromDenyReadToDenyWrite();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getOperation() == OperationType.READ) {
			if(judgement.getAccess() == AccessibilityLevel.DENY) {
				consequences.add(new Judgement(judgement.getAccess(), OperationType.WRITE, judgement.getAsset(),
				         judgement.getPriority(), judgement.getResolution()));
		    }
		}
		
		return consequences;
	}

}
