/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.lab2.metamodel.lab2.Lab2Factory
 * @model kind="package"
 * @generated
 */
public interface Lab2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lab2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rm2pt.com/lab2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab2Package eINSTANCE = org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ClassImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Studentnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STUDENTNUM = 1;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GRADE = 2;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEACHER = 3;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STUDENT = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__CLASSID = 2;

	/**
	 * The feature id for the '<em><b>Teaching</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__TEACHING = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__INPUT = 4;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__CORRECT = 5;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.CourseImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Stunum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUNUM = 2;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MEAN = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.StudentImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CLASSID = 2;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__HAVE = 4;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl <em>Report Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getReportCard()
	 * @generated
	 */
	int REPORT_CARD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Stuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__STUID = 1;

	/**
	 * The feature id for the '<em><b>Stuname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__STUNAME = 2;

	/**
	 * The feature id for the '<em><b>Totalscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__TOTALSCORE = 3;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__RANK = 4;

	/**
	 * The number of structural features of the '<em>Report Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Report Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ExamPaperImpl <em>Exam Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ExamPaperImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getExamPaper()
	 * @generated
	 */
	int EXAM_PAPER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Courseid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__COURSEID = 1;

	/**
	 * The feature id for the '<em><b>Teaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__TEAID = 2;

	/**
	 * The feature id for the '<em><b>Stuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__STUID = 3;

	/**
	 * The feature id for the '<em><b>Ifanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__IFANSWER = 4;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__SCORE = 5;

	/**
	 * The feature id for the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__IFCORRECT = 6;

	/**
	 * The feature id for the '<em><b>Submit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER__SUBMIT = 7;

	/**
	 * The number of structural features of the '<em>Exam Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Exam Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_PAPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl <em>Submited Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getSubmitedPaper()
	 * @generated
	 */
	int SUBMITED_PAPER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Stuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__STUID = 1;

	/**
	 * The feature id for the '<em><b>Teaid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__TEAID = 2;

	/**
	 * The feature id for the '<em><b>Courseid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__COURSEID = 3;

	/**
	 * The feature id for the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__IFCORRECT = 4;

	/**
	 * The feature id for the '<em><b>Ifanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__IFANSWER = 5;

	/**
	 * The number of structural features of the '<em>Submited Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Submited Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class#getStudentnum <em>Studentnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentnum</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class#getStudentnum()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Studentnum();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class#getGrade()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Grade();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teacher</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class#getTeacher()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Teacher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Class#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Class#getStudent()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Student();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getId()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getClassid <em>Classid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getClassid()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Classid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getTeaching <em>Teaching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teaching</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getTeaching()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Teaching();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getInput()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correct</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Teacher#getCorrect()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Correct();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course#getId()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getStunum <em>Stunum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stunum</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course#getStunum()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Stunum();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Course#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Course#getMean()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Mean();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student#getId()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getClassid <em>Classid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student#getClassid()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Classid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student#getAnswer()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Answer();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.lab2.metamodel.lab2.Student#getHave <em>Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Have</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.Student#getHave()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Have();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard <em>Report Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Card</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard
	 * @generated
	 */
	EClass getReportCard();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getId()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuid <em>Stuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stuid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuid()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Stuid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuname <em>Stuname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stuname</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getStuname()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Stuname();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalscore</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getTotalscore()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Totalscore();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ReportCard#getRank()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Rank();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper <em>Exam Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Paper</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper
	 * @generated
	 */
	EClass getExamPaper();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getId()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getCourseid <em>Courseid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Courseid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getCourseid()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Courseid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getTeaid <em>Teaid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teaid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getTeaid()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Teaid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getStuid <em>Stuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stuid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getStuid()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Stuid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfanswer <em>Ifanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifanswer</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfanswer()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Ifanswer();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getScore()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Score();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfcorrect <em>Ifcorrect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifcorrect</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#isIfcorrect()
	 * @see #getExamPaper()
	 * @generated
	 */
	EAttribute getExamPaper_Ifcorrect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getSubmit <em>Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submit</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.ExamPaper#getSubmit()
	 * @see #getExamPaper()
	 * @generated
	 */
	EReference getExamPaper_Submit();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper <em>Submited Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submited Paper</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper
	 * @generated
	 */
	EClass getSubmitedPaper();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getId()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getStuid <em>Stuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stuid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getStuid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Stuid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getTeaid <em>Teaid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teaid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getTeaid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Teaid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getCourseid <em>Courseid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Courseid</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#getCourseid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Courseid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect <em>Ifcorrect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifcorrect</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Ifcorrect();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#isIfanswer <em>Ifanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifanswer</em>'.
	 * @see org.rm2pt.sample.lab2.metamodel.lab2.SubmitedPaper#isIfanswer()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Ifanswer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab2Factory getLab2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ClassImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__ID = eINSTANCE.getClass_Id();

		/**
		 * The meta object literal for the '<em><b>Studentnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__STUDENTNUM = eINSTANCE.getClass_Studentnum();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__GRADE = eINSTANCE.getClass_Grade();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__TEACHER = eINSTANCE.getClass_Teacher();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__STUDENT = eINSTANCE.getClass_Student();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.TeacherImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__ID = eINSTANCE.getTeacher_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '<em><b>Classid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__CLASSID = eINSTANCE.getTeacher_Classid();

		/**
		 * The meta object literal for the '<em><b>Teaching</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__TEACHING = eINSTANCE.getTeacher_Teaching();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__INPUT = eINSTANCE.getTeacher_Input();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__CORRECT = eINSTANCE.getTeacher_Correct();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.CourseImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__ID = eINSTANCE.getCourse_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Stunum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUNUM = eINSTANCE.getCourse_Stunum();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__MEAN = eINSTANCE.getCourse_Mean();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.StudentImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__ID = eINSTANCE.getStudent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>Classid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__CLASSID = eINSTANCE.getStudent_Classid();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ANSWER = eINSTANCE.getStudent_Answer();

		/**
		 * The meta object literal for the '<em><b>Have</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__HAVE = eINSTANCE.getStudent_Have();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl <em>Report Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getReportCard()
		 * @generated
		 */
		EClass REPORT_CARD = eINSTANCE.getReportCard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__ID = eINSTANCE.getReportCard_Id();

		/**
		 * The meta object literal for the '<em><b>Stuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__STUID = eINSTANCE.getReportCard_Stuid();

		/**
		 * The meta object literal for the '<em><b>Stuname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__STUNAME = eINSTANCE.getReportCard_Stuname();

		/**
		 * The meta object literal for the '<em><b>Totalscore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__TOTALSCORE = eINSTANCE.getReportCard_Totalscore();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__RANK = eINSTANCE.getReportCard_Rank();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ExamPaperImpl <em>Exam Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.ExamPaperImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getExamPaper()
		 * @generated
		 */
		EClass EXAM_PAPER = eINSTANCE.getExamPaper();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__ID = eINSTANCE.getExamPaper_Id();

		/**
		 * The meta object literal for the '<em><b>Courseid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__COURSEID = eINSTANCE.getExamPaper_Courseid();

		/**
		 * The meta object literal for the '<em><b>Teaid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__TEAID = eINSTANCE.getExamPaper_Teaid();

		/**
		 * The meta object literal for the '<em><b>Stuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__STUID = eINSTANCE.getExamPaper_Stuid();

		/**
		 * The meta object literal for the '<em><b>Ifanswer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__IFANSWER = eINSTANCE.getExamPaper_Ifanswer();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__SCORE = eINSTANCE.getExamPaper_Score();

		/**
		 * The meta object literal for the '<em><b>Ifcorrect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_PAPER__IFCORRECT = eINSTANCE.getExamPaper_Ifcorrect();

		/**
		 * The meta object literal for the '<em><b>Submit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_PAPER__SUBMIT = eINSTANCE.getExamPaper_Submit();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl <em>Submited Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.SubmitedPaperImpl
		 * @see org.rm2pt.sample.lab2.metamodel.lab2.impl.Lab2PackageImpl#getSubmitedPaper()
		 * @generated
		 */
		EClass SUBMITED_PAPER = eINSTANCE.getSubmitedPaper();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__ID = eINSTANCE.getSubmitedPaper_Id();

		/**
		 * The meta object literal for the '<em><b>Stuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__STUID = eINSTANCE.getSubmitedPaper_Stuid();

		/**
		 * The meta object literal for the '<em><b>Teaid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__TEAID = eINSTANCE.getSubmitedPaper_Teaid();

		/**
		 * The meta object literal for the '<em><b>Courseid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__COURSEID = eINSTANCE.getSubmitedPaper_Courseid();

		/**
		 * The meta object literal for the '<em><b>Ifcorrect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__IFCORRECT = eINSTANCE.getSubmitedPaper_Ifcorrect();

		/**
		 * The meta object literal for the '<em><b>Ifanswer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__IFANSWER = eINSTANCE.getSubmitedPaper_Ifanswer();

	}

} //Lab2Package
