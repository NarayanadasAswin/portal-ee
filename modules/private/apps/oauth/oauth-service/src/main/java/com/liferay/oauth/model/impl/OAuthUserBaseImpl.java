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

package com.liferay.oauth.model.impl;

import com.liferay.oauth.model.OAuthUser;
import com.liferay.oauth.service.OAuthUserLocalServiceUtil;

/**
 * The extended model base implementation for the OAuthUser service. Represents a row in the &quot;OAuth_OAuthUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OAuthUserImpl}.
 * </p>
 *
 * @author Ivica Cardic
 * @see OAuthUserImpl
 * @see OAuthUser
 * @generated
 */
public abstract class OAuthUserBaseImpl
	extends OAuthUserModelImpl implements OAuthUser {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o auth user model instance should use the <code>OAuthUser</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OAuthUserLocalServiceUtil.addOAuthUser(this);
		}
		else {
			OAuthUserLocalServiceUtil.updateOAuthUser(this);
		}
	}

}