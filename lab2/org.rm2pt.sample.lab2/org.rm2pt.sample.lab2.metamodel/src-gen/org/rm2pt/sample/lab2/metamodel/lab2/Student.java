/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getClassid <em>Classid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getHave <em>Have</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getId <em>Id</em>}' attribute.
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getName <em>Name</em>}' attribute.
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent_Classid()
	 * @model
	 * @generated
	 */
	String getClassid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getClassid <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classid</em>' attribute.
	 * @see #getClassid()
	 * @generated
	 */
	void setClassid(String value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference list.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent_Answer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExamPaper> getAnswer();

	/**
	 * Returns the value of the '<em><b>Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Have</em>' reference.
	 * @see #setHave(ReportCard)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getStudent_Have()
	 * @model required="true"
	 * @generated
	 */
	ReportCard getHave();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getHave <em>Have</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Have</em>' reference.
	 * @see #getHave()
	 * @generated
	 */
	void setHave(ReportCard value);

} // Student
