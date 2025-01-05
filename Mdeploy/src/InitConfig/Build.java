/**
 */
package InitConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link InitConfig.Build#getName <em>Name</em>}</li>
 *   <li>{@link InitConfig.Build#getCmd <em>Cmd</em>}</li>
 *   <li>{@link InitConfig.Build#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see InitConfig.InitConfigPackage#getBuild()
 * @model
 * @generated
 */
public interface Build extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see InitConfig.InitConfigPackage#getBuild_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link InitConfig.Build#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see InitConfig.InitConfigPackage#getBuild_Cmd()
	 * @model
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link InitConfig.Build#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' attribute.
	 * @see #setParams(String)
	 * @see InitConfig.InitConfigPackage#getBuild_Params()
	 * @model
	 * @generated
	 */
	String getParams();

	/**
	 * Sets the value of the '{@link InitConfig.Build#getParams <em>Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Params</em>' attribute.
	 * @see #getParams()
	 * @generated
	 */
	void setParams(String value);

} // Build
