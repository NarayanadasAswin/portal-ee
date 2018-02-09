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
 * The base model interface for the CommerceCart service. Represents a row in the &quot;CommerceCart&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.model.impl.CommerceCartModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.model.impl.CommerceCartImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceCart
 * @see com.liferay.commerce.model.impl.CommerceCartImpl
 * @see com.liferay.commerce.model.impl.CommerceCartModelImpl
 * @generated
 */
@ProviderType
public interface CommerceCartModel extends BaseModel<CommerceCart>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce cart model instance should use the {@link CommerceCart} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce cart.
	 *
	 * @return the primary key of this commerce cart
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce cart.
	 *
	 * @param primaryKey the primary key of this commerce cart
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this commerce cart.
	 *
	 * @return the uuid of this commerce cart
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this commerce cart.
	 *
	 * @param uuid the uuid of this commerce cart
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the commerce cart ID of this commerce cart.
	 *
	 * @return the commerce cart ID of this commerce cart
	 */
	public long getCommerceCartId();

	/**
	 * Sets the commerce cart ID of this commerce cart.
	 *
	 * @param commerceCartId the commerce cart ID of this commerce cart
	 */
	public void setCommerceCartId(long commerceCartId);

	/**
	 * Returns the group ID of this commerce cart.
	 *
	 * @return the group ID of this commerce cart
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this commerce cart.
	 *
	 * @param groupId the group ID of this commerce cart
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this commerce cart.
	 *
	 * @return the company ID of this commerce cart
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce cart.
	 *
	 * @param companyId the company ID of this commerce cart
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce cart.
	 *
	 * @return the user ID of this commerce cart
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce cart.
	 *
	 * @param userId the user ID of this commerce cart
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce cart.
	 *
	 * @return the user uuid of this commerce cart
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce cart.
	 *
	 * @param userUuid the user uuid of this commerce cart
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce cart.
	 *
	 * @return the user name of this commerce cart
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce cart.
	 *
	 * @param userName the user name of this commerce cart
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce cart.
	 *
	 * @return the create date of this commerce cart
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce cart.
	 *
	 * @param createDate the create date of this commerce cart
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce cart.
	 *
	 * @return the modified date of this commerce cart
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce cart.
	 *
	 * @param modifiedDate the modified date of this commerce cart
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this commerce cart.
	 *
	 * @return the name of this commerce cart
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this commerce cart.
	 *
	 * @param name the name of this commerce cart
	 */
	public void setName(String name);

	/**
	 * Returns the default cart of this commerce cart.
	 *
	 * @return the default cart of this commerce cart
	 */
	public boolean getDefaultCart();

	/**
	 * Returns <code>true</code> if this commerce cart is default cart.
	 *
	 * @return <code>true</code> if this commerce cart is default cart; <code>false</code> otherwise
	 */
	public boolean isDefaultCart();

	/**
	 * Sets whether this commerce cart is default cart.
	 *
	 * @param defaultCart the default cart of this commerce cart
	 */
	public void setDefaultCart(boolean defaultCart);

	/**
	 * Returns the billing address ID of this commerce cart.
	 *
	 * @return the billing address ID of this commerce cart
	 */
	public long getBillingAddressId();

	/**
	 * Sets the billing address ID of this commerce cart.
	 *
	 * @param billingAddressId the billing address ID of this commerce cart
	 */
	public void setBillingAddressId(long billingAddressId);

	/**
	 * Returns the shipping address ID of this commerce cart.
	 *
	 * @return the shipping address ID of this commerce cart
	 */
	public long getShippingAddressId();

	/**
	 * Sets the shipping address ID of this commerce cart.
	 *
	 * @param shippingAddressId the shipping address ID of this commerce cart
	 */
	public void setShippingAddressId(long shippingAddressId);

	/**
	 * Returns the commerce payment method ID of this commerce cart.
	 *
	 * @return the commerce payment method ID of this commerce cart
	 */
	public long getCommercePaymentMethodId();

	/**
	 * Sets the commerce payment method ID of this commerce cart.
	 *
	 * @param commercePaymentMethodId the commerce payment method ID of this commerce cart
	 */
	public void setCommercePaymentMethodId(long commercePaymentMethodId);

	/**
	 * Returns the commerce shipping method ID of this commerce cart.
	 *
	 * @return the commerce shipping method ID of this commerce cart
	 */
	public long getCommerceShippingMethodId();

	/**
	 * Sets the commerce shipping method ID of this commerce cart.
	 *
	 * @param commerceShippingMethodId the commerce shipping method ID of this commerce cart
	 */
	public void setCommerceShippingMethodId(long commerceShippingMethodId);

	/**
	 * Returns the shipping option name of this commerce cart.
	 *
	 * @return the shipping option name of this commerce cart
	 */
	@AutoEscape
	public String getShippingOptionName();

	/**
	 * Sets the shipping option name of this commerce cart.
	 *
	 * @param shippingOptionName the shipping option name of this commerce cart
	 */
	public void setShippingOptionName(String shippingOptionName);

	/**
	 * Returns the shipping price of this commerce cart.
	 *
	 * @return the shipping price of this commerce cart
	 */
	public double getShippingPrice();

	/**
	 * Sets the shipping price of this commerce cart.
	 *
	 * @param shippingPrice the shipping price of this commerce cart
	 */
	public void setShippingPrice(double shippingPrice);

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
	public int compareTo(CommerceCart commerceCart);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceCart> toCacheModel();

	@Override
	public CommerceCart toEscapedModel();

	@Override
	public CommerceCart toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}