/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCouse <em>Couse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getInput <em>Input</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getTeaching <em>Teaching</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCorrect <em>Correct</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getInclass <em>Inclass</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends User {
	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Grade()
	 * @model
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Couse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couse</em>' attribute.
	 * @see #setCouse(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Couse()
	 * @model
	 * @generated
	 */
	String getCouse();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCouse <em>Couse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couse</em>' attribute.
	 * @see #getCouse()
	 * @generated
	 */
	void setCouse(String value);

	/**
	 * Returns the value of the '<em><b>Correct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct</em>' reference.
	 * @see #setCorrect(SubmitedPaper)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Correct()
	 * @model required="true"
	 * @generated
	 */
	SubmitedPaper getCorrect();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCorrect <em>Correct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct</em>' reference.
	 * @see #getCorrect()
	 * @generated
	 */
	void setCorrect(SubmitedPaper value);

	/**
	 * Returns the value of the '<em><b>Inclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclass</em>' reference.
	 * @see #setInclass(org.rm2pt.lab2.metamodel.lab2.Class)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Inclass()
	 * @model required="true"
	 * @generated
	 */
	org.rm2pt.lab2.metamodel.lab2.Class getInclass();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getInclass <em>Inclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclass</em>' reference.
	 * @see #getInclass()
	 * @generated
	 */
	void setInclass(org.rm2pt.lab2.metamodel.lab2.Class value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.ReportCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportCard> getInput();

	/**
	 * Returns the value of the '<em><b>Teaching</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teaching</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getTeacher_Teaching()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getTeaching();

} // Teacher
