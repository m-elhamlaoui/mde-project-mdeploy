/**
 */
package com.example.mde.model.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gitlab.Test#getClassesToTest <em>Classes To Test</em>}</li>
 * </ul>
 *
 * @see gitlab.GitlabPackage#getTest()
 * @model
 * @generated
 */
public interface Test extends Stage {
	/**
	 * Returns the value of the '<em><b>Classes To Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes To Test</em>' attribute.
	 * @see #setClassesToTest(String)
	 * @see gitlab.GitlabPackage#getTest_ClassesToTest()
	 * @model
	 * @generated
	 */
	String getClassesToTest();

	/**
	 * Sets the value of the '{@link gitlab.Test#getClassesToTest <em>Classes To Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes To Test</em>' attribute.
	 * @see #getClassesToTest()
	 * @generated
	 */
	void setClassesToTest(String value);

} // Test
