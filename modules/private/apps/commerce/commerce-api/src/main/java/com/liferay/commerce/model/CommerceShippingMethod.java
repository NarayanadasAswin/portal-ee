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

package com.liferay.commerce.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the CommerceShippingMethod service. Represents a row in the &quot;CommerceShippingMethod&quot; database table, with each column mapped to a property of this class.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceShippingMethodModel
 * @see com.liferay.commerce.model.impl.CommerceShippingMethodImpl
 * @see com.liferay.commerce.model.impl.CommerceShippingMethodModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.commerce.model.impl.CommerceShippingMethodImpl")
@ProviderType
public interface CommerceShippingMethod extends CommerceShippingMethodModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.commerce.model.impl.CommerceShippingMethodImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CommerceShippingMethod, Long> COMMERCE_SHIPPING_METHOD_ID_ACCESSOR =
		new Accessor<CommerceShippingMethod, Long>() {
			@Override
			public Long get(CommerceShippingMethod commerceShippingMethod) {
				return commerceShippingMethod.getCommerceShippingMethodId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CommerceShippingMethod> getTypeClass() {
				return CommerceShippingMethod.class;
			}
		};

	public String getImageURL(
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay);
}