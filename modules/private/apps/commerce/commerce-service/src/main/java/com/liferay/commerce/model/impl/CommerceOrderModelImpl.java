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

package com.liferay.commerce.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.model.CommerceOrderModel;
import com.liferay.commerce.model.CommerceOrderSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CommerceOrder service. Represents a row in the &quot;CommerceOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CommerceOrderModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceOrderImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceOrderImpl
 * @see CommerceOrder
 * @see CommerceOrderModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CommerceOrderModelImpl extends BaseModelImpl<CommerceOrder>
	implements CommerceOrderModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce order model instance should use the {@link CommerceOrder} interface instead.
	 */
	public static final String TABLE_NAME = "CommerceOrder";
	public static final Object[][] TABLE_COLUMNS = {
			{ "commerceOrderId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "orderUserId", Types.BIGINT },
			{ "billingAddressId", Types.BIGINT },
			{ "shippingAddressId", Types.BIGINT },
			{ "commercePaymentMethodId", Types.BIGINT },
			{ "commerceShippingMethodId", Types.BIGINT },
			{ "shippingOptionName", Types.VARCHAR },
			{ "subtotal", Types.DOUBLE },
			{ "shippingPrice", Types.DOUBLE },
			{ "total", Types.DOUBLE },
			{ "status", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("commerceOrderId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("orderUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("billingAddressId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("shippingAddressId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("commercePaymentMethodId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("commerceShippingMethodId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("shippingOptionName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subtotal", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("shippingPrice", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("total", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table CommerceOrder (commerceOrderId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,orderUserId LONG,billingAddressId LONG,shippingAddressId LONG,commercePaymentMethodId LONG,commerceShippingMethodId LONG,shippingOptionName VARCHAR(75) null,subtotal DOUBLE,shippingPrice DOUBLE,total DOUBLE,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table CommerceOrder";
	public static final String ORDER_BY_JPQL = " ORDER BY commerceOrder.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY CommerceOrder.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.commerce.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.commerce.model.CommerceOrder"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.commerce.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.commerce.model.CommerceOrder"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.commerce.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.commerce.model.CommerceOrder"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CommerceOrder toModel(CommerceOrderSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CommerceOrder model = new CommerceOrderImpl();

		model.setCommerceOrderId(soapModel.getCommerceOrderId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setOrderUserId(soapModel.getOrderUserId());
		model.setBillingAddressId(soapModel.getBillingAddressId());
		model.setShippingAddressId(soapModel.getShippingAddressId());
		model.setCommercePaymentMethodId(soapModel.getCommercePaymentMethodId());
		model.setCommerceShippingMethodId(soapModel.getCommerceShippingMethodId());
		model.setShippingOptionName(soapModel.getShippingOptionName());
		model.setSubtotal(soapModel.getSubtotal());
		model.setShippingPrice(soapModel.getShippingPrice());
		model.setTotal(soapModel.getTotal());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CommerceOrder> toModels(CommerceOrderSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CommerceOrder> models = new ArrayList<CommerceOrder>(soapModels.length);

		for (CommerceOrderSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.commerce.service.util.ServiceProps.get(
				"lock.expiration.time.com.liferay.commerce.model.CommerceOrder"));

	public CommerceOrderModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _commerceOrderId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommerceOrderId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commerceOrderId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CommerceOrder.class;
	}

	@Override
	public String getModelClassName() {
		return CommerceOrder.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("commerceOrderId", getCommerceOrderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("orderUserId", getOrderUserId());
		attributes.put("billingAddressId", getBillingAddressId());
		attributes.put("shippingAddressId", getShippingAddressId());
		attributes.put("commercePaymentMethodId", getCommercePaymentMethodId());
		attributes.put("commerceShippingMethodId", getCommerceShippingMethodId());
		attributes.put("shippingOptionName", getShippingOptionName());
		attributes.put("subtotal", getSubtotal());
		attributes.put("shippingPrice", getShippingPrice());
		attributes.put("total", getTotal());
		attributes.put("status", getStatus());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long commerceOrderId = (Long)attributes.get("commerceOrderId");

		if (commerceOrderId != null) {
			setCommerceOrderId(commerceOrderId);
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

		Long orderUserId = (Long)attributes.get("orderUserId");

		if (orderUserId != null) {
			setOrderUserId(orderUserId);
		}

		Long billingAddressId = (Long)attributes.get("billingAddressId");

		if (billingAddressId != null) {
			setBillingAddressId(billingAddressId);
		}

		Long shippingAddressId = (Long)attributes.get("shippingAddressId");

		if (shippingAddressId != null) {
			setShippingAddressId(shippingAddressId);
		}

		Long commercePaymentMethodId = (Long)attributes.get(
				"commercePaymentMethodId");

		if (commercePaymentMethodId != null) {
			setCommercePaymentMethodId(commercePaymentMethodId);
		}

		Long commerceShippingMethodId = (Long)attributes.get(
				"commerceShippingMethodId");

		if (commerceShippingMethodId != null) {
			setCommerceShippingMethodId(commerceShippingMethodId);
		}

		String shippingOptionName = (String)attributes.get("shippingOptionName");

		if (shippingOptionName != null) {
			setShippingOptionName(shippingOptionName);
		}

		Double subtotal = (Double)attributes.get("subtotal");

		if (subtotal != null) {
			setSubtotal(subtotal);
		}

		Double shippingPrice = (Double)attributes.get("shippingPrice");

		if (shippingPrice != null) {
			setShippingPrice(shippingPrice);
		}

		Double total = (Double)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getCommerceOrderId() {
		return _commerceOrderId;
	}

	@Override
	public void setCommerceOrderId(long commerceOrderId) {
		_commerceOrderId = commerceOrderId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getOrderUserId() {
		return _orderUserId;
	}

	@Override
	public void setOrderUserId(long orderUserId) {
		_orderUserId = orderUserId;
	}

	@Override
	public String getOrderUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getOrderUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setOrderUserUuid(String orderUserUuid) {
	}

	@JSON
	@Override
	public long getBillingAddressId() {
		return _billingAddressId;
	}

	@Override
	public void setBillingAddressId(long billingAddressId) {
		_billingAddressId = billingAddressId;
	}

	@JSON
	@Override
	public long getShippingAddressId() {
		return _shippingAddressId;
	}

	@Override
	public void setShippingAddressId(long shippingAddressId) {
		_shippingAddressId = shippingAddressId;
	}

	@JSON
	@Override
	public long getCommercePaymentMethodId() {
		return _commercePaymentMethodId;
	}

	@Override
	public void setCommercePaymentMethodId(long commercePaymentMethodId) {
		_commercePaymentMethodId = commercePaymentMethodId;
	}

	@JSON
	@Override
	public long getCommerceShippingMethodId() {
		return _commerceShippingMethodId;
	}

	@Override
	public void setCommerceShippingMethodId(long commerceShippingMethodId) {
		_commerceShippingMethodId = commerceShippingMethodId;
	}

	@JSON
	@Override
	public String getShippingOptionName() {
		if (_shippingOptionName == null) {
			return "";
		}
		else {
			return _shippingOptionName;
		}
	}

	@Override
	public void setShippingOptionName(String shippingOptionName) {
		_shippingOptionName = shippingOptionName;
	}

	@JSON
	@Override
	public double getSubtotal() {
		return _subtotal;
	}

	@Override
	public void setSubtotal(double subtotal) {
		_subtotal = subtotal;
	}

	@JSON
	@Override
	public double getShippingPrice() {
		return _shippingPrice;
	}

	@Override
	public void setShippingPrice(double shippingPrice) {
		_shippingPrice = shippingPrice;
	}

	@JSON
	@Override
	public double getTotal() {
		return _total;
	}

	@Override
	public void setTotal(double total) {
		_total = total;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			CommerceOrder.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CommerceOrder toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CommerceOrder)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CommerceOrderImpl commerceOrderImpl = new CommerceOrderImpl();

		commerceOrderImpl.setCommerceOrderId(getCommerceOrderId());
		commerceOrderImpl.setGroupId(getGroupId());
		commerceOrderImpl.setCompanyId(getCompanyId());
		commerceOrderImpl.setUserId(getUserId());
		commerceOrderImpl.setUserName(getUserName());
		commerceOrderImpl.setCreateDate(getCreateDate());
		commerceOrderImpl.setModifiedDate(getModifiedDate());
		commerceOrderImpl.setOrderUserId(getOrderUserId());
		commerceOrderImpl.setBillingAddressId(getBillingAddressId());
		commerceOrderImpl.setShippingAddressId(getShippingAddressId());
		commerceOrderImpl.setCommercePaymentMethodId(getCommercePaymentMethodId());
		commerceOrderImpl.setCommerceShippingMethodId(getCommerceShippingMethodId());
		commerceOrderImpl.setShippingOptionName(getShippingOptionName());
		commerceOrderImpl.setSubtotal(getSubtotal());
		commerceOrderImpl.setShippingPrice(getShippingPrice());
		commerceOrderImpl.setTotal(getTotal());
		commerceOrderImpl.setStatus(getStatus());

		commerceOrderImpl.resetOriginalValues();

		return commerceOrderImpl;
	}

	@Override
	public int compareTo(CommerceOrder commerceOrder) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				commerceOrder.getCreateDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommerceOrder)) {
			return false;
		}

		CommerceOrder commerceOrder = (CommerceOrder)obj;

		long primaryKey = commerceOrder.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CommerceOrderModelImpl commerceOrderModelImpl = this;

		commerceOrderModelImpl._originalGroupId = commerceOrderModelImpl._groupId;

		commerceOrderModelImpl._setOriginalGroupId = false;

		commerceOrderModelImpl._setModifiedDate = false;

		commerceOrderModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CommerceOrder> toCacheModel() {
		CommerceOrderCacheModel commerceOrderCacheModel = new CommerceOrderCacheModel();

		commerceOrderCacheModel.commerceOrderId = getCommerceOrderId();

		commerceOrderCacheModel.groupId = getGroupId();

		commerceOrderCacheModel.companyId = getCompanyId();

		commerceOrderCacheModel.userId = getUserId();

		commerceOrderCacheModel.userName = getUserName();

		String userName = commerceOrderCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			commerceOrderCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			commerceOrderCacheModel.createDate = createDate.getTime();
		}
		else {
			commerceOrderCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			commerceOrderCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			commerceOrderCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		commerceOrderCacheModel.orderUserId = getOrderUserId();

		commerceOrderCacheModel.billingAddressId = getBillingAddressId();

		commerceOrderCacheModel.shippingAddressId = getShippingAddressId();

		commerceOrderCacheModel.commercePaymentMethodId = getCommercePaymentMethodId();

		commerceOrderCacheModel.commerceShippingMethodId = getCommerceShippingMethodId();

		commerceOrderCacheModel.shippingOptionName = getShippingOptionName();

		String shippingOptionName = commerceOrderCacheModel.shippingOptionName;

		if ((shippingOptionName != null) && (shippingOptionName.length() == 0)) {
			commerceOrderCacheModel.shippingOptionName = null;
		}

		commerceOrderCacheModel.subtotal = getSubtotal();

		commerceOrderCacheModel.shippingPrice = getShippingPrice();

		commerceOrderCacheModel.total = getTotal();

		commerceOrderCacheModel.status = getStatus();

		return commerceOrderCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{commerceOrderId=");
		sb.append(getCommerceOrderId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", orderUserId=");
		sb.append(getOrderUserId());
		sb.append(", billingAddressId=");
		sb.append(getBillingAddressId());
		sb.append(", shippingAddressId=");
		sb.append(getShippingAddressId());
		sb.append(", commercePaymentMethodId=");
		sb.append(getCommercePaymentMethodId());
		sb.append(", commerceShippingMethodId=");
		sb.append(getCommerceShippingMethodId());
		sb.append(", shippingOptionName=");
		sb.append(getShippingOptionName());
		sb.append(", subtotal=");
		sb.append(getSubtotal());
		sb.append(", shippingPrice=");
		sb.append(getShippingPrice());
		sb.append(", total=");
		sb.append(getTotal());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.commerce.model.CommerceOrder");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>commerceOrderId</column-name><column-value><![CDATA[");
		sb.append(getCommerceOrderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orderUserId</column-name><column-value><![CDATA[");
		sb.append(getOrderUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>billingAddressId</column-name><column-value><![CDATA[");
		sb.append(getBillingAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingAddressId</column-name><column-value><![CDATA[");
		sb.append(getShippingAddressId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commercePaymentMethodId</column-name><column-value><![CDATA[");
		sb.append(getCommercePaymentMethodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commerceShippingMethodId</column-name><column-value><![CDATA[");
		sb.append(getCommerceShippingMethodId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingOptionName</column-name><column-value><![CDATA[");
		sb.append(getShippingOptionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subtotal</column-name><column-value><![CDATA[");
		sb.append(getSubtotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shippingPrice</column-name><column-value><![CDATA[");
		sb.append(getShippingPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>total</column-name><column-value><![CDATA[");
		sb.append(getTotal());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CommerceOrder.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CommerceOrder.class
		};
	private long _commerceOrderId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _orderUserId;
	private long _billingAddressId;
	private long _shippingAddressId;
	private long _commercePaymentMethodId;
	private long _commerceShippingMethodId;
	private String _shippingOptionName;
	private double _subtotal;
	private double _shippingPrice;
	private double _total;
	private int _status;
	private long _columnBitmask;
	private CommerceOrder _escapedModel;
}