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
import org.rm2pt.lab2.metamodel.lab2.ExaminationPaper;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.lab2.metamodel.lab2.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl#getHave <em>Have</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl#getInclass <em>Inclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHave() <em>Have</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHave()
	 * @generated
	 * @ordered
	 */
	protected ReportCard have;

	/**
	 * The cached value of the '{@link #getAnswer() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswer()
	 * @generated
	 * @ordered
	 */
	protected EList<ExaminationPaper> answer;

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
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.STUDENT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExaminationPaper> getAnswer() {
		if (answer == null) {
			answer = new EObjectContainmentEList<ExaminationPaper>(ExaminationPaper.class, this,
					Lab2Package.STUDENT__ANSWER);
		}
		return answer;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.STUDENT__INCLASS, oldInclass,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.STUDENT__INCLASS, oldInclass, inclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab2Package.STUDENT__ANSWER:
			return ((InternalEList<?>) getAnswer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportCard getHave() {
		if (have != null && have.eIsProxy()) {
			InternalEObject oldHave = (InternalEObject) have;
			have = (ReportCard) eResolveProxy(oldHave);
			if (have != oldHave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.STUDENT__HAVE, oldHave,
							have));
			}
		}
		return have;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportCard basicGetHave() {
		return have;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHave(ReportCard newHave) {
		ReportCard oldHave = have;
		have = newHave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.STUDENT__HAVE, oldHave, have));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.STUDENT__AGE:
			return getAge();
		case Lab2Package.STUDENT__HAVE:
			if (resolve)
				return getHave();
			return basicGetHave();
		case Lab2Package.STUDENT__ANSWER:
			return getAnswer();
		case Lab2Package.STUDENT__INCLASS:
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
		case Lab2Package.STUDENT__AGE:
			setAge((Integer) newValue);
			return;
		case Lab2Package.STUDENT__HAVE:
			setHave((ReportCard) newValue);
			return;
		case Lab2Package.STUDENT__ANSWER:
			getAnswer().clear();
			getAnswer().addAll((Collection<? extends ExaminationPaper>) newValue);
			return;
		case Lab2Package.STUDENT__INCLASS:
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
		case Lab2Package.STUDENT__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case Lab2Package.STUDENT__HAVE:
			setHave((ReportCard) null);
			return;
		case Lab2Package.STUDENT__ANSWER:
			getAnswer().clear();
			return;
		case Lab2Package.STUDENT__INCLASS:
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
		case Lab2Package.STUDENT__AGE:
			return age != AGE_EDEFAULT;
		case Lab2Package.STUDENT__HAVE:
			return have != null;
		case Lab2Package.STUDENT__ANSWER:
			return answer != null && !answer.isEmpty();
		case Lab2Package.STUDENT__INCLASS:
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
		result.append(" (age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
