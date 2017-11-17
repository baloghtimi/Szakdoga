package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class FromAllowWriteToAllowRead implements IConsequence{
	
	private FromAllowWriteToAllowRead() {
	}
	
	public static IConsequence instance = new FromAllowWriteToAllowRead();


	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getOperation() == OperationType.WRITE && judgement.getAccess() == AccessibilityLevel.ALLOW){
			consequences.add(new Judgement(judgement.getAccess(), OperationType.READ, judgement.getAsset(),
					         judgement.getPriority(), judgement.getResolution()));
		}
		
		return consequences;
	}

}
