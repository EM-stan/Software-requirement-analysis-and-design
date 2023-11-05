/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rm2pt.lab2.metamodel.lab2.Course;
import org.rm2pt.lab2.metamodel.lab2.ExaminationPaper;
import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.Student;
import org.rm2pt.lab2.metamodel.lab2.SubmitedPaper;
import org.rm2pt.lab2.metamodel.lab2.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Examination Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getCourseid <em>Courseid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getTeacherid <em>Teacherid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#isIfanswer <em>Ifanswer</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#isIfcorrect <em>Ifcorrect</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getScore <em>Score</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getSubmit <em>Submit</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getWhichcourse <em>Whichcourse</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getWhichstudent <em>Whichstudent</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ExaminationPaperImpl#getWhichteacher <em>Whichteacher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExaminationPaperImpl extends MinimalEObjectImpl.Container implements ExaminationPaper {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseid() <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseid()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSEID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseid() <em>Courseid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseid()
	 * @generated
	 * @ordered
	 */
	protected String courseid = COURSEID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeacherid() <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacherid()
	 * @generated
	 * @ordered
	 */
	protected static final String TEACHERID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeacherid() <em>Teacherid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacherid()
	 * @generated
	 * @ordered
	 */
	protected String teacherid = TEACHERID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudentid() <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentid()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentid() <em>Studentid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentid()
	 * @generated
	 * @ordered
	 */
	protected String studentid = STUDENTID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIfanswer() <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfanswer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IFANSWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIfanswer() <em>Ifanswer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfanswer()
	 * @generated
	 * @ordered
	 */
	protected boolean ifanswer = IFANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIfcorrect() <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfcorrect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IFCORRECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIfcorrect() <em>Ifcorrect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfcorrect()
	 * @generated
	 * @ordered
	 */
	protected boolean ifcorrect = IFCORRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final float SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected float score = SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubmit() <em>Submit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmit()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmitedPaper> submit;

	/**
	 * The cached value of the '{@link #getWhichcourse() <em>Whichcourse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichcourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> whichcourse;

	/**
	 * The cached value of the '{@link #getWhichstudent() <em>Whichstudent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichstudent()
	 * @generated
	 * @ordered
	 */
	protected Student whichstudent;

	/**
	 * The cached value of the '{@link #getWhichteacher() <em>Whichteacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhichteacher()
	 * @generated
	 * @ordered
	 */
	protected Teacher whichteacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExaminationPaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.EXAMINATION_PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseid() {
		return courseid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseid(String newCourseid) {
		String oldCourseid = courseid;
		courseid = newCourseid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__COURSEID, oldCourseid,
					courseid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeacherid() {
		return teacherid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacherid(String newTeacherid) {
		String oldTeacherid = teacherid;
		teacherid = newTeacherid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__TEACHERID,
					oldTeacherid, teacherid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentid() {
		return studentid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentid(String newStudentid) {
		String oldStudentid = studentid;
		studentid = newStudentid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__STUDENTID,
					oldStudentid, studentid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIfanswer() {
		return ifanswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfanswer(boolean newIfanswer) {
		boolean oldIfanswer = ifanswer;
		ifanswer = newIfanswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__IFANSWER, oldIfanswer,
					ifanswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIfcorrect() {
		return ifcorrect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcorrect(boolean newIfcorrect) {
		boolean oldIfcorrect = ifcorrect;
		ifcorrect = newIfcorrect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__IFCORRECT,
					oldIfcorrect, ifcorrect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(float newScore) {
		float oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__SCORE, oldScore,
					score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmitedPaper> getSubmit() {
		if (submit == null) {
			submit = new EObjectContainmentEList<SubmitedPaper>(SubmitedPaper.class, this,
					Lab2Package.EXAMINATION_PAPER__SUBMIT);
		}
		return submit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getWhichcourse() {
		if (whichcourse == null) {
			whichcourse = new EObjectResolvingEList<Course>(Course.class, this,
					Lab2Package.EXAMINATION_PAPER__WHICHCOURSE);
		}
		return whichcourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student getWhichstudent() {
		if (whichstudent != null && whichstudent.eIsProxy()) {
			InternalEObject oldWhichstudent = (InternalEObject) whichstudent;
			whichstudent = (Student) eResolveProxy(oldWhichstudent);
			if (whichstudent != oldWhichstudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT, oldWhichstudent, whichstudent));
			}
		}
		return whichstudent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetWhichstudent() {
		return whichstudent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhichstudent(Student newWhichstudent) {
		Student oldWhichstudent = whichstudent;
		whichstudent = newWhichstudent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT,
					oldWhichstudent, whichstudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher getWhichteacher() {
		if (whichteacher != null && whichteacher.eIsProxy()) {
			InternalEObject oldWhichteacher = (InternalEObject) whichteacher;
			whichteacher = (Teacher) eResolveProxy(oldWhichteacher);
			if (whichteacher != oldWhichteacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Lab2Package.EXAMINATION_PAPER__WHICHTEACHER, oldWhichteacher, whichteacher));
			}
		}
		return whichteacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetWhichteacher() {
		return whichteacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhichteacher(Teacher newWhichteacher) {
		Teacher oldWhichteacher = whichteacher;
		whichteacher = newWhichteacher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.EXAMINATION_PAPER__WHICHTEACHER,
					oldWhichteacher, whichteacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			return ((InternalEList<?>) getSubmit()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.EXAMINATION_PAPER__ID:
			return getId();
		case Lab2Package.EXAMINATION_PAPER__COURSEID:
			return getCourseid();
		case Lab2Package.EXAMINATION_PAPER__TEACHERID:
			return getTeacherid();
		case Lab2Package.EXAMINATION_PAPER__STUDENTID:
			return getStudentid();
		case Lab2Package.EXAMINATION_PAPER__IFANSWER:
			return isIfanswer();
		case Lab2Package.EXAMINATION_PAPER__IFCORRECT:
			return isIfcorrect();
		case Lab2Package.EXAMINATION_PAPER__SCORE:
			return getScore();
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			return getSubmit();
		case Lab2Package.EXAMINATION_PAPER__WHICHCOURSE:
			return getWhichcourse();
		case Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT:
			if (resolve)
				return getWhichstudent();
			return basicGetWhichstudent();
		case Lab2Package.EXAMINATION_PAPER__WHICHTEACHER:
			if (resolve)
				return getWhichteacher();
			return basicGetWhichteacher();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab2Package.EXAMINATION_PAPER__ID:
			setId((String) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__COURSEID:
			setCourseid((String) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__TEACHERID:
			setTeacherid((String) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__STUDENTID:
			setStudentid((String) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__IFANSWER:
			setIfanswer((Boolean) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__IFCORRECT:
			setIfcorrect((Boolean) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__SCORE:
			setScore((Float) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			getSubmit().clear();
			getSubmit().addAll((Collection<? extends SubmitedPaper>) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHCOURSE:
			getWhichcourse().clear();
			getWhichcourse().addAll((Collection<? extends Course>) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT:
			setWhichstudent((Student) newValue);
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHTEACHER:
			setWhichteacher((Teacher) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Lab2Package.EXAMINATION_PAPER__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__COURSEID:
			setCourseid(COURSEID_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__TEACHERID:
			setTeacherid(TEACHERID_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__STUDENTID:
			setStudentid(STUDENTID_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__IFANSWER:
			setIfanswer(IFANSWER_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__IFCORRECT:
			setIfcorrect(IFCORRECT_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__SCORE:
			setScore(SCORE_EDEFAULT);
			return;
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			getSubmit().clear();
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHCOURSE:
			getWhichcourse().clear();
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT:
			setWhichstudent((Student) null);
			return;
		case Lab2Package.EXAMINATION_PAPER__WHICHTEACHER:
			setWhichteacher((Teacher) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Lab2Package.EXAMINATION_PAPER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.EXAMINATION_PAPER__COURSEID:
			return COURSEID_EDEFAULT == null ? courseid != null : !COURSEID_EDEFAULT.equals(courseid);
		case Lab2Package.EXAMINATION_PAPER__TEACHERID:
			return TEACHERID_EDEFAULT == null ? teacherid != null : !TEACHERID_EDEFAULT.equals(teacherid);
		case Lab2Package.EXAMINATION_PAPER__STUDENTID:
			return STUDENTID_EDEFAULT == null ? studentid != null : !STUDENTID_EDEFAULT.equals(studentid);
		case Lab2Package.EXAMINATION_PAPER__IFANSWER:
			return ifanswer != IFANSWER_EDEFAULT;
		case Lab2Package.EXAMINATION_PAPER__IFCORRECT:
			return ifcorrect != IFCORRECT_EDEFAULT;
		case Lab2Package.EXAMINATION_PAPER__SCORE:
			return score != SCORE_EDEFAULT;
		case Lab2Package.EXAMINATION_PAPER__SUBMIT:
			return submit != null && !submit.isEmpty();
		case Lab2Package.EXAMINATION_PAPER__WHICHCOURSE:
			return whichcourse != null && !whichcourse.isEmpty();
		case Lab2Package.EXAMINATION_PAPER__WHICHSTUDENT:
			return whichstudent != null;
		case Lab2Package.EXAMINATION_PAPER__WHICHTEACHER:
			return whichteacher != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", courseid: ");
		result.append(courseid);
		result.append(", teacherid: ");
		result.append(teacherid);
		result.append(", studentid: ");
		result.append(studentid);
		result.append(", ifanswer: ");
		result.append(ifanswer);
		result.append(", ifcorrect: ");
		result.append(ifcorrect);
		result.append(", score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //ExaminationPaperImpl
