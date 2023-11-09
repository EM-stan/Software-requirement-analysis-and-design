/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getCourseid <em>Courseid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getTeaid <em>Teaid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getStuid <em>Stuid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfanswer <em>Ifanswer</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getScore <em>Score</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getSubmit <em>Submit</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper()
 * @model
 * @generated
 */
public interface ExamPaper extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getId <em>Id</em>}' attribute.
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Courseid()
	 * @model
	 * @generated
	 */
	String getCourseid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getCourseid <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courseid</em>' attribute.
	 * @see #getCourseid()
	 * @generated
	 */
	void setCourseid(String value);

	/**
	 * Returns the value of the '<em><b>Teaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teaid</em>' attribute.
	 * @see #setTeaid(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Teaid()
	 * @model
	 * @generated
	 */
	String getTeaid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getTeaid <em>Teaid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teaid</em>' attribute.
	 * @see #getTeaid()
	 * @generated
	 */
	void setTeaid(String value);

	/**
	 * Returns the value of the '<em><b>Stuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stuid</em>' attribute.
	 * @see #setStuid(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Stuid()
	 * @model
	 * @generated
	 */
	String getStuid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getStuid <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stuid</em>' attribute.
	 * @see #getStuid()
	 * @generated
	 */
	void setStuid(String value);

	/**
	 * Returns the value of the '<em><b>Ifanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifanswer</em>' attribute.
	 * @see #setIfanswer(boolean)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Ifanswer()
	 * @model
	 * @generated
	 */
	boolean isIfanswer();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfanswer <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifanswer</em>' attribute.
	 * @see #isIfanswer()
	 * @generated
	 */
	void setIfanswer(boolean value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(float)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Score()
	 * @model
	 * @generated
	 */
	float getScore();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(float value);

	/**
	 * Returns the value of the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifcorrect</em>' attribute.
	 * @see #setIfcorrect(boolean)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Ifcorrect()
	 * @model
	 * @generated
	 */
	boolean isIfcorrect();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfcorrect <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifcorrect</em>' attribute.
	 * @see #isIfcorrect()
	 * @generated
	 */
	void setIfcorrect(boolean value);

	/**
	 * Returns the value of the '<em><b>Submit</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit</em>' containment reference list.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getExamPaper_Submit()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubmitedPaper> getSubmit();

} // ExamPaper
