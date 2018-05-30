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

package com.liferay.commerce.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.service.CommerceTaxMethodServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;

import java.rmi.RemoteException;

import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * {@link CommerceTaxMethodServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.commerce.model.CommerceTaxMethodSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.commerce.model.CommerceTaxMethod}, that is translated to a
 * {@link com.liferay.commerce.model.CommerceTaxMethodSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceTaxMethodServiceHttp
 * @see com.liferay.commerce.model.CommerceTaxMethodSoap
 * @see CommerceTaxMethodServiceUtil
 * @generated
 */
@ProviderType
public class CommerceTaxMethodServiceSoap {
	public static com.liferay.commerce.model.CommerceTaxMethodSoap addCommerceTaxMethod(
		String[] nameMapLanguageIds, String[] nameMapValues,
		String[] descriptionMapLanguageIds, String[] descriptionMapValues,
		String engineKey, boolean percentage, boolean active,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.addCommerceTaxMethod(nameMap,
					descriptionMap, engineKey, percentage, active,
					serviceContext);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap createCommerceTaxMethod(
		long commerceTaxMethodId) throws RemoteException {
		try {
			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.createCommerceTaxMethod(commerceTaxMethodId);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCommerceTaxMethod(long commerceTaxMethodId)
		throws RemoteException {
		try {
			CommerceTaxMethodServiceUtil.deleteCommerceTaxMethod(commerceTaxMethodId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap fetchCommerceTaxMethod(
		long groupId, String engineKey) throws RemoteException {
		try {
			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.fetchCommerceTaxMethod(groupId,
					engineKey);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap getCommerceTaxMethod(
		long commerceTaxMethodId) throws RemoteException {
		try {
			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.getCommerceTaxMethod(commerceTaxMethodId);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap[] getCommerceTaxMethods(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.model.CommerceTaxMethod> returnValue =
				CommerceTaxMethodServiceUtil.getCommerceTaxMethods(groupId);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap[] getCommerceTaxMethods(
		long groupId, boolean active) throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.model.CommerceTaxMethod> returnValue =
				CommerceTaxMethodServiceUtil.getCommerceTaxMethods(groupId,
					active);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getCommerceTaxMethodsCount(long groupId, boolean active)
		throws RemoteException {
		try {
			int returnValue = CommerceTaxMethodServiceUtil.getCommerceTaxMethodsCount(groupId,
					active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap setActive(
		long commerceTaxMethodId, boolean active) throws RemoteException {
		try {
			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.setActive(commerceTaxMethodId,
					active);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceTaxMethodSoap updateCommerceTaxMethod(
		long commerceTaxMethodId, String[] nameMapLanguageIds,
		String[] nameMapValues, String[] descriptionMapLanguageIds,
		String[] descriptionMapValues, boolean percentage, boolean active)
		throws RemoteException {
		try {
			Map<Locale, String> nameMap = LocalizationUtil.getLocalizationMap(nameMapLanguageIds,
					nameMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			com.liferay.commerce.model.CommerceTaxMethod returnValue = CommerceTaxMethodServiceUtil.updateCommerceTaxMethod(commerceTaxMethodId,
					nameMap, descriptionMap, percentage, active);

			return com.liferay.commerce.model.CommerceTaxMethodSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CommerceTaxMethodServiceSoap.class);
}