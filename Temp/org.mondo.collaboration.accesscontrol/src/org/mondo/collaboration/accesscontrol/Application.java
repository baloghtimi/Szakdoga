package org.mondo.collaboration.accesscontrol;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

public class Application {
	public static void main(String[] args){
		ModelClass model = new ModelClass();
		EList<Asset> assets = model.assets;
		Iterator<Asset> iterator = assets.iterator();
		while(iterator.hasNext()){
			Asset asset = iterator.next();
			asset.WriteOut();
		}
	}
}
