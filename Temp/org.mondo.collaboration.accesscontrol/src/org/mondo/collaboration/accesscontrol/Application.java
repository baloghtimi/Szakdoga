package org.mondo.collaboration.accesscontrol;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromAttributeToContainerObject;
import org.mondo.collaboration.accesscontrol.strong.ObfuscateReadFromObjectToAttribute;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromObjectToContainer;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromObjectToIDAttribute;
import org.mondo.collaboration.accesscontrol.strong.AllowReadFromReferenceToSourceTargetObject;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromIDAttributeToContainerReference;
import org.mondo.collaboration.accesscontrol.strong.AllowWriteFromObjectToContainerReference;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromContainmentReferenceToChildrenObject;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromIDAttributeToContainerObject;
import org.mondo.collaboration.accesscontrol.strong.DenyReadFromObjectToReference;
import org.mondo.collaboration.accesscontrol.strong.DenyWriteFromContainerReferenceToChildrenIDAttribute;
import org.mondo.collaboration.accesscontrol.strong.FromAllowWriteToAllowRead;
import org.mondo.collaboration.accesscontrol.strong.FromDenyReadToDenyWrite;
import org.mondo.collaboration.accesscontrol.strong.FromObfuscateReadToDenyWrite;
import org.mondo.collaboration.accesscontrol.weak.FromObjectToAttributeWeakConsequence;
import org.mondo.collaboration.accesscontrol.weak.FromObjectToReferenceWeakConsequence;
import org.mondo.collaboration.policy.rules.Role;
import org.mondo.collaboration.policy.rules.User;

import com.google.common.collect.Sets;

public class Application {
	
	public static Set<IConsequence> defaultWeak = Sets.newHashSet(FromObjectToAttributeWeakConsequence.instance,
			                                                      FromObjectToReferenceWeakConsequence.instance);
	public static Set<IConsequence> defaultStrong = Sets.newHashSet(FromAllowWriteToAllowRead.instance,
			                                                        FromDenyReadToDenyWrite.instance,
			                                                        FromObfuscateReadToDenyWrite.instance,
			                                                        AllowReadFromAttributeToContainerObject.instance,
			                                                        ObfuscateReadFromObjectToAttribute.instance,
			                                                        AllowReadFromObjectToContainer.instance,
			                                                        AllowReadFromObjectToIDAttribute.instance,
			                                                        AllowReadFromReferenceToSourceTargetObject.instance,
			                                                        AllowWriteFromIDAttributeToContainerReference.instance,
			                                                        AllowWriteFromObjectToContainerReference.instance,
			                                                        DenyReadFromContainmentReferenceToChildrenObject.instance,
			                                                        DenyReadFromObjectToReference.instance,
			                                                        DenyWriteFromContainerReferenceToChildrenIDAttribute.instance,
			                                                        AllowWriteFromContainmentReferenceToChildrenObject.instance,
			                                                        DenyReadFromIDAttributeToContainerObject.instance
																	);
	
	public static void main(String[] args){
		ModelClass model = new ModelClass();
		RuleManager ruleManager = new RuleManager(defaultWeak, defaultStrong);
		Set<Judgement> judgementList = new HashSet<Judgement>();
		
		List<Role> roleList = model.getRuleModel().getRoles();
		for (Role role : roleList) {
			if(role instanceof User){
				try {
					judgementList = ruleManager.getEffectivePermissions(model.getModelResource(), model.getRuleModel(), (User) role);
					
					System.out.println("\n" + role + ": " + judgementList.size() + " judgements");
					
					TreeIterator<EObject> allContents = model.getModelResource().getAllContents();
					while(allContents.hasNext()){
						EObject object = allContents.next();
						System.out.println(new Asset.ObjectAsset(object) + ": ");
						for(Judgement j : judgementList){
							if(j.getAsset().equals(new Asset.ObjectAsset(object))){
								System.out.println(j);
							}
						}
					}
					
//					for(Judgement judgement : judgementList){
//						System.out.println(judgement);
//					}
					
				} catch (ViatraQueryException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
