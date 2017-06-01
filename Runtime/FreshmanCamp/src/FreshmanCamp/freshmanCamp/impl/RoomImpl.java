/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.Freshman;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.Room;
import FreshmanCamp.freshmanCamp.RoomSenior;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.RoomImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.RoomImpl#getRoomsenior <em>Roomsenior</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.RoomImpl#getFreshmen <em>Freshmen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomsenior() <em>Roomsenior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomsenior()
	 * @generated
	 * @ordered
	 */
	protected RoomSenior roomsenior;

	/**
	 * The cached value of the '{@link #getFreshmen() <em>Freshmen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreshmen()
	 * @generated
	 * @ordered
	 */
	protected EList freshmen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.ROOM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomSenior getRoomsenior() {
		if (roomsenior != null && roomsenior.eIsProxy()) {
			InternalEObject oldRoomsenior = (InternalEObject)roomsenior;
			roomsenior = (RoomSenior)eResolveProxy(oldRoomsenior);
			if (roomsenior != oldRoomsenior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.ROOM__ROOMSENIOR, oldRoomsenior, roomsenior));
			}
		}
		return roomsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomSenior basicGetRoomsenior() {
		return roomsenior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomsenior(RoomSenior newRoomsenior) {
		RoomSenior oldRoomsenior = roomsenior;
		roomsenior = newRoomsenior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.ROOM__ROOMSENIOR, oldRoomsenior, roomsenior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFreshmen() {
		if (freshmen == null) {
			freshmen = new EObjectResolvingEList(Freshman.class, this, FreshmanCampPackage.ROOM__FRESHMEN);
		}
		return freshmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM__NAME:
				return getName();
			case FreshmanCampPackage.ROOM__ROOMSENIOR:
				if (resolve) return getRoomsenior();
				return basicGetRoomsenior();
			case FreshmanCampPackage.ROOM__FRESHMEN:
				return getFreshmen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM__NAME:
				setName((String)newValue);
				return;
			case FreshmanCampPackage.ROOM__ROOMSENIOR:
				setRoomsenior((RoomSenior)newValue);
				return;
			case FreshmanCampPackage.ROOM__FRESHMEN:
				getFreshmen().clear();
				getFreshmen().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreshmanCampPackage.ROOM__ROOMSENIOR:
				setRoomsenior((RoomSenior)null);
				return;
			case FreshmanCampPackage.ROOM__FRESHMEN:
				getFreshmen().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.ROOM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreshmanCampPackage.ROOM__ROOMSENIOR:
				return roomsenior != null;
			case FreshmanCampPackage.ROOM__FRESHMEN:
				return freshmen != null && !freshmen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
