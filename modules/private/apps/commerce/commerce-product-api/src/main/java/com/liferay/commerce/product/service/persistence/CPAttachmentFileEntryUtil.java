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

package com.liferay.commerce.product.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.product.model.CPAttachmentFileEntry;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the cp attachment file entry service. This utility wraps {@link com.liferay.commerce.product.service.persistence.impl.CPAttachmentFileEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Marco Leo
 * @see CPAttachmentFileEntryPersistence
 * @see com.liferay.commerce.product.service.persistence.impl.CPAttachmentFileEntryPersistenceImpl
 * @generated
 */
@ProviderType
public class CPAttachmentFileEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CPAttachmentFileEntry cpAttachmentFileEntry) {
		getPersistence().clearCache(cpAttachmentFileEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CPAttachmentFileEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CPAttachmentFileEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CPAttachmentFileEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CPAttachmentFileEntry update(
		CPAttachmentFileEntry cpAttachmentFileEntry) {
		return getPersistence().update(cpAttachmentFileEntry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CPAttachmentFileEntry update(
		CPAttachmentFileEntry cpAttachmentFileEntry,
		ServiceContext serviceContext) {
		return getPersistence().update(cpAttachmentFileEntry, serviceContext);
	}

	/**
	* Returns all the cp attachment file entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the cp attachment file entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @return the range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid(
		java.lang.String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid(
		java.lang.String uuid, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid(
		java.lang.String uuid, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByUuid_First(
		java.lang.String uuid,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUuid_First(
		java.lang.String uuid,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByUuid_Last(java.lang.String uuid,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUuid_Last(
		java.lang.String uuid,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the cp attachment file entries before and after the current cp attachment file entry in the ordered set where uuid = &#63;.
	*
	* @param CPAttachmentFileEntryId the primary key of the current cp attachment file entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry[] findByUuid_PrevAndNext(
		long CPAttachmentFileEntryId, java.lang.String uuid,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByUuid_PrevAndNext(CPAttachmentFileEntryId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the cp attachment file entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of cp attachment file entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching cp attachment file entries
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the cp attachment file entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchCPAttachmentFileEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the cp attachment file entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUUID_G(java.lang.String uuid,
		long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the cp attachment file entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the cp attachment file entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the cp attachment file entry that was removed
	*/
	public static CPAttachmentFileEntry removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of cp attachment file entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching cp attachment file entries
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the cp attachment file entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid_C(
		java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the cp attachment file entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @return the range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByUuid_C_First(
		java.lang.String uuid, long companyId,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the cp attachment file entries before and after the current cp attachment file entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param CPAttachmentFileEntryId the primary key of the current cp attachment file entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry[] findByUuid_C_PrevAndNext(
		long CPAttachmentFileEntryId, java.lang.String uuid, long companyId,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(CPAttachmentFileEntryId, uuid,
			companyId, orderByComparator);
	}

	/**
	* Removes all the cp attachment file entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of cp attachment file entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching cp attachment file entries
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the cp attachment file entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @return the matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByC_C(long classNameId,
		long classPK) {
		return getPersistence().findByC_C(classNameId, classPK);
	}

	/**
	* Returns a range of all the cp attachment file entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @return the range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByC_C(long classNameId,
		long classPK, int start, int end) {
		return getPersistence().findByC_C(classNameId, classPK, start, end);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByC_C(long classNameId,
		long classPK, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .findByC_C(classNameId, classPK, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findByC_C(long classNameId,
		long classPK, int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_C(classNameId, classPK, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByC_C_First(long classNameId,
		long classPK, OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByC_C_First(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the first cp attachment file entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByC_C_First(long classNameId,
		long classPK, OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .fetchByC_C_First(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry findByC_C_Last(long classNameId,
		long classPK, OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByC_C_Last(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the last cp attachment file entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cp attachment file entry, or <code>null</code> if a matching cp attachment file entry could not be found
	*/
	public static CPAttachmentFileEntry fetchByC_C_Last(long classNameId,
		long classPK, OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence()
				   .fetchByC_C_Last(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the cp attachment file entries before and after the current cp attachment file entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param CPAttachmentFileEntryId the primary key of the current cp attachment file entry
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry[] findByC_C_PrevAndNext(
		long CPAttachmentFileEntryId, long classNameId, long classPK,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence()
				   .findByC_C_PrevAndNext(CPAttachmentFileEntryId, classNameId,
			classPK, orderByComparator);
	}

	/**
	* Removes all the cp attachment file entries where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	*/
	public static void removeByC_C(long classNameId, long classPK) {
		getPersistence().removeByC_C(classNameId, classPK);
	}

	/**
	* Returns the number of cp attachment file entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class pk
	* @return the number of matching cp attachment file entries
	*/
	public static int countByC_C(long classNameId, long classPK) {
		return getPersistence().countByC_C(classNameId, classPK);
	}

	/**
	* Caches the cp attachment file entry in the entity cache if it is enabled.
	*
	* @param cpAttachmentFileEntry the cp attachment file entry
	*/
	public static void cacheResult(CPAttachmentFileEntry cpAttachmentFileEntry) {
		getPersistence().cacheResult(cpAttachmentFileEntry);
	}

	/**
	* Caches the cp attachment file entries in the entity cache if it is enabled.
	*
	* @param cpAttachmentFileEntries the cp attachment file entries
	*/
	public static void cacheResult(
		List<CPAttachmentFileEntry> cpAttachmentFileEntries) {
		getPersistence().cacheResult(cpAttachmentFileEntries);
	}

	/**
	* Creates a new cp attachment file entry with the primary key. Does not add the cp attachment file entry to the database.
	*
	* @param CPAttachmentFileEntryId the primary key for the new cp attachment file entry
	* @return the new cp attachment file entry
	*/
	public static CPAttachmentFileEntry create(long CPAttachmentFileEntryId) {
		return getPersistence().create(CPAttachmentFileEntryId);
	}

	/**
	* Removes the cp attachment file entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CPAttachmentFileEntryId the primary key of the cp attachment file entry
	* @return the cp attachment file entry that was removed
	* @throws NoSuchCPAttachmentFileEntryException if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry remove(long CPAttachmentFileEntryId)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().remove(CPAttachmentFileEntryId);
	}

	public static CPAttachmentFileEntry updateImpl(
		CPAttachmentFileEntry cpAttachmentFileEntry) {
		return getPersistence().updateImpl(cpAttachmentFileEntry);
	}

	/**
	* Returns the cp attachment file entry with the primary key or throws a {@link NoSuchCPAttachmentFileEntryException} if it could not be found.
	*
	* @param CPAttachmentFileEntryId the primary key of the cp attachment file entry
	* @return the cp attachment file entry
	* @throws NoSuchCPAttachmentFileEntryException if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry findByPrimaryKey(
		long CPAttachmentFileEntryId)
		throws com.liferay.commerce.product.exception.NoSuchCPAttachmentFileEntryException {
		return getPersistence().findByPrimaryKey(CPAttachmentFileEntryId);
	}

	/**
	* Returns the cp attachment file entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CPAttachmentFileEntryId the primary key of the cp attachment file entry
	* @return the cp attachment file entry, or <code>null</code> if a cp attachment file entry with the primary key could not be found
	*/
	public static CPAttachmentFileEntry fetchByPrimaryKey(
		long CPAttachmentFileEntryId) {
		return getPersistence().fetchByPrimaryKey(CPAttachmentFileEntryId);
	}

	public static java.util.Map<java.io.Serializable, CPAttachmentFileEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the cp attachment file entries.
	*
	* @return the cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the cp attachment file entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @return the range of cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findAll(int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the cp attachment file entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CPAttachmentFileEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cp attachment file entries
	* @param end the upper bound of the range of cp attachment file entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cp attachment file entries
	*/
	public static List<CPAttachmentFileEntry> findAll(int start, int end,
		OrderByComparator<CPAttachmentFileEntry> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the cp attachment file entries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of cp attachment file entries.
	*
	* @return the number of cp attachment file entries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CPAttachmentFileEntryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CPAttachmentFileEntryPersistence, CPAttachmentFileEntryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CPAttachmentFileEntryPersistence.class);
}