/**
 */
package com.example.mde.model.terraform.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import com.example.mde.model.terraform.Ressource;
import com.example.mde.model.terraform.TerraformFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ressource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RessourceTest extends TestCase {

	/**
	 * The fixture for this Ressource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ressource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RessourceTest.class);
	}

	/**
	 * Constructs a new Ressource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RessourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ressource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ressource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ressource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ressource getFixture() {
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
		setFixture(TerraformFactory.eINSTANCE.createRessource());
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

} //RessourceTest
