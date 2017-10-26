/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.product.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CPInstanceLocalService}.
 *
 * @author Marco Leo
 * @see CPInstanceLocalService
 * @generated
 */
@ProviderType
public class CPInstanceLocalServiceWrapper implements CPInstanceLocalService,
	ServiceWrapper<CPInstanceLocalService> {
	public CPInstanceLocalServiceWrapper(
		CPInstanceLocalService cpInstanceLocalService) {
		_cpInstanceLocalService = cpInstanceLocalService;
	}

	/**
	* Adds the cp instance to the database. Also notifies the appropriate model listeners.
	*
	* @param cpInstance the cp instance
	* @return the cp instance that was added
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance addCPInstance(
		com.liferay.commerce.product.model.CPInstance cpInstance) {
		return _cpInstanceLocalService.addCPInstance(cpInstance);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance addCPInstance(
		long cpDefinitionId, java.lang.String sku, java.lang.String gtin,
		java.lang.String manufacturerPartNumber, java.lang.String ddmContent,
		double width, double height, double depth, double weight, double cost,
		double price, int displayDateMonth, int displayDateDay,
		int displayDateYear, int displayDateHour, int displayDateMinute,
		int expirationDateMonth, int expirationDateDay, int expirationDateYear,
		int expirationDateHour, int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.addCPInstance(cpDefinitionId, sku, gtin,
			manufacturerPartNumber, ddmContent, width, height, depth, weight,
			cost, price, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, serviceContext);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance addCPInstance(
		long cpDefinitionId, java.lang.String sku, java.lang.String gtin,
		java.lang.String manufacturerPartNumber, java.lang.String ddmContent,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.addCPInstance(cpDefinitionId, sku, gtin,
			manufacturerPartNumber, ddmContent, displayDateMonth,
			displayDateDay, displayDateYear, displayDateHour,
			displayDateMinute, expirationDateMonth, expirationDateDay,
			expirationDateYear, expirationDateHour, expirationDateMinute,
			neverExpire, serviceContext);
	}

	@Override
	public void buildCPInstances(long cpDefinitionId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_cpInstanceLocalService.buildCPInstances(cpDefinitionId, serviceContext);
	}

	@Override
	public void checkCPInstances()
		throws com.liferay.portal.kernel.exception.PortalException {
		_cpInstanceLocalService.checkCPInstances();
	}

	/**
	* Creates a new cp instance with the primary key. Does not add the cp instance to the database.
	*
	* @param CPInstanceId the primary key for the new cp instance
	* @return the new cp instance
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance createCPInstance(
		long CPInstanceId) {
		return _cpInstanceLocalService.createCPInstance(CPInstanceId);
	}

	/**
	* Deletes the cp instance from the database. Also notifies the appropriate model listeners.
	*
	* @param cpInstance the cp instance
	* @return the cp instance that was removed
	* @throws PortalException
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance deleteCPInstance(
		com.liferay.commerce.product.model.CPInstance cpInstance)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.deleteCPInstance(cpInstance);
	}

	/**
	* Deletes the cp instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CPInstanceId the primary key of the cp instance
	* @return the cp instance that was removed
	* @throws PortalException if a cp instance with the primary key could not be found
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance deleteCPInstance(
		long CPInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.deleteCPInstance(CPInstanceId);
	}

	@Override
	public void deleteCPInstances(long cpDefinitionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_cpInstanceLocalService.deleteCPInstances(cpDefinitionId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cpInstanceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cpInstanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.product.model.impl.CPInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _cpInstanceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.product.model.impl.CPInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _cpInstanceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _cpInstanceLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _cpInstanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance fetchCPInstance(
		long CPInstanceId) {
		return _cpInstanceLocalService.fetchCPInstance(CPInstanceId);
	}

	/**
	* Returns the cp instance matching the UUID and group.
	*
	* @param uuid the cp instance's UUID
	* @param groupId the primary key of the group
	* @return the matching cp instance, or <code>null</code> if a matching cp instance could not be found
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance fetchCPInstanceByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _cpInstanceLocalService.fetchCPInstanceByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _cpInstanceLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPDefinitionInstances(
		long cpDefinitionId) {
		return _cpInstanceLocalService.getCPDefinitionInstances(cpDefinitionId);
	}

	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPDefinitionInstances(
		long cpDefinitionId, int start, int end) {
		return _cpInstanceLocalService.getCPDefinitionInstances(cpDefinitionId,
			start, end);
	}

	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPDefinitionInstances(
		long cpDefinitionId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance> orderByComparator) {
		return _cpInstanceLocalService.getCPDefinitionInstances(cpDefinitionId,
			status, start, end, orderByComparator);
	}

	@Override
	public int getCPDefinitionInstancesCount(long cpDefinitionId, int status) {
		return _cpInstanceLocalService.getCPDefinitionInstancesCount(cpDefinitionId,
			status);
	}

	/**
	* Returns the cp instance with the primary key.
	*
	* @param CPInstanceId the primary key of the cp instance
	* @return the cp instance
	* @throws PortalException if a cp instance with the primary key could not be found
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance getCPInstance(
		long CPInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getCPInstance(CPInstanceId);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance getCPInstance(
		long cpDefinitionId, java.lang.String sku)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getCPInstance(cpDefinitionId, sku);
	}

	/**
	* Returns the cp instance matching the UUID and group.
	*
	* @param uuid the cp instance's UUID
	* @param groupId the primary key of the group
	* @return the matching cp instance
	* @throws PortalException if a matching cp instance could not be found
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance getCPInstanceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getCPInstanceByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the cp instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.commerce.product.model.impl.CPInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cp instances
	* @param end the upper bound of the range of cp instances (not inclusive)
	* @return the range of cp instances
	*/
	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPInstances(
		int start, int end) {
		return _cpInstanceLocalService.getCPInstances(start, end);
	}

	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPInstances(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getCPInstances(groupId, status, start,
			end, orderByComparator);
	}

	/**
	* Returns all the cp instances matching the UUID and company.
	*
	* @param uuid the UUID of the cp instances
	* @param companyId the primary key of the company
	* @return the matching cp instances, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPInstancesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _cpInstanceLocalService.getCPInstancesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of cp instances matching the UUID and company.
	*
	* @param uuid the UUID of the cp instances
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of cp instances
	* @param end the upper bound of the range of cp instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching cp instances, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.commerce.product.model.CPInstance> getCPInstancesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.product.model.CPInstance> orderByComparator) {
		return _cpInstanceLocalService.getCPInstancesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of cp instances.
	*
	* @return the number of cp instances
	*/
	@Override
	public int getCPInstancesCount() {
		return _cpInstanceLocalService.getCPInstancesCount();
	}

	@Override
	public int getCPInstancesCount(long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getCPInstancesCount(groupId, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _cpInstanceLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _cpInstanceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _cpInstanceLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.lang.String[] getSKUs(long cpDefinitionId) {
		return _cpInstanceLocalService.getSKUs(cpDefinitionId);
	}

	@Override
	public com.liferay.portal.kernel.search.Hits search(
		com.liferay.portal.kernel.search.SearchContext searchContext) {
		return _cpInstanceLocalService.search(searchContext);
	}

	@Override
	public com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.product.model.CPInstance> searchCPDefinitionInstances(
		long companyId, long groupId, long cpDefinitionId,
		java.lang.String keywords, int status, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.searchCPDefinitionInstances(companyId,
			groupId, cpDefinitionId, keywords, status, start, end, sort);
	}

	@Override
	public com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.product.model.CPInstance> searchCPInstances(
		long companyId, long groupId, java.lang.String keywords, int status,
		int start, int end, com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.searchCPInstances(companyId, groupId,
			keywords, status, start, end, sort);
	}

	/**
	* Updates the cp instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cpInstance the cp instance
	* @return the cp instance that was updated
	*/
	@Override
	public com.liferay.commerce.product.model.CPInstance updateCPInstance(
		com.liferay.commerce.product.model.CPInstance cpInstance) {
		return _cpInstanceLocalService.updateCPInstance(cpInstance);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance updateCPInstance(
		long cpInstanceId, java.lang.String sku, java.lang.String gtin,
		java.lang.String manufacturerPartNumber, double width, double height,
		double depth, double weight, double cost, double price,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.updateCPInstance(cpInstanceId, sku,
			gtin, manufacturerPartNumber, width, height, depth, weight, cost,
			price, displayDateMonth, displayDateDay, displayDateYear,
			displayDateHour, displayDateMinute, expirationDateMonth,
			expirationDateDay, expirationDateYear, expirationDateHour,
			expirationDateMinute, neverExpire, serviceContext);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance updateCPInstance(
		long cpInstanceId, java.lang.String sku, java.lang.String gtin,
		java.lang.String manufacturerPartNumber, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, int expirationDateMonth, int expirationDateDay,
		int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.updateCPInstance(cpInstanceId, sku,
			gtin, manufacturerPartNumber, displayDateMonth, displayDateDay,
			displayDateYear, displayDateHour, displayDateMinute,
			expirationDateMonth, expirationDateDay, expirationDateYear,
			expirationDateHour, expirationDateMinute, neverExpire,
			serviceContext);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance updatePricingInfo(
		long cpInstanceId, double cost, double price,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.updatePricingInfo(cpInstanceId, cost,
			price, serviceContext);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance updateShippingInfo(
		long cpInstanceId, double width, double height, double depth,
		double weight,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.updateShippingInfo(cpInstanceId, width,
			height, depth, weight, serviceContext);
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance updateStatus(
		long userId, long cpInstanceId, int status,
		com.liferay.portal.kernel.service.ServiceContext serviceContext,
		java.util.Map<java.lang.String, java.io.Serializable> workflowContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _cpInstanceLocalService.updateStatus(userId, cpInstanceId,
			status, serviceContext, workflowContext);
	}

	@Override
	public CPInstanceLocalService getWrappedService() {
		return _cpInstanceLocalService;
	}

	@Override
	public void setWrappedService(CPInstanceLocalService cpInstanceLocalService) {
		_cpInstanceLocalService = cpInstanceLocalService;
	}

	private CPInstanceLocalService _cpInstanceLocalService;
}