/**
 */
package InitConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see InitConfig.InitConfigFactory
 * @model kind="package"
 * @generated
 */
public interface InitConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "InitConfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://initConfig.ma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "InitConfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InitConfigPackage eINSTANCE = InitConfig.impl.InitConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link InitConfig.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see InitConfig.impl.ProjectImpl
	 * @see InitConfig.impl.InitConfigPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__URL = 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BRANCH = 2;

	/**
	 * The feature id for the '<em><b>Buildconfigs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUILDCONFIGS = 3;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TESTS = 4;

	/**
	 * The feature id for the '<em><b>Deployconfigs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPLOYCONFIGS = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link InitConfig.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see InitConfig.impl.BuildImpl
	 * @see InitConfig.impl.InitConfigPackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CMD = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link InitConfig.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see InitConfig.impl.TestImpl
	 * @see InitConfig.impl.InitConfigPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CMD = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PROJECT = 4;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link InitConfig.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see InitConfig.impl.DeployImpl
	 * @see InitConfig.impl.InitConfigPackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 3;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__CMD = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PROJECT = 1;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link InitConfig.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see InitConfig.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see InitConfig.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Project#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see InitConfig.Project#getUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Url();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Project#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see InitConfig.Project#getBranch()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Branch();

	/**
	 * Returns the meta object for the containment reference list '{@link InitConfig.Project#getBuildconfigs <em>Buildconfigs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buildconfigs</em>'.
	 * @see InitConfig.Project#getBuildconfigs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Buildconfigs();

	/**
	 * Returns the meta object for the containment reference list '{@link InitConfig.Project#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see InitConfig.Project#getTests()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Tests();

	/**
	 * Returns the meta object for the containment reference list '{@link InitConfig.Project#getDeployconfigs <em>Deployconfigs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployconfigs</em>'.
	 * @see InitConfig.Project#getDeployconfigs()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Deployconfigs();

	/**
	 * Returns the meta object for class '{@link InitConfig.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see InitConfig.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Build#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see InitConfig.Build#getTool()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Tool();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Build#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see InitConfig.Build#getCmd()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Build#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Params</em>'.
	 * @see InitConfig.Build#getParams()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Params();

	/**
	 * Returns the meta object for the reference '{@link InitConfig.Build#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see InitConfig.Build#getProject()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Project();

	/**
	 * Returns the meta object for class '{@link InitConfig.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see InitConfig.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see InitConfig.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Test#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see InitConfig.Test#getType()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Type();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Test#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see InitConfig.Test#getCmd()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Test#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see InitConfig.Test#getStatus()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Status();

	/**
	 * Returns the meta object for the reference '{@link InitConfig.Test#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see InitConfig.Test#getProject()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Project();

	/**
	 * Returns the meta object for class '{@link InitConfig.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see InitConfig.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the attribute '{@link InitConfig.Deploy#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see InitConfig.Deploy#getCmd()
	 * @see #getDeploy()
	 * @generated
	 */
	EAttribute getDeploy_Cmd();

	/**
	 * Returns the meta object for the reference '{@link InitConfig.Deploy#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see InitConfig.Deploy#getProject()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Project();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InitConfigFactory getInitConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link InitConfig.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see InitConfig.impl.ProjectImpl
		 * @see InitConfig.impl.InitConfigPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__URL = eINSTANCE.getProject_Url();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BRANCH = eINSTANCE.getProject_Branch();

		/**
		 * The meta object literal for the '<em><b>Buildconfigs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BUILDCONFIGS = eINSTANCE.getProject_Buildconfigs();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__TESTS = eINSTANCE.getProject_Tests();

		/**
		 * The meta object literal for the '<em><b>Deployconfigs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DEPLOYCONFIGS = eINSTANCE.getProject_Deployconfigs();

		/**
		 * The meta object literal for the '{@link InitConfig.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see InitConfig.impl.BuildImpl
		 * @see InitConfig.impl.InitConfigPackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TOOL = eINSTANCE.getBuild_Tool();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__CMD = eINSTANCE.getBuild_Cmd();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__PARAMS = eINSTANCE.getBuild_Params();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PROJECT = eINSTANCE.getBuild_Project();

		/**
		 * The meta object literal for the '{@link InitConfig.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see InitConfig.impl.TestImpl
		 * @see InitConfig.impl.InitConfigPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__TYPE = eINSTANCE.getTest_Type();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__CMD = eINSTANCE.getTest_Cmd();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__STATUS = eINSTANCE.getTest_Status();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__PROJECT = eINSTANCE.getTest_Project();

		/**
		 * The meta object literal for the '{@link InitConfig.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see InitConfig.impl.DeployImpl
		 * @see InitConfig.impl.InitConfigPackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY__CMD = eINSTANCE.getDeploy_Cmd();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__PROJECT = eINSTANCE.getDeploy_Project();

	}

} //InitConfigPackage
