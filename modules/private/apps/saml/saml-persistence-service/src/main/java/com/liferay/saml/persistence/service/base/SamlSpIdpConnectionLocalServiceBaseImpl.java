/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.saml.persistence.service.base;

import org.osgi.annotation.versioning.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;
import com.liferay.saml.persistence.model.SamlSpIdpConnection;
import com.liferay.saml.persistence.service.SamlSpIdpConnectionLocalService;
import com.liferay.saml.persistence.service.persistence.SamlIdpSpConnectionPersistence;
import com.liferay.saml.persistence.service.persistence.SamlIdpSpSessionPersistence;
import com.liferay.saml.persistence.service.persistence.SamlIdpSsoSessionPersistence;
import com.liferay.saml.persistence.service.persistence.SamlSpAuthRequestPersistence;
import com.liferay.saml.persistence.service.persistence.SamlSpIdpConnectionPersistence;
import com.liferay.saml.persistence.service.persistence.SamlSpMessagePersistence;
import com.liferay.saml.persistence.service.persistence.SamlSpSessionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the saml sp idp connection local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.saml.persistence.service.impl.SamlSpIdpConnectionLocalServiceImpl}.
 * </p>
 *
 * @author Mika Koivisto
 * @see com.liferay.saml.persistence.service.impl.SamlSpIdpConnectionLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class SamlSpIdpConnectionLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements SamlSpIdpConnectionLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SamlSpIdpConnectionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.saml.persistence.service.SamlSpIdpConnectionLocalServiceUtil</code>.
	 */

	/**
	 * Adds the saml sp idp connection to the database. Also notifies the appropriate model listeners.
	 *
	 * @param samlSpIdpConnection the saml sp idp connection
	 * @return the saml sp idp connection that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SamlSpIdpConnection addSamlSpIdpConnection(
		SamlSpIdpConnection samlSpIdpConnection) {

		samlSpIdpConnection.setNew(true);

		return samlSpIdpConnectionPersistence.update(samlSpIdpConnection);
	}

	/**
	 * Creates a new saml sp idp connection with the primary key. Does not add the saml sp idp connection to the database.
	 *
	 * @param samlSpIdpConnectionId the primary key for the new saml sp idp connection
	 * @return the new saml sp idp connection
	 */
	@Override
	@Transactional(enabled = false)
	public SamlSpIdpConnection createSamlSpIdpConnection(
		long samlSpIdpConnectionId) {

		return samlSpIdpConnectionPersistence.create(samlSpIdpConnectionId);
	}

	/**
	 * Deletes the saml sp idp connection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param samlSpIdpConnectionId the primary key of the saml sp idp connection
	 * @return the saml sp idp connection that was removed
	 * @throws PortalException if a saml sp idp connection with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SamlSpIdpConnection deleteSamlSpIdpConnection(
			long samlSpIdpConnectionId)
		throws PortalException {

		return samlSpIdpConnectionPersistence.remove(samlSpIdpConnectionId);
	}

	/**
	 * Deletes the saml sp idp connection from the database. Also notifies the appropriate model listeners.
	 *
	 * @param samlSpIdpConnection the saml sp idp connection
	 * @return the saml sp idp connection that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SamlSpIdpConnection deleteSamlSpIdpConnection(
		SamlSpIdpConnection samlSpIdpConnection) {

		return samlSpIdpConnectionPersistence.remove(samlSpIdpConnection);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			SamlSpIdpConnection.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return samlSpIdpConnectionPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.saml.persistence.model.impl.SamlSpIdpConnectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return samlSpIdpConnectionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.saml.persistence.model.impl.SamlSpIdpConnectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return samlSpIdpConnectionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return samlSpIdpConnectionPersistence.countWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return samlSpIdpConnectionPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SamlSpIdpConnection fetchSamlSpIdpConnection(
		long samlSpIdpConnectionId) {

		return samlSpIdpConnectionPersistence.fetchByPrimaryKey(
			samlSpIdpConnectionId);
	}

	/**
	 * Returns the saml sp idp connection with the primary key.
	 *
	 * @param samlSpIdpConnectionId the primary key of the saml sp idp connection
	 * @return the saml sp idp connection
	 * @throws PortalException if a saml sp idp connection with the primary key could not be found
	 */
	@Override
	public SamlSpIdpConnection getSamlSpIdpConnection(
			long samlSpIdpConnectionId)
		throws PortalException {

		return samlSpIdpConnectionPersistence.findByPrimaryKey(
			samlSpIdpConnectionId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			samlSpIdpConnectionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SamlSpIdpConnection.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"samlSpIdpConnectionId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			samlSpIdpConnectionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			SamlSpIdpConnection.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"samlSpIdpConnectionId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			samlSpIdpConnectionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SamlSpIdpConnection.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"samlSpIdpConnectionId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return samlSpIdpConnectionLocalService.deleteSamlSpIdpConnection(
			(SamlSpIdpConnection)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return samlSpIdpConnectionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the saml sp idp connections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.liferay.saml.persistence.model.impl.SamlSpIdpConnectionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of saml sp idp connections
	 * @param end the upper bound of the range of saml sp idp connections (not inclusive)
	 * @return the range of saml sp idp connections
	 */
	@Override
	public List<SamlSpIdpConnection> getSamlSpIdpConnections(
		int start, int end) {

		return samlSpIdpConnectionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of saml sp idp connections.
	 *
	 * @return the number of saml sp idp connections
	 */
	@Override
	public int getSamlSpIdpConnectionsCount() {
		return samlSpIdpConnectionPersistence.countAll();
	}

	/**
	 * Updates the saml sp idp connection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param samlSpIdpConnection the saml sp idp connection
	 * @return the saml sp idp connection that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SamlSpIdpConnection updateSamlSpIdpConnection(
		SamlSpIdpConnection samlSpIdpConnection) {

		return samlSpIdpConnectionPersistence.update(samlSpIdpConnection);
	}

	/**
	 * Returns the saml idp sp connection local service.
	 *
	 * @return the saml idp sp connection local service
	 */
	public com.liferay.saml.persistence.service.SamlIdpSpConnectionLocalService
		getSamlIdpSpConnectionLocalService() {

		return samlIdpSpConnectionLocalService;
	}

	/**
	 * Sets the saml idp sp connection local service.
	 *
	 * @param samlIdpSpConnectionLocalService the saml idp sp connection local service
	 */
	public void setSamlIdpSpConnectionLocalService(
		com.liferay.saml.persistence.service.SamlIdpSpConnectionLocalService
			samlIdpSpConnectionLocalService) {

		this.samlIdpSpConnectionLocalService = samlIdpSpConnectionLocalService;
	}

	/**
	 * Returns the saml idp sp connection persistence.
	 *
	 * @return the saml idp sp connection persistence
	 */
	public SamlIdpSpConnectionPersistence getSamlIdpSpConnectionPersistence() {
		return samlIdpSpConnectionPersistence;
	}

	/**
	 * Sets the saml idp sp connection persistence.
	 *
	 * @param samlIdpSpConnectionPersistence the saml idp sp connection persistence
	 */
	public void setSamlIdpSpConnectionPersistence(
		SamlIdpSpConnectionPersistence samlIdpSpConnectionPersistence) {

		this.samlIdpSpConnectionPersistence = samlIdpSpConnectionPersistence;
	}

	/**
	 * Returns the saml idp sp session local service.
	 *
	 * @return the saml idp sp session local service
	 */
	public com.liferay.saml.persistence.service.SamlIdpSpSessionLocalService
		getSamlIdpSpSessionLocalService() {

		return samlIdpSpSessionLocalService;
	}

	/**
	 * Sets the saml idp sp session local service.
	 *
	 * @param samlIdpSpSessionLocalService the saml idp sp session local service
	 */
	public void setSamlIdpSpSessionLocalService(
		com.liferay.saml.persistence.service.SamlIdpSpSessionLocalService
			samlIdpSpSessionLocalService) {

		this.samlIdpSpSessionLocalService = samlIdpSpSessionLocalService;
	}

	/**
	 * Returns the saml idp sp session persistence.
	 *
	 * @return the saml idp sp session persistence
	 */
	public SamlIdpSpSessionPersistence getSamlIdpSpSessionPersistence() {
		return samlIdpSpSessionPersistence;
	}

	/**
	 * Sets the saml idp sp session persistence.
	 *
	 * @param samlIdpSpSessionPersistence the saml idp sp session persistence
	 */
	public void setSamlIdpSpSessionPersistence(
		SamlIdpSpSessionPersistence samlIdpSpSessionPersistence) {

		this.samlIdpSpSessionPersistence = samlIdpSpSessionPersistence;
	}

	/**
	 * Returns the saml idp sso session local service.
	 *
	 * @return the saml idp sso session local service
	 */
	public com.liferay.saml.persistence.service.SamlIdpSsoSessionLocalService
		getSamlIdpSsoSessionLocalService() {

		return samlIdpSsoSessionLocalService;
	}

	/**
	 * Sets the saml idp sso session local service.
	 *
	 * @param samlIdpSsoSessionLocalService the saml idp sso session local service
	 */
	public void setSamlIdpSsoSessionLocalService(
		com.liferay.saml.persistence.service.SamlIdpSsoSessionLocalService
			samlIdpSsoSessionLocalService) {

		this.samlIdpSsoSessionLocalService = samlIdpSsoSessionLocalService;
	}

	/**
	 * Returns the saml idp sso session persistence.
	 *
	 * @return the saml idp sso session persistence
	 */
	public SamlIdpSsoSessionPersistence getSamlIdpSsoSessionPersistence() {
		return samlIdpSsoSessionPersistence;
	}

	/**
	 * Sets the saml idp sso session persistence.
	 *
	 * @param samlIdpSsoSessionPersistence the saml idp sso session persistence
	 */
	public void setSamlIdpSsoSessionPersistence(
		SamlIdpSsoSessionPersistence samlIdpSsoSessionPersistence) {

		this.samlIdpSsoSessionPersistence = samlIdpSsoSessionPersistence;
	}

	/**
	 * Returns the saml sp auth request local service.
	 *
	 * @return the saml sp auth request local service
	 */
	public com.liferay.saml.persistence.service.SamlSpAuthRequestLocalService
		getSamlSpAuthRequestLocalService() {

		return samlSpAuthRequestLocalService;
	}

	/**
	 * Sets the saml sp auth request local service.
	 *
	 * @param samlSpAuthRequestLocalService the saml sp auth request local service
	 */
	public void setSamlSpAuthRequestLocalService(
		com.liferay.saml.persistence.service.SamlSpAuthRequestLocalService
			samlSpAuthRequestLocalService) {

		this.samlSpAuthRequestLocalService = samlSpAuthRequestLocalService;
	}

	/**
	 * Returns the saml sp auth request persistence.
	 *
	 * @return the saml sp auth request persistence
	 */
	public SamlSpAuthRequestPersistence getSamlSpAuthRequestPersistence() {
		return samlSpAuthRequestPersistence;
	}

	/**
	 * Sets the saml sp auth request persistence.
	 *
	 * @param samlSpAuthRequestPersistence the saml sp auth request persistence
	 */
	public void setSamlSpAuthRequestPersistence(
		SamlSpAuthRequestPersistence samlSpAuthRequestPersistence) {

		this.samlSpAuthRequestPersistence = samlSpAuthRequestPersistence;
	}

	/**
	 * Returns the saml sp idp connection local service.
	 *
	 * @return the saml sp idp connection local service
	 */
	public SamlSpIdpConnectionLocalService
		getSamlSpIdpConnectionLocalService() {

		return samlSpIdpConnectionLocalService;
	}

	/**
	 * Sets the saml sp idp connection local service.
	 *
	 * @param samlSpIdpConnectionLocalService the saml sp idp connection local service
	 */
	public void setSamlSpIdpConnectionLocalService(
		SamlSpIdpConnectionLocalService samlSpIdpConnectionLocalService) {

		this.samlSpIdpConnectionLocalService = samlSpIdpConnectionLocalService;
	}

	/**
	 * Returns the saml sp idp connection persistence.
	 *
	 * @return the saml sp idp connection persistence
	 */
	public SamlSpIdpConnectionPersistence getSamlSpIdpConnectionPersistence() {
		return samlSpIdpConnectionPersistence;
	}

	/**
	 * Sets the saml sp idp connection persistence.
	 *
	 * @param samlSpIdpConnectionPersistence the saml sp idp connection persistence
	 */
	public void setSamlSpIdpConnectionPersistence(
		SamlSpIdpConnectionPersistence samlSpIdpConnectionPersistence) {

		this.samlSpIdpConnectionPersistence = samlSpIdpConnectionPersistence;
	}

	/**
	 * Returns the saml sp message local service.
	 *
	 * @return the saml sp message local service
	 */
	public com.liferay.saml.persistence.service.SamlSpMessageLocalService
		getSamlSpMessageLocalService() {

		return samlSpMessageLocalService;
	}

	/**
	 * Sets the saml sp message local service.
	 *
	 * @param samlSpMessageLocalService the saml sp message local service
	 */
	public void setSamlSpMessageLocalService(
		com.liferay.saml.persistence.service.SamlSpMessageLocalService
			samlSpMessageLocalService) {

		this.samlSpMessageLocalService = samlSpMessageLocalService;
	}

	/**
	 * Returns the saml sp message persistence.
	 *
	 * @return the saml sp message persistence
	 */
	public SamlSpMessagePersistence getSamlSpMessagePersistence() {
		return samlSpMessagePersistence;
	}

	/**
	 * Sets the saml sp message persistence.
	 *
	 * @param samlSpMessagePersistence the saml sp message persistence
	 */
	public void setSamlSpMessagePersistence(
		SamlSpMessagePersistence samlSpMessagePersistence) {

		this.samlSpMessagePersistence = samlSpMessagePersistence;
	}

	/**
	 * Returns the saml sp session local service.
	 *
	 * @return the saml sp session local service
	 */
	public com.liferay.saml.persistence.service.SamlSpSessionLocalService
		getSamlSpSessionLocalService() {

		return samlSpSessionLocalService;
	}

	/**
	 * Sets the saml sp session local service.
	 *
	 * @param samlSpSessionLocalService the saml sp session local service
	 */
	public void setSamlSpSessionLocalService(
		com.liferay.saml.persistence.service.SamlSpSessionLocalService
			samlSpSessionLocalService) {

		this.samlSpSessionLocalService = samlSpSessionLocalService;
	}

	/**
	 * Returns the saml sp session persistence.
	 *
	 * @return the saml sp session persistence
	 */
	public SamlSpSessionPersistence getSamlSpSessionPersistence() {
		return samlSpSessionPersistence;
	}

	/**
	 * Sets the saml sp session persistence.
	 *
	 * @param samlSpSessionPersistence the saml sp session persistence
	 */
	public void setSamlSpSessionPersistence(
		SamlSpSessionPersistence samlSpSessionPersistence) {

		this.samlSpSessionPersistence = samlSpSessionPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"com.liferay.saml.persistence.model.SamlSpIdpConnection",
			samlSpIdpConnectionLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.liferay.saml.persistence.model.SamlSpIdpConnection");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SamlSpIdpConnectionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SamlSpIdpConnection.class;
	}

	protected String getModelClassName() {
		return SamlSpIdpConnection.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				samlSpIdpConnectionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlIdpSpConnectionLocalService.class
	)
	protected
		com.liferay.saml.persistence.service.SamlIdpSpConnectionLocalService
			samlIdpSpConnectionLocalService;

	@BeanReference(type = SamlIdpSpConnectionPersistence.class)
	protected SamlIdpSpConnectionPersistence samlIdpSpConnectionPersistence;

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlIdpSpSessionLocalService.class
	)
	protected com.liferay.saml.persistence.service.SamlIdpSpSessionLocalService
		samlIdpSpSessionLocalService;

	@BeanReference(type = SamlIdpSpSessionPersistence.class)
	protected SamlIdpSpSessionPersistence samlIdpSpSessionPersistence;

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlIdpSsoSessionLocalService.class
	)
	protected com.liferay.saml.persistence.service.SamlIdpSsoSessionLocalService
		samlIdpSsoSessionLocalService;

	@BeanReference(type = SamlIdpSsoSessionPersistence.class)
	protected SamlIdpSsoSessionPersistence samlIdpSsoSessionPersistence;

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlSpAuthRequestLocalService.class
	)
	protected com.liferay.saml.persistence.service.SamlSpAuthRequestLocalService
		samlSpAuthRequestLocalService;

	@BeanReference(type = SamlSpAuthRequestPersistence.class)
	protected SamlSpAuthRequestPersistence samlSpAuthRequestPersistence;

	@BeanReference(type = SamlSpIdpConnectionLocalService.class)
	protected SamlSpIdpConnectionLocalService samlSpIdpConnectionLocalService;

	@BeanReference(type = SamlSpIdpConnectionPersistence.class)
	protected SamlSpIdpConnectionPersistence samlSpIdpConnectionPersistence;

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlSpMessageLocalService.class
	)
	protected com.liferay.saml.persistence.service.SamlSpMessageLocalService
		samlSpMessageLocalService;

	@BeanReference(type = SamlSpMessagePersistence.class)
	protected SamlSpMessagePersistence samlSpMessagePersistence;

	@BeanReference(
		type = com.liferay.saml.persistence.service.SamlSpSessionLocalService.class
	)
	protected com.liferay.saml.persistence.service.SamlSpSessionLocalService
		samlSpSessionLocalService;

	@BeanReference(type = SamlSpSessionPersistence.class)
	protected SamlSpSessionPersistence samlSpSessionPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}