/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Examination Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getCourseid <em>Courseid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getTeacherid <em>Teacherid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfanswer <em>Ifanswer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getScore <em>Score</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getSubmit <em>Submit</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichcourse <em>Whichcourse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichstudent <em>Whichstudent</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichteacher <em>Whichteacher</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper()
 * @model
 * @generated
 */
public interface ExaminationPaper extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Courseid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courseid</em>' attribute.
	 * @see #setCourseid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Courseid()
	 * @model
	 * @generated
	 */
	String getCourseid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getCourseid <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courseid</em>' attribute.
	 * @see #getCourseid()
	 * @generated
	 */
	void setCourseid(String value);

	/**
	 * Returns the value of the '<em><b>Teacherid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacherid</em>' attribute.
	 * @see #setTeacherid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Teacherid()
	 * @model
	 * @generated
	 */
	String getTeacherid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getTeacherid <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacherid</em>' attribute.
	 * @see #getTeacherid()
	 * @generated
	 */
	void setTeacherid(String value);

	/**
	 * Returns the value of the '<em><b>Studentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studentid</em>' attribute.
	 * @see #setStudentid(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Studentid()
	 * @model
	 * @generated
	 */
	String getStudentid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getStudentid <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studentid</em>' attribute.
	 * @see #getStudentid()
	 * @generated
	 */
	void setStudentid(String value);

	/**
	 * Returns the value of the '<em><b>Ifanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifanswer</em>' attribute.
	 * @see #setIfanswer(boolean)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Ifanswer()
	 * @model
	 * @generated
	 */
	boolean isIfanswer();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfanswer <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifanswer</em>' attribute.
	 * @see #isIfanswer()
	 * @generated
	 */
	void setIfanswer(boolean value);

	/**
	 * Returns the value of the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifcorrect</em>' attribute.
	 * @see #setIfcorrect(boolean)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Ifcorrect()
	 * @model
	 * @generated
	 */
	boolean isIfcorrect();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfcorrect <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifcorrect</em>' attribute.
	 * @see #isIfcorrect()
	 * @generated
	 */
	void setIfcorrect(boolean value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(float)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Score()
	 * @model default="0.0"
	 * @generated
	 */
	float getScore();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(float value);

	/**
	 * Returns the value of the '<em><b>Submit</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit</em>' containment reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Submit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmitedPaper> getSubmit();

	/**
	 * Returns the value of the '<em><b>Whichcourse</b></em>' reference list.
	 * The list contents are of type {@link org.rm2pt.lab2.metamodel.lab2.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichcourse</em>' reference list.
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Whichcourse()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getWhichcourse();

	/**
	 * Returns the value of the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichstudent</em>' reference.
	 * @see #setWhichstudent(Student)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Whichstudent()
	 * @model required="true"
	 * @generated
	 */
	Student getWhichstudent();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichstudent <em>Whichstudent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whichstudent</em>' reference.
	 * @see #getWhichstudent()
	 * @generated
	 */
	void setWhichstudent(Student value);

	/**
	 * Returns the value of the '<em><b>Whichteacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichteacher</em>' reference.
	 * @see #setWhichteacher(Teacher)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getExaminationPaper_Whichteacher()
	 * @model required="true"
	 * @generated
	 */
	Teacher getWhichteacher();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichteacher <em>Whichteacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whichteacher</em>' reference.
	 * @see #getWhichteacher()
	 * @generated
	 */
	void setWhichteacher(Teacher value);

} // ExaminationPaper
