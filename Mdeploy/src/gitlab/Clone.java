/**
 */
package gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gitlab.Clone#getUrl <em>Url</em>}</li>
 *   <li>{@link gitlab.Clone#getCreadentialId <em>Creadential Id</em>}</li>
 *   <li>{@link gitlab.Clone#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @see gitlab.GitlabPackage#getClone()
 * @model
 * @generated
 */
public interface Clone extends Stage {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see gitlab.GitlabPackage#getClone_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link gitlab.Clone#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Creadential Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creadential Id</em>' attribute.
	 * @see #setCreadentialId(String)
	 * @see gitlab.GitlabPackage#getClone_CreadentialId()
	 * @model
	 * @generated
	 */
	String getCreadentialId();

	/**
	 * Sets the value of the '{@link gitlab.Clone#getCreadentialId <em>Creadential Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creadential Id</em>' attribute.
	 * @see #getCreadentialId()
	 * @generated
	 */
	void setCreadentialId(String value);

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' attribute.
	 * @see #setBranch(String)
	 * @see gitlab.GitlabPackage#getClone_Branch()
	 * @model
	 * @generated
	 */
	String getBranch();

	/**
	 * Sets the value of the '{@link gitlab.Clone#getBranch <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch</em>' attribute.
	 * @see #getBranch()
	 * @generated
	 */
	void setBranch(String value);

} // Clone
