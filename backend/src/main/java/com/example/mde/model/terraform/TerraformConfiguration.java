/**
 */
package com.example.mde.model.terraform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terraform.TerraformConfiguration#getResources <em>Resources</em>}</li>
 *   <li>{@link terraform.TerraformConfiguration#getVariables <em>Variables</em>}</li>
 *   <li>{@link terraform.TerraformConfiguration#getProviders <em>Providers</em>}</li>
 *   <li>{@link terraform.TerraformConfiguration#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see terraform.TerraformPackage#getTerraformConfiguration()
 * @model
 * @generated
 */
public interface TerraformConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link terraform.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see terraform.TerraformPackage#getTerraformConfiguration_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getResources();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link terraform.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see terraform.TerraformPackage#getTerraformConfiguration_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link terraform.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see terraform.TerraformPackage#getTerraformConfiguration_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link terraform.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see terraform.TerraformPackage#getTerraformConfiguration_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

} // TerraformConfiguration
