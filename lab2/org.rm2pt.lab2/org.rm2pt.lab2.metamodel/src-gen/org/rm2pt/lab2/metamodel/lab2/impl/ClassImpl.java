/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getStudentnum <em>Studentnum</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getMeanscore <em>Meanscore</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements org.rm2pt.lab2.metamodel.lab2.Class {
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
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

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
	 * The default value of the '{@link #getMeanscore() <em>Meanscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanscore()
	 * @generated
	 * @ordered
	 */
	protected static final float MEANSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMeanscore() <em>Meanscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanscore()
	 * @generated
	 * @ordered
	 */
	protected float meanscore = MEANSCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.CLASS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrade(String newGrade) {
		String oldGrade = grade;
		grade = newGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.CLASS__GRADE, oldGrade, grade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.CLASS__STUDENTNUM, oldStudentnum,
					studentnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMeanscore() {
		return meanscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanscore(float newMeanscore) {
		float oldMeanscore = meanscore;
		meanscore = newMeanscore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.CLASS__MEANSCORE, oldMeanscore,
					meanscore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this, Lab2Package.CLASS__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeacher() {
		if (teacher == null) {
			teacher = new EObjectContainmentEList<Teacher>(Teacher.class, this, Lab2Package.CLASS__TEACHER);
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab2Package.CLASS__STUDENT:
			return ((InternalEList<?>) getStudent()).basicRemove(otherEnd, msgs);
		case Lab2Package.CLASS__TEACHER:
			return ((InternalEList<?>) getTeacher()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.CLASS__ID:
			return getId();
		case Lab2Package.CLASS__GRADE:
			return getGrade();
		case Lab2Package.CLASS__STUDENTNUM:
			return getStudentnum();
		case Lab2Package.CLASS__MEANSCORE:
			return getMeanscore();
		case Lab2Package.CLASS__STUDENT:
			return getStudent();
		case Lab2Package.CLASS__TEACHER:
			return getTeacher();
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
		case Lab2Package.CLASS__ID:
			setId((String) newValue);
			return;
		case Lab2Package.CLASS__GRADE:
			setGrade((String) newValue);
			return;
		case Lab2Package.CLASS__STUDENTNUM:
			setStudentnum((Integer) newValue);
			return;
		case Lab2Package.CLASS__MEANSCORE:
			setMeanscore((Float) newValue);
			return;
		case Lab2Package.CLASS__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Student>) newValue);
			return;
		case Lab2Package.CLASS__TEACHER:
			getTeacher().clear();
			getTeacher().addAll((Collection<? extends Teacher>) newValue);
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
		case Lab2Package.CLASS__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.CLASS__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case Lab2Package.CLASS__STUDENTNUM:
			setStudentnum(STUDENTNUM_EDEFAULT);
			return;
		case Lab2Package.CLASS__MEANSCORE:
			setMeanscore(MEANSCORE_EDEFAULT);
			return;
		case Lab2Package.CLASS__STUDENT:
			getStudent().clear();
			return;
		case Lab2Package.CLASS__TEACHER:
			getTeacher().clear();
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
		case Lab2Package.CLASS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.CLASS__GRADE:
			return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
		case Lab2Package.CLASS__STUDENTNUM:
			return studentnum != STUDENTNUM_EDEFAULT;
		case Lab2Package.CLASS__MEANSCORE:
			return meanscore != MEANSCORE_EDEFAULT;
		case Lab2Package.CLASS__STUDENT:
			return student != null && !student.isEmpty();
		case Lab2Package.CLASS__TEACHER:
			return teacher != null && !teacher.isEmpty();
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
		result.append(", grade: ");
		result.append(grade);
		result.append(", studentnum: ");
		result.append(studentnum);
		result.append(", meanscore: ");
		result.append(meanscore);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
