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

package com.liferay.commerce.discount.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.discount.service.CommerceDiscountServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link CommerceDiscountServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.commerce.discount.model.CommerceDiscountSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.commerce.discount.model.CommerceDiscount}, that is translated to a
 * {@link com.liferay.commerce.discount.model.CommerceDiscountSoap}. Methods that SOAP cannot
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
 * @author Marco Leo
 * @see CommerceDiscountServiceHttp
 * @see com.liferay.commerce.discount.model.CommerceDiscountSoap
 * @see CommerceDiscountServiceUtil
 * @generated
 */
@ProviderType
public class CommerceDiscountServiceSoap {
	public static com.liferay.commerce.discount.model.CommerceDiscountSoap addCommerceDiscount(
		java.lang.String title, java.lang.String target, java.lang.String type,
		java.lang.String typeSettings, boolean useCouponCode,
		java.lang.String couponCode, java.lang.String limitationType,
		int limitationTimes, int numberOfUse, boolean cumulative,
		boolean usePercentage, java.math.BigDecimal level1,
		java.math.BigDecimal level2, java.math.BigDecimal level3,
		java.math.BigDecimal maximumDiscountAmount, boolean active,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.commerce.discount.model.CommerceDiscount returnValue = CommerceDiscountServiceUtil.addCommerceDiscount(title,
					target, type, typeSettings, useCouponCode, couponCode,
					limitationType, limitationTimes, numberOfUse, cumulative,
					usePercentage, level1, level2, level3,
					maximumDiscountAmount, active, displayDateMonth,
					displayDateDay, displayDateYear, displayDateHour,
					displayDateMinute, expirationDateMonth, expirationDateDay,
					expirationDateYear, expirationDateHour,
					expirationDateMinute, neverExpire, serviceContext);

			return com.liferay.commerce.discount.model.CommerceDiscountSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCommerceDiscount(long commerceDiscountId)
		throws RemoteException {
		try {
			CommerceDiscountServiceUtil.deleteCommerceDiscount(commerceDiscountId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.discount.model.CommerceDiscountSoap updateCommerceDiscount(
		long commerceDiscountId, java.lang.String title,
		java.lang.String target, java.lang.String type,
		java.lang.String typeSettings, boolean useCouponCode,
		java.lang.String couponCode, java.lang.String limitationType,
		int limitationTimes, int numberOfUse, boolean cumulative,
		boolean usePercentage, java.math.BigDecimal level1,
		java.math.BigDecimal level2, java.math.BigDecimal level3,
		java.math.BigDecimal maximumDiscountAmount, boolean active,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, int expirationDateMonth,
		int expirationDateDay, int expirationDateYear, int expirationDateHour,
		int expirationDateMinute, boolean neverExpire,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.commerce.discount.model.CommerceDiscount returnValue = CommerceDiscountServiceUtil.updateCommerceDiscount(commerceDiscountId,
					title, target, type, typeSettings, useCouponCode,
					couponCode, limitationType, limitationTimes, numberOfUse,
					cumulative, usePercentage, level1, level2, level3,
					maximumDiscountAmount, active, displayDateMonth,
					displayDateDay, displayDateYear, displayDateHour,
					displayDateMinute, expirationDateMonth, expirationDateDay,
					expirationDateYear, expirationDateHour,
					expirationDateMinute, neverExpire, serviceContext);

			return com.liferay.commerce.discount.model.CommerceDiscountSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CommerceDiscountServiceSoap.class);
}