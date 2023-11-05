/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getGrade <em>Grade</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getStudentnum <em>Studentnum</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getMeanscore <em>Meanscore</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getStudent <em>Student</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.Class#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Class#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see #setGrade(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Grade()
	 * @model
	 * @generated
	 */
	String getGrade();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Class#getGrade <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade</em>' attribute.
	 * @see #getGrade()
	 * @generated
	 */
	void setGrade(String value);

	/**
	 * Returns the value of the '<em><b>Studentnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studentnum</em>' attribute.
	 * @see #setStudentnum(int)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Studentnum()
	 * @model
	 * @generated
	 */
	int getStudentnum();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Class#getStudentnum <em>Studentnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studentnum</em>' attribute.
	 * @see #getStudentnum()
	 * @generated
	 */
	void setStudentnum(int value);

	/**
	 * Returns the value of the '<em><b>Meanscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meanscore</em>' attribute.
	 * @see #setMeanscore(float)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Meanscore()
	 * @model
	 * @generated
	 */
	float getMeanscore();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.Class#getMeanscore <em>Meanscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meanscore</em>' attribute.
	 * @see #getMeanscore()
	 * @generated
	 */
	void setMeanscore(float value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Student()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getClass_Teacher()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeacher();

} // Class
