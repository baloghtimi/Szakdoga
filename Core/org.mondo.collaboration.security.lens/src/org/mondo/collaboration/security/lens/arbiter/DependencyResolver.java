package org.mondo.collaboration.security.lens.arbiter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.policy.rules.Policy;
import org.mondo.collaboration.policy.rules.ResolutionType;
import org.mondo.collaboration.policy.rules.Rule;
import org.mondo.collaboration.security.lens.arbiter.SecurityArbiter.RuleConflictResolver;

public class DependencyResolver implements RuleConflictResolver {

	@Override
	public int compare(SecurityRuleJudgement arg0, SecurityRuleJudgement arg1) {
		int x = arg0.getRule().getPriority() - arg1.getRule().getPriority();
		if(x != 0){
			return x;
		}
		
		Policy policy = (Policy) arg0.getRule().eContainer();
		ResolutionType resolution = policy.getResolution();
		
		//if(arg0.getRule().getConstraint().getAccess().)
		return 0;
	}

}
