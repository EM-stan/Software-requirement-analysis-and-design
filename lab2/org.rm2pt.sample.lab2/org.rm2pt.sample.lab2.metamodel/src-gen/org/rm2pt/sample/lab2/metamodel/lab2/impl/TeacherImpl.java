/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.sample.lab2.metamodel.lab2.Course;
import org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.sample.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.sample.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getClassid <em>Classid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getTeaching <em>Teaching</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl#getCorrect <em>Correct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeacherImpl extends MinimalEObjectImpl.Container implements Teacher {
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
	 * The default value of the '{@link #getClassid() <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassid()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassid() <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassid()
	 * @generated
	 * @ordered
	 */
	protected String classid = CLASSID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeaching() <em>Teaching</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeaching()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> teaching;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportCard> input;

	/**
	 * The cached value of the '{@link #getCorrect() <em>Correct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrect()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmitedPaper> correct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.TEACHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassid() {
		return classid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassid(String newClassid) {
		String oldClassid = classid;
		classid = newClassid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__CLASSID, oldClassid, classid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getTeaching() {
		if (teaching == null) {
			teaching = new EObjectContainmentEList<Course>(Course.class, this, Lab2Package.TEACHER__TEACHING);
		}
		return teaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportCard> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<ReportCard>(ReportCard.class, this, Lab2Package.TEACHER__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmitedPaper> getCorrect() {
		if (correct == null) {
			correct = new EObjectResolvingEList<SubmitedPaper>(SubmitedPaper.class, this, Lab2Package.TEACHER__CORRECT);
		}
		return correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab2Package.TEACHER__TEACHING:
			return ((InternalEList<?>) getTeaching()).basicRemove(otherEnd, msgs);
		case Lab2Package.TEACHER__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
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
		case Lab2Package.TEACHER__ID:
			return getId();
		case Lab2Package.TEACHER__NAME:
			return getName();
		case Lab2Package.TEACHER__CLASSID:
			return getClassid();
		case Lab2Package.TEACHER__TEACHING:
			return getTeaching();
		case Lab2Package.TEACHER__INPUT:
			return getInput();
		case Lab2Package.TEACHER__CORRECT:
			return getCorrect();
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
		case Lab2Package.TEACHER__ID:
			setId((String) newValue);
			return;
		case Lab2Package.TEACHER__NAME:
			setName((String) newValue);
			return;
		case Lab2Package.TEACHER__CLASSID:
			setClassid((String) newValue);
			return;
		case Lab2Package.TEACHER__TEACHING:
			getTeaching().clear();
			getTeaching().addAll((Collection<? extends Course>) newValue);
			return;
		case Lab2Package.TEACHER__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends ReportCard>) newValue);
			return;
		case Lab2Package.TEACHER__CORRECT:
			getCorrect().clear();
			getCorrect().addAll((Collection<? extends SubmitedPaper>) newValue);
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
		case Lab2Package.TEACHER__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.TEACHER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Lab2Package.TEACHER__CLASSID:
			setClassid(CLASSID_EDEFAULT);
			return;
		case Lab2Package.TEACHER__TEACHING:
			getTeaching().clear();
			return;
		case Lab2Package.TEACHER__INPUT:
			getInput().clear();
			return;
		case Lab2Package.TEACHER__CORRECT:
			getCorrect().clear();
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
		case Lab2Package.TEACHER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.TEACHER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Lab2Package.TEACHER__CLASSID:
			return CLASSID_EDEFAULT == null ? classid != null : !CLASSID_EDEFAULT.equals(classid);
		case Lab2Package.TEACHER__TEACHING:
			return teaching != null && !teaching.isEmpty();
		case Lab2Package.TEACHER__INPUT:
			return input != null && !input.isEmpty();
		case Lab2Package.TEACHER__CORRECT:
			return correct != null && !correct.isEmpty();
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
		result.append(", classid: ");
		result.append(classid);
		result.append(')');
		return result.toString();
	}

} //TeacherImpl
