/**
 */
package InitConfig.impl;

import InitConfig.Build;
import InitConfig.Deploy;
import InitConfig.InitConfigPackage;
import InitConfig.Project;
import InitConfig.Test;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link InitConfig.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link InitConfig.impl.ProjectImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link InitConfig.impl.ProjectImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link InitConfig.impl.ProjectImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link InitConfig.impl.ProjectImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link InitConfig.impl.ProjectImpl#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected EList<Build> build;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> tests;

	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected EList<Deploy> deploy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitConfigPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.PROJECT__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.PROJECT__BRANCH, oldBranch, branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Build> getBuild() {
		if (build == null) {
			build = new EObjectContainmentEList<Build>(Build.class, this, InitConfigPackage.PROJECT__BUILD);
		}
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Test> getTests() {
		if (tests == null) {
			tests = new EObjectContainmentEList<Test>(Test.class, this, InitConfigPackage.PROJECT__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deploy> getDeploy() {
		if (deploy == null) {
			deploy = new EObjectContainmentEList<Deploy>(Deploy.class, this, InitConfigPackage.PROJECT__DEPLOY);
		}
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InitConfigPackage.PROJECT__BUILD:
				return ((InternalEList<?>)getBuild()).basicRemove(otherEnd, msgs);
			case InitConfigPackage.PROJECT__TESTS:
				return ((InternalEList<?>)getTests()).basicRemove(otherEnd, msgs);
			case InitConfigPackage.PROJECT__DEPLOY:
				return ((InternalEList<?>)getDeploy()).basicRemove(otherEnd, msgs);
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
			case InitConfigPackage.PROJECT__NAME:
				return getName();
			case InitConfigPackage.PROJECT__URL:
				return getUrl();
			case InitConfigPackage.PROJECT__BRANCH:
				return getBranch();
			case InitConfigPackage.PROJECT__BUILD:
				return getBuild();
			case InitConfigPackage.PROJECT__TESTS:
				return getTests();
			case InitConfigPackage.PROJECT__DEPLOY:
				return getDeploy();
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
			case InitConfigPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case InitConfigPackage.PROJECT__URL:
				setUrl((String)newValue);
				return;
			case InitConfigPackage.PROJECT__BRANCH:
				setBranch((String)newValue);
				return;
			case InitConfigPackage.PROJECT__BUILD:
				getBuild().clear();
				getBuild().addAll((Collection<? extends Build>)newValue);
				return;
			case InitConfigPackage.PROJECT__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends Test>)newValue);
				return;
			case InitConfigPackage.PROJECT__DEPLOY:
				getDeploy().clear();
				getDeploy().addAll((Collection<? extends Deploy>)newValue);
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
			case InitConfigPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InitConfigPackage.PROJECT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case InitConfigPackage.PROJECT__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case InitConfigPackage.PROJECT__BUILD:
				getBuild().clear();
				return;
			case InitConfigPackage.PROJECT__TESTS:
				getTests().clear();
				return;
			case InitConfigPackage.PROJECT__DEPLOY:
				getDeploy().clear();
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
			case InitConfigPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InitConfigPackage.PROJECT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case InitConfigPackage.PROJECT__BRANCH:
				return BRANCH_EDEFAULT == null ? branch != null : !BRANCH_EDEFAULT.equals(branch);
			case InitConfigPackage.PROJECT__BUILD:
				return build != null && !build.isEmpty();
			case InitConfigPackage.PROJECT__TESTS:
				return tests != null && !tests.isEmpty();
			case InitConfigPackage.PROJECT__DEPLOY:
				return deploy != null && !deploy.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", branch: ");
		result.append(branch);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
