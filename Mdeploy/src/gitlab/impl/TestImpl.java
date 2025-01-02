/**
 */
package gitlab.impl;

import gitlab.GitlabPackage;
import gitlab.Test;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gitlab.impl.TestImpl#getClassesToTest <em>Classes To Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends StageImpl implements Test {
	/**
	 * The default value of the '{@link #getClassesToTest() <em>Classes To Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesToTest()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSES_TO_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassesToTest() <em>Classes To Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesToTest()
	 * @generated
	 * @ordered
	 */
	protected String classesToTest = CLASSES_TO_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitlabPackage.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassesToTest() {
		return classesToTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassesToTest(String newClassesToTest) {
		String oldClassesToTest = classesToTest;
		classesToTest = newClassesToTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GitlabPackage.TEST__CLASSES_TO_TEST, oldClassesToTest, classesToTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitlabPackage.TEST__CLASSES_TO_TEST:
				return getClassesToTest();
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
			case GitlabPackage.TEST__CLASSES_TO_TEST:
				setClassesToTest((String)newValue);
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
			case GitlabPackage.TEST__CLASSES_TO_TEST:
				setClassesToTest(CLASSES_TO_TEST_EDEFAULT);
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
			case GitlabPackage.TEST__CLASSES_TO_TEST:
				return CLASSES_TO_TEST_EDEFAULT == null ? classesToTest != null : !CLASSES_TO_TEST_EDEFAULT.equals(classesToTest);
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
		result.append(" (ClassesToTest: ");
		result.append(classesToTest);
		result.append(')');
		return result.toString();
	}

} //TestImpl
