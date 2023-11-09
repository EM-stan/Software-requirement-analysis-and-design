/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submited Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getStuid <em>Stuid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getTeaid <em>Teaid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getCourseid <em>Courseid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl#isIfanswer <em>Ifanswer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmitedPaperImpl extends MinimalEObjectImpl.Container implements SubmitedPaper {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStuid() <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuid()
	 * @generated
	 * @ordered
	 */
	protected static final String STUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStuid() <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuid()
	 * @generated
	 * @ordered
	 */
	protected String stuid = STUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeaid() <em>Teaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeaid()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeaid() <em>Teaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeaid()
	 * @generated
	 * @ordered
	 */
	protected String teaid = TEAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseid() <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseid()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseid() <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseid()
	 * @generated
	 * @ordered
	 */
	protected String courseid = COURSEID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIfcorrect() <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfcorrect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IFCORRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIfcorrect() <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfcorrect()
	 * @generated
	 * @ordered
	 */
	protected boolean ifcorrect = IFCORRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIfanswer() <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfanswer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IFANSWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIfanswer() <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfanswer()
	 * @generated
	 * @ordered
	 */
	protected boolean ifanswer = IFANSWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmitedPaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.SUBMITED_PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStuid() {
		return stuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStuid(String newStuid) {
		String oldStuid = stuid;
		stuid = newStuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__STUID, oldStuid, stuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeaid() {
		return teaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeaid(String newTeaid) {
		String oldTeaid = teaid;
		teaid = newTeaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__TEAID, oldTeaid, teaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseid() {
		return courseid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseid(String newCourseid) {
		String oldCourseid = courseid;
		courseid = newCourseid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__COURSEID, oldCourseid,
					courseid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIfcorrect() {
		return ifcorrect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcorrect(boolean newIfcorrect) {
		boolean oldIfcorrect = ifcorrect;
		ifcorrect = newIfcorrect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__IFCORRECT, oldIfcorrect,
					ifcorrect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIfanswer() {
		return ifanswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfanswer(boolean newIfanswer) {
		boolean oldIfanswer = ifanswer;
		ifanswer = newIfanswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__IFANSWER, oldIfanswer,
					ifanswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.SUBMITED_PAPER__ID:
			return getId();
		case Lab2Package.SUBMITED_PAPER__STUID:
			return getStuid();
		case Lab2Package.SUBMITED_PAPER__TEAID:
			return getTeaid();
		case Lab2Package.SUBMITED_PAPER__COURSEID:
			return getCourseid();
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			return isIfcorrect();
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			return isIfanswer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab2Package.SUBMITED_PAPER__ID:
			setId((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__STUID:
			setStuid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__TEAID:
			setTeaid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__COURSEID:
			setCourseid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			setIfcorrect((Boolean) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			setIfanswer((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Lab2Package.SUBMITED_PAPER__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__STUID:
			setStuid(STUID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__TEAID:
			setTeaid(TEAID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__COURSEID:
			setCourseid(COURSEID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			setIfcorrect(IFCORRECT_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			setIfanswer(IFANSWER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Lab2Package.SUBMITED_PAPER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.SUBMITED_PAPER__STUID:
			return STUID_EDEFAULT == null ? stuid != null : !STUID_EDEFAULT.equals(stuid);
		case Lab2Package.SUBMITED_PAPER__TEAID:
			return TEAID_EDEFAULT == null ? teaid != null : !TEAID_EDEFAULT.equals(teaid);
		case Lab2Package.SUBMITED_PAPER__COURSEID:
			return COURSEID_EDEFAULT == null ? courseid != null : !COURSEID_EDEFAULT.equals(courseid);
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			return ifcorrect != IFCORRECT_EDEFAULT;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			return ifanswer != IFANSWER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", stuid: ");
		result.append(stuid);
		result.append(", teaid: ");
		result.append(teaid);
		result.append(", courseid: ");
		result.append(courseid);
		result.append(", ifcorrect: ");
		result.append(ifcorrect);
		result.append(", ifanswer: ");
		result.append(ifanswer);
		result.append(')');
		return result.toString();
	}

} //SubmitedPaperImpl
