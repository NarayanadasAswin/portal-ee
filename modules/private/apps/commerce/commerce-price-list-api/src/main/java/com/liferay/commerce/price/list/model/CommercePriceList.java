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

package com.liferay.commerce.price.list.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CommercePriceList service. Represents a row in the &quot;CommercePriceList&quot; database table, with each column mapped to a property of this class.
 *
 * @author Alessio Antonio Rendina
 * @see CommercePriceListModel
 * @see com.liferay.commerce.price.list.model.impl.CommercePriceListImpl
 * @see com.liferay.commerce.price.list.model.impl.CommercePriceListModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.commerce.price.list.model.impl.CommercePriceListImpl")
@ProviderType
public interface CommercePriceList extends CommercePriceListModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.commerce.price.list.model.impl.CommercePriceListImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CommercePriceList, Long> COMMERCE_PRICE_LIST_ID_ACCESSOR =
		new Accessor<CommercePriceList, Long>() {
			@Override
			public Long get(CommercePriceList commercePriceList) {
				return commercePriceList.getCommercePriceListId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CommercePriceList> getTypeClass() {
				return CommercePriceList.class;
			}
		};

	public com.liferay.commerce.currency.model.CommerceCurrency getCommerceCurrency()
		throws com.liferay.portal.kernel.exception.PortalException;
}