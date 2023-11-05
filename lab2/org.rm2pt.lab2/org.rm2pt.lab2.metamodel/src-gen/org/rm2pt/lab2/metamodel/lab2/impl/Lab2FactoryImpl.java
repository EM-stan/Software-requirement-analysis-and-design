/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.ExaminationPaper;
import org.rm2pt.lab2.metamodel.lab2.Lab2Factory;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab2FactoryImpl extends EFactoryImpl implements Lab2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lab2Factory init() {
		try {
			Lab2Factory theLab2Factory = (Lab2Factory) EPackage.Registry.INSTANCE.getEFactory(Lab2Package.eNS_URI);
			if (theLab2Factory != null) {
				return theLab2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lab2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Lab2Package.STUDENT:
			return createStudent();
		case Lab2Package.TEACHER:
			return createTeacher();
		case Lab2Package.EXAMINATION_PAPER:
			return createExaminationPaper();
		case Lab2Package.SUBMITED_PAPER:
			return createSubmitedPaper();
		case Lab2Package.REPORT_CARD:
			return createReportCard();
		case Lab2Package.COURSE:
			return createCourse();
		case Lab2Package.CLASS:
			return createClass();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher createTeacher() {
		TeacherImpl teacher = new TeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExaminationPaper createExaminationPaper() {
		ExaminationPaperImpl examinationPaper = new ExaminationPaperImpl();
		return examinationPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitedPaper createSubmitedPaper() {
		SubmitedPaperImpl submitedPaper = new SubmitedPaperImpl();
		return submitedPaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportCard createReportCard() {
		ReportCardImpl reportCard = new ReportCardImpl();
		return reportCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.rm2pt.lab2.metamodel.lab2.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2Package getLab2Package() {
		return (Lab2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lab2Package getPackage() {
		return Lab2Package.eINSTANCE;
	}

} //Lab2FactoryImpl
