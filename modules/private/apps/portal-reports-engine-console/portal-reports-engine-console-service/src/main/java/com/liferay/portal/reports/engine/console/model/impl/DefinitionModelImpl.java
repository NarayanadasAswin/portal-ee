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

package com.liferay.portal.reports.engine.console.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.reports.engine.console.model.Definition;
import com.liferay.portal.reports.engine.console.model.DefinitionModel;
import com.liferay.portal.reports.engine.console.model.DefinitionSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the Definition service. Represents a row in the &quot;Reports_Definition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>DefinitionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DefinitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DefinitionImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DefinitionModelImpl
	extends BaseModelImpl<Definition> implements DefinitionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a definition model instance should use the <code>Definition</code> interface instead.
	 */
	public static final String TABLE_NAME = "Reports_Definition";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"definitionId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"name", Types.VARCHAR}, {"description", Types.VARCHAR},
		{"sourceId", Types.BIGINT}, {"reportName", Types.VARCHAR},
		{"reportParameters", Types.CLOB}, {"lastPublishDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("definitionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sourceId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("reportName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reportParameters", Types.CLOB);
		TABLE_COLUMNS_MAP.put("lastPublishDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Reports_Definition (uuid_ VARCHAR(75) null,definitionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name STRING null,description STRING null,sourceId LONG,reportName VARCHAR(75) null,reportParameters TEXT null,lastPublishDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table Reports_Definition";

	public static final String ORDER_BY_JPQL =
		" ORDER BY definition.modifiedDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Reports_Definition.modifiedDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.reports.engine.console.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.portal.reports.engine.console.model.Definition"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.reports.engine.console.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.portal.reports.engine.console.model.Definition"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.reports.engine.console.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.portal.reports.engine.console.model.Definition"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long MODIFIEDDATE_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Definition toModel(DefinitionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Definition model = new DefinitionImpl();

		model.setUuid(soapModel.getUuid());
		model.setDefinitionId(soapModel.getDefinitionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setSourceId(soapModel.getSourceId());
		model.setReportName(soapModel.getReportName());
		model.setReportParameters(soapModel.getReportParameters());
		model.setLastPublishDate(soapModel.getLastPublishDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Definition> toModels(DefinitionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Definition> models = new ArrayList<Definition>(soapModels.length);

		for (DefinitionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.portal.reports.engine.console.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.portal.reports.engine.console.model.Definition"));

	public DefinitionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _definitionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDefinitionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _definitionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Definition.class;
	}

	@Override
	public String getModelClassName() {
		return Definition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Definition, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Definition, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Definition, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Definition)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Definition, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Definition, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Definition)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Definition, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Definition, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Definition, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Definition, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Definition, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Definition, Object>>();
		Map<String, BiConsumer<Definition, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Definition, ?>>();

		attributeGetterFunctions.put("uuid", Definition::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Definition, String>)Definition::setUuid);
		attributeGetterFunctions.put(
			"definitionId", Definition::getDefinitionId);
		attributeSetterBiConsumers.put(
			"definitionId",
			(BiConsumer<Definition, Long>)Definition::setDefinitionId);
		attributeGetterFunctions.put("groupId", Definition::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Definition, Long>)Definition::setGroupId);
		attributeGetterFunctions.put("companyId", Definition::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<Definition, Long>)Definition::setCompanyId);
		attributeGetterFunctions.put("userId", Definition::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Definition, Long>)Definition::setUserId);
		attributeGetterFunctions.put("userName", Definition::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<Definition, String>)Definition::setUserName);
		attributeGetterFunctions.put("createDate", Definition::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Definition, Date>)Definition::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", Definition::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Definition, Date>)Definition::setModifiedDate);
		attributeGetterFunctions.put("name", Definition::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<Definition, String>)Definition::setName);
		attributeGetterFunctions.put("description", Definition::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<Definition, String>)Definition::setDescription);
		attributeGetterFunctions.put("sourceId", Definition::getSourceId);
		attributeSetterBiConsumers.put(
			"sourceId", (BiConsumer<Definition, Long>)Definition::setSourceId);
		attributeGetterFunctions.put("reportName", Definition::getReportName);
		attributeSetterBiConsumers.put(
			"reportName",
			(BiConsumer<Definition, String>)Definition::setReportName);
		attributeGetterFunctions.put(
			"reportParameters", Definition::getReportParameters);
		attributeSetterBiConsumers.put(
			"reportParameters",
			(BiConsumer<Definition, String>)Definition::setReportParameters);
		attributeGetterFunctions.put(
			"lastPublishDate", Definition::getLastPublishDate);
		attributeSetterBiConsumers.put(
			"lastPublishDate",
			(BiConsumer<Definition, Date>)Definition::setLastPublishDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getDefinitionId() {
		return _definitionId;
	}

	@Override
	public void setDefinitionId(long definitionId) {
		_definitionId = definitionId;
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
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
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

		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public String getName(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId);
	}

	@Override
	public String getName(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getName(languageId, useDefault);
	}

	@Override
	public String getName(String languageId) {
		return LocalizationUtil.getLocalization(getName(), languageId);
	}

	@Override
	public String getName(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(
			getName(), languageId, useDefault);
	}

	@Override
	public String getNameCurrentLanguageId() {
		return _nameCurrentLanguageId;
	}

	@JSON
	@Override
	public String getNameCurrentValue() {
		Locale locale = getLocale(_nameCurrentLanguageId);

		return getName(locale);
	}

	@Override
	public Map<Locale, String> getNameMap() {
		return LocalizationUtil.getLocalizationMap(getName());
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@Override
	public void setName(String name, Locale locale) {
		setName(name, locale, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setName(String name, Locale locale, Locale defaultLocale) {
		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(name)) {
			setName(
				LocalizationUtil.updateLocalization(
					getName(), "Name", name, languageId, defaultLanguageId));
		}
		else {
			setName(
				LocalizationUtil.removeLocalization(
					getName(), "Name", languageId));
		}
	}

	@Override
	public void setNameCurrentLanguageId(String languageId) {
		_nameCurrentLanguageId = languageId;
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap) {
		setNameMap(nameMap, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setNameMap(Map<Locale, String> nameMap, Locale defaultLocale) {
		if (nameMap == null) {
			return;
		}

		setName(
			LocalizationUtil.updateLocalization(
				nameMap, getName(), "Name",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public String getDescription(Locale locale) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId);
	}

	@Override
	public String getDescription(Locale locale, boolean useDefault) {
		String languageId = LocaleUtil.toLanguageId(locale);

		return getDescription(languageId, useDefault);
	}

	@Override
	public String getDescription(String languageId) {
		return LocalizationUtil.getLocalization(getDescription(), languageId);
	}

	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return LocalizationUtil.getLocalization(
			getDescription(), languageId, useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return _descriptionCurrentLanguageId;
	}

	@JSON
	@Override
	public String getDescriptionCurrentValue() {
		Locale locale = getLocale(_descriptionCurrentLanguageId);

		return getDescription(locale);
	}

	@Override
	public Map<Locale, String> getDescriptionMap() {
		return LocalizationUtil.getLocalizationMap(getDescription());
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public void setDescription(String description, Locale locale) {
		setDescription(description, locale, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setDescription(
		String description, Locale locale, Locale defaultLocale) {

		String languageId = LocaleUtil.toLanguageId(locale);
		String defaultLanguageId = LocaleUtil.toLanguageId(defaultLocale);

		if (Validator.isNotNull(description)) {
			setDescription(
				LocalizationUtil.updateLocalization(
					getDescription(), "Description", description, languageId,
					defaultLanguageId));
		}
		else {
			setDescription(
				LocalizationUtil.removeLocalization(
					getDescription(), "Description", languageId));
		}
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		_descriptionCurrentLanguageId = languageId;
	}

	@Override
	public void setDescriptionMap(Map<Locale, String> descriptionMap) {
		setDescriptionMap(descriptionMap, LocaleUtil.getSiteDefault());
	}

	@Override
	public void setDescriptionMap(
		Map<Locale, String> descriptionMap, Locale defaultLocale) {

		if (descriptionMap == null) {
			return;
		}

		setDescription(
			LocalizationUtil.updateLocalization(
				descriptionMap, getDescription(), "Description",
				LocaleUtil.toLanguageId(defaultLocale)));
	}

	@JSON
	@Override
	public long getSourceId() {
		return _sourceId;
	}

	@Override
	public void setSourceId(long sourceId) {
		_sourceId = sourceId;
	}

	@JSON
	@Override
	public String getReportName() {
		if (_reportName == null) {
			return "";
		}
		else {
			return _reportName;
		}
	}

	@Override
	public void setReportName(String reportName) {
		_reportName = reportName;
	}

	@JSON
	@Override
	public String getReportParameters() {
		if (_reportParameters == null) {
			return "";
		}
		else {
			return _reportParameters;
		}
	}

	@Override
	public void setReportParameters(String reportParameters) {
		_reportParameters = reportParameters;
	}

	@JSON
	@Override
	public Date getLastPublishDate() {
		return _lastPublishDate;
	}

	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		_lastPublishDate = lastPublishDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Definition.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Definition.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public String[] getAvailableLanguageIds() {
		Set<String> availableLanguageIds = new TreeSet<String>();

		Map<Locale, String> nameMap = getNameMap();

		for (Map.Entry<Locale, String> entry : nameMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		Map<Locale, String> descriptionMap = getDescriptionMap();

		for (Map.Entry<Locale, String> entry : descriptionMap.entrySet()) {
			Locale locale = entry.getKey();
			String value = entry.getValue();

			if (Validator.isNotNull(value)) {
				availableLanguageIds.add(LocaleUtil.toLanguageId(locale));
			}
		}

		return availableLanguageIds.toArray(
			new String[availableLanguageIds.size()]);
	}

	@Override
	public String getDefaultLanguageId() {
		String xml = getName();

		if (xml == null) {
			return "";
		}

		Locale defaultLocale = LocaleUtil.getSiteDefault();

		return LocalizationUtil.getDefaultLanguageId(xml, defaultLocale);
	}

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException {
		Locale defaultLocale = LocaleUtil.fromLanguageId(
			getDefaultLanguageId());

		Locale[] availableLocales = LocaleUtil.fromLanguageIds(
			getAvailableLanguageIds());

		Locale defaultImportLocale = LocalizationUtil.getDefaultImportLocale(
			Definition.class.getName(), getPrimaryKey(), defaultLocale,
			availableLocales);

		prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	@Override
	@SuppressWarnings("unused")
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException {

		Locale defaultLocale = LocaleUtil.getSiteDefault();

		String modelDefaultLanguageId = getDefaultLanguageId();

		String name = getName(defaultLocale);

		if (Validator.isNull(name)) {
			setName(getName(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setName(getName(defaultLocale), defaultLocale, defaultLocale);
		}

		String description = getDescription(defaultLocale);

		if (Validator.isNull(description)) {
			setDescription(
				getDescription(modelDefaultLanguageId), defaultLocale);
		}
		else {
			setDescription(
				getDescription(defaultLocale), defaultLocale, defaultLocale);
		}
	}

	@Override
	public Definition toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Definition)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DefinitionImpl definitionImpl = new DefinitionImpl();

		definitionImpl.setUuid(getUuid());
		definitionImpl.setDefinitionId(getDefinitionId());
		definitionImpl.setGroupId(getGroupId());
		definitionImpl.setCompanyId(getCompanyId());
		definitionImpl.setUserId(getUserId());
		definitionImpl.setUserName(getUserName());
		definitionImpl.setCreateDate(getCreateDate());
		definitionImpl.setModifiedDate(getModifiedDate());
		definitionImpl.setName(getName());
		definitionImpl.setDescription(getDescription());
		definitionImpl.setSourceId(getSourceId());
		definitionImpl.setReportName(getReportName());
		definitionImpl.setReportParameters(getReportParameters());
		definitionImpl.setLastPublishDate(getLastPublishDate());

		definitionImpl.resetOriginalValues();

		return definitionImpl;
	}

	@Override
	public int compareTo(Definition definition) {
		int value = 0;

		value = DateUtil.compareTo(
			getModifiedDate(), definition.getModifiedDate());

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

		if (!(obj instanceof Definition)) {
			return false;
		}

		Definition definition = (Definition)obj;

		long primaryKey = definition.getPrimaryKey();

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
		DefinitionModelImpl definitionModelImpl = this;

		definitionModelImpl._originalUuid = definitionModelImpl._uuid;

		definitionModelImpl._originalGroupId = definitionModelImpl._groupId;

		definitionModelImpl._setOriginalGroupId = false;

		definitionModelImpl._originalCompanyId = definitionModelImpl._companyId;

		definitionModelImpl._setOriginalCompanyId = false;

		definitionModelImpl._setModifiedDate = false;

		definitionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Definition> toCacheModel() {
		DefinitionCacheModel definitionCacheModel = new DefinitionCacheModel();

		definitionCacheModel.uuid = getUuid();

		String uuid = definitionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			definitionCacheModel.uuid = null;
		}

		definitionCacheModel.definitionId = getDefinitionId();

		definitionCacheModel.groupId = getGroupId();

		definitionCacheModel.companyId = getCompanyId();

		definitionCacheModel.userId = getUserId();

		definitionCacheModel.userName = getUserName();

		String userName = definitionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			definitionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			definitionCacheModel.createDate = createDate.getTime();
		}
		else {
			definitionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			definitionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			definitionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		definitionCacheModel.name = getName();

		String name = definitionCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			definitionCacheModel.name = null;
		}

		definitionCacheModel.description = getDescription();

		String description = definitionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			definitionCacheModel.description = null;
		}

		definitionCacheModel.sourceId = getSourceId();

		definitionCacheModel.reportName = getReportName();

		String reportName = definitionCacheModel.reportName;

		if ((reportName != null) && (reportName.length() == 0)) {
			definitionCacheModel.reportName = null;
		}

		definitionCacheModel.reportParameters = getReportParameters();

		String reportParameters = definitionCacheModel.reportParameters;

		if ((reportParameters != null) && (reportParameters.length() == 0)) {
			definitionCacheModel.reportParameters = null;
		}

		Date lastPublishDate = getLastPublishDate();

		if (lastPublishDate != null) {
			definitionCacheModel.lastPublishDate = lastPublishDate.getTime();
		}
		else {
			definitionCacheModel.lastPublishDate = Long.MIN_VALUE;
		}

		return definitionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Definition, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Definition, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Definition, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Definition)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Definition, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Definition, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Definition, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Definition)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		Definition.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		Definition.class, ModelWrapper.class
	};

	private String _uuid;
	private String _originalUuid;
	private long _definitionId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _nameCurrentLanguageId;
	private String _description;
	private String _descriptionCurrentLanguageId;
	private long _sourceId;
	private String _reportName;
	private String _reportParameters;
	private Date _lastPublishDate;
	private long _columnBitmask;
	private Definition _escapedModel;

}