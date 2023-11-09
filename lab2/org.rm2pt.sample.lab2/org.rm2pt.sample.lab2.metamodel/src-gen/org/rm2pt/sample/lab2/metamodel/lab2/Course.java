/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getStunum <em>Stunum</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getCourse_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getId <em>Id</em>}' attribute.
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stunum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stunum</em>' attribute.
	 * @see #setStunum(int)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getCourse_Stunum()
	 * @model
	 * @generated
	 */
	int getStunum();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getStunum <em>Stunum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stunum</em>' attribute.
	 * @see #getStunum()
	 * @generated
	 */
	void setStunum(int value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(float)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getCourse_Mean()
	 * @model
	 * @generated
	 */
	float getMean();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(float value);

} // Course
