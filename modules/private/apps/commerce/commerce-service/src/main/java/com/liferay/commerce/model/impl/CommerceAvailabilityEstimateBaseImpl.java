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

package com.liferay.commerce.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.model.CommerceAvailabilityEstimate;
import com.liferay.commerce.service.CommerceAvailabilityEstimateLocalServiceUtil;

/**
 * The extended model base implementation for the CommerceAvailabilityEstimate service. Represents a row in the &quot;CommerceAvailabilityEstimate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CommerceAvailabilityEstimateImpl}.
 * </p>
 *
 * @author Alessio Antonio Rendina
 * @see CommerceAvailabilityEstimateImpl
 * @see CommerceAvailabilityEstimate
 * @generated
 */
@ProviderType
public abstract class CommerceAvailabilityEstimateBaseImpl
	extends CommerceAvailabilityEstimateModelImpl
	implements CommerceAvailabilityEstimate {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a commerce availability estimate model instance should use the {@link CommerceAvailabilityEstimate} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CommerceAvailabilityEstimateLocalServiceUtil.addCommerceAvailabilityEstimate(this);
		}
		else {
			CommerceAvailabilityEstimateLocalServiceUtil.updateCommerceAvailabilityEstimate(this);
		}
	}
}