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

package com.liferay.commerce.user.segment.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.user.segment.service.CommerceUserSegmentEntryServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * {@link CommerceUserSegmentEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceUserSegmentEntryServiceSoap
 * @see HttpPrincipal
 * @see CommerceUserSegmentEntryServiceUtil
 * @generated
 */
@ProviderType
public class CommerceUserSegmentEntryServiceHttp {
	public static com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry addCommerceUserSegmentEntry(
		HttpPrincipal httpPrincipal,
		java.util.Map<java.util.Locale, String> nameMap, String key,
		boolean active, boolean system, double priority,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"addCommerceUserSegmentEntry",
					_addCommerceUserSegmentEntryParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, nameMap,
					key, active, system, priority, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry deleteCommerceUserSegmentEntry(
		HttpPrincipal httpPrincipal, long commerceUserSegmentEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"deleteCommerceUserSegmentEntry",
					_deleteCommerceUserSegmentEntryParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					commerceUserSegmentEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry> getCommerceUserSegmentEntries(
		HttpPrincipal httpPrincipal, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"getCommerceUserSegmentEntries",
					_getCommerceUserSegmentEntriesParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
					start, end, orderByComparator);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getCommerceUserSegmentEntriesCount(
		HttpPrincipal httpPrincipal, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"getCommerceUserSegmentEntriesCount",
					_getCommerceUserSegmentEntriesCountParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry getCommerceUserSegmentEntry(
		HttpPrincipal httpPrincipal, long commerceUserSegmentEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"getCommerceUserSegmentEntry",
					_getCommerceUserSegmentEntryParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					commerceUserSegmentEntryId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry> searchCommerceUserSegmentEntries(
		HttpPrincipal httpPrincipal, long companyId, long groupId,
		String keywords, int start, int end,
		com.liferay.portal.kernel.search.Sort sort)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"searchCommerceUserSegmentEntries",
					_searchCommerceUserSegmentEntriesParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					companyId, groupId, keywords, start, end, sort);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry> searchCommerceUserSegmentEntries(
		HttpPrincipal httpPrincipal,
		com.liferay.portal.kernel.search.SearchContext searchContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"searchCommerceUserSegmentEntries",
					_searchCommerceUserSegmentEntriesParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					searchContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.search.BaseModelSearchResult<com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry updateCommerceUserSegmentEntry(
		HttpPrincipal httpPrincipal, long commerceUserSegmentEntryId,
		java.util.Map<java.util.Locale, String> nameMap, String key,
		boolean active, double priority,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(CommerceUserSegmentEntryServiceUtil.class,
					"updateCommerceUserSegmentEntry",
					_updateCommerceUserSegmentEntryParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey,
					commerceUserSegmentEntryId, nameMap, key, active, priority,
					serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.commerce.user.segment.model.CommerceUserSegmentEntry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CommerceUserSegmentEntryServiceHttp.class);
	private static final Class<?>[] _addCommerceUserSegmentEntryParameterTypes0 = new Class[] {
			java.util.Map.class, String.class, boolean.class, boolean.class,
			double.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
	private static final Class<?>[] _deleteCommerceUserSegmentEntryParameterTypes1 =
		new Class[] { long.class };
	private static final Class<?>[] _getCommerceUserSegmentEntriesParameterTypes2 =
		new Class[] {
			long.class, int.class, int.class,
			com.liferay.portal.kernel.util.OrderByComparator.class
		};
	private static final Class<?>[] _getCommerceUserSegmentEntriesCountParameterTypes3 =
		new Class[] { long.class };
	private static final Class<?>[] _getCommerceUserSegmentEntryParameterTypes4 = new Class[] {
			long.class
		};
	private static final Class<?>[] _searchCommerceUserSegmentEntriesParameterTypes5 =
		new Class[] {
			long.class, long.class, String.class, int.class, int.class,
			com.liferay.portal.kernel.search.Sort.class
		};
	private static final Class<?>[] _searchCommerceUserSegmentEntriesParameterTypes6 =
		new Class[] { com.liferay.portal.kernel.search.SearchContext.class };
	private static final Class<?>[] _updateCommerceUserSegmentEntryParameterTypes7 =
		new Class[] {
			long.class, java.util.Map.class, String.class, boolean.class,
			double.class, com.liferay.portal.kernel.service.ServiceContext.class
		};
}