/**
 */
package InitConfig;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link InitConfig.Project#getName <em>Name</em>}</li>
 *   <li>{@link InitConfig.Project#getUrl <em>Url</em>}</li>
 *   <li>{@link InitConfig.Project#getBranch <em>Branch</em>}</li>
 *   <li>{@link InitConfig.Project#getBuild <em>Build</em>}</li>
 *   <li>{@link InitConfig.Project#getTests <em>Tests</em>}</li>
 *   <li>{@link InitConfig.Project#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see InitConfig.InitConfigPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see InitConfig.InitConfigPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link InitConfig.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see InitConfig.InitConfigPackage#getProject_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link InitConfig.Project#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see InitConfig.InitConfigPackage#getProject_Branch()
	 * @model
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link InitConfig.Project#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' containment reference list.
	 * The list contents are of type {@link InitConfig.Build}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' containment reference list.
	 * @see InitConfig.InitConfigPackage#getProject_Build()
	 * @model containment="true"
	 * @generated
	 */
	EList<Build> getBuild();

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link InitConfig.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see InitConfig.InitConfigPackage#getProject_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getTests();

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference list.
	 * The list contents are of type {@link InitConfig.Deploy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference list.
	 * @see InitConfig.InitConfigPackage#getProject_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deploy> getDeploy();

} // Project
