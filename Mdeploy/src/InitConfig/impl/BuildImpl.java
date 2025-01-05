/**
 */
package InitConfig.impl;

import InitConfig.Build;
import InitConfig.InitConfigPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link InitConfig.impl.BuildImpl#getName <em>Name</em>}</li>
 *   <li>{@link InitConfig.impl.BuildImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link InitConfig.impl.BuildImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildImpl extends MinimalEObjectImpl.Container implements Build {
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
	 * The default value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected static final String CMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected String cmd = CMD_EDEFAULT;

	/**
	 * The default value of the '{@link #getParams() <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected String params = PARAMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitConfigPackage.Literals.BUILD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.BUILD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCmd(String newCmd) {
		String oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.BUILD__CMD, oldCmd, cmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParams() {
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParams(String newParams) {
		String oldParams = params;
		params = newParams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitConfigPackage.BUILD__PARAMS, oldParams, params));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InitConfigPackage.BUILD__NAME:
				return getName();
			case InitConfigPackage.BUILD__CMD:
				return getCmd();
			case InitConfigPackage.BUILD__PARAMS:
				return getParams();
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
			case InitConfigPackage.BUILD__NAME:
				setName((String)newValue);
				return;
			case InitConfigPackage.BUILD__CMD:
				setCmd((String)newValue);
				return;
			case InitConfigPackage.BUILD__PARAMS:
				setParams((String)newValue);
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
			case InitConfigPackage.BUILD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InitConfigPackage.BUILD__CMD:
				setCmd(CMD_EDEFAULT);
				return;
			case InitConfigPackage.BUILD__PARAMS:
				setParams(PARAMS_EDEFAULT);
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
			case InitConfigPackage.BUILD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InitConfigPackage.BUILD__CMD:
				return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
			case InitConfigPackage.BUILD__PARAMS:
				return PARAMS_EDEFAULT == null ? params != null : !PARAMS_EDEFAULT.equals(params);
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
		result.append(", cmd: ");
		result.append(cmd);
		result.append(", params: ");
		result.append(params);
		result.append(')');
		return result.toString();
	}

} //BuildImpl
