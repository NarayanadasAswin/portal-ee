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

package com.liferay.commerce.product.service.base;

import com.liferay.commerce.product.model.CPDefinitionOptionRel;
import com.liferay.commerce.product.service.CPDefinitionOptionRelService;
import com.liferay.commerce.product.service.persistence.CPAttachmentFileEntryPersistence;
import com.liferay.commerce.product.service.persistence.CPDefinitionLocalizationPersistence;
import com.liferay.commerce.product.service.persistence.CPDefinitionOptionRelPersistence;
import com.liferay.commerce.product.service.persistence.CPDefinitionOptionValueRelPersistence;
import com.liferay.commerce.product.service.persistence.CPDefinitionPersistence;
import com.liferay.commerce.product.service.persistence.CPInstancePersistence;
import com.liferay.commerce.product.service.persistence.CPOptionCategoryPersistence;
import com.liferay.commerce.product.service.persistence.CPOptionPersistence;
import com.liferay.commerce.product.service.persistence.CPOptionValuePersistence;

import com.liferay.expando.kernel.service.persistence.ExpandoRowPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the cp definition option rel remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.commerce.product.service.impl.CPDefinitionOptionRelServiceImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see com.liferay.commerce.product.service.impl.CPDefinitionOptionRelServiceImpl
 * @see com.liferay.commerce.product.service.CPDefinitionOptionRelServiceUtil
 * @generated
 */
public abstract class CPDefinitionOptionRelServiceBaseImpl
	extends BaseServiceImpl implements CPDefinitionOptionRelService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.commerce.product.service.CPDefinitionOptionRelServiceUtil} to access the cp definition option rel remote service.
	 */

	/**
	 * Returns the cp attachment file entry local service.
	 *
	 * @return the cp attachment file entry local service
	 */
	public com.liferay.commerce.product.service.CPAttachmentFileEntryLocalService getCPAttachmentFileEntryLocalService() {
		return cpAttachmentFileEntryLocalService;
	}

	/**
	 * Sets the cp attachment file entry local service.
	 *
	 * @param cpAttachmentFileEntryLocalService the cp attachment file entry local service
	 */
	public void setCPAttachmentFileEntryLocalService(
		com.liferay.commerce.product.service.CPAttachmentFileEntryLocalService cpAttachmentFileEntryLocalService) {
		this.cpAttachmentFileEntryLocalService = cpAttachmentFileEntryLocalService;
	}

	/**
	 * Returns the cp attachment file entry remote service.
	 *
	 * @return the cp attachment file entry remote service
	 */
	public com.liferay.commerce.product.service.CPAttachmentFileEntryService getCPAttachmentFileEntryService() {
		return cpAttachmentFileEntryService;
	}

	/**
	 * Sets the cp attachment file entry remote service.
	 *
	 * @param cpAttachmentFileEntryService the cp attachment file entry remote service
	 */
	public void setCPAttachmentFileEntryService(
		com.liferay.commerce.product.service.CPAttachmentFileEntryService cpAttachmentFileEntryService) {
		this.cpAttachmentFileEntryService = cpAttachmentFileEntryService;
	}

	/**
	 * Returns the cp attachment file entry persistence.
	 *
	 * @return the cp attachment file entry persistence
	 */
	public CPAttachmentFileEntryPersistence getCPAttachmentFileEntryPersistence() {
		return cpAttachmentFileEntryPersistence;
	}

	/**
	 * Sets the cp attachment file entry persistence.
	 *
	 * @param cpAttachmentFileEntryPersistence the cp attachment file entry persistence
	 */
	public void setCPAttachmentFileEntryPersistence(
		CPAttachmentFileEntryPersistence cpAttachmentFileEntryPersistence) {
		this.cpAttachmentFileEntryPersistence = cpAttachmentFileEntryPersistence;
	}

	/**
	 * Returns the cp definition local service.
	 *
	 * @return the cp definition local service
	 */
	public com.liferay.commerce.product.service.CPDefinitionLocalService getCPDefinitionLocalService() {
		return cpDefinitionLocalService;
	}

	/**
	 * Sets the cp definition local service.
	 *
	 * @param cpDefinitionLocalService the cp definition local service
	 */
	public void setCPDefinitionLocalService(
		com.liferay.commerce.product.service.CPDefinitionLocalService cpDefinitionLocalService) {
		this.cpDefinitionLocalService = cpDefinitionLocalService;
	}

	/**
	 * Returns the cp definition remote service.
	 *
	 * @return the cp definition remote service
	 */
	public com.liferay.commerce.product.service.CPDefinitionService getCPDefinitionService() {
		return cpDefinitionService;
	}

	/**
	 * Sets the cp definition remote service.
	 *
	 * @param cpDefinitionService the cp definition remote service
	 */
	public void setCPDefinitionService(
		com.liferay.commerce.product.service.CPDefinitionService cpDefinitionService) {
		this.cpDefinitionService = cpDefinitionService;
	}

	/**
	 * Returns the cp definition persistence.
	 *
	 * @return the cp definition persistence
	 */
	public CPDefinitionPersistence getCPDefinitionPersistence() {
		return cpDefinitionPersistence;
	}

	/**
	 * Sets the cp definition persistence.
	 *
	 * @param cpDefinitionPersistence the cp definition persistence
	 */
	public void setCPDefinitionPersistence(
		CPDefinitionPersistence cpDefinitionPersistence) {
		this.cpDefinitionPersistence = cpDefinitionPersistence;
	}

	/**
	 * Returns the cp definition localization persistence.
	 *
	 * @return the cp definition localization persistence
	 */
	public CPDefinitionLocalizationPersistence getCPDefinitionLocalizationPersistence() {
		return cpDefinitionLocalizationPersistence;
	}

	/**
	 * Sets the cp definition localization persistence.
	 *
	 * @param cpDefinitionLocalizationPersistence the cp definition localization persistence
	 */
	public void setCPDefinitionLocalizationPersistence(
		CPDefinitionLocalizationPersistence cpDefinitionLocalizationPersistence) {
		this.cpDefinitionLocalizationPersistence = cpDefinitionLocalizationPersistence;
	}

	/**
	 * Returns the cp definition option rel local service.
	 *
	 * @return the cp definition option rel local service
	 */
	public com.liferay.commerce.product.service.CPDefinitionOptionRelLocalService getCPDefinitionOptionRelLocalService() {
		return cpDefinitionOptionRelLocalService;
	}

	/**
	 * Sets the cp definition option rel local service.
	 *
	 * @param cpDefinitionOptionRelLocalService the cp definition option rel local service
	 */
	public void setCPDefinitionOptionRelLocalService(
		com.liferay.commerce.product.service.CPDefinitionOptionRelLocalService cpDefinitionOptionRelLocalService) {
		this.cpDefinitionOptionRelLocalService = cpDefinitionOptionRelLocalService;
	}

	/**
	 * Returns the cp definition option rel remote service.
	 *
	 * @return the cp definition option rel remote service
	 */
	public CPDefinitionOptionRelService getCPDefinitionOptionRelService() {
		return cpDefinitionOptionRelService;
	}

	/**
	 * Sets the cp definition option rel remote service.
	 *
	 * @param cpDefinitionOptionRelService the cp definition option rel remote service
	 */
	public void setCPDefinitionOptionRelService(
		CPDefinitionOptionRelService cpDefinitionOptionRelService) {
		this.cpDefinitionOptionRelService = cpDefinitionOptionRelService;
	}

	/**
	 * Returns the cp definition option rel persistence.
	 *
	 * @return the cp definition option rel persistence
	 */
	public CPDefinitionOptionRelPersistence getCPDefinitionOptionRelPersistence() {
		return cpDefinitionOptionRelPersistence;
	}

	/**
	 * Sets the cp definition option rel persistence.
	 *
	 * @param cpDefinitionOptionRelPersistence the cp definition option rel persistence
	 */
	public void setCPDefinitionOptionRelPersistence(
		CPDefinitionOptionRelPersistence cpDefinitionOptionRelPersistence) {
		this.cpDefinitionOptionRelPersistence = cpDefinitionOptionRelPersistence;
	}

	/**
	 * Returns the cp definition option value rel local service.
	 *
	 * @return the cp definition option value rel local service
	 */
	public com.liferay.commerce.product.service.CPDefinitionOptionValueRelLocalService getCPDefinitionOptionValueRelLocalService() {
		return cpDefinitionOptionValueRelLocalService;
	}

	/**
	 * Sets the cp definition option value rel local service.
	 *
	 * @param cpDefinitionOptionValueRelLocalService the cp definition option value rel local service
	 */
	public void setCPDefinitionOptionValueRelLocalService(
		com.liferay.commerce.product.service.CPDefinitionOptionValueRelLocalService cpDefinitionOptionValueRelLocalService) {
		this.cpDefinitionOptionValueRelLocalService = cpDefinitionOptionValueRelLocalService;
	}

	/**
	 * Returns the cp definition option value rel remote service.
	 *
	 * @return the cp definition option value rel remote service
	 */
	public com.liferay.commerce.product.service.CPDefinitionOptionValueRelService getCPDefinitionOptionValueRelService() {
		return cpDefinitionOptionValueRelService;
	}

	/**
	 * Sets the cp definition option value rel remote service.
	 *
	 * @param cpDefinitionOptionValueRelService the cp definition option value rel remote service
	 */
	public void setCPDefinitionOptionValueRelService(
		com.liferay.commerce.product.service.CPDefinitionOptionValueRelService cpDefinitionOptionValueRelService) {
		this.cpDefinitionOptionValueRelService = cpDefinitionOptionValueRelService;
	}

	/**
	 * Returns the cp definition option value rel persistence.
	 *
	 * @return the cp definition option value rel persistence
	 */
	public CPDefinitionOptionValueRelPersistence getCPDefinitionOptionValueRelPersistence() {
		return cpDefinitionOptionValueRelPersistence;
	}

	/**
	 * Sets the cp definition option value rel persistence.
	 *
	 * @param cpDefinitionOptionValueRelPersistence the cp definition option value rel persistence
	 */
	public void setCPDefinitionOptionValueRelPersistence(
		CPDefinitionOptionValueRelPersistence cpDefinitionOptionValueRelPersistence) {
		this.cpDefinitionOptionValueRelPersistence = cpDefinitionOptionValueRelPersistence;
	}

	/**
	 * Returns the cp instance local service.
	 *
	 * @return the cp instance local service
	 */
	public com.liferay.commerce.product.service.CPInstanceLocalService getCPInstanceLocalService() {
		return cpInstanceLocalService;
	}

	/**
	 * Sets the cp instance local service.
	 *
	 * @param cpInstanceLocalService the cp instance local service
	 */
	public void setCPInstanceLocalService(
		com.liferay.commerce.product.service.CPInstanceLocalService cpInstanceLocalService) {
		this.cpInstanceLocalService = cpInstanceLocalService;
	}

	/**
	 * Returns the cp instance remote service.
	 *
	 * @return the cp instance remote service
	 */
	public com.liferay.commerce.product.service.CPInstanceService getCPInstanceService() {
		return cpInstanceService;
	}

	/**
	 * Sets the cp instance remote service.
	 *
	 * @param cpInstanceService the cp instance remote service
	 */
	public void setCPInstanceService(
		com.liferay.commerce.product.service.CPInstanceService cpInstanceService) {
		this.cpInstanceService = cpInstanceService;
	}

	/**
	 * Returns the cp instance persistence.
	 *
	 * @return the cp instance persistence
	 */
	public CPInstancePersistence getCPInstancePersistence() {
		return cpInstancePersistence;
	}

	/**
	 * Sets the cp instance persistence.
	 *
	 * @param cpInstancePersistence the cp instance persistence
	 */
	public void setCPInstancePersistence(
		CPInstancePersistence cpInstancePersistence) {
		this.cpInstancePersistence = cpInstancePersistence;
	}

	/**
	 * Returns the cp option local service.
	 *
	 * @return the cp option local service
	 */
	public com.liferay.commerce.product.service.CPOptionLocalService getCPOptionLocalService() {
		return cpOptionLocalService;
	}

	/**
	 * Sets the cp option local service.
	 *
	 * @param cpOptionLocalService the cp option local service
	 */
	public void setCPOptionLocalService(
		com.liferay.commerce.product.service.CPOptionLocalService cpOptionLocalService) {
		this.cpOptionLocalService = cpOptionLocalService;
	}

	/**
	 * Returns the cp option remote service.
	 *
	 * @return the cp option remote service
	 */
	public com.liferay.commerce.product.service.CPOptionService getCPOptionService() {
		return cpOptionService;
	}

	/**
	 * Sets the cp option remote service.
	 *
	 * @param cpOptionService the cp option remote service
	 */
	public void setCPOptionService(
		com.liferay.commerce.product.service.CPOptionService cpOptionService) {
		this.cpOptionService = cpOptionService;
	}

	/**
	 * Returns the cp option persistence.
	 *
	 * @return the cp option persistence
	 */
	public CPOptionPersistence getCPOptionPersistence() {
		return cpOptionPersistence;
	}

	/**
	 * Sets the cp option persistence.
	 *
	 * @param cpOptionPersistence the cp option persistence
	 */
	public void setCPOptionPersistence(CPOptionPersistence cpOptionPersistence) {
		this.cpOptionPersistence = cpOptionPersistence;
	}

	/**
	 * Returns the cp option category local service.
	 *
	 * @return the cp option category local service
	 */
	public com.liferay.commerce.product.service.CPOptionCategoryLocalService getCPOptionCategoryLocalService() {
		return cpOptionCategoryLocalService;
	}

	/**
	 * Sets the cp option category local service.
	 *
	 * @param cpOptionCategoryLocalService the cp option category local service
	 */
	public void setCPOptionCategoryLocalService(
		com.liferay.commerce.product.service.CPOptionCategoryLocalService cpOptionCategoryLocalService) {
		this.cpOptionCategoryLocalService = cpOptionCategoryLocalService;
	}

	/**
	 * Returns the cp option category remote service.
	 *
	 * @return the cp option category remote service
	 */
	public com.liferay.commerce.product.service.CPOptionCategoryService getCPOptionCategoryService() {
		return cpOptionCategoryService;
	}

	/**
	 * Sets the cp option category remote service.
	 *
	 * @param cpOptionCategoryService the cp option category remote service
	 */
	public void setCPOptionCategoryService(
		com.liferay.commerce.product.service.CPOptionCategoryService cpOptionCategoryService) {
		this.cpOptionCategoryService = cpOptionCategoryService;
	}

	/**
	 * Returns the cp option category persistence.
	 *
	 * @return the cp option category persistence
	 */
	public CPOptionCategoryPersistence getCPOptionCategoryPersistence() {
		return cpOptionCategoryPersistence;
	}

	/**
	 * Sets the cp option category persistence.
	 *
	 * @param cpOptionCategoryPersistence the cp option category persistence
	 */
	public void setCPOptionCategoryPersistence(
		CPOptionCategoryPersistence cpOptionCategoryPersistence) {
		this.cpOptionCategoryPersistence = cpOptionCategoryPersistence;
	}

	/**
	 * Returns the cp option value local service.
	 *
	 * @return the cp option value local service
	 */
	public com.liferay.commerce.product.service.CPOptionValueLocalService getCPOptionValueLocalService() {
		return cpOptionValueLocalService;
	}

	/**
	 * Sets the cp option value local service.
	 *
	 * @param cpOptionValueLocalService the cp option value local service
	 */
	public void setCPOptionValueLocalService(
		com.liferay.commerce.product.service.CPOptionValueLocalService cpOptionValueLocalService) {
		this.cpOptionValueLocalService = cpOptionValueLocalService;
	}

	/**
	 * Returns the cp option value remote service.
	 *
	 * @return the cp option value remote service
	 */
	public com.liferay.commerce.product.service.CPOptionValueService getCPOptionValueService() {
		return cpOptionValueService;
	}

	/**
	 * Sets the cp option value remote service.
	 *
	 * @param cpOptionValueService the cp option value remote service
	 */
	public void setCPOptionValueService(
		com.liferay.commerce.product.service.CPOptionValueService cpOptionValueService) {
		this.cpOptionValueService = cpOptionValueService;
	}

	/**
	 * Returns the cp option value persistence.
	 *
	 * @return the cp option value persistence
	 */
	public CPOptionValuePersistence getCPOptionValuePersistence() {
		return cpOptionValuePersistence;
	}

	/**
	 * Sets the cp option value persistence.
	 *
	 * @param cpOptionValuePersistence the cp option value persistence
	 */
	public void setCPOptionValuePersistence(
		CPOptionValuePersistence cpOptionValuePersistence) {
		this.cpOptionValuePersistence = cpOptionValuePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
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
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
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
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
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

	/**
	 * Returns the expando row local service.
	 *
	 * @return the expando row local service
	 */
	public com.liferay.expando.kernel.service.ExpandoRowLocalService getExpandoRowLocalService() {
		return expandoRowLocalService;
	}

	/**
	 * Sets the expando row local service.
	 *
	 * @param expandoRowLocalService the expando row local service
	 */
	public void setExpandoRowLocalService(
		com.liferay.expando.kernel.service.ExpandoRowLocalService expandoRowLocalService) {
		this.expandoRowLocalService = expandoRowLocalService;
	}

	/**
	 * Returns the expando row persistence.
	 *
	 * @return the expando row persistence
	 */
	public ExpandoRowPersistence getExpandoRowPersistence() {
		return expandoRowPersistence;
	}

	/**
	 * Sets the expando row persistence.
	 *
	 * @param expandoRowPersistence the expando row persistence
	 */
	public void setExpandoRowPersistence(
		ExpandoRowPersistence expandoRowPersistence) {
		this.expandoRowPersistence = expandoRowPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CPDefinitionOptionRelService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CPDefinitionOptionRel.class;
	}

	protected String getModelClassName() {
		return CPDefinitionOptionRel.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cpDefinitionOptionRelPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.commerce.product.service.CPAttachmentFileEntryLocalService.class)
	protected com.liferay.commerce.product.service.CPAttachmentFileEntryLocalService cpAttachmentFileEntryLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPAttachmentFileEntryService.class)
	protected com.liferay.commerce.product.service.CPAttachmentFileEntryService cpAttachmentFileEntryService;
	@BeanReference(type = CPAttachmentFileEntryPersistence.class)
	protected CPAttachmentFileEntryPersistence cpAttachmentFileEntryPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPDefinitionLocalService.class)
	protected com.liferay.commerce.product.service.CPDefinitionLocalService cpDefinitionLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPDefinitionService.class)
	protected com.liferay.commerce.product.service.CPDefinitionService cpDefinitionService;
	@BeanReference(type = CPDefinitionPersistence.class)
	protected CPDefinitionPersistence cpDefinitionPersistence;
	@BeanReference(type = CPDefinitionLocalizationPersistence.class)
	protected CPDefinitionLocalizationPersistence cpDefinitionLocalizationPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPDefinitionOptionRelLocalService.class)
	protected com.liferay.commerce.product.service.CPDefinitionOptionRelLocalService cpDefinitionOptionRelLocalService;
	@BeanReference(type = CPDefinitionOptionRelService.class)
	protected CPDefinitionOptionRelService cpDefinitionOptionRelService;
	@BeanReference(type = CPDefinitionOptionRelPersistence.class)
	protected CPDefinitionOptionRelPersistence cpDefinitionOptionRelPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPDefinitionOptionValueRelLocalService.class)
	protected com.liferay.commerce.product.service.CPDefinitionOptionValueRelLocalService cpDefinitionOptionValueRelLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPDefinitionOptionValueRelService.class)
	protected com.liferay.commerce.product.service.CPDefinitionOptionValueRelService cpDefinitionOptionValueRelService;
	@BeanReference(type = CPDefinitionOptionValueRelPersistence.class)
	protected CPDefinitionOptionValueRelPersistence cpDefinitionOptionValueRelPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPInstanceLocalService.class)
	protected com.liferay.commerce.product.service.CPInstanceLocalService cpInstanceLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPInstanceService.class)
	protected com.liferay.commerce.product.service.CPInstanceService cpInstanceService;
	@BeanReference(type = CPInstancePersistence.class)
	protected CPInstancePersistence cpInstancePersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionLocalService.class)
	protected com.liferay.commerce.product.service.CPOptionLocalService cpOptionLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionService.class)
	protected com.liferay.commerce.product.service.CPOptionService cpOptionService;
	@BeanReference(type = CPOptionPersistence.class)
	protected CPOptionPersistence cpOptionPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionCategoryLocalService.class)
	protected com.liferay.commerce.product.service.CPOptionCategoryLocalService cpOptionCategoryLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionCategoryService.class)
	protected com.liferay.commerce.product.service.CPOptionCategoryService cpOptionCategoryService;
	@BeanReference(type = CPOptionCategoryPersistence.class)
	protected CPOptionCategoryPersistence cpOptionCategoryPersistence;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionValueLocalService.class)
	protected com.liferay.commerce.product.service.CPOptionValueLocalService cpOptionValueLocalService;
	@BeanReference(type = com.liferay.commerce.product.service.CPOptionValueService.class)
	protected com.liferay.commerce.product.service.CPOptionValueService cpOptionValueService;
	@BeanReference(type = CPOptionValuePersistence.class)
	protected CPOptionValuePersistence cpOptionValuePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = com.liferay.expando.kernel.service.ExpandoRowLocalService.class)
	protected com.liferay.expando.kernel.service.ExpandoRowLocalService expandoRowLocalService;
	@ServiceReference(type = ExpandoRowPersistence.class)
	protected ExpandoRowPersistence expandoRowPersistence;
}