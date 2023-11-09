/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.rm2pt.sample.lab2.metamodel.lab2.Course;
import org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper;
import org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.sample.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.sample.lab2.metamodel.lab2.Student;
import org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.sample.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package
 * @generated
 */
public class Lab2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Lab2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lab2Switch<Adapter> modelSwitch = new Lab2Switch<Adapter>() {
		@Override
		public Adapter caseClass(org.rm2pt.sample.lab2.metamodel.lab2.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseTeacher(Teacher object) {
			return createTeacherAdapter();
		}

		@Override
		public Adapter caseCourse(Course object) {
			return createCourseAdapter();
		}

		@Override
		public Adapter caseStudent(Student object) {
			return createStudentAdapter();
		}

		@Override
		public Adapter caseReportCard(ReportCard object) {
			return createReportCardAdapter();
		}

		@Override
		public Adapter caseExamPaper(ExamPaper object) {
			return createExamPaperAdapter();
		}

		@Override
		public Adapter caseSubmitedPaper(SubmitedPaper object) {
			return createSubmitedPaperAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher
	 * @generated
	 */
	public Adapter createTeacherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard <em>Report Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard
	 * @generated
	 */
	public Adapter createReportCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper <em>Exam Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper
	 * @generated
	 */
	public Adapter createExamPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper <em>Submited Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper
	 * @generated
	 */
	public Adapter createSubmitedPaperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Lab2AdapterFactory
