/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submited Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getTeacherid <em>Teacherid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getCouserid <em>Couserid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#isIfanswer <em>Ifanswer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getWhichcourse <em>Whichcourse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getWhichteacher <em>Whichteacher</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl#getWhichstudent <em>Whichstudent</em>}</li>
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
	 * The default value of the '{@link #getStudentid() <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentid()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentid() <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentid()
	 * @generated
	 * @ordered
	 */
	protected String studentid = STUDENTID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeacherid() <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacherid()
	 * @generated
	 * @ordered
	 */
	protected static final String TEACHERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeacherid() <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacherid()
	 * @generated
	 * @ordered
	 */
	protected String teacherid = TEACHERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCouserid() <em>Couserid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouserid()
	 * @generated
	 * @ordered
	 */
	protected static final String COUSERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouserid() <em>Couserid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouserid()
	 * @generated
	 * @ordered
	 */
	protected String couserid = COUSERID_EDEFAULT;

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
	 * The cached value of the '{@link #getWhichcourse() <em>Whichcourse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichcourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> whichcourse;

	/**
	 * The cached value of the '{@link #getWhichteacher() <em>Whichteacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichteacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher whichteacher;

	/**
	 * The cached value of the '{@link #getWhichstudent() <em>Whichstudent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichstudent()
	 * @generated
	 * @ordered
	 */
	protected Student whichstudent;

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
	public String getStudentid() {
		return studentid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentid(String newStudentid) {
		String oldStudentid = studentid;
		studentid = newStudentid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__STUDENTID, oldStudentid,
					studentid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeacherid() {
		return teacherid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacherid(String newTeacherid) {
		String oldTeacherid = teacherid;
		teacherid = newTeacherid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__TEACHERID, oldTeacherid,
					teacherid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouserid() {
		return couserid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouserid(String newCouserid) {
		String oldCouserid = couserid;
		couserid = newCouserid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__COUSERID, oldCouserid,
					couserid));
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
	public EList<Course> getWhichcourse() {
		if (whichcourse == null) {
			whichcourse = new EObjectResolvingEList<Course>(Course.class, this,
					Lab2Package.SUBMITED_PAPER__WHICHCOURSE);
		}
		return whichcourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getWhichteacher() {
		if (whichteacher != null && whichteacher.eIsProxy()) {
			InternalEObject oldWhichteacher = (InternalEObject) whichteacher;
			whichteacher = (Teacher) eResolveProxy(oldWhichteacher);
			if (whichteacher != oldWhichteacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.SUBMITED_PAPER__WHICHTEACHER,
							oldWhichteacher, whichteacher));
			}
		}
		return whichteacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetWhichteacher() {
		return whichteacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhichteacher(Teacher newWhichteacher) {
		Teacher oldWhichteacher = whichteacher;
		whichteacher = newWhichteacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__WHICHTEACHER,
					oldWhichteacher, whichteacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getWhichstudent() {
		if (whichstudent != null && whichstudent.eIsProxy()) {
			InternalEObject oldWhichstudent = (InternalEObject) whichstudent;
			whichstudent = (Student) eResolveProxy(oldWhichstudent);
			if (whichstudent != oldWhichstudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.SUBMITED_PAPER__WHICHSTUDENT,
							oldWhichstudent, whichstudent));
			}
		}
		return whichstudent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetWhichstudent() {
		return whichstudent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhichstudent(Student newWhichstudent) {
		Student oldWhichstudent = whichstudent;
		whichstudent = newWhichstudent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.SUBMITED_PAPER__WHICHSTUDENT,
					oldWhichstudent, whichstudent));
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
		case Lab2Package.SUBMITED_PAPER__STUDENTID:
			return getStudentid();
		case Lab2Package.SUBMITED_PAPER__TEACHERID:
			return getTeacherid();
		case Lab2Package.SUBMITED_PAPER__COUSERID:
			return getCouserid();
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			return isIfcorrect();
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			return isIfanswer();
		case Lab2Package.SUBMITED_PAPER__WHICHCOURSE:
			return getWhichcourse();
		case Lab2Package.SUBMITED_PAPER__WHICHTEACHER:
			if (resolve)
				return getWhichteacher();
			return basicGetWhichteacher();
		case Lab2Package.SUBMITED_PAPER__WHICHSTUDENT:
			if (resolve)
				return getWhichstudent();
			return basicGetWhichstudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab2Package.SUBMITED_PAPER__ID:
			setId((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__STUDENTID:
			setStudentid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__TEACHERID:
			setTeacherid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__COUSERID:
			setCouserid((String) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			setIfcorrect((Boolean) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			setIfanswer((Boolean) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHCOURSE:
			getWhichcourse().clear();
			getWhichcourse().addAll((Collection<? extends Course>) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHTEACHER:
			setWhichteacher((Teacher) newValue);
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHSTUDENT:
			setWhichstudent((Student) newValue);
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
		case Lab2Package.SUBMITED_PAPER__STUDENTID:
			setStudentid(STUDENTID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__TEACHERID:
			setTeacherid(TEACHERID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__COUSERID:
			setCouserid(COUSERID_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			setIfcorrect(IFCORRECT_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			setIfanswer(IFANSWER_EDEFAULT);
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHCOURSE:
			getWhichcourse().clear();
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHTEACHER:
			setWhichteacher((Teacher) null);
			return;
		case Lab2Package.SUBMITED_PAPER__WHICHSTUDENT:
			setWhichstudent((Student) null);
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
		case Lab2Package.SUBMITED_PAPER__STUDENTID:
			return STUDENTID_EDEFAULT == null ? studentid != null : !STUDENTID_EDEFAULT.equals(studentid);
		case Lab2Package.SUBMITED_PAPER__TEACHERID:
			return TEACHERID_EDEFAULT == null ? teacherid != null : !TEACHERID_EDEFAULT.equals(teacherid);
		case Lab2Package.SUBMITED_PAPER__COUSERID:
			return COUSERID_EDEFAULT == null ? couserid != null : !COUSERID_EDEFAULT.equals(couserid);
		case Lab2Package.SUBMITED_PAPER__IFCORRECT:
			return ifcorrect != IFCORRECT_EDEFAULT;
		case Lab2Package.SUBMITED_PAPER__IFANSWER:
			return ifanswer != IFANSWER_EDEFAULT;
		case Lab2Package.SUBMITED_PAPER__WHICHCOURSE:
			return whichcourse != null && !whichcourse.isEmpty();
		case Lab2Package.SUBMITED_PAPER__WHICHTEACHER:
			return whichteacher != null;
		case Lab2Package.SUBMITED_PAPER__WHICHSTUDENT:
			return whichstudent != null;
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
		result.append(", studentid: ");
		result.append(studentid);
		result.append(", teacherid: ");
		result.append(teacherid);
		result.append(", couserid: ");
		result.append(couserid);
		result.append(", ifcorrect: ");
		result.append(ifcorrect);
		result.append(", ifanswer: ");
		result.append(ifanswer);
		result.append(')');
		return result.toString();
	}

} //SubmitedPaperImpl
