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

package com.liferay.commerce.price.list.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.price.list.model.CommercePriceEntry;
import com.liferay.commerce.price.list.service.CommercePriceEntryLocalServiceUtil;

/**
 * The extended model base implementation for the CommercePriceEntry service. Represents a row in the &quot;CommercePriceEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommercePriceEntryImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommercePriceEntryImpl
 * @see CommercePriceEntry
 * @generated
 */
@ProviderType
public abstract class CommercePriceEntryBaseImpl
	extends CommercePriceEntryModelImpl implements CommercePriceEntry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce price entry model instance should use the {@link CommercePriceEntry} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CommercePriceEntryLocalServiceUtil.addCommercePriceEntry(this);
		}
		else {
			CommercePriceEntryLocalServiceUtil.updateCommercePriceEntry(this);
		}
	}
}