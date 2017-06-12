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

package com.liferay.commerce.product.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.commerce.product.service.http.CPFriendlyUrlEntryServiceSoap}.
 *
 * @author Marco Leo
 * @see com.liferay.commerce.product.service.http.CPFriendlyUrlEntryServiceSoap
 * @generated
 */
@ProviderType
public class CPFriendlyUrlEntrySoap implements Serializable {
	public static CPFriendlyUrlEntrySoap toSoapModel(CPFriendlyUrlEntry model) {
		CPFriendlyUrlEntrySoap soapModel = new CPFriendlyUrlEntrySoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCPFriendlyUrlEntryId(model.getCPFriendlyUrlEntryId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setLanguageId(model.getLanguageId());
		soapModel.setUrlTitle(model.getUrlTitle());
		soapModel.setMain(model.getMain());

		return soapModel;
	}

	public static CPFriendlyUrlEntrySoap[] toSoapModels(
		CPFriendlyUrlEntry[] models) {
		CPFriendlyUrlEntrySoap[] soapModels = new CPFriendlyUrlEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CPFriendlyUrlEntrySoap[][] toSoapModels(
		CPFriendlyUrlEntry[][] models) {
		CPFriendlyUrlEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CPFriendlyUrlEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CPFriendlyUrlEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CPFriendlyUrlEntrySoap[] toSoapModels(
		List<CPFriendlyUrlEntry> models) {
		List<CPFriendlyUrlEntrySoap> soapModels = new ArrayList<CPFriendlyUrlEntrySoap>(models.size());

		for (CPFriendlyUrlEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CPFriendlyUrlEntrySoap[soapModels.size()]);
	}

	public CPFriendlyUrlEntrySoap() {
	}

	public long getPrimaryKey() {
		return _CPFriendlyUrlEntryId;
	}

	public void setPrimaryKey(long pk) {
		setCPFriendlyUrlEntryId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCPFriendlyUrlEntryId() {
		return _CPFriendlyUrlEntryId;
	}

	public void setCPFriendlyUrlEntryId(long CPFriendlyUrlEntryId) {
		_CPFriendlyUrlEntryId = CPFriendlyUrlEntryId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public String getLanguageId() {
		return _languageId;
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public String getUrlTitle() {
		return _urlTitle;
	}

	public void setUrlTitle(String urlTitle) {
		_urlTitle = urlTitle;
	}

	public boolean getMain() {
		return _main;
	}

	public boolean isMain() {
		return _main;
	}

	public void setMain(boolean main) {
		_main = main;
	}

	private String _uuid;
	private long _CPFriendlyUrlEntryId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _classPK;
	private String _languageId;
	private String _urlTitle;
	private boolean _main;
}