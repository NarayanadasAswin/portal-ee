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

package com.liferay.commerce.product.type.grouped.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CPDefinitionGroupedEntry service. Represents a row in the &quot;CPDefinitionGroupedEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.product.type.grouped.model.impl.CPDefinitionGroupedEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.product.type.grouped.model.impl.CPDefinitionGroupedEntryImpl}.
 * </p>
 *
 * @author Andrea Di Giorgi
 * @see CPDefinitionGroupedEntry
 * @see com.liferay.commerce.product.type.grouped.model.impl.CPDefinitionGroupedEntryImpl
 * @see com.liferay.commerce.product.type.grouped.model.impl.CPDefinitionGroupedEntryModelImpl
 * @generated
 */
@ProviderType
public interface CPDefinitionGroupedEntryModel extends BaseModel<CPDefinitionGroupedEntry>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a cp definition grouped entry model instance should use the {@link CPDefinitionGroupedEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this cp definition grouped entry.
	 *
	 * @return the primary key of this cp definition grouped entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this cp definition grouped entry.
	 *
	 * @param primaryKey the primary key of this cp definition grouped entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this cp definition grouped entry.
	 *
	 * @return the uuid of this cp definition grouped entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this cp definition grouped entry.
	 *
	 * @param uuid the uuid of this cp definition grouped entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the cp definition grouped entry ID of this cp definition grouped entry.
	 *
	 * @return the cp definition grouped entry ID of this cp definition grouped entry
	 */
	public long getCPDefinitionGroupedEntryId();

	/**
	 * Sets the cp definition grouped entry ID of this cp definition grouped entry.
	 *
	 * @param CPDefinitionGroupedEntryId the cp definition grouped entry ID of this cp definition grouped entry
	 */
	public void setCPDefinitionGroupedEntryId(long CPDefinitionGroupedEntryId);

	/**
	 * Returns the group ID of this cp definition grouped entry.
	 *
	 * @return the group ID of this cp definition grouped entry
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this cp definition grouped entry.
	 *
	 * @param groupId the group ID of this cp definition grouped entry
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this cp definition grouped entry.
	 *
	 * @return the company ID of this cp definition grouped entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this cp definition grouped entry.
	 *
	 * @param companyId the company ID of this cp definition grouped entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this cp definition grouped entry.
	 *
	 * @return the user ID of this cp definition grouped entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this cp definition grouped entry.
	 *
	 * @param userId the user ID of this cp definition grouped entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this cp definition grouped entry.
	 *
	 * @return the user uuid of this cp definition grouped entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this cp definition grouped entry.
	 *
	 * @param userUuid the user uuid of this cp definition grouped entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this cp definition grouped entry.
	 *
	 * @return the user name of this cp definition grouped entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this cp definition grouped entry.
	 *
	 * @param userName the user name of this cp definition grouped entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this cp definition grouped entry.
	 *
	 * @return the create date of this cp definition grouped entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this cp definition grouped entry.
	 *
	 * @param createDate the create date of this cp definition grouped entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this cp definition grouped entry.
	 *
	 * @return the modified date of this cp definition grouped entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this cp definition grouped entry.
	 *
	 * @param modifiedDate the modified date of this cp definition grouped entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the cp definition ID of this cp definition grouped entry.
	 *
	 * @return the cp definition ID of this cp definition grouped entry
	 */
	public long getCPDefinitionId();

	/**
	 * Sets the cp definition ID of this cp definition grouped entry.
	 *
	 * @param CPDefinitionId the cp definition ID of this cp definition grouped entry
	 */
	public void setCPDefinitionId(long CPDefinitionId);

	/**
	 * Returns the entry cp definition ID of this cp definition grouped entry.
	 *
	 * @return the entry cp definition ID of this cp definition grouped entry
	 */
	public long getEntryCPDefinitionId();

	/**
	 * Sets the entry cp definition ID of this cp definition grouped entry.
	 *
	 * @param entryCPDefinitionId the entry cp definition ID of this cp definition grouped entry
	 */
	public void setEntryCPDefinitionId(long entryCPDefinitionId);

	/**
	 * Returns the quantity of this cp definition grouped entry.
	 *
	 * @return the quantity of this cp definition grouped entry
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this cp definition grouped entry.
	 *
	 * @param quantity the quantity of this cp definition grouped entry
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the priority of this cp definition grouped entry.
	 *
	 * @return the priority of this cp definition grouped entry
	 */
	public int getPriority();

	/**
	 * Sets the priority of this cp definition grouped entry.
	 *
	 * @param priority the priority of this cp definition grouped entry
	 */
	public void setPriority(int priority);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CPDefinitionGroupedEntry cpDefinitionGroupedEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CPDefinitionGroupedEntry> toCacheModel();

	@Override
	public CPDefinitionGroupedEntry toEscapedModel();

	@Override
	public CPDefinitionGroupedEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}