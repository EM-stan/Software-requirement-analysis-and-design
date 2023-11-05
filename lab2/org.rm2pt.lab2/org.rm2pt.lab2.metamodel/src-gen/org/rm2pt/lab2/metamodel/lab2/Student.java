/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Student#getAge <em>Age</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Student#getHave <em>Have</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Student#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Student#getInclass <em>Inclass</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getStudent_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Student#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getStudent_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExaminationPaper> getAnswer();

	/**
	 * Returns the value of the '<em><b>Inclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclass</em>' reference.
	 * @see #setInclass(org.rm2pt.lab2.metamodel.lab2.Class)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getStudent_Inclass()
	 * @model required="true"
	 * @generated
	 */
	org.rm2pt.lab2.metamodel.lab2.Class getInclass();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Student#getInclass <em>Inclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclass</em>' reference.
	 * @see #getInclass()
	 * @generated
	 */
	void setInclass(org.rm2pt.lab2.metamodel.lab2.Class value);

	/**
	 * Returns the value of the '<em><b>Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have</em>' reference.
	 * @see #setHave(ReportCard)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getStudent_Have()
	 * @model required="true"
	 * @generated
	 */
	ReportCard getHave();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Student#getHave <em>Have</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Have</em>' reference.
	 * @see #getHave()
	 * @generated
	 */
	void setHave(ReportCard value);

} // Student
