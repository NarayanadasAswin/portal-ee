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

package com.liferay.commerce.item.selector.web.internal.search;

import com.liferay.commerce.model.CommercePriceList;
import com.liferay.portal.kernel.dao.search.EmptyOnClickRowChecker;
import com.liferay.portal.kernel.util.ArrayUtil;

import javax.portlet.RenderResponse;

/**
 * @author Alessio Antonio Rendina
 */
public class CommercePriceListItemSelectorChecker
	extends EmptyOnClickRowChecker {

	public CommercePriceListItemSelectorChecker(
		RenderResponse renderResponse, long[] checkedCommercePriceListIds) {

		super(renderResponse);

		_checkedCommercePriceListIds = checkedCommercePriceListIds;
	}

	@Override
	public boolean isChecked(Object obj) {
		CommercePriceList commercePriceList = (CommercePriceList)obj;

		return ArrayUtil.contains(
			_checkedCommercePriceListIds,
			commercePriceList.getCommercePriceListId());
	}

	@Override
	public boolean isDisabled(Object obj) {
		return isChecked(obj);
	}

	private final long[] _checkedCommercePriceListIds;

}