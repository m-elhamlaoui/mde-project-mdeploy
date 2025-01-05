/**
 */
package com.example.mde.model.gitlab.impl;

import com.example.mde.model.gitlab.Clone;
import com.example.mde.model.gitlab.GitlabPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gitlab.impl.CloneImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link gitlab.impl.CloneImpl#getCreadentialId <em>Creadential Id</em>}</li>
 *   <li>{@link gitlab.impl.CloneImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloneImpl extends StageImpl implements Clone {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreadentialId() <em>Creadential Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreadentialId()
	 * @generated
	 * @ordered
	 */
	protected static final String CREADENTIAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreadentialId() <em>Creadential Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreadentialId()
	 * @generated
	 * @ordered
	 */
	protected String creadentialId = CREADENTIAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected String branch = BRANCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitlabPackage.Literals.CLONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GitlabPackage.CLONE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreadentialId() {
		return creadentialId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreadentialId(String newCreadentialId) {
		String oldCreadentialId = creadentialId;
		creadentialId = newCreadentialId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GitlabPackage.CLONE__CREADENTIAL_ID, oldCreadentialId, creadentialId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranch() {
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch(String newBranch) {
		String oldBranch = branch;
		branch = newBranch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GitlabPackage.CLONE__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitlabPackage.CLONE__URL:
				return getUrl();
			case GitlabPackage.CLONE__CREADENTIAL_ID:
				return getCreadentialId();
			case GitlabPackage.CLONE__BRANCH:
				return getBranch();
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
			case GitlabPackage.CLONE__URL:
				setUrl((String)newValue);
				return;
			case GitlabPackage.CLONE__CREADENTIAL_ID:
				setCreadentialId((String)newValue);
				return;
			case GitlabPackage.CLONE__BRANCH:
				setBranch((String)newValue);
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
			case GitlabPackage.CLONE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GitlabPackage.CLONE__CREADENTIAL_ID:
				setCreadentialId(CREADENTIAL_ID_EDEFAULT);
				return;
			case GitlabPackage.CLONE__BRANCH:
				setBranch(BRANCH_EDEFAULT);
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
			case GitlabPackage.CLONE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GitlabPackage.CLONE__CREADENTIAL_ID:
				return CREADENTIAL_ID_EDEFAULT == null ? creadentialId != null : !CREADENTIAL_ID_EDEFAULT.equals(creadentialId);
			case GitlabPackage.CLONE__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", creadentialId: ");
		result.append(creadentialId);
		result.append(", branch: ");
		result.append(branch);
		result.append(')');
		return result.toString();
	}

} //CloneImpl
