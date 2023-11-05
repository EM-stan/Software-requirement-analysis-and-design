/**
 */
package org.rm2pt.lab2.metamodel.lab2;

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
 * @see org.rm2pt.lab2.metamodel.lab2.Lab2Factory
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
	Lab2Package eINSTANCE = org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.UserImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TEACHER = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CLASS = USER__CLASS;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT = USER__STUDENT;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__TEACHER = USER__TEACHER;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__AGE = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Have</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__HAVE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ANSWER = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__INCLASS = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__CLASS = USER__CLASS;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__STUDENT = USER__STUDENT;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__TEACHER = USER__TEACHER;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__GRADE = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Couse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__COUSE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__INPUT = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Teaching</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__TEACHING = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__CORRECT = USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__INCLASS = USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = USER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl <em>Examination Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getExaminationPaper()
	 * @generated
	 */
	int EXAMINATION_PAPER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Courseid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__COURSEID = 1;

	/**
	 * The feature id for the '<em><b>Teacherid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__TEACHERID = 2;

	/**
	 * The feature id for the '<em><b>Studentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__STUDENTID = 3;

	/**
	 * The feature id for the '<em><b>Ifanswer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__IFANSWER = 4;

	/**
	 * The feature id for the '<em><b>Ifcorrect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__IFCORRECT = 5;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__SCORE = 6;

	/**
	 * The feature id for the '<em><b>Submit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__SUBMIT = 7;

	/**
	 * The feature id for the '<em><b>Whichcourse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__WHICHCOURSE = 8;

	/**
	 * The feature id for the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__WHICHSTUDENT = 9;

	/**
	 * The feature id for the '<em><b>Whichteacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER__WHICHTEACHER = 10;

	/**
	 * The number of structural features of the '<em>Examination Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Examination Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMINATION_PAPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl <em>Submited Paper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getSubmitedPaper()
	 * @generated
	 */
	int SUBMITED_PAPER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__ID = 0;

	/**
	 * The feature id for the '<em><b>Studentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__STUDENTID = 1;

	/**
	 * The feature id for the '<em><b>Teacherid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__TEACHERID = 2;

	/**
	 * The feature id for the '<em><b>Couserid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__COUSERID = 3;

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
	 * The feature id for the '<em><b>Whichcourse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__WHICHCOURSE = 6;

	/**
	 * The feature id for the '<em><b>Whichteacher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__WHICHTEACHER = 7;

	/**
	 * The feature id for the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER__WHICHSTUDENT = 8;

	/**
	 * The number of structural features of the '<em>Submited Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Submited Paper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMITED_PAPER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl <em>Report Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getReportCard()
	 * @generated
	 */
	int REPORT_CARD = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Studentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__STUDENTID = 1;

	/**
	 * The feature id for the '<em><b>Studentname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__STUDENTNAME = 2;

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
	 * The feature id for the '<em><b>Whichstudent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD__WHICHSTUDENT = 5;

	/**
	 * The number of structural features of the '<em>Report Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Report Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 6;

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
	 * The feature id for the '<em><b>Studentnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDENTNUM = 2;

	/**
	 * The feature id for the '<em><b>Coursemean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSEMEAN = 3;

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
	 * The meta object id for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl
	 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ID = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GRADE = 1;

	/**
	 * The feature id for the '<em><b>Studentnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STUDENTNUM = 2;

	/**
	 * The feature id for the '<em><b>Meanscore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MEANSCORE = 3;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Teacher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEACHER = 5;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.User#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getClass_()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.User#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getStudent()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Student();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.User#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Teacher</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.User#getTeacher()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Teacher();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Student#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Student#getAge()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Age();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.Student#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Student#getAnswer()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Answer();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.Student#getInclass <em>Inclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inclass</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Student#getInclass()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Inclass();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.Student#getHave <em>Have</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Have</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Student#getHave()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Have();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getGrade()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Grade();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCouse <em>Couse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Couse</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getCouse()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Couse();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correct</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getCorrect()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Correct();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getInclass <em>Inclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inclass</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getInclass()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Inclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getInput()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.Teacher#getTeaching <em>Teaching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teaching</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Teacher#getTeaching()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Teaching();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper <em>Examination Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Examination Paper</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper
	 * @generated
	 */
	EClass getExaminationPaper();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getId()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getCourseid <em>Courseid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Courseid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getCourseid()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Courseid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getTeacherid <em>Teacherid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teacherid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getTeacherid()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Teacherid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getStudentid <em>Studentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getStudentid()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Studentid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfanswer <em>Ifanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifanswer</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfanswer()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Ifanswer();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfcorrect <em>Ifcorrect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifcorrect</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#isIfcorrect()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Ifcorrect();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getScore()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EAttribute getExaminationPaper_Score();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getSubmit <em>Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submit</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getSubmit()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EReference getExaminationPaper_Submit();

	/**
	 * Returns the meta object for the reference list '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichcourse <em>Whichcourse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Whichcourse</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichcourse()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EReference getExaminationPaper_Whichcourse();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichstudent <em>Whichstudent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whichstudent</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichstudent()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EReference getExaminationPaper_Whichstudent();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichteacher <em>Whichteacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whichteacher</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ExaminationPaper#getWhichteacher()
	 * @see #getExaminationPaper()
	 * @generated
	 */
	EReference getExaminationPaper_Whichteacher();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper <em>Submited Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submited Paper</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper
	 * @generated
	 */
	EClass getSubmitedPaper();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getId()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getStudentid <em>Studentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getStudentid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Studentid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getTeacherid <em>Teacherid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teacherid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getTeacherid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Teacherid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getCouserid <em>Couserid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Couserid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getCouserid()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Couserid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect <em>Ifcorrect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifcorrect</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfcorrect()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Ifcorrect();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfanswer <em>Ifanswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifanswer</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#isIfanswer()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EAttribute getSubmitedPaper_Ifanswer();

	/**
	 * Returns the meta object for the reference list '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichcourse <em>Whichcourse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Whichcourse</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichcourse()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EReference getSubmitedPaper_Whichcourse();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichteacher <em>Whichteacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whichteacher</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichteacher()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EReference getSubmitedPaper_Whichteacher();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichstudent <em>Whichstudent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whichstudent</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.SubmitedPaper#getWhichstudent()
	 * @see #getSubmitedPaper()
	 * @generated
	 */
	EReference getSubmitedPaper_Whichstudent();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard <em>Report Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Card</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard
	 * @generated
	 */
	EClass getReportCard();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getId()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentid <em>Studentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentid</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentid()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Studentid();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentname <em>Studentname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentname</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getStudentname()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Studentname();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getTotalscore <em>Totalscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalscore</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getTotalscore()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Totalscore();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getRank()
	 * @see #getReportCard()
	 * @generated
	 */
	EAttribute getReportCard_Rank();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.lab2.metamodel.lab2.ReportCard#getWhichstudent <em>Whichstudent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whichstudent</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.ReportCard#getWhichstudent()
	 * @see #getReportCard()
	 * @generated
	 */
	EReference getReportCard_Whichstudent();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Course#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Course#getId()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Course#getStudentnum <em>Studentnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentnum</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Course#getStudentnum()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Studentnum();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Course#getCoursemean <em>Coursemean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coursemean</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Course#getCoursemean()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Coursemean();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.lab2.metamodel.lab2.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Class#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getId()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Class#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getGrade()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Grade();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Class#getStudentnum <em>Studentnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Studentnum</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getStudentnum()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Studentnum();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.lab2.metamodel.lab2.Class#getMeanscore <em>Meanscore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meanscore</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getMeanscore()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Meanscore();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.Class#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getStudent()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Student();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.lab2.metamodel.lab2.Class#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teacher</em>'.
	 * @see org.rm2pt.lab2.metamodel.lab2.Class#getTeacher()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Teacher();

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
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.UserImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CLASS = eINSTANCE.getUser_Class();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__STUDENT = eINSTANCE.getUser_Student();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__TEACHER = eINSTANCE.getUser_Teacher();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.StudentImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__AGE = eINSTANCE.getStudent_Age();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__ANSWER = eINSTANCE.getStudent_Answer();

		/**
		 * The meta object literal for the '<em><b>Inclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__INCLASS = eINSTANCE.getStudent_Inclass();

		/**
		 * The meta object literal for the '<em><b>Have</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__HAVE = eINSTANCE.getStudent_Have();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.TeacherImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__GRADE = eINSTANCE.getTeacher_Grade();

		/**
		 * The meta object literal for the '<em><b>Couse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__COUSE = eINSTANCE.getTeacher_Couse();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__CORRECT = eINSTANCE.getTeacher_Correct();

		/**
		 * The meta object literal for the '<em><b>Inclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__INCLASS = eINSTANCE.getTeacher_Inclass();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__INPUT = eINSTANCE.getTeacher_Input();

		/**
		 * The meta object literal for the '<em><b>Teaching</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__TEACHING = eINSTANCE.getTeacher_Teaching();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl <em>Examination Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getExaminationPaper()
		 * @generated
		 */
		EClass EXAMINATION_PAPER = eINSTANCE.getExaminationPaper();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__ID = eINSTANCE.getExaminationPaper_Id();

		/**
		 * The meta object literal for the '<em><b>Courseid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__COURSEID = eINSTANCE.getExaminationPaper_Courseid();

		/**
		 * The meta object literal for the '<em><b>Teacherid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__TEACHERID = eINSTANCE.getExaminationPaper_Teacherid();

		/**
		 * The meta object literal for the '<em><b>Studentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__STUDENTID = eINSTANCE.getExaminationPaper_Studentid();

		/**
		 * The meta object literal for the '<em><b>Ifanswer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__IFANSWER = eINSTANCE.getExaminationPaper_Ifanswer();

		/**
		 * The meta object literal for the '<em><b>Ifcorrect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__IFCORRECT = eINSTANCE.getExaminationPaper_Ifcorrect();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMINATION_PAPER__SCORE = eINSTANCE.getExaminationPaper_Score();

		/**
		 * The meta object literal for the '<em><b>Submit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_PAPER__SUBMIT = eINSTANCE.getExaminationPaper_Submit();

		/**
		 * The meta object literal for the '<em><b>Whichcourse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_PAPER__WHICHCOURSE = eINSTANCE.getExaminationPaper_Whichcourse();

		/**
		 * The meta object literal for the '<em><b>Whichstudent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_PAPER__WHICHSTUDENT = eINSTANCE.getExaminationPaper_Whichstudent();

		/**
		 * The meta object literal for the '<em><b>Whichteacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMINATION_PAPER__WHICHTEACHER = eINSTANCE.getExaminationPaper_Whichteacher();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl <em>Submited Paper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.SubmitedPaperImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getSubmitedPaper()
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
		 * The meta object literal for the '<em><b>Studentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__STUDENTID = eINSTANCE.getSubmitedPaper_Studentid();

		/**
		 * The meta object literal for the '<em><b>Teacherid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__TEACHERID = eINSTANCE.getSubmitedPaper_Teacherid();

		/**
		 * The meta object literal for the '<em><b>Couserid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMITED_PAPER__COUSERID = eINSTANCE.getSubmitedPaper_Couserid();

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

		/**
		 * The meta object literal for the '<em><b>Whichcourse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMITED_PAPER__WHICHCOURSE = eINSTANCE.getSubmitedPaper_Whichcourse();

		/**
		 * The meta object literal for the '<em><b>Whichteacher</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMITED_PAPER__WHICHTEACHER = eINSTANCE.getSubmitedPaper_Whichteacher();

		/**
		 * The meta object literal for the '<em><b>Whichstudent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMITED_PAPER__WHICHSTUDENT = eINSTANCE.getSubmitedPaper_Whichstudent();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl <em>Report Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getReportCard()
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
		 * The meta object literal for the '<em><b>Studentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__STUDENTID = eINSTANCE.getReportCard_Studentid();

		/**
		 * The meta object literal for the '<em><b>Studentname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_CARD__STUDENTNAME = eINSTANCE.getReportCard_Studentname();

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
		 * The meta object literal for the '<em><b>Whichstudent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_CARD__WHICHSTUDENT = eINSTANCE.getReportCard_Whichstudent();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.CourseImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getCourse()
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
		 * The meta object literal for the '<em><b>Studentnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__STUDENTNUM = eINSTANCE.getCourse_Studentnum();

		/**
		 * The meta object literal for the '<em><b>Coursemean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSEMEAN = eINSTANCE.getCourse_Coursemean();

		/**
		 * The meta object literal for the '{@link org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.ClassImpl
		 * @see org.rm2pt.lab2.metamodel.lab2.impl.Lab2PackageImpl#getClass_()
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
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__GRADE = eINSTANCE.getClass_Grade();

		/**
		 * The meta object literal for the '<em><b>Studentnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__STUDENTNUM = eINSTANCE.getClass_Studentnum();

		/**
		 * The meta object literal for the '<em><b>Meanscore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__MEANSCORE = eINSTANCE.getClass_Meanscore();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__STUDENT = eINSTANCE.getClass_Student();

		/**
		 * The meta object literal for the '<em><b>Teacher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__TEACHER = eINSTANCE.getClass_Teacher();

	}

} //Lab2Package
