/**
 */
package com.example.mde.model.terraform.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import com.example.mde.model.terraform.Provider;
import com.example.mde.model.terraform.TerraformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProviderTest extends TestCase {

	/**
	 * The fixture for this Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Provider fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProviderTest.class);
	}

	/**
	 * Constructs a new Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Provider fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Provider getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TerraformFactory.eINSTANCE.createProvider());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProviderTest
