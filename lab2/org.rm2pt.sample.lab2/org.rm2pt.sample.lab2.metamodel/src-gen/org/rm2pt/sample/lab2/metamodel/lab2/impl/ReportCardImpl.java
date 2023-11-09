/**
 */
package org.rm2pt.sample.lab2.metamodel.lab2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rm2pt.sample.lab2.metamodel.lab2.Lab2Package;
import org.rm2pt.sample.lab2.metamodel.lab2.ReportCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl#getStuid <em>Stuid</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl#getStuname <em>Stuname</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl#getTotalscore <em>Totalscore</em>}</li>
 *   <li>{@link org.rm2pt.sample.lab2.metamodel.lab2.impl.ReportCardImpl#getRank <em>Rank</em>}</li>
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
	 * The default value of the '{@link #getStuid() <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuid()
	 * @generated
	 * @ordered
	 */
	protected static final String STUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStuid() <em>Stuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuid()
	 * @generated
	 * @ordered
	 */
	protected String stuid = STUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStuname() <em>Stuname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuname()
	 * @generated
	 * @ordered
	 */
	protected static final String STUNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStuname() <em>Stuname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuname()
	 * @generated
	 * @ordered
	 */
	protected String stuname = STUNAME_EDEFAULT;

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
	public String getStuid() {
		return stuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStuid(String newStuid) {
		String oldStuid = stuid;
		stuid = newStuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__STUID, oldStuid, stuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStuname() {
		return stuname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStuname(String newStuname) {
		String oldStuname = stuname;
		stuname = newStuname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2Package.REPORT_CARD__STUNAME, oldStuname,
					stuname));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab2Package.REPORT_CARD__ID:
			return getId();
		case Lab2Package.REPORT_CARD__STUID:
			return getStuid();
		case Lab2Package.REPORT_CARD__STUNAME:
			return getStuname();
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			return getTotalscore();
		case Lab2Package.REPORT_CARD__RANK:
			return getRank();
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
		case Lab2Package.REPORT_CARD__STUID:
			setStuid((String) newValue);
			return;
		case Lab2Package.REPORT_CARD__STUNAME:
			setStuname((String) newValue);
			return;
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			setTotalscore((Float) newValue);
			return;
		case Lab2Package.REPORT_CARD__RANK:
			setRank((Integer) newValue);
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
		case Lab2Package.REPORT_CARD__STUID:
			setStuid(STUID_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__STUNAME:
			setStuname(STUNAME_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			setTotalscore(TOTALSCORE_EDEFAULT);
			return;
		case Lab2Package.REPORT_CARD__RANK:
			setRank(RANK_EDEFAULT);
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
		case Lab2Package.REPORT_CARD__STUID:
			return STUID_EDEFAULT == null ? stuid != null : !STUID_EDEFAULT.equals(stuid);
		case Lab2Package.REPORT_CARD__STUNAME:
			return STUNAME_EDEFAULT == null ? stuname != null : !STUNAME_EDEFAULT.equals(stuname);
		case Lab2Package.REPORT_CARD__TOTALSCORE:
			return totalscore != TOTALSCORE_EDEFAULT;
		case Lab2Package.REPORT_CARD__RANK:
			return rank != RANK_EDEFAULT;
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
		result.append(", stuid: ");
		result.append(stuid);
		result.append(", stuname: ");
		result.append(stuname);
		result.append(", totalscore: ");
		result.append(totalscore);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ReportCardImpl
