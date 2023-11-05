/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl#getStudentnum <em>Studentnum</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl#getCoursemean <em>Coursemean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
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
	 * The default value of the '{@link #getStudentnum() <em>Studentnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentnum()
	 * @generated
	 * @ordered
	 */
	protected static final int STUDENTNUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStudentnum() <em>Studentnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentnum()
	 * @generated
	 * @ordered
	 */
	protected int studentnum = STUDENTNUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoursemean() <em>Coursemean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursemean()
	 * @generated
	 * @ordered
	 */
	protected static final float COURSEMEAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoursemean() <em>Coursemean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursemean()
	 * @generated
	 * @ordered
	 */
	protected float coursemean = COURSEMEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.COURSE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStudentnum() {
		return studentnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentnum(int newStudentnum) {
		int oldStudentnum = studentnum;
		studentnum = newStudentnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.COURSE__STUDENTNUM, oldStudentnum,
					studentnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoursemean() {
		return coursemean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoursemean(float newCoursemean) {
		float oldCoursemean = coursemean;
		coursemean = newCoursemean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.COURSE__COURSEMEAN, oldCoursemean,
					coursemean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.COURSE__ID:
			return getId();
		case Lab2Package.COURSE__NAME:
			return getName();
		case Lab2Package.COURSE__STUDENTNUM:
			return getStudentnum();
		case Lab2Package.COURSE__COURSEMEAN:
			return getCoursemean();
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
		case Lab2Package.COURSE__ID:
			setId((String) newValue);
			return;
		case Lab2Package.COURSE__NAME:
			setName((String) newValue);
			return;
		case Lab2Package.COURSE__STUDENTNUM:
			setStudentnum((Integer) newValue);
			return;
		case Lab2Package.COURSE__COURSEMEAN:
			setCoursemean((Float) newValue);
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
		case Lab2Package.COURSE__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab2Package.COURSE__STUDENTNUM:
			setStudentnum(STUDENTNUM_EDEFAULT);
			return;
		case Lab2Package.COURSE__COURSEMEAN:
			setCoursemean(COURSEMEAN_EDEFAULT);
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
		case Lab2Package.COURSE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab2Package.COURSE__STUDENTNUM:
			return studentnum != STUDENTNUM_EDEFAULT;
		case Lab2Package.COURSE__COURSEMEAN:
			return coursemean != COURSEMEAN_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(", studentnum: ");
		result.append(studentnum);
		result.append(", coursemean: ");
		result.append(coursemean);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
