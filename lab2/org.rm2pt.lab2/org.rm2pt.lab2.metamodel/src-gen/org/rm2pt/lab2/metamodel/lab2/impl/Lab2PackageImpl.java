/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.ExaminationPaper;
import org.rm2pt.lab2.metamodel.lab2.Lab2Factory;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.lab2.metamodel.lab2.Teacher;
import org.rm2pt.lab2.metamodel.lab2.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab2PackageImpl extends EPackageImpl implements Lab2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teacherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examinationPaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submitedPaperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lab2PackageImpl() {
		super(eNS_URI, Lab2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Lab2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lab2Package init() {
		if (isInited)
			return (Lab2Package) EPackage.Registry.INSTANCE.getEPackage(Lab2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredLab2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Lab2PackageImpl theLab2Package = registeredLab2Package instanceof Lab2PackageImpl
				? (Lab2PackageImpl) registeredLab2Package
				: new Lab2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLab2Package.createPackageContents();

		// Initialize created meta-data
		theLab2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLab2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lab2Package.eNS_URI, theLab2Package);
		return theLab2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Class() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Student() {
		return (EReference) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Teacher() {
		return (EReference) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Age() {
		return (EAttribute) studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Answer() {
		return (EReference) studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Inclass() {
		return (EReference) studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Have() {
		return (EReference) studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeacher() {
		return teacherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeacher_Grade() {
		return (EAttribute) teacherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeacher_Couse() {
		return (EAttribute) teacherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeacher_Correct() {
		return (EReference) teacherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeacher_Inclass() {
		return (EReference) teacherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeacher_Input() {
		return (EReference) teacherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeacher_Teaching() {
		return (EReference) teacherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExaminationPaper() {
		return examinationPaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Id() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Courseid() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Teacherid() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Studentid() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Ifanswer() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Ifcorrect() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExaminationPaper_Score() {
		return (EAttribute) examinationPaperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminationPaper_Submit() {
		return (EReference) examinationPaperEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminationPaper_Whichcourse() {
		return (EReference) examinationPaperEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminationPaper_Whichstudent() {
		return (EReference) examinationPaperEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExaminationPaper_Whichteacher() {
		return (EReference) examinationPaperEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmitedPaper() {
		return submitedPaperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Id() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Studentid() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Teacherid() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Couserid() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Ifcorrect() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmitedPaper_Ifanswer() {
		return (EAttribute) submitedPaperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmitedPaper_Whichcourse() {
		return (EReference) submitedPaperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmitedPaper_Whichteacher() {
		return (EReference) submitedPaperEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmitedPaper_Whichstudent() {
		return (EReference) submitedPaperEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportCard() {
		return reportCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportCard_Id() {
		return (EAttribute) reportCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportCard_Studentid() {
		return (EAttribute) reportCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportCard_Studentname() {
		return (EAttribute) reportCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportCard_Totalscore() {
		return (EAttribute) reportCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportCard_Rank() {
		return (EAttribute) reportCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportCard_Whichstudent() {
		return (EReference) reportCardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Id() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Studentnum() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Coursemean() {
		return (EAttribute) courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Id() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Grade() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Studentnum() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Meanscore() {
		return (EAttribute) classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Student() {
		return (EReference) classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Teacher() {
		return (EReference) classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2Factory getLab2Factory() {
		return (Lab2Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__CLASS);
		createEAttribute(userEClass, USER__PASSWORD);
		createEReference(userEClass, USER__STUDENT);
		createEReference(userEClass, USER__TEACHER);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__AGE);
		createEReference(studentEClass, STUDENT__HAVE);
		createEReference(studentEClass, STUDENT__ANSWER);
		createEReference(studentEClass, STUDENT__INCLASS);

		teacherEClass = createEClass(TEACHER);
		createEAttribute(teacherEClass, TEACHER__GRADE);
		createEAttribute(teacherEClass, TEACHER__COUSE);
		createEReference(teacherEClass, TEACHER__INPUT);
		createEReference(teacherEClass, TEACHER__TEACHING);
		createEReference(teacherEClass, TEACHER__CORRECT);
		createEReference(teacherEClass, TEACHER__INCLASS);

		examinationPaperEClass = createEClass(EXAMINATION_PAPER);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__ID);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__COURSEID);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__TEACHERID);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__STUDENTID);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__IFANSWER);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__IFCORRECT);
		createEAttribute(examinationPaperEClass, EXAMINATION_PAPER__SCORE);
		createEReference(examinationPaperEClass, EXAMINATION_PAPER__SUBMIT);
		createEReference(examinationPaperEClass, EXAMINATION_PAPER__WHICHCOURSE);
		createEReference(examinationPaperEClass, EXAMINATION_PAPER__WHICHSTUDENT);
		createEReference(examinationPaperEClass, EXAMINATION_PAPER__WHICHTEACHER);

		submitedPaperEClass = createEClass(SUBMITED_PAPER);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__ID);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__STUDENTID);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__TEACHERID);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__COUSERID);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__IFCORRECT);
		createEAttribute(submitedPaperEClass, SUBMITED_PAPER__IFANSWER);
		createEReference(submitedPaperEClass, SUBMITED_PAPER__WHICHCOURSE);
		createEReference(submitedPaperEClass, SUBMITED_PAPER__WHICHTEACHER);
		createEReference(submitedPaperEClass, SUBMITED_PAPER__WHICHSTUDENT);

		reportCardEClass = createEClass(REPORT_CARD);
		createEAttribute(reportCardEClass, REPORT_CARD__ID);
		createEAttribute(reportCardEClass, REPORT_CARD__STUDENTID);
		createEAttribute(reportCardEClass, REPORT_CARD__STUDENTNAME);
		createEAttribute(reportCardEClass, REPORT_CARD__TOTALSCORE);
		createEAttribute(reportCardEClass, REPORT_CARD__RANK);
		createEReference(reportCardEClass, REPORT_CARD__WHICHSTUDENT);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__ID);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__STUDENTNUM);
		createEAttribute(courseEClass, COURSE__COURSEMEAN);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__ID);
		createEAttribute(classEClass, CLASS__GRADE);
		createEAttribute(classEClass, CLASS__STUDENTNUM);
		createEAttribute(classEClass, CLASS__MEANSCORE);
		createEReference(classEClass, CLASS__STUDENT);
		createEReference(classEClass, CLASS__TEACHER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		studentEClass.getESuperTypes().add(this.getUser());
		teacherEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), ecorePackage.getEString(), "id", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Class(), ecorePackage.getEString(), "class", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Student(), this.getStudent(), null, "student", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEReference(getUser_Teacher(), this.getTeacher(), null, "teacher", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Student.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Have(), this.getReportCard(), null, "have", null, 1, 1, Student.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStudent_Answer(), this.getExaminationPaper(), null, "answer", null, 0, -1, Student.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Inclass(), this.getClass_(), null, "inclass", null, 1, 1, Student.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teacherEClass, Teacher.class, "Teacher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeacher_Grade(), ecorePackage.getEString(), "grade", null, 0, 1, Teacher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeacher_Couse(), ecorePackage.getEString(), "couse", null, 0, 1, Teacher.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Input(), this.getReportCard(), null, "input", null, 0, -1, Teacher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Teaching(), this.getCourse(), null, "teaching", null, 0, -1, Teacher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Correct(), this.getSubmitedPaper(), null, "correct", null, 1, 1, Teacher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeacher_Inclass(), this.getClass_(), null, "inclass", null, 1, 1, Teacher.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examinationPaperEClass, ExaminationPaper.class, "ExaminationPaper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExaminationPaper_Id(), ecorePackage.getEString(), "id", null, 0, 1, ExaminationPaper.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Courseid(), ecorePackage.getEString(), "courseid", null, 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Teacherid(), ecorePackage.getEString(), "teacherid", null, 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Studentid(), ecorePackage.getEString(), "studentid", null, 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Ifanswer(), ecorePackage.getEBoolean(), "ifanswer", null, 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Ifcorrect(), ecorePackage.getEBoolean(), "ifcorrect", null, 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExaminationPaper_Score(), ecorePackage.getEFloat(), "score", "0.0", 0, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationPaper_Submit(), this.getSubmitedPaper(), null, "submit", null, 0, -1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationPaper_Whichcourse(), this.getCourse(), null, "whichcourse", null, 1, -1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationPaper_Whichstudent(), this.getStudent(), null, "whichstudent", null, 1, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExaminationPaper_Whichteacher(), this.getTeacher(), null, "whichteacher", null, 1, 1,
				ExaminationPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submitedPaperEClass, SubmitedPaper.class, "SubmitedPaper", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmitedPaper_Id(), ecorePackage.getEString(), "id", null, 0, 1, SubmitedPaper.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmitedPaper_Studentid(), ecorePackage.getEString(), "studentid", null, 0, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmitedPaper_Teacherid(), ecorePackage.getEString(), "teacherid", null, 0, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmitedPaper_Couserid(), ecorePackage.getEString(), "couserid", null, 0, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmitedPaper_Ifcorrect(), ecorePackage.getEBoolean(), "ifcorrect", null, 0, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubmitedPaper_Ifanswer(), ecorePackage.getEBoolean(), "ifanswer", "false", 0, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSubmitedPaper_Whichcourse(), this.getCourse(), null, "whichcourse", null, 1, -1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmitedPaper_Whichteacher(), this.getTeacher(), null, "whichteacher", null, 1, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmitedPaper_Whichstudent(), this.getStudent(), null, "whichstudent", null, 1, 1,
				SubmitedPaper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportCardEClass, ReportCard.class, "ReportCard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportCard_Id(), ecorePackage.getEString(), "id", null, 0, 1, ReportCard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportCard_Studentid(), ecorePackage.getEString(), "studentid", null, 0, 1, ReportCard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportCard_Studentname(), ecorePackage.getEString(), "studentname", null, 0, 1,
				ReportCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportCard_Totalscore(), ecorePackage.getEFloat(), "totalscore", null, 0, 1, ReportCard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportCard_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, ReportCard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportCard_Whichstudent(), this.getStudent(), null, "whichstudent", null, 1, 1,
				ReportCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Id(), ecorePackage.getEString(), "id", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Studentnum(), ecorePackage.getEInt(), "studentnum", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Coursemean(), ecorePackage.getEFloat(), "coursemean", null, 0, 1, Course.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.rm2pt.lab2.metamodel.lab2.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Grade(), ecorePackage.getEString(), "grade", null, 0, 1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Studentnum(), ecorePackage.getEInt(), "studentnum", null, 0, 1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Meanscore(), ecorePackage.getEFloat(), "meanscore", null, 0, 1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Student(), this.getStudent(), null, "student", null, 0, -1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Teacher(), this.getTeacher(), null, "teacher", null, 0, -1,
				org.rm2pt.lab2.metamodel.lab2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Lab2PackageImpl
