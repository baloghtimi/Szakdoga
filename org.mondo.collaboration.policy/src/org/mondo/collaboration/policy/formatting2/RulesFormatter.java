package org.mondo.collaboration.policy.formatting2;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;

public class RulesFormatter extends AbstractDeclarativeFormatter {
	
	@Override
    protected void configureFormatting(FormattingConfig c){
		RulesGrammarAccess g = (RulesGrammarAccess) getGrammarAccess();
		
		c.setLinewrap().before(g.getRuleAccess().getRuleKeyword_0());
		
		c.setLinewrap(1).after(g.getRuleAccess().getLeftCurlyBracketKeyword_7());
		
		//c.setLinewrap(1).after(g.getRuleAccess().getQueryAssignment_10());
		
		//c.setLinewrap(1).after(g.getRuleAccess().getAssetAssignment_12());
		
		//c.setLinewrap(1).after(g.getRuleAccess().getBindingsAssignment_13());
		
		c.setLinewrap(1).after(g.getRuleAccess().getPriorityKeyword_15_2());
	}
}
