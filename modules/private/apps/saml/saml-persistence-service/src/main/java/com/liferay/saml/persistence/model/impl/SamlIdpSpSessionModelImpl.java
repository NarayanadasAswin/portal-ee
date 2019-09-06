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

package com.liferay.saml.persistence.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.saml.persistence.model.SamlIdpSpSession;
import com.liferay.saml.persistence.model.SamlIdpSpSessionModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the SamlIdpSpSession service. Represents a row in the &quot;SamlIdpSpSession&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>SamlIdpSpSessionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SamlIdpSpSessionImpl}.
 * </p>
 *
 * @author Mika Koivisto
 * @see SamlIdpSpSessionImpl
 * @generated
 */
public class SamlIdpSpSessionModelImpl
	extends BaseModelImpl<SamlIdpSpSession> implements SamlIdpSpSessionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a saml idp sp session model instance should use the <code>SamlIdpSpSession</code> interface instead.
	 */
	public static final String TABLE_NAME = "SamlIdpSpSession";

	public static final Object[][] TABLE_COLUMNS = {
		{"samlIdpSpSessionId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"samlIdpSsoSessionId", Types.BIGINT},
		{"samlSpEntityId", Types.VARCHAR}, {"nameIdFormat", Types.VARCHAR},
		{"nameIdValue", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("samlIdpSpSessionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("samlIdpSsoSessionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("samlSpEntityId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nameIdFormat", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nameIdValue", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table SamlIdpSpSession (samlIdpSpSessionId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,samlIdpSsoSessionId LONG,samlSpEntityId VARCHAR(1024) null,nameIdFormat VARCHAR(1024) null,nameIdValue VARCHAR(1024) null)";

	public static final String TABLE_SQL_DROP = "drop table SamlIdpSpSession";

	public static final String ORDER_BY_JPQL =
		" ORDER BY samlIdpSpSession.samlIdpSpSessionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY SamlIdpSpSession.samlIdpSpSessionId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.saml.persistence.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.saml.persistence.model.SamlIdpSpSession"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.saml.persistence.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.saml.persistence.model.SamlIdpSpSession"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.saml.persistence.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.saml.persistence.model.SamlIdpSpSession"),
		true);

	public static final long CREATEDATE_COLUMN_BITMASK = 1L;

	public static final long SAMLIDPSSOSESSIONID_COLUMN_BITMASK = 2L;

	public static final long SAMLSPENTITYID_COLUMN_BITMASK = 4L;

	public static final long SAMLIDPSPSESSIONID_COLUMN_BITMASK = 8L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.saml.persistence.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.saml.persistence.model.SamlIdpSpSession"));

	public SamlIdpSpSessionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _samlIdpSpSessionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSamlIdpSpSessionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _samlIdpSpSessionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SamlIdpSpSession.class;
	}

	@Override
	public String getModelClassName() {
		return SamlIdpSpSession.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SamlIdpSpSession, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SamlIdpSpSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SamlIdpSpSession, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SamlIdpSpSession)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SamlIdpSpSession, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SamlIdpSpSession, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SamlIdpSpSession)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SamlIdpSpSession, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SamlIdpSpSession, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, SamlIdpSpSession>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			SamlIdpSpSession.class.getClassLoader(), SamlIdpSpSession.class,
			ModelWrapper.class);

		try {
			Constructor<SamlIdpSpSession> constructor =
				(Constructor<SamlIdpSpSession>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<SamlIdpSpSession, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<SamlIdpSpSession, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<SamlIdpSpSession, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<SamlIdpSpSession, Object>>();
		Map<String, BiConsumer<SamlIdpSpSession, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<SamlIdpSpSession, ?>>();

		attributeGetterFunctions.put(
			"samlIdpSpSessionId", SamlIdpSpSession::getSamlIdpSpSessionId);
		attributeSetterBiConsumers.put(
			"samlIdpSpSessionId",
			(BiConsumer<SamlIdpSpSession, Long>)
				SamlIdpSpSession::setSamlIdpSpSessionId);
		attributeGetterFunctions.put(
			"companyId", SamlIdpSpSession::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<SamlIdpSpSession, Long>)SamlIdpSpSession::setCompanyId);
		attributeGetterFunctions.put("userId", SamlIdpSpSession::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<SamlIdpSpSession, Long>)SamlIdpSpSession::setUserId);
		attributeGetterFunctions.put("userName", SamlIdpSpSession::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<SamlIdpSpSession, String>)
				SamlIdpSpSession::setUserName);
		attributeGetterFunctions.put(
			"createDate", SamlIdpSpSession::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<SamlIdpSpSession, Date>)
				SamlIdpSpSession::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", SamlIdpSpSession::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<SamlIdpSpSession, Date>)
				SamlIdpSpSession::setModifiedDate);
		attributeGetterFunctions.put(
			"samlIdpSsoSessionId", SamlIdpSpSession::getSamlIdpSsoSessionId);
		attributeSetterBiConsumers.put(
			"samlIdpSsoSessionId",
			(BiConsumer<SamlIdpSpSession, Long>)
				SamlIdpSpSession::setSamlIdpSsoSessionId);
		attributeGetterFunctions.put(
			"samlSpEntityId", SamlIdpSpSession::getSamlSpEntityId);
		attributeSetterBiConsumers.put(
			"samlSpEntityId",
			(BiConsumer<SamlIdpSpSession, String>)
				SamlIdpSpSession::setSamlSpEntityId);
		attributeGetterFunctions.put(
			"nameIdFormat", SamlIdpSpSession::getNameIdFormat);
		attributeSetterBiConsumers.put(
			"nameIdFormat",
			(BiConsumer<SamlIdpSpSession, String>)
				SamlIdpSpSession::setNameIdFormat);
		attributeGetterFunctions.put(
			"nameIdValue", SamlIdpSpSession::getNameIdValue);
		attributeSetterBiConsumers.put(
			"nameIdValue",
			(BiConsumer<SamlIdpSpSession, String>)
				SamlIdpSpSession::setNameIdValue);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getSamlIdpSpSessionId() {
		return _samlIdpSpSessionId;
	}

	@Override
	public void setSamlIdpSpSessionId(long samlIdpSpSessionId) {
		_samlIdpSpSessionId = samlIdpSpSessionId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

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

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_columnBitmask |= CREATEDATE_COLUMN_BITMASK;

		if (_originalCreateDate == null) {
			_originalCreateDate = _createDate;
		}

		_createDate = createDate;
	}

	public Date getOriginalCreateDate() {
		return _originalCreateDate;
	}

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

	@Override
	public long getSamlIdpSsoSessionId() {
		return _samlIdpSsoSessionId;
	}

	@Override
	public void setSamlIdpSsoSessionId(long samlIdpSsoSessionId) {
		_columnBitmask |= SAMLIDPSSOSESSIONID_COLUMN_BITMASK;

		if (!_setOriginalSamlIdpSsoSessionId) {
			_setOriginalSamlIdpSsoSessionId = true;

			_originalSamlIdpSsoSessionId = _samlIdpSsoSessionId;
		}

		_samlIdpSsoSessionId = samlIdpSsoSessionId;
	}

	public long getOriginalSamlIdpSsoSessionId() {
		return _originalSamlIdpSsoSessionId;
	}

	@Override
	public String getSamlSpEntityId() {
		if (_samlSpEntityId == null) {
			return "";
		}
		else {
			return _samlSpEntityId;
		}
	}

	@Override
	public void setSamlSpEntityId(String samlSpEntityId) {
		_columnBitmask |= SAMLSPENTITYID_COLUMN_BITMASK;

		if (_originalSamlSpEntityId == null) {
			_originalSamlSpEntityId = _samlSpEntityId;
		}

		_samlSpEntityId = samlSpEntityId;
	}

	public String getOriginalSamlSpEntityId() {
		return GetterUtil.getString(_originalSamlSpEntityId);
	}

	@Override
	public String getNameIdFormat() {
		if (_nameIdFormat == null) {
			return "";
		}
		else {
			return _nameIdFormat;
		}
	}

	@Override
	public void setNameIdFormat(String nameIdFormat) {
		_nameIdFormat = nameIdFormat;
	}

	@Override
	public String getNameIdValue() {
		if (_nameIdValue == null) {
			return "";
		}
		else {
			return _nameIdValue;
		}
	}

	@Override
	public void setNameIdValue(String nameIdValue) {
		_nameIdValue = nameIdValue;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), SamlIdpSpSession.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SamlIdpSpSession toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SamlIdpSpSession>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SamlIdpSpSessionImpl samlIdpSpSessionImpl = new SamlIdpSpSessionImpl();

		samlIdpSpSessionImpl.setSamlIdpSpSessionId(getSamlIdpSpSessionId());
		samlIdpSpSessionImpl.setCompanyId(getCompanyId());
		samlIdpSpSessionImpl.setUserId(getUserId());
		samlIdpSpSessionImpl.setUserName(getUserName());
		samlIdpSpSessionImpl.setCreateDate(getCreateDate());
		samlIdpSpSessionImpl.setModifiedDate(getModifiedDate());
		samlIdpSpSessionImpl.setSamlIdpSsoSessionId(getSamlIdpSsoSessionId());
		samlIdpSpSessionImpl.setSamlSpEntityId(getSamlSpEntityId());
		samlIdpSpSessionImpl.setNameIdFormat(getNameIdFormat());
		samlIdpSpSessionImpl.setNameIdValue(getNameIdValue());

		samlIdpSpSessionImpl.resetOriginalValues();

		return samlIdpSpSessionImpl;
	}

	@Override
	public int compareTo(SamlIdpSpSession samlIdpSpSession) {
		long primaryKey = samlIdpSpSession.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SamlIdpSpSession)) {
			return false;
		}

		SamlIdpSpSession samlIdpSpSession = (SamlIdpSpSession)obj;

		long primaryKey = samlIdpSpSession.getPrimaryKey();

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
		SamlIdpSpSessionModelImpl samlIdpSpSessionModelImpl = this;

		samlIdpSpSessionModelImpl._originalCreateDate =
			samlIdpSpSessionModelImpl._createDate;

		samlIdpSpSessionModelImpl._setModifiedDate = false;

		samlIdpSpSessionModelImpl._originalSamlIdpSsoSessionId =
			samlIdpSpSessionModelImpl._samlIdpSsoSessionId;

		samlIdpSpSessionModelImpl._setOriginalSamlIdpSsoSessionId = false;

		samlIdpSpSessionModelImpl._originalSamlSpEntityId =
			samlIdpSpSessionModelImpl._samlSpEntityId;

		samlIdpSpSessionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SamlIdpSpSession> toCacheModel() {
		SamlIdpSpSessionCacheModel samlIdpSpSessionCacheModel =
			new SamlIdpSpSessionCacheModel();

		samlIdpSpSessionCacheModel.samlIdpSpSessionId = getSamlIdpSpSessionId();

		samlIdpSpSessionCacheModel.companyId = getCompanyId();

		samlIdpSpSessionCacheModel.userId = getUserId();

		samlIdpSpSessionCacheModel.userName = getUserName();

		String userName = samlIdpSpSessionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			samlIdpSpSessionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			samlIdpSpSessionCacheModel.createDate = createDate.getTime();
		}
		else {
			samlIdpSpSessionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			samlIdpSpSessionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			samlIdpSpSessionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		samlIdpSpSessionCacheModel.samlIdpSsoSessionId =
			getSamlIdpSsoSessionId();

		samlIdpSpSessionCacheModel.samlSpEntityId = getSamlSpEntityId();

		String samlSpEntityId = samlIdpSpSessionCacheModel.samlSpEntityId;

		if ((samlSpEntityId != null) && (samlSpEntityId.length() == 0)) {
			samlIdpSpSessionCacheModel.samlSpEntityId = null;
		}

		samlIdpSpSessionCacheModel.nameIdFormat = getNameIdFormat();

		String nameIdFormat = samlIdpSpSessionCacheModel.nameIdFormat;

		if ((nameIdFormat != null) && (nameIdFormat.length() == 0)) {
			samlIdpSpSessionCacheModel.nameIdFormat = null;
		}

		samlIdpSpSessionCacheModel.nameIdValue = getNameIdValue();

		String nameIdValue = samlIdpSpSessionCacheModel.nameIdValue;

		if ((nameIdValue != null) && (nameIdValue.length() == 0)) {
			samlIdpSpSessionCacheModel.nameIdValue = null;
		}

		return samlIdpSpSessionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SamlIdpSpSession, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SamlIdpSpSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SamlIdpSpSession, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((SamlIdpSpSession)this));
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
		Map<String, Function<SamlIdpSpSession, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SamlIdpSpSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SamlIdpSpSession, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((SamlIdpSpSession)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, SamlIdpSpSession>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private long _samlIdpSpSessionId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _originalCreateDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _samlIdpSsoSessionId;
	private long _originalSamlIdpSsoSessionId;
	private boolean _setOriginalSamlIdpSsoSessionId;
	private String _samlSpEntityId;
	private String _originalSamlSpEntityId;
	private String _nameIdFormat;
	private String _nameIdValue;
	private long _columnBitmask;
	private SamlIdpSpSession _escapedModel;

}