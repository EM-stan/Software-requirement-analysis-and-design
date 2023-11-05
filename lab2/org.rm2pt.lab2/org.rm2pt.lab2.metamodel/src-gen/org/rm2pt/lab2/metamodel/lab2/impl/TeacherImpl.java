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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getCouse <em>Couse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getTeaching <em>Teaching</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getCorrect <em>Correct</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl#getInclass <em>Inclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeacherImpl extends UserImpl implements Teacher {
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
	 * The default value of the '{@link #getCouse() <em>Couse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouse()
	 * @generated
	 * @ordered
	 */
	protected static final String COUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouse() <em>Couse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouse()
	 * @generated
	 * @ordered
	 */
	protected String couse = COUSE_EDEFAULT;

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
	 * The cached value of the '{@link #getTeaching() <em>Teaching</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeaching()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> teaching;

	/**
	 * The cached value of the '{@link #getCorrect() <em>Correct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrect()
	 * @generated
	 * @ordered
	 */
	protected SubmitedPaper correct;

	/**
	 * The cached value of the '{@link #getInclass() <em>Inclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclass()
	 * @generated
	 * @ordered
	 */
	protected org.rm2pt.lab2.metamodel.lab2.Class inclass;

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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__GRADE, oldGrade, grade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouse() {
		return couse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouse(String newCouse) {
		String oldCouse = couse;
		couse = newCouse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__COUSE, oldCouse, couse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitedPaper getCorrect() {
		if (correct != null && correct.eIsProxy()) {
			InternalEObject oldCorrect = (InternalEObject) correct;
			correct = (SubmitedPaper) eResolveProxy(oldCorrect);
			if (correct != oldCorrect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.TEACHER__CORRECT, oldCorrect,
							correct));
			}
		}
		return correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitedPaper basicGetCorrect() {
		return correct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrect(SubmitedPaper newCorrect) {
		SubmitedPaper oldCorrect = correct;
		correct = newCorrect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__CORRECT, oldCorrect, correct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.rm2pt.lab2.metamodel.lab2.Class getInclass() {
		if (inclass != null && inclass.eIsProxy()) {
			InternalEObject oldInclass = (InternalEObject) inclass;
			inclass = (org.rm2pt.lab2.metamodel.lab2.Class) eResolveProxy(oldInclass);
			if (inclass != oldInclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.TEACHER__INCLASS, oldInclass,
							inclass));
			}
		}
		return inclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.rm2pt.lab2.metamodel.lab2.Class basicGetInclass() {
		return inclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclass(org.rm2pt.lab2.metamodel.lab2.Class newInclass) {
		org.rm2pt.lab2.metamodel.lab2.Class oldInclass = inclass;
		inclass = newInclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.TEACHER__INCLASS, oldInclass, inclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab2Package.TEACHER__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case Lab2Package.TEACHER__TEACHING:
			return ((InternalEList<?>) getTeaching()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.TEACHER__GRADE:
			return getGrade();
		case Lab2Package.TEACHER__COUSE:
			return getCouse();
		case Lab2Package.TEACHER__INPUT:
			return getInput();
		case Lab2Package.TEACHER__TEACHING:
			return getTeaching();
		case Lab2Package.TEACHER__CORRECT:
			if (resolve)
				return getCorrect();
			return basicGetCorrect();
		case Lab2Package.TEACHER__INCLASS:
			if (resolve)
				return getInclass();
			return basicGetInclass();
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
		case Lab2Package.TEACHER__GRADE:
			setGrade((String) newValue);
			return;
		case Lab2Package.TEACHER__COUSE:
			setCouse((String) newValue);
			return;
		case Lab2Package.TEACHER__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends ReportCard>) newValue);
			return;
		case Lab2Package.TEACHER__TEACHING:
			getTeaching().clear();
			getTeaching().addAll((Collection<? extends Course>) newValue);
			return;
		case Lab2Package.TEACHER__CORRECT:
			setCorrect((SubmitedPaper) newValue);
			return;
		case Lab2Package.TEACHER__INCLASS:
			setInclass((org.rm2pt.lab2.metamodel.lab2.Class) newValue);
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
		case Lab2Package.TEACHER__GRADE:
			setGrade(GRADE_EDEFAULT);
			return;
		case Lab2Package.TEACHER__COUSE:
			setCouse(COUSE_EDEFAULT);
			return;
		case Lab2Package.TEACHER__INPUT:
			getInput().clear();
			return;
		case Lab2Package.TEACHER__TEACHING:
			getTeaching().clear();
			return;
		case Lab2Package.TEACHER__CORRECT:
			setCorrect((SubmitedPaper) null);
			return;
		case Lab2Package.TEACHER__INCLASS:
			setInclass((org.rm2pt.lab2.metamodel.lab2.Class) null);
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
		case Lab2Package.TEACHER__GRADE:
			return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
		case Lab2Package.TEACHER__COUSE:
			return COUSE_EDEFAULT == null ? couse != null : !COUSE_EDEFAULT.equals(couse);
		case Lab2Package.TEACHER__INPUT:
			return input != null && !input.isEmpty();
		case Lab2Package.TEACHER__TEACHING:
			return teaching != null && !teaching.isEmpty();
		case Lab2Package.TEACHER__CORRECT:
			return correct != null;
		case Lab2Package.TEACHER__INCLASS:
			return inclass != null;
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
		result.append(" (grade: ");
		result.append(grade);
		result.append(", couse: ");
		result.append(couse);
		result.append(')');
		return result.toString();
	}

} //TeacherImpl
