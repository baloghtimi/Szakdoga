/*
 * generated by Xtext 2.10.0
 */
package org.xtext.policy.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.policy.ui.internal.PolicyActivator;

public class RulesUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PolicyActivator.getInstance().getInjector("org.xtext.policy.Rules");
	}

}
