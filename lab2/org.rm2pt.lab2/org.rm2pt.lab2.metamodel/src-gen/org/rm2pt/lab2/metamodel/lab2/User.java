/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getStudent <em>Student</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.User#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getId <em>Id</em>}' attribute.
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
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Student()
	 * @model derived="true"
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(Teacher)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getUser_Teacher()
	 * @model derived="true"
	 * @generated
	 */
	Teacher getTeacher();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.User#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Teacher value);

} // User
