/**
 */
package org.rm2pt.lab2.metamodel.lab2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rm2pt.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.lab2.metamodel.lab2.ReportCard;
import org.rm2pt.lab2.metamodel.lab2.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getStudentid <em>Studentid</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getStudentname <em>Studentname</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getTotalscore <em>Totalscore</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link org.rm2pt.lab2.metamodel.lab2.impl.ReportCardImpl#getWhichstudent <em>Whichstudent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportCardImpl extends MinimalEObjectImpl.Container implements ReportCard {
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
	 * The default value of the '{@link #getStudentname() <em>Studentname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentname()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentname() <em>Studentname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentname()
	 * @generated
	 * @ordered
	 */
	protected String studentname = STUDENTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalscore() <em>Totalscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalscore()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTALSCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalscore() <em>Totalscore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalscore()
	 * @generated
	 * @ordered
	 */
	protected float totalscore = TOTALSCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2Package.Literals.REPORT_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__STUDENTID, oldStudentid,
					studentid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentname() {
		return studentname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentname(String newStudentname) {
		String oldStudentname = studentname;
		studentname = newStudentname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__STUDENTNAME, oldStudentname,
					studentname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalscore() {
		return totalscore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalscore(float newTotalscore) {
		float oldTotalscore = totalscore;
		totalscore = newTotalscore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__TOTALSCORE, oldTotalscore,
					totalscore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__RANK, oldRank, rank));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2Package.REPORT_CARD__WHICHSTUDENT,
							oldWhichstudent, whichstudent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__WHICHSTUDENT,
					oldWhichstudent, whichstudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.REPORT_CARD__ID:
			return getId();
		case Lab2Package.REPORT_CARD__STUDENTID:
			return getStudentid();
		case Lab2Package.REPORT_CARD__STUDENTNAME:
			return getStudentname();
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			return getTotalscore();
		case Lab2Package.REPORT_CARD__RANK:
			return getRank();
		case Lab2Package.REPORT_CARD__WHICHSTUDENT:
			if (resolve)
				return getWhichstudent();
			return basicGetWhichstudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab2Package.REPORT_CARD__ID:
			setId((String) newValue);
			return;
		case Lab2Package.REPORT_CARD__STUDENTID:
			setStudentid((String) newValue);
			return;
		case Lab2Package.REPORT_CARD__STUDENTNAME:
			setStudentname((String) newValue);
			return;
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			setTotalscore((Float) newValue);
			return;
		case Lab2Package.REPORT_CARD__RANK:
			setRank((Integer) newValue);
			return;
		case Lab2Package.REPORT_CARD__WHICHSTUDENT:
			setWhichstudent((Student) newValue);
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
		case Lab2Package.REPORT_CARD__ID:
			setId(ID_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__STUDENTID:
			setStudentid(STUDENTID_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__STUDENTNAME:
			setStudentname(STUDENTNAME_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			setTotalscore(TOTALSCORE_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__RANK:
			setRank(RANK_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__WHICHSTUDENT:
			setWhichstudent((Student) null);
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
		case Lab2Package.REPORT_CARD__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Lab2Package.REPORT_CARD__STUDENTID:
			return STUDENTID_EDEFAULT == null ? studentid != null : !STUDENTID_EDEFAULT.equals(studentid);
		case Lab2Package.REPORT_CARD__STUDENTNAME:
			return STUDENTNAME_EDEFAULT == null ? studentname != null : !STUDENTNAME_EDEFAULT.equals(studentname);
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			return totalscore != TOTALSCORE_EDEFAULT;
		case Lab2Package.REPORT_CARD__RANK:
			return rank != RANK_EDEFAULT;
		case Lab2Package.REPORT_CARD__WHICHSTUDENT:
			return whichstudent != null;
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
		result.append(", studentid: ");
		result.append(studentid);
		result.append(", studentname: ");
		result.append(studentname);
		result.append(", totalscore: ");
		result.append(totalscore);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ReportCardImpl
