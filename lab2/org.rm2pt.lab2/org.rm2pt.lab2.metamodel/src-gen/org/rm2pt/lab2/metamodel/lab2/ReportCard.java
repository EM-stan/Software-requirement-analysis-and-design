/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentname <em>Studentname</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getWhichstudent <em>Whichstudent</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard()
 * @model
 * @generated
 */
public interface ReportCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}' attribute.
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
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Studentid()
	 * @model
	 * @generated
	 */
	String getStudentid();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentid <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studentid</em>' attribute.
	 * @see #getStudentid()
	 * @generated
	 */
	void setStudentid(String value);

	/**
	 * Returns the value of the '<em><b>Studentname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studentname</em>' attribute.
	 * @see #setStudentname(String)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Studentname()
	 * @model
	 * @generated
	 */
	String getStudentname();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentname <em>Studentname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studentname</em>' attribute.
	 * @see #getStudentname()
	 * @generated
	 */
	void setStudentname(String value);

	/**
	 * Returns the value of the '<em><b>Totalscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalscore</em>' attribute.
	 * @see #setTotalscore(float)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Totalscore()
	 * @model
	 * @generated
	 */
	float getTotalscore();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalscore</em>' attribute.
	 * @see #getTotalscore()
	 * @generated
	 */
	void setTotalscore(float value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whichstudent</em>' reference.
	 * @see #setWhichstudent(Student)
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#getReportCard_Whichstudent()
	 * @model required="true"
	 * @generated
	 */
	Student getWhichstudent();

	/**
	 * Sets the value of the '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getWhichstudent <em>Whichstudent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Whichstudent</em>' reference.
	 * @see #getWhichstudent()
	 * @generated
	 */
	void setWhichstudent(Student value);

} // ReportCard
