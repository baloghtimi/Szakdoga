package org.mondo.collaboration.policy;

import org.mondo.collaboration.policy.rules.*;

public class Application {
	public static void main(String[] args){
		ModelClass model = new ModelClass();
		Role role = model.getRoleByName("Nur");
		ObjectFact obj = model.getObjectFact();
		System.out.println(model.canModify(role, obj));
	}
}
