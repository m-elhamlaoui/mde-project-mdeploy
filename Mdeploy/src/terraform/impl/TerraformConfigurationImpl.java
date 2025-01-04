/**
 */
package terraform.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import terraform.Output;
import terraform.Provider;
import terraform.Ressource;
import terraform.TerraformConfiguration;
import terraform.TerraformPackage;
import terraform.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terraform.impl.TerraformConfigurationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link terraform.impl.TerraformConfigurationImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link terraform.impl.TerraformConfigurationImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link terraform.impl.TerraformConfigurationImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerraformConfigurationImpl extends MinimalEObjectImpl.Container implements TerraformConfiguration {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> resources;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providers;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerraformConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerraformPackage.Literals.TERRAFORM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ressource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Ressource>(Ressource.class, this, TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Provider> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<Provider>(Provider.class, this, TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
			case TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES:
				return getResources();
			case TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES:
				return getVariables();
			case TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS:
				return getProviders();
			case TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS:
				return getOutputs();
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
			case TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Ressource>)newValue);
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends Provider>)newValue);
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
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
			case TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES:
				getResources().clear();
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES:
				getVariables().clear();
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS:
				getProviders().clear();
				return;
			case TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS:
				getOutputs().clear();
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
			case TerraformPackage.TERRAFORM_CONFIGURATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case TerraformPackage.TERRAFORM_CONFIGURATION__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TerraformPackage.TERRAFORM_CONFIGURATION__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case TerraformPackage.TERRAFORM_CONFIGURATION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerraformConfigurationImpl
