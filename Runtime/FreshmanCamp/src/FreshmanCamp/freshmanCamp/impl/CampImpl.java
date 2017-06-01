/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.Camp;
import FreshmanCamp.freshmanCamp.Color;
import FreshmanCamp.freshmanCamp.Freshman;
import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.Senior;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getName <em>Name</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getDate <em>Date</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.CampImpl#getFreshman <em>Freshman</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CampImpl extends MinimalEObjectImpl.Container implements Camp {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColors() <em>Colors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColors()
	 * @generated
	 * @ordered
	 */
	protected EList colors;

	/**
	 * The cached value of the '{@link #getSeniors() <em>Seniors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeniors()
	 * @generated
	 * @ordered
	 */
	protected EList seniors;

	/**
	 * The cached value of the '{@link #getFreshman() <em>Freshman</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreshman()
	 * @generated
	 * @ordered
	 */
	protected EList freshman;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.CAMP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CAMP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CAMP__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.CAMP__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getColors() {
		if (colors == null) {
			colors = new EObjectContainmentEList(Color.class, this, FreshmanCampPackage.CAMP__COLORS);
		}
		return colors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSeniors() {
		if (seniors == null) {
			seniors = new EObjectContainmentEList(Senior.class, this, FreshmanCampPackage.CAMP__SENIORS);
		}
		return seniors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFreshman() {
		if (freshman == null) {
			freshman = new EObjectContainmentEList(Freshman.class, this, FreshmanCampPackage.CAMP__FRESHMAN);
		}
		return freshman;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.CAMP__COLORS:
				return ((InternalEList)getColors()).basicRemove(otherEnd, msgs);
			case FreshmanCampPackage.CAMP__SENIORS:
				return ((InternalEList)getSeniors()).basicRemove(otherEnd, msgs);
			case FreshmanCampPackage.CAMP__FRESHMAN:
				return ((InternalEList)getFreshman()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreshmanCampPackage.CAMP__NAME:
				return getName();
			case FreshmanCampPackage.CAMP__DATE:
				return getDate();
			case FreshmanCampPackage.CAMP__LOCATION:
				return getLocation();
			case FreshmanCampPackage.CAMP__COLORS:
				return getColors();
			case FreshmanCampPackage.CAMP__SENIORS:
				return getSeniors();
			case FreshmanCampPackage.CAMP__FRESHMAN:
				return getFreshman();
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
			case FreshmanCampPackage.CAMP__NAME:
				setName((String)newValue);
				return;
			case FreshmanCampPackage.CAMP__DATE:
				setDate((Date)newValue);
				return;
			case FreshmanCampPackage.CAMP__LOCATION:
				setLocation((String)newValue);
				return;
			case FreshmanCampPackage.CAMP__COLORS:
				getColors().clear();
				getColors().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.CAMP__SENIORS:
				getSeniors().clear();
				getSeniors().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.CAMP__FRESHMAN:
				getFreshman().clear();
				getFreshman().addAll((Collection)newValue);
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
			case FreshmanCampPackage.CAMP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FreshmanCampPackage.CAMP__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case FreshmanCampPackage.CAMP__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case FreshmanCampPackage.CAMP__COLORS:
				getColors().clear();
				return;
			case FreshmanCampPackage.CAMP__SENIORS:
				getSeniors().clear();
				return;
			case FreshmanCampPackage.CAMP__FRESHMAN:
				getFreshman().clear();
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
			case FreshmanCampPackage.CAMP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FreshmanCampPackage.CAMP__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case FreshmanCampPackage.CAMP__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case FreshmanCampPackage.CAMP__COLORS:
				return colors != null && !colors.isEmpty();
			case FreshmanCampPackage.CAMP__SENIORS:
				return seniors != null && !seniors.isEmpty();
			case FreshmanCampPackage.CAMP__FRESHMAN:
				return freshman != null && !freshman.isEmpty();
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
		result.append(", date: ");
		result.append(date);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //CampImpl
