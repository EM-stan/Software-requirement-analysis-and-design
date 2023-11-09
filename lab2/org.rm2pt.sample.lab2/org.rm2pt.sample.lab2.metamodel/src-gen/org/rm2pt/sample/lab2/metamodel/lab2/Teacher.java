/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getClassid <em>Classid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getTeaching <em>Teaching</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getInput <em>Input</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getCorrect <em>Correct</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classid</em>' attribute.
	 * @see #setClassid(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Classid()
	 * @model
	 * @generated
	 */
	String getClassid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getClassid <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classid</em>' attribute.
	 * @see #getClassid()
	 * @generated
	 */
	void setClassid(String value);

	/**
	 * Returns the value of the '<em><b>Teaching</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.lab2.metamodel.lab2.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teaching</em>' containment reference list.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Teaching()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getTeaching();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportCard> getInput();

	/**
	 * Returns the value of the '<em><b>Correct</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct</em>' reference list.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getTeacher_Correct()
	 * @model required="true"
	 * @generated
	 */
	EList<SubmitedPaper> getCorrect();

} // Teacher
