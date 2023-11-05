/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.Teacher;
import org.rm2pt.lab2.metamodel.lab2.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher teacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getStudent() {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject) student;
			student = (Student) eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.USER__STUDENT, oldStudent,
							student));
			}
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudent(Student newStudent) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__STUDENT, oldStudent, student));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getTeacher() {
		if (teacher != null && teacher.eIsProxy()) {
			InternalEObject oldTeacher = (InternalEObject) teacher;
			teacher = (Teacher) eResolveProxy(oldTeacher);
			if (teacher != oldTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.USER__TEACHER, oldTeacher,
							teacher));
			}
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetTeacher() {
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacher(Teacher newTeacher) {
		Teacher oldTeacher = teacher;
		teacher = newTeacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.USER__TEACHER, oldTeacher, teacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.USER__ID:
			return getId();
		case Lab2Package.USER__NAME:
			return getName();
		case Lab2Package.USER__CLASS:
			return getClass_();
		case Lab2Package.USER__PASSWORD:
			return getPassword();
		case Lab2Package.USER__STUDENT:
			if (resolve)
				return getStudent();
			return basicGetStudent();
		case Lab2Package.USER__TEACHER:
			if (resolve)
				return getTeacher();
			return basicGetTeacher();
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
		case Lab2Package.USER__ID:
			setId((String) newValue);
			return;
		case Lab2Package.USER__NAME:
			setName((String) newValue);
			return;
		case Lab2Package.USER__CLASS:
			setClass((String) newValue);
			return;
		case Lab2Package.USER__PASSWORD:
			setPassword((String) newValue);
			return;
		case Lab2Package.USER__STUDENT:
			setStudent((Student) newValue);
			return;
		case Lab2Package.USER__TEACHER:
			setTeacher((Teacher) newValue);
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
		case Lab2Package.USER__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.USER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab2Package.USER__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case Lab2Package.USER__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case Lab2Package.USER__STUDENT:
			setStudent((Student) null);
			return;
		case Lab2Package.USER__TEACHER:
			setTeacher((Teacher) null);
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
		case Lab2Package.USER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.USER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab2Package.USER__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case Lab2Package.USER__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case Lab2Package.USER__STUDENT:
			return student != null;
		case Lab2Package.USER__TEACHER:
			return teacher != null;
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
		result.append(", class: ");
		result.append(class_);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //UserImpl
