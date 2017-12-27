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

package com.liferay.commerce.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CommerceOrderItem}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceOrderItem
 * @generated
 */
@ProviderType
public class CommerceOrderItemWrapper implements CommerceOrderItem,
	ModelWrapper<CommerceOrderItem> {
	public CommerceOrderItemWrapper(CommerceOrderItem commerceOrderItem) {
		_commerceOrderItem = commerceOrderItem;
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceOrderItem.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceOrderItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("commerceOrderItemId", getCommerceOrderItemId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("commerceOrderId", getCommerceOrderId());
		attributes.put("CPInstanceId", getCPInstanceId());
		attributes.put("quantity", getQuantity());
		attributes.put("shippedQuantity", getShippedQuantity());
		attributes.put("json", getJson());
		attributes.put("title", getTitle());
		attributes.put("sku", getSku());
		attributes.put("price", getPrice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long commerceOrderItemId = (Long)attributes.get("commerceOrderItemId");

		if (commerceOrderItemId != null) {
			setCommerceOrderItemId(commerceOrderItemId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long commerceOrderId = (Long)attributes.get("commerceOrderId");

		if (commerceOrderId != null) {
			setCommerceOrderId(commerceOrderId);
		}

		Long CPInstanceId = (Long)attributes.get("CPInstanceId");

		if (CPInstanceId != null) {
			setCPInstanceId(CPInstanceId);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Integer shippedQuantity = (Integer)attributes.get("shippedQuantity");

		if (shippedQuantity != null) {
			setShippedQuantity(shippedQuantity);
		}

		String json = (String)attributes.get("json");

		if (json != null) {
			setJson(json);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String sku = (String)attributes.get("sku");

		if (sku != null) {
			setSku(sku);
		}

		Double price = (Double)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}
	}

	@Override
	public java.lang.Object clone() {
		return new CommerceOrderItemWrapper((CommerceOrderItem)_commerceOrderItem.clone());
	}

	@Override
	public int compareTo(CommerceOrderItem commerceOrderItem) {
		return _commerceOrderItem.compareTo(commerceOrderItem);
	}

	@Override
	public java.lang.String[] getAvailableLanguageIds() {
		return _commerceOrderItem.getAvailableLanguageIds();
	}

	@Override
	public CommerceOrder getCommerceOrder()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItem.getCommerceOrder();
	}

	/**
	* Returns the commerce order ID of this commerce order item.
	*
	* @return the commerce order ID of this commerce order item
	*/
	@Override
	public long getCommerceOrderId() {
		return _commerceOrderItem.getCommerceOrderId();
	}

	/**
	* Returns the commerce order item ID of this commerce order item.
	*
	* @return the commerce order item ID of this commerce order item
	*/
	@Override
	public long getCommerceOrderItemId() {
		return _commerceOrderItem.getCommerceOrderItemId();
	}

	/**
	* Returns the company ID of this commerce order item.
	*
	* @return the company ID of this commerce order item
	*/
	@Override
	public long getCompanyId() {
		return _commerceOrderItem.getCompanyId();
	}

	@Override
	public com.liferay.commerce.product.model.CPDefinition getCPDefinition()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItem.getCPDefinition();
	}

	@Override
	public com.liferay.commerce.product.model.CPInstance getCPInstance()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _commerceOrderItem.getCPInstance();
	}

	/**
	* Returns the cp instance ID of this commerce order item.
	*
	* @return the cp instance ID of this commerce order item
	*/
	@Override
	public long getCPInstanceId() {
		return _commerceOrderItem.getCPInstanceId();
	}

	/**
	* Returns the create date of this commerce order item.
	*
	* @return the create date of this commerce order item
	*/
	@Override
	public Date getCreateDate() {
		return _commerceOrderItem.getCreateDate();
	}

	@Override
	public java.lang.String getDefaultLanguageId() {
		return _commerceOrderItem.getDefaultLanguageId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _commerceOrderItem.getExpandoBridge();
	}

	/**
	* Returns the group ID of this commerce order item.
	*
	* @return the group ID of this commerce order item
	*/
	@Override
	public long getGroupId() {
		return _commerceOrderItem.getGroupId();
	}

	/**
	* Returns the json of this commerce order item.
	*
	* @return the json of this commerce order item
	*/
	@Override
	public java.lang.String getJson() {
		return _commerceOrderItem.getJson();
	}

	/**
	* Returns the modified date of this commerce order item.
	*
	* @return the modified date of this commerce order item
	*/
	@Override
	public Date getModifiedDate() {
		return _commerceOrderItem.getModifiedDate();
	}

	/**
	* Returns the price of this commerce order item.
	*
	* @return the price of this commerce order item
	*/
	@Override
	public double getPrice() {
		return _commerceOrderItem.getPrice();
	}

	/**
	* Returns the primary key of this commerce order item.
	*
	* @return the primary key of this commerce order item
	*/
	@Override
	public long getPrimaryKey() {
		return _commerceOrderItem.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceOrderItem.getPrimaryKeyObj();
	}

	/**
	* Returns the quantity of this commerce order item.
	*
	* @return the quantity of this commerce order item
	*/
	@Override
	public int getQuantity() {
		return _commerceOrderItem.getQuantity();
	}

	/**
	* Returns the shipped quantity of this commerce order item.
	*
	* @return the shipped quantity of this commerce order item
	*/
	@Override
	public int getShippedQuantity() {
		return _commerceOrderItem.getShippedQuantity();
	}

	/**
	* Returns the sku of this commerce order item.
	*
	* @return the sku of this commerce order item
	*/
	@Override
	public java.lang.String getSku() {
		return _commerceOrderItem.getSku();
	}

	/**
	* Returns the title of this commerce order item.
	*
	* @return the title of this commerce order item
	*/
	@Override
	public java.lang.String getTitle() {
		return _commerceOrderItem.getTitle();
	}

	/**
	* Returns the localized title of this commerce order item in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param locale the locale of the language
	* @return the localized title of this commerce order item
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale) {
		return _commerceOrderItem.getTitle(locale);
	}

	/**
	* Returns the localized title of this commerce order item in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param locale the local of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this commerce order item. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	*/
	@Override
	public java.lang.String getTitle(java.util.Locale locale, boolean useDefault) {
		return _commerceOrderItem.getTitle(locale, useDefault);
	}

	/**
	* Returns the localized title of this commerce order item in the language. Uses the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @return the localized title of this commerce order item
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId) {
		return _commerceOrderItem.getTitle(languageId);
	}

	/**
	* Returns the localized title of this commerce order item in the language, optionally using the default language if no localization exists for the requested language.
	*
	* @param languageId the ID of the language
	* @param useDefault whether to use the default language if no localization exists for the requested language
	* @return the localized title of this commerce order item
	*/
	@Override
	public java.lang.String getTitle(java.lang.String languageId,
		boolean useDefault) {
		return _commerceOrderItem.getTitle(languageId, useDefault);
	}

	@Override
	public java.lang.String getTitleCurrentLanguageId() {
		return _commerceOrderItem.getTitleCurrentLanguageId();
	}

	@Override
	public java.lang.String getTitleCurrentValue() {
		return _commerceOrderItem.getTitleCurrentValue();
	}

	/**
	* Returns a map of the locales and localized titles of this commerce order item.
	*
	* @return the locales and localized titles of this commerce order item
	*/
	@Override
	public Map<java.util.Locale, java.lang.String> getTitleMap() {
		return _commerceOrderItem.getTitleMap();
	}

	/**
	* Returns the user ID of this commerce order item.
	*
	* @return the user ID of this commerce order item
	*/
	@Override
	public long getUserId() {
		return _commerceOrderItem.getUserId();
	}

	/**
	* Returns the user name of this commerce order item.
	*
	* @return the user name of this commerce order item
	*/
	@Override
	public java.lang.String getUserName() {
		return _commerceOrderItem.getUserName();
	}

	/**
	* Returns the user uuid of this commerce order item.
	*
	* @return the user uuid of this commerce order item
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _commerceOrderItem.getUserUuid();
	}

	@Override
	public int hashCode() {
		return _commerceOrderItem.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _commerceOrderItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _commerceOrderItem.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _commerceOrderItem.isNew();
	}

	@Override
	public void persist() {
		_commerceOrderItem.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {
		_commerceOrderItem.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
		java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {
		_commerceOrderItem.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_commerceOrderItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the commerce order ID of this commerce order item.
	*
	* @param commerceOrderId the commerce order ID of this commerce order item
	*/
	@Override
	public void setCommerceOrderId(long commerceOrderId) {
		_commerceOrderItem.setCommerceOrderId(commerceOrderId);
	}

	/**
	* Sets the commerce order item ID of this commerce order item.
	*
	* @param commerceOrderItemId the commerce order item ID of this commerce order item
	*/
	@Override
	public void setCommerceOrderItemId(long commerceOrderItemId) {
		_commerceOrderItem.setCommerceOrderItemId(commerceOrderItemId);
	}

	/**
	* Sets the company ID of this commerce order item.
	*
	* @param companyId the company ID of this commerce order item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_commerceOrderItem.setCompanyId(companyId);
	}

	/**
	* Sets the cp instance ID of this commerce order item.
	*
	* @param CPInstanceId the cp instance ID of this commerce order item
	*/
	@Override
	public void setCPInstanceId(long CPInstanceId) {
		_commerceOrderItem.setCPInstanceId(CPInstanceId);
	}

	/**
	* Sets the create date of this commerce order item.
	*
	* @param createDate the create date of this commerce order item
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_commerceOrderItem.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_commerceOrderItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_commerceOrderItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_commerceOrderItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this commerce order item.
	*
	* @param groupId the group ID of this commerce order item
	*/
	@Override
	public void setGroupId(long groupId) {
		_commerceOrderItem.setGroupId(groupId);
	}

	/**
	* Sets the json of this commerce order item.
	*
	* @param json the json of this commerce order item
	*/
	@Override
	public void setJson(java.lang.String json) {
		_commerceOrderItem.setJson(json);
	}

	/**
	* Sets the modified date of this commerce order item.
	*
	* @param modifiedDate the modified date of this commerce order item
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_commerceOrderItem.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_commerceOrderItem.setNew(n);
	}

	/**
	* Sets the price of this commerce order item.
	*
	* @param price the price of this commerce order item
	*/
	@Override
	public void setPrice(double price) {
		_commerceOrderItem.setPrice(price);
	}

	/**
	* Sets the primary key of this commerce order item.
	*
	* @param primaryKey the primary key of this commerce order item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_commerceOrderItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_commerceOrderItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quantity of this commerce order item.
	*
	* @param quantity the quantity of this commerce order item
	*/
	@Override
	public void setQuantity(int quantity) {
		_commerceOrderItem.setQuantity(quantity);
	}

	/**
	* Sets the shipped quantity of this commerce order item.
	*
	* @param shippedQuantity the shipped quantity of this commerce order item
	*/
	@Override
	public void setShippedQuantity(int shippedQuantity) {
		_commerceOrderItem.setShippedQuantity(shippedQuantity);
	}

	/**
	* Sets the sku of this commerce order item.
	*
	* @param sku the sku of this commerce order item
	*/
	@Override
	public void setSku(java.lang.String sku) {
		_commerceOrderItem.setSku(sku);
	}

	/**
	* Sets the title of this commerce order item.
	*
	* @param title the title of this commerce order item
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_commerceOrderItem.setTitle(title);
	}

	/**
	* Sets the localized title of this commerce order item in the language.
	*
	* @param title the localized title of this commerce order item
	* @param locale the locale of the language
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale) {
		_commerceOrderItem.setTitle(title, locale);
	}

	/**
	* Sets the localized title of this commerce order item in the language, and sets the default locale.
	*
	* @param title the localized title of this commerce order item
	* @param locale the locale of the language
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitle(java.lang.String title, java.util.Locale locale,
		java.util.Locale defaultLocale) {
		_commerceOrderItem.setTitle(title, locale, defaultLocale);
	}

	@Override
	public void setTitleCurrentLanguageId(java.lang.String languageId) {
		_commerceOrderItem.setTitleCurrentLanguageId(languageId);
	}

	/**
	* Sets the localized titles of this commerce order item from the map of locales and localized titles.
	*
	* @param titleMap the locales and localized titles of this commerce order item
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap) {
		_commerceOrderItem.setTitleMap(titleMap);
	}

	/**
	* Sets the localized titles of this commerce order item from the map of locales and localized titles, and sets the default locale.
	*
	* @param titleMap the locales and localized titles of this commerce order item
	* @param defaultLocale the default locale
	*/
	@Override
	public void setTitleMap(Map<java.util.Locale, java.lang.String> titleMap,
		java.util.Locale defaultLocale) {
		_commerceOrderItem.setTitleMap(titleMap, defaultLocale);
	}

	/**
	* Sets the user ID of this commerce order item.
	*
	* @param userId the user ID of this commerce order item
	*/
	@Override
	public void setUserId(long userId) {
		_commerceOrderItem.setUserId(userId);
	}

	/**
	* Sets the user name of this commerce order item.
	*
	* @param userName the user name of this commerce order item
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_commerceOrderItem.setUserName(userName);
	}

	/**
	* Sets the user uuid of this commerce order item.
	*
	* @param userUuid the user uuid of this commerce order item
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_commerceOrderItem.setUserUuid(userUuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CommerceOrderItem> toCacheModel() {
		return _commerceOrderItem.toCacheModel();
	}

	@Override
	public CommerceOrderItem toEscapedModel() {
		return new CommerceOrderItemWrapper(_commerceOrderItem.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _commerceOrderItem.toString();
	}

	@Override
	public CommerceOrderItem toUnescapedModel() {
		return new CommerceOrderItemWrapper(_commerceOrderItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toXmlString() {
		return _commerceOrderItem.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommerceOrderItemWrapper)) {
			return false;
		}

		CommerceOrderItemWrapper commerceOrderItemWrapper = (CommerceOrderItemWrapper)obj;

		if (Objects.equals(_commerceOrderItem,
					commerceOrderItemWrapper._commerceOrderItem)) {
			return true;
		}

		return false;
	}

	@Override
	public CommerceOrderItem getWrappedModel() {
		return _commerceOrderItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _commerceOrderItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _commerceOrderItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_commerceOrderItem.resetOriginalValues();
	}

	private final CommerceOrderItem _commerceOrderItem;
}