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

package com.liferay.commerce.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the CommerceShippingMethod service. Represents a row in the &quot;CommerceShippingMethod&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.model.impl.CommerceShippingMethodModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.model.impl.CommerceShippingMethodImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceShippingMethod
 * @see com.liferay.commerce.model.impl.CommerceShippingMethodImpl
 * @see com.liferay.commerce.model.impl.CommerceShippingMethodModelImpl
 * @generated
 */
@ProviderType
public interface CommerceShippingMethodModel extends BaseModel<CommerceShippingMethod>,
	GroupedModel, LocalizedModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce shipping method model instance should use the {@link CommerceShippingMethod} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce shipping method.
	 *
	 * @return the primary key of this commerce shipping method
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce shipping method.
	 *
	 * @param primaryKey the primary key of this commerce shipping method
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the commerce shipping method ID of this commerce shipping method.
	 *
	 * @return the commerce shipping method ID of this commerce shipping method
	 */
	public long getCommerceShippingMethodId();

	/**
	 * Sets the commerce shipping method ID of this commerce shipping method.
	 *
	 * @param commerceShippingMethodId the commerce shipping method ID of this commerce shipping method
	 */
	public void setCommerceShippingMethodId(long commerceShippingMethodId);

	/**
	 * Returns the group ID of this commerce shipping method.
	 *
	 * @return the group ID of this commerce shipping method
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this commerce shipping method.
	 *
	 * @param groupId the group ID of this commerce shipping method
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this commerce shipping method.
	 *
	 * @return the company ID of this commerce shipping method
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce shipping method.
	 *
	 * @param companyId the company ID of this commerce shipping method
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce shipping method.
	 *
	 * @return the user ID of this commerce shipping method
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce shipping method.
	 *
	 * @param userId the user ID of this commerce shipping method
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce shipping method.
	 *
	 * @return the user uuid of this commerce shipping method
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce shipping method.
	 *
	 * @param userUuid the user uuid of this commerce shipping method
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce shipping method.
	 *
	 * @return the user name of this commerce shipping method
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce shipping method.
	 *
	 * @param userName the user name of this commerce shipping method
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce shipping method.
	 *
	 * @return the create date of this commerce shipping method
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce shipping method.
	 *
	 * @param createDate the create date of this commerce shipping method
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce shipping method.
	 *
	 * @return the modified date of this commerce shipping method
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce shipping method.
	 *
	 * @param modifiedDate the modified date of this commerce shipping method
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this commerce shipping method.
	 *
	 * @return the name of this commerce shipping method
	 */
	public String getName();

	/**
	 * Returns the localized name of this commerce shipping method in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized name of this commerce shipping method
	 */
	@AutoEscape
	public String getName(Locale locale);

	/**
	 * Returns the localized name of this commerce shipping method in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this commerce shipping method. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized name of this commerce shipping method in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized name of this commerce shipping method
	 */
	@AutoEscape
	public String getName(String languageId);

	/**
	 * Returns the localized name of this commerce shipping method in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized name of this commerce shipping method
	 */
	@AutoEscape
	public String getName(String languageId, boolean useDefault);

	@AutoEscape
	public String getNameCurrentLanguageId();

	@AutoEscape
	public String getNameCurrentValue();

	/**
	 * Returns a map of the locales and localized names of this commerce shipping method.
	 *
	 * @return the locales and localized names of this commerce shipping method
	 */
	public Map<Locale, String> getNameMap();

	/**
	 * Sets the name of this commerce shipping method.
	 *
	 * @param name the name of this commerce shipping method
	 */
	public void setName(String name);

	/**
	 * Sets the localized name of this commerce shipping method in the language.
	 *
	 * @param name the localized name of this commerce shipping method
	 * @param locale the locale of the language
	 */
	public void setName(String name, Locale locale);

	/**
	 * Sets the localized name of this commerce shipping method in the language, and sets the default locale.
	 *
	 * @param name the localized name of this commerce shipping method
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setName(String name, Locale locale, Locale defaultLocale);

	public void setNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized names of this commerce shipping method from the map of locales and localized names.
	 *
	 * @param nameMap the locales and localized names of this commerce shipping method
	 */
	public void setNameMap(Map<Locale, String> nameMap);

	/**
	 * Sets the localized names of this commerce shipping method from the map of locales and localized names, and sets the default locale.
	 *
	 * @param nameMap the locales and localized names of this commerce shipping method
	 * @param defaultLocale the default locale
	 */
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale);

	/**
	 * Returns the description of this commerce shipping method.
	 *
	 * @return the description of this commerce shipping method
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this commerce shipping method in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this commerce shipping method
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this commerce shipping method in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this commerce shipping method. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this commerce shipping method in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this commerce shipping method
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this commerce shipping method in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this commerce shipping method
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this commerce shipping method.
	 *
	 * @return the locales and localized descriptions of this commerce shipping method
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this commerce shipping method.
	 *
	 * @param description the description of this commerce shipping method
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this commerce shipping method in the language.
	 *
	 * @param description the localized description of this commerce shipping method
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this commerce shipping method in the language, and sets the default locale.
	 *
	 * @param description the localized description of this commerce shipping method
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this commerce shipping method from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this commerce shipping method
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this commerce shipping method from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this commerce shipping method
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Returns the image ID of this commerce shipping method.
	 *
	 * @return the image ID of this commerce shipping method
	 */
	public long getImageId();

	/**
	 * Sets the image ID of this commerce shipping method.
	 *
	 * @param imageId the image ID of this commerce shipping method
	 */
	public void setImageId(long imageId);

	/**
	 * Returns the engine key of this commerce shipping method.
	 *
	 * @return the engine key of this commerce shipping method
	 */
	@AutoEscape
	public String getEngineKey();

	/**
	 * Sets the engine key of this commerce shipping method.
	 *
	 * @param engineKey the engine key of this commerce shipping method
	 */
	public void setEngineKey(String engineKey);

	/**
	 * Returns the priority of this commerce shipping method.
	 *
	 * @return the priority of this commerce shipping method
	 */
	public double getPriority();

	/**
	 * Sets the priority of this commerce shipping method.
	 *
	 * @param priority the priority of this commerce shipping method
	 */
	public void setPriority(double priority);

	/**
	 * Returns the active of this commerce shipping method.
	 *
	 * @return the active of this commerce shipping method
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this commerce shipping method is active.
	 *
	 * @return <code>true</code> if this commerce shipping method is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this commerce shipping method is active.
	 *
	 * @param active the active of this commerce shipping method
	 */
	public void setActive(boolean active);

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
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

	@Override
	public Object clone();

	@Override
	public int compareTo(CommerceShippingMethod commerceShippingMethod);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceShippingMethod> toCacheModel();

	@Override
	public CommerceShippingMethod toEscapedModel();

	@Override
	public CommerceShippingMethod toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}