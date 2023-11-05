/**
 */
package org.rm2pt.lab2.metamodel.lab2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package
 * @generated
 */
public interface Lab2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab2Factory eINSTANCE = org.rm2pt.lab2.metamodel.lab2.impl.Lab2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teacher</em>'.
	 * @generated
	 */
	Teacher createTeacher();

	/**
	 * Returns a new object of class '<em>Examination Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Examination Paper</em>'.
	 * @generated
	 */
	ExaminationPaper createExaminationPaper();

	/**
	 * Returns a new object of class '<em>Submited Paper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submited Paper</em>'.
	 * @generated
	 */
	SubmitedPaper createSubmitedPaper();

	/**
	 * Returns a new object of class '<em>Report Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Card</em>'.
	 * @generated
	 */
	ReportCard createReportCard();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lab2Package getLab2Package();

} //Lab2Factory
