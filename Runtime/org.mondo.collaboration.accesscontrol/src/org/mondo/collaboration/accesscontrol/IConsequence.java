package org.mondo.collaboration.accesscontrol;

import java.util.Set;

public interface IConsequence {

	public Set<Judgement> propagate(Judgement judgement); 
}
