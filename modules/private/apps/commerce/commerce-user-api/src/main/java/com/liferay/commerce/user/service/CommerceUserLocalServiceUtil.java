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

package com.liferay.commerce.user.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CommerceUser. This utility wraps
 * {@link com.liferay.commerce.user.service.impl.CommerceUserLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceUserLocalService
 * @see com.liferay.commerce.user.service.base.CommerceUserLocalServiceBaseImpl
 * @see com.liferay.commerce.user.service.impl.CommerceUserLocalServiceImpl
 * @generated
 */
@ProviderType
public class CommerceUserLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.commerce.user.service.impl.CommerceUserLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.User updatePassword(
		long userId, String password1, String password2, boolean passwordReset)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updatePassword(userId, password1, password2, passwordReset);
	}

	public static com.liferay.portal.kernel.model.User updatePasswordReset(
		long userId, boolean passwordReset)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updatePasswordReset(userId, passwordReset);
	}

	public static com.liferay.portal.kernel.model.User updateReminderQuery(
		long userId, String question, String answer)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateReminderQuery(userId, question, answer);
	}

	public static com.liferay.portal.kernel.model.User updateUser(long userId,
		String screenName, String emailAddress, boolean portrait,
		byte[] portraitBytes, String languageId, String firstName,
		String middleName, String lastName, long prefixId, long suffixId,
		boolean male, int birthdayMonth, int birthdayDay, int birthdayYear,
		String jobTitle,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updateUser(userId, screenName, emailAddress, portrait,
			portraitBytes, languageId, firstName, middleName, lastName,
			prefixId, suffixId, male, birthdayMonth, birthdayDay, birthdayYear,
			jobTitle, serviceContext);
	}

	public static void updateUserRoles(long userId, long groupId, long[] roleIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().updateUserRoles(userId, groupId, roleIds);
	}

	public static CommerceUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CommerceUserLocalService, CommerceUserLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CommerceUserLocalService.class);

		ServiceTracker<CommerceUserLocalService, CommerceUserLocalService> serviceTracker =
			new ServiceTracker<CommerceUserLocalService, CommerceUserLocalService>(bundle.getBundleContext(),
				CommerceUserLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}