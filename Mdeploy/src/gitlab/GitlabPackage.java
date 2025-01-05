/**
 */
package gitlab;

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
 * @see gitlab.GitlabFactory
 * @model kind="package"
 * @generated
 */
public interface GitlabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gitlab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://gitlab.ma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gitlab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GitlabPackage eINSTANCE = gitlab.impl.GitlabPackageImpl.init();

	/**
	 * The meta object id for the '{@link gitlab.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.PipelineImpl
	 * @see gitlab.impl.GitlabPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGES = 1;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.StageImpl
	 * @see gitlab.impl.GitlabPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ORDER = 2;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__PIPELINE = 3;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ARTIFACTS = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TRIGGER = 5;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.CloneImpl <em>Clone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.CloneImpl
	 * @see gitlab.impl.GitlabPackageImpl#getClone()
	 * @generated
	 */
	int CLONE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__NAME = STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__SCRIPT = STAGE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__ORDER = STAGE__ORDER;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__PIPELINE = STAGE__PIPELINE;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__ARTIFACTS = STAGE__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__TRIGGER = STAGE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__URL = STAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creadential Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__CREADENTIAL_ID = STAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE__BRANCH = STAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_FEATURE_COUNT = STAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONE_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.TestImpl
	 * @see gitlab.impl.GitlabPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SCRIPT = STAGE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ORDER = STAGE__ORDER;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PIPELINE = STAGE__PIPELINE;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ARTIFACTS = STAGE__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TRIGGER = STAGE__TRIGGER;

	/**
	 * The feature id for the '<em><b>Classes To Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CLASSES_TO_TEST = STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.BuildImpl
	 * @see gitlab.impl.GitlabPackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__NAME = STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__SCRIPT = STAGE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__ORDER = STAGE__ORDER;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PIPELINE = STAGE__PIPELINE;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__ARTIFACTS = STAGE__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TRIGGER = STAGE__TRIGGER;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.DeployImpl
	 * @see gitlab.impl.GitlabPackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__NAME = STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__SCRIPT = STAGE__SCRIPT;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__ORDER = STAGE__ORDER;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__PIPELINE = STAGE__PIPELINE;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__ARTIFACTS = STAGE__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__TRIGGER = STAGE__TRIGGER;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.ArtifactImpl
	 * @see gitlab.impl.GitlabPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__STAGE = 2;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gitlab.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gitlab.impl.TriggerImpl
	 * @see gitlab.impl.GitlabPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gitlab.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see gitlab.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gitlab.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gitlab.Pipeline#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see gitlab.Pipeline#getStages()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stages();

	/**
	 * Returns the meta object for class '{@link gitlab.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see gitlab.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gitlab.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Stage#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see gitlab.Stage#getScript()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Script();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Stage#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see gitlab.Stage#getOrder()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Order();

	/**
	 * Returns the meta object for the reference '{@link gitlab.Stage#getPipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pipeline</em>'.
	 * @see gitlab.Stage#getPipeline()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Pipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link gitlab.Stage#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see gitlab.Stage#getArtifacts()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Artifacts();

	/**
	 * Returns the meta object for the containment reference '{@link gitlab.Stage#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see gitlab.Stage#getTrigger()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Trigger();

	/**
	 * Returns the meta object for class '{@link gitlab.Clone <em>Clone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clone</em>'.
	 * @see gitlab.Clone
	 * @generated
	 */
	EClass getClone();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Clone#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see gitlab.Clone#getUrl()
	 * @see #getClone()
	 * @generated
	 */
	EAttribute getClone_Url();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Clone#getCreadentialId <em>Creadential Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creadential Id</em>'.
	 * @see gitlab.Clone#getCreadentialId()
	 * @see #getClone()
	 * @generated
	 */
	EAttribute getClone_CreadentialId();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Clone#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see gitlab.Clone#getBranch()
	 * @see #getClone()
	 * @generated
	 */
	EAttribute getClone_Branch();

	/**
	 * Returns the meta object for class '{@link gitlab.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see gitlab.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Test#getClassesToTest <em>Classes To Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classes To Test</em>'.
	 * @see gitlab.Test#getClassesToTest()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_ClassesToTest();

	/**
	 * Returns the meta object for class '{@link gitlab.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see gitlab.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for class '{@link gitlab.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see gitlab.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for class '{@link gitlab.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see gitlab.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gitlab.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see gitlab.Artifact#getPath()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Path();

	/**
	 * Returns the meta object for the reference '{@link gitlab.Artifact#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage</em>'.
	 * @see gitlab.Artifact#getStage()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Stage();

	/**
	 * Returns the meta object for class '{@link gitlab.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see gitlab.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Trigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gitlab.Trigger#getName()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Name();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Trigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see gitlab.Trigger#getCondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Condition();

	/**
	 * Returns the meta object for the attribute '{@link gitlab.Trigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gitlab.Trigger#getType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GitlabFactory getGitlabFactory();

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
		 * The meta object literal for the '{@link gitlab.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.PipelineImpl
		 * @see gitlab.impl.GitlabPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGES = eINSTANCE.getPipeline_Stages();

		/**
		 * The meta object literal for the '{@link gitlab.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.StageImpl
		 * @see gitlab.impl.GitlabPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__SCRIPT = eINSTANCE.getStage_Script();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__ORDER = eINSTANCE.getStage_Order();

		/**
		 * The meta object literal for the '<em><b>Pipeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__PIPELINE = eINSTANCE.getStage_Pipeline();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ARTIFACTS = eINSTANCE.getStage_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TRIGGER = eINSTANCE.getStage_Trigger();

		/**
		 * The meta object literal for the '{@link gitlab.impl.CloneImpl <em>Clone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.CloneImpl
		 * @see gitlab.impl.GitlabPackageImpl#getClone()
		 * @generated
		 */
		EClass CLONE = eINSTANCE.getClone();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE__URL = eINSTANCE.getClone_Url();

		/**
		 * The meta object literal for the '<em><b>Creadential Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE__CREADENTIAL_ID = eINSTANCE.getClone_CreadentialId();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLONE__BRANCH = eINSTANCE.getClone_Branch();

		/**
		 * The meta object literal for the '{@link gitlab.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.TestImpl
		 * @see gitlab.impl.GitlabPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Classes To Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__CLASSES_TO_TEST = eINSTANCE.getTest_ClassesToTest();

		/**
		 * The meta object literal for the '{@link gitlab.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.BuildImpl
		 * @see gitlab.impl.GitlabPackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '{@link gitlab.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.DeployImpl
		 * @see gitlab.impl.GitlabPackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '{@link gitlab.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.ArtifactImpl
		 * @see gitlab.impl.GitlabPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PATH = eINSTANCE.getArtifact_Path();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__STAGE = eINSTANCE.getArtifact_Stage();

		/**
		 * The meta object literal for the '{@link gitlab.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gitlab.impl.TriggerImpl
		 * @see gitlab.impl.GitlabPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NAME = eINSTANCE.getTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CONDITION = eINSTANCE.getTrigger_Condition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TYPE = eINSTANCE.getTrigger_Type();

	}

} //GitlabPackage
