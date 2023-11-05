/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submited Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getTeacherid <em>Teacherid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getCouserid <em>Couserid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfanswer <em>Ifanswer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichcourse <em>Whichcourse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichteacher <em>Whichteacher</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichstudent <em>Whichstudent</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper()
 * @model
 * @generated
 */
public interface SubmitedPaper extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Studentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studentid</em>' attribute.
	 * @see #setStudentid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Studentid()
	 * @model
	 * @generated
	 */
	String getStudentid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getStudentid <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studentid</em>' attribute.
	 * @see #getStudentid()
	 * @generated
	 */
	void setStudentid(String value);

	/**
	 * Returns the value of the '<em><b>Teacherid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacherid</em>' attribute.
	 * @see #setTeacherid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Teacherid()
	 * @model
	 * @generated
	 */
	String getTeacherid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getTeacherid <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacherid</em>' attribute.
	 * @see #getTeacherid()
	 * @generated
	 */
	void setTeacherid(String value);

	/**
	 * Returns the value of the '<em><b>Couserid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couserid</em>' attribute.
	 * @see #setCouserid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Couserid()
	 * @model
	 * @generated
	 */
	String getCouserid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getCouserid <em>Couserid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couserid</em>' attribute.
	 * @see #getCouserid()
	 * @generated
	 */
	void setCouserid(String value);

	/**
	 * Returns the value of the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifcorrect</em>' attribute.
	 * @see #setIfcorrect(boolean)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Ifcorrect()
	 * @model
	 * @generated
	 */
	boolean isIfcorrect();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifcorrect</em>' attribute.
	 * @see #isIfcorrect()
	 * @generated
	 */
	void setIfcorrect(boolean value);

	/**
	 * Returns the value of the '<em><b>Ifanswer</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifanswer</em>' attribute.
	 * @see #setIfanswer(boolean)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Ifanswer()
	 * @model default="false"
	 * @generated
	 */
	boolean isIfanswer();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfanswer <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifanswer</em>' attribute.
	 * @see #isIfanswer()
	 * @generated
	 */
	void setIfanswer(boolean value);

	/**
	 * Returns the value of the '<em><b>Whichcourse</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichcourse</em>' reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Whichcourse()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getWhichcourse();

	/**
	 * Returns the value of the '<em><b>Whichteacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichteacher</em>' reference.
	 * @see #setWhichteacher(Teacher)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Whichteacher()
	 * @model required="true"
	 * @generated
	 */
	Teacher getWhichteacher();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichteacher <em>Whichteacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whichteacher</em>' reference.
	 * @see #getWhichteacher()
	 * @generated
	 */
	void setWhichteacher(Teacher value);

	/**
	 * Returns the value of the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichstudent</em>' reference.
	 * @see #setWhichstudent(Student)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getSubmitedPaper_Whichstudent()
	 * @model required="true"
	 * @generated
	 */
	Student getWhichstudent();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichstudent <em>Whichstudent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whichstudent</em>' reference.
	 * @see #getWhichstudent()
	 * @generated
	 */
	void setWhichstudent(Student value);

} // SubmitedPaper
