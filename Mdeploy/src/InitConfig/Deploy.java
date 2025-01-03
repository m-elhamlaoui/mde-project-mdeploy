/**
 */
package InitConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link InitConfig.Deploy#getCmd <em>Cmd</em>}</li>
 *   <li>{@link InitConfig.Deploy#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see InitConfig.InitConfigPackage#getDeploy()
 * @model
 * @generated
 */
public interface Deploy extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see #setCmd(String)
	 * @see InitConfig.InitConfigPackage#getDeploy_Cmd()
	 * @model
	 * @generated
	 */
	String getCmd();

	/**
	 * Sets the value of the '{@link InitConfig.Deploy#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see InitConfig.InitConfigPackage#getDeploy_Project()
	 * @model required="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link InitConfig.Deploy#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

} // Deploy
