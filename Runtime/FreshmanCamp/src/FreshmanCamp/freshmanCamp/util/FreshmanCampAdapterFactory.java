/**
 */
package FreshmanCamp.freshmanCamp.util;

import FreshmanCamp.freshmanCamp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage
 * @generated
 */
public class FreshmanCampAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FreshmanCampPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshmanCampAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FreshmanCampPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreshmanCampSwitch modelSwitch =
		new FreshmanCampSwitch() {
			public Object caseCamp(Camp object) {
				return createCampAdapter();
			}
			public Object caseColor(Color object) {
				return createColorAdapter();
			}
			public Object caseCard(Card object) {
				return createCardAdapter();
			}
			public Object caseRoom(Room object) {
				return createRoomAdapter();
			}
			public Object caseFreshman(Freshman object) {
				return createFreshmanAdapter();
			}
			public Object caseSenior(Senior object) {
				return createSeniorAdapter();
			}
			public Object caseRoomSenior(RoomSenior object) {
				return createRoomSeniorAdapter();
			}
			public Object caseCardSenior(CardSenior object) {
				return createCardSeniorAdapter();
			}
			public Object caseColorSenior(ColorSenior object) {
				return createColorSeniorAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Camp <em>Camp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Camp
	 * @generated
	 */
	public Adapter createCampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Color
	 * @generated
	 */
	public Adapter createColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Freshman <em>Freshman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Freshman
	 * @generated
	 */
	public Adapter createFreshmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.Senior <em>Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.Senior
	 * @generated
	 */
	public Adapter createSeniorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.RoomSenior <em>Room Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.RoomSenior
	 * @generated
	 */
	public Adapter createRoomSeniorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.CardSenior <em>Card Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.CardSenior
	 * @generated
	 */
	public Adapter createCardSeniorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FreshmanCamp.freshmanCamp.ColorSenior <em>Color Senior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FreshmanCamp.freshmanCamp.ColorSenior
	 * @generated
	 */
	public Adapter createColorSeniorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FreshmanCampAdapterFactory
