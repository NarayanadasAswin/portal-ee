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

package com.liferay.portal.workflow.metrics.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinition;
import com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinitionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the WorkflowMetricsSLADefinition service. Represents a row in the &quot;WorkflowMetricsSLADefinition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>WorkflowMetricsSLADefinitionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkflowMetricsSLADefinitionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkflowMetricsSLADefinitionImpl
 * @generated
 */
@ProviderType
public class WorkflowMetricsSLADefinitionModelImpl
	extends BaseModelImpl<WorkflowMetricsSLADefinition>
	implements WorkflowMetricsSLADefinitionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a workflow metrics sla definition model instance should use the <code>WorkflowMetricsSLADefinition</code> interface instead.
	 */
	public static final String TABLE_NAME = "WorkflowMetricsSLADefinition";

	public static final Object[][] TABLE_COLUMNS = {
		{"mvccVersion", Types.BIGINT}, {"uuid_", Types.VARCHAR},
		{"workflowMetricsSLADefinitionId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"name", Types.VARCHAR}, {"description", Types.CLOB},
		{"duration", Types.BIGINT}, {"calendarKey", Types.VARCHAR},
		{"processId", Types.BIGINT}, {"processVersion", Types.VARCHAR},
		{"pauseNodeKeys", Types.VARCHAR}, {"startNodeKeys", Types.VARCHAR},
		{"stopNodeKeys", Types.VARCHAR}, {"status", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("mvccVersion", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("workflowMetricsSLADefinitionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.CLOB);
		TABLE_COLUMNS_MAP.put("duration", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("calendarKey", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("processVersion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pauseNodeKeys", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("startNodeKeys", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stopNodeKeys", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table WorkflowMetricsSLADefinition (mvccVersion LONG default 0 not null,uuid_ VARCHAR(75) null,workflowMetricsSLADefinitionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name STRING null,description TEXT null,duration LONG,calendarKey VARCHAR(75) null,processId LONG,processVersion VARCHAR(75) null,pauseNodeKeys VARCHAR(75) null,startNodeKeys VARCHAR(75) null,stopNodeKeys VARCHAR(75) null,status INTEGER)";

	public static final String TABLE_SQL_DROP =
		"drop table WorkflowMetricsSLADefinition";

	public static final String ORDER_BY_JPQL =
		" ORDER BY workflowMetricsSLADefinition.modifiedDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY WorkflowMetricsSLADefinition.modifiedDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.workflow.metrics.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinition"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.workflow.metrics.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinition"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.liferay.portal.workflow.metrics.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinition"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long NAME_COLUMN_BITMASK = 4L;

	public static final long PROCESSID_COLUMN_BITMASK = 8L;

	public static final long PROCESSVERSION_COLUMN_BITMASK = 16L;

	public static final long STATUS_COLUMN_BITMASK = 32L;

	public static final long UUID_COLUMN_BITMASK = 64L;

	public static final long MODIFIEDDATE_COLUMN_BITMASK = 128L;

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.liferay.portal.workflow.metrics.service.util.ServiceProps.get(
			"lock.expiration.time.com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinition"));

	public WorkflowMetricsSLADefinitionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _workflowMetricsSLADefinitionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setWorkflowMetricsSLADefinitionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _workflowMetricsSLADefinitionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return WorkflowMetricsSLADefinition.class;
	}

	@Override
	public String getModelClassName() {
		return WorkflowMetricsSLADefinition.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<WorkflowMetricsSLADefinition, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<WorkflowMetricsSLADefinition, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<WorkflowMetricsSLADefinition, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(WorkflowMetricsSLADefinition)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<WorkflowMetricsSLADefinition, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<WorkflowMetricsSLADefinition, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(WorkflowMetricsSLADefinition)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<WorkflowMetricsSLADefinition, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<WorkflowMetricsSLADefinition, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map
		<String, Function<WorkflowMetricsSLADefinition, Object>>
			_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<WorkflowMetricsSLADefinition, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<WorkflowMetricsSLADefinition, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<WorkflowMetricsSLADefinition, Object>>();
		Map<String, BiConsumer<WorkflowMetricsSLADefinition, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<WorkflowMetricsSLADefinition, ?>>();

		attributeGetterFunctions.put(
			"mvccVersion", WorkflowMetricsSLADefinition::getMvccVersion);
		attributeSetterBiConsumers.put(
			"mvccVersion",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setMvccVersion);
		attributeGetterFunctions.put(
			"uuid", WorkflowMetricsSLADefinition::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setUuid);
		attributeGetterFunctions.put(
			"workflowMetricsSLADefinitionId",
			WorkflowMetricsSLADefinition::getWorkflowMetricsSLADefinitionId);
		attributeSetterBiConsumers.put(
			"workflowMetricsSLADefinitionId",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::
					setWorkflowMetricsSLADefinitionId);
		attributeGetterFunctions.put(
			"groupId", WorkflowMetricsSLADefinition::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setGroupId);
		attributeGetterFunctions.put(
			"companyId", WorkflowMetricsSLADefinition::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setCompanyId);
		attributeGetterFunctions.put(
			"userId", WorkflowMetricsSLADefinition::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setUserId);
		attributeGetterFunctions.put(
			"userName", WorkflowMetricsSLADefinition::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setUserName);
		attributeGetterFunctions.put(
			"createDate", WorkflowMetricsSLADefinition::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<WorkflowMetricsSLADefinition, Date>)
				WorkflowMetricsSLADefinition::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", WorkflowMetricsSLADefinition::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<WorkflowMetricsSLADefinition, Date>)
				WorkflowMetricsSLADefinition::setModifiedDate);
		attributeGetterFunctions.put(
			"name", WorkflowMetricsSLADefinition::getName);
		attributeSetterBiConsumers.put(
			"name",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setName);
		attributeGetterFunctions.put(
			"description", WorkflowMetricsSLADefinition::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setDescription);
		attributeGetterFunctions.put(
			"duration", WorkflowMetricsSLADefinition::getDuration);
		attributeSetterBiConsumers.put(
			"duration",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setDuration);
		attributeGetterFunctions.put(
			"calendarKey", WorkflowMetricsSLADefinition::getCalendarKey);
		attributeSetterBiConsumers.put(
			"calendarKey",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setCalendarKey);
		attributeGetterFunctions.put(
			"processId", WorkflowMetricsSLADefinition::getProcessId);
		attributeSetterBiConsumers.put(
			"processId",
			(BiConsumer<WorkflowMetricsSLADefinition, Long>)
				WorkflowMetricsSLADefinition::setProcessId);
		attributeGetterFunctions.put(
			"processVersion", WorkflowMetricsSLADefinition::getProcessVersion);
		attributeSetterBiConsumers.put(
			"processVersion",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setProcessVersion);
		attributeGetterFunctions.put(
			"pauseNodeKeys", WorkflowMetricsSLADefinition::getPauseNodeKeys);
		attributeSetterBiConsumers.put(
			"pauseNodeKeys",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setPauseNodeKeys);
		attributeGetterFunctions.put(
			"startNodeKeys", WorkflowMetricsSLADefinition::getStartNodeKeys);
		attributeSetterBiConsumers.put(
			"startNodeKeys",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setStartNodeKeys);
		attributeGetterFunctions.put(
			"stopNodeKeys", WorkflowMetricsSLADefinition::getStopNodeKeys);
		attributeSetterBiConsumers.put(
			"stopNodeKeys",
			(BiConsumer<WorkflowMetricsSLADefinition, String>)
				WorkflowMetricsSLADefinition::setStopNodeKeys);
		attributeGetterFunctions.put(
			"status", WorkflowMetricsSLADefinition::getStatus);
		attributeSetterBiConsumers.put(
			"status",
			(BiConsumer<WorkflowMetricsSLADefinition, Integer>)
				WorkflowMetricsSLADefinition::setStatus);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@Override
	public long getMvccVersion() {
		return _mvccVersion;
	}

	@Override
	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

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

	@Override
	public long getWorkflowMetricsSLADefinitionId() {
		return _workflowMetricsSLADefinitionId;
	}

	@Override
	public void setWorkflowMetricsSLADefinitionId(
		long workflowMetricsSLADefinitionId) {

		_workflowMetricsSLADefinitionId = workflowMetricsSLADefinitionId;
	}

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
		_createDate = createDate;
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

		_columnBitmask = -1L;

		_modifiedDate = modifiedDate;
	}

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
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

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
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public long getDuration() {
		return _duration;
	}

	@Override
	public void setDuration(long duration) {
		_duration = duration;
	}

	@Override
	public String getCalendarKey() {
		if (_calendarKey == null) {
			return "";
		}
		else {
			return _calendarKey;
		}
	}

	@Override
	public void setCalendarKey(String calendarKey) {
		_calendarKey = calendarKey;
	}

	@Override
	public long getProcessId() {
		return _processId;
	}

	@Override
	public void setProcessId(long processId) {
		_columnBitmask |= PROCESSID_COLUMN_BITMASK;

		if (!_setOriginalProcessId) {
			_setOriginalProcessId = true;

			_originalProcessId = _processId;
		}

		_processId = processId;
	}

	public long getOriginalProcessId() {
		return _originalProcessId;
	}

	@Override
	public String getProcessVersion() {
		if (_processVersion == null) {
			return "";
		}
		else {
			return _processVersion;
		}
	}

	@Override
	public void setProcessVersion(String processVersion) {
		_columnBitmask |= PROCESSVERSION_COLUMN_BITMASK;

		if (_originalProcessVersion == null) {
			_originalProcessVersion = _processVersion;
		}

		_processVersion = processVersion;
	}

	public String getOriginalProcessVersion() {
		return GetterUtil.getString(_originalProcessVersion);
	}

	@Override
	public String getPauseNodeKeys() {
		if (_pauseNodeKeys == null) {
			return "";
		}
		else {
			return _pauseNodeKeys;
		}
	}

	@Override
	public void setPauseNodeKeys(String pauseNodeKeys) {
		_pauseNodeKeys = pauseNodeKeys;
	}

	@Override
	public String getStartNodeKeys() {
		if (_startNodeKeys == null) {
			return "";
		}
		else {
			return _startNodeKeys;
		}
	}

	@Override
	public void setStartNodeKeys(String startNodeKeys) {
		_startNodeKeys = startNodeKeys;
	}

	@Override
	public String getStopNodeKeys() {
		if (_stopNodeKeys == null) {
			return "";
		}
		else {
			return _stopNodeKeys;
		}
	}

	@Override
	public void setStopNodeKeys(String stopNodeKeys) {
		_stopNodeKeys = stopNodeKeys;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				WorkflowMetricsSLADefinition.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), WorkflowMetricsSLADefinition.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public WorkflowMetricsSLADefinition toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel =
				(WorkflowMetricsSLADefinition)ProxyUtil.newProxyInstance(
					_classLoader, _escapedModelInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WorkflowMetricsSLADefinitionImpl workflowMetricsSLADefinitionImpl =
			new WorkflowMetricsSLADefinitionImpl();

		workflowMetricsSLADefinitionImpl.setMvccVersion(getMvccVersion());
		workflowMetricsSLADefinitionImpl.setUuid(getUuid());
		workflowMetricsSLADefinitionImpl.setWorkflowMetricsSLADefinitionId(
			getWorkflowMetricsSLADefinitionId());
		workflowMetricsSLADefinitionImpl.setGroupId(getGroupId());
		workflowMetricsSLADefinitionImpl.setCompanyId(getCompanyId());
		workflowMetricsSLADefinitionImpl.setUserId(getUserId());
		workflowMetricsSLADefinitionImpl.setUserName(getUserName());
		workflowMetricsSLADefinitionImpl.setCreateDate(getCreateDate());
		workflowMetricsSLADefinitionImpl.setModifiedDate(getModifiedDate());
		workflowMetricsSLADefinitionImpl.setName(getName());
		workflowMetricsSLADefinitionImpl.setDescription(getDescription());
		workflowMetricsSLADefinitionImpl.setDuration(getDuration());
		workflowMetricsSLADefinitionImpl.setCalendarKey(getCalendarKey());
		workflowMetricsSLADefinitionImpl.setProcessId(getProcessId());
		workflowMetricsSLADefinitionImpl.setProcessVersion(getProcessVersion());
		workflowMetricsSLADefinitionImpl.setPauseNodeKeys(getPauseNodeKeys());
		workflowMetricsSLADefinitionImpl.setStartNodeKeys(getStartNodeKeys());
		workflowMetricsSLADefinitionImpl.setStopNodeKeys(getStopNodeKeys());
		workflowMetricsSLADefinitionImpl.setStatus(getStatus());

		workflowMetricsSLADefinitionImpl.resetOriginalValues();

		return workflowMetricsSLADefinitionImpl;
	}

	@Override
	public int compareTo(
		WorkflowMetricsSLADefinition workflowMetricsSLADefinition) {

		int value = 0;

		value = DateUtil.compareTo(
			getModifiedDate(), workflowMetricsSLADefinition.getModifiedDate());

		value = value * -1;

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

		if (!(obj instanceof WorkflowMetricsSLADefinition)) {
			return false;
		}

		WorkflowMetricsSLADefinition workflowMetricsSLADefinition =
			(WorkflowMetricsSLADefinition)obj;

		long primaryKey = workflowMetricsSLADefinition.getPrimaryKey();

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
		WorkflowMetricsSLADefinitionModelImpl
			workflowMetricsSLADefinitionModelImpl = this;

		workflowMetricsSLADefinitionModelImpl._originalUuid =
			workflowMetricsSLADefinitionModelImpl._uuid;

		workflowMetricsSLADefinitionModelImpl._originalGroupId =
			workflowMetricsSLADefinitionModelImpl._groupId;

		workflowMetricsSLADefinitionModelImpl._setOriginalGroupId = false;

		workflowMetricsSLADefinitionModelImpl._originalCompanyId =
			workflowMetricsSLADefinitionModelImpl._companyId;

		workflowMetricsSLADefinitionModelImpl._setOriginalCompanyId = false;

		workflowMetricsSLADefinitionModelImpl._setModifiedDate = false;

		workflowMetricsSLADefinitionModelImpl._originalName =
			workflowMetricsSLADefinitionModelImpl._name;

		workflowMetricsSLADefinitionModelImpl._originalProcessId =
			workflowMetricsSLADefinitionModelImpl._processId;

		workflowMetricsSLADefinitionModelImpl._setOriginalProcessId = false;

		workflowMetricsSLADefinitionModelImpl._originalProcessVersion =
			workflowMetricsSLADefinitionModelImpl._processVersion;

		workflowMetricsSLADefinitionModelImpl._originalStatus =
			workflowMetricsSLADefinitionModelImpl._status;

		workflowMetricsSLADefinitionModelImpl._setOriginalStatus = false;

		workflowMetricsSLADefinitionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<WorkflowMetricsSLADefinition> toCacheModel() {
		WorkflowMetricsSLADefinitionCacheModel
			workflowMetricsSLADefinitionCacheModel =
				new WorkflowMetricsSLADefinitionCacheModel();

		workflowMetricsSLADefinitionCacheModel.mvccVersion = getMvccVersion();

		workflowMetricsSLADefinitionCacheModel.uuid = getUuid();

		String uuid = workflowMetricsSLADefinitionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.uuid = null;
		}

		workflowMetricsSLADefinitionCacheModel.workflowMetricsSLADefinitionId =
			getWorkflowMetricsSLADefinitionId();

		workflowMetricsSLADefinitionCacheModel.groupId = getGroupId();

		workflowMetricsSLADefinitionCacheModel.companyId = getCompanyId();

		workflowMetricsSLADefinitionCacheModel.userId = getUserId();

		workflowMetricsSLADefinitionCacheModel.userName = getUserName();

		String userName = workflowMetricsSLADefinitionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			workflowMetricsSLADefinitionCacheModel.createDate =
				createDate.getTime();
		}
		else {
			workflowMetricsSLADefinitionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			workflowMetricsSLADefinitionCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			workflowMetricsSLADefinitionCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		workflowMetricsSLADefinitionCacheModel.name = getName();

		String name = workflowMetricsSLADefinitionCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.name = null;
		}

		workflowMetricsSLADefinitionCacheModel.description = getDescription();

		String description = workflowMetricsSLADefinitionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.description = null;
		}

		workflowMetricsSLADefinitionCacheModel.duration = getDuration();

		workflowMetricsSLADefinitionCacheModel.calendarKey = getCalendarKey();

		String calendarKey = workflowMetricsSLADefinitionCacheModel.calendarKey;

		if ((calendarKey != null) && (calendarKey.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.calendarKey = null;
		}

		workflowMetricsSLADefinitionCacheModel.processId = getProcessId();

		workflowMetricsSLADefinitionCacheModel.processVersion =
			getProcessVersion();

		String processVersion =
			workflowMetricsSLADefinitionCacheModel.processVersion;

		if ((processVersion != null) && (processVersion.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.processVersion = null;
		}

		workflowMetricsSLADefinitionCacheModel.pauseNodeKeys =
			getPauseNodeKeys();

		String pauseNodeKeys =
			workflowMetricsSLADefinitionCacheModel.pauseNodeKeys;

		if ((pauseNodeKeys != null) && (pauseNodeKeys.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.pauseNodeKeys = null;
		}

		workflowMetricsSLADefinitionCacheModel.startNodeKeys =
			getStartNodeKeys();

		String startNodeKeys =
			workflowMetricsSLADefinitionCacheModel.startNodeKeys;

		if ((startNodeKeys != null) && (startNodeKeys.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.startNodeKeys = null;
		}

		workflowMetricsSLADefinitionCacheModel.stopNodeKeys = getStopNodeKeys();

		String stopNodeKeys =
			workflowMetricsSLADefinitionCacheModel.stopNodeKeys;

		if ((stopNodeKeys != null) && (stopNodeKeys.length() == 0)) {
			workflowMetricsSLADefinitionCacheModel.stopNodeKeys = null;
		}

		workflowMetricsSLADefinitionCacheModel.status = getStatus();

		return workflowMetricsSLADefinitionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<WorkflowMetricsSLADefinition, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<WorkflowMetricsSLADefinition, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<WorkflowMetricsSLADefinition, Object>
				attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply(
					(WorkflowMetricsSLADefinition)this));
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
		Map<String, Function<WorkflowMetricsSLADefinition, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<WorkflowMetricsSLADefinition, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<WorkflowMetricsSLADefinition, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply(
					(WorkflowMetricsSLADefinition)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		WorkflowMetricsSLADefinition.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		WorkflowMetricsSLADefinition.class, ModelWrapper.class
	};

	private long _mvccVersion;
	private String _uuid;
	private String _originalUuid;
	private long _workflowMetricsSLADefinitionId;
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
	private String _originalName;
	private String _description;
	private long _duration;
	private String _calendarKey;
	private long _processId;
	private long _originalProcessId;
	private boolean _setOriginalProcessId;
	private String _processVersion;
	private String _originalProcessVersion;
	private String _pauseNodeKeys;
	private String _startNodeKeys;
	private String _stopNodeKeys;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _columnBitmask;
	private WorkflowMetricsSLADefinition _escapedModel;

}