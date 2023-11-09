/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

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
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuid <em>Stuid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuname <em>Stuname</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard()
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Stuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stuid</em>' attribute.
	 * @see #setStuid(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard_Stuid()
	 * @model
	 * @generated
	 */
	String getStuid();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuid <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stuid</em>' attribute.
	 * @see #getStuid()
	 * @generated
	 */
	void setStuid(String value);

	/**
	 * Returns the value of the '<em><b>Stuname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stuname</em>' attribute.
	 * @see #setStuname(String)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard_Stuname()
	 * @model
	 * @generated
	 */
	String getStuname();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuname <em>Stuname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stuname</em>' attribute.
	 * @see #getStuname()
	 * @generated
	 */
	void setStuname(String value);

	/**
	 * Returns the value of the '<em><b>Totalscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalscore</em>' attribute.
	 * @see #setTotalscore(float)
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard_Totalscore()
	 * @model
	 * @generated
	 */
	float getTotalscore();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}' attribute.
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
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package#getReportCard_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

} // ReportCard
