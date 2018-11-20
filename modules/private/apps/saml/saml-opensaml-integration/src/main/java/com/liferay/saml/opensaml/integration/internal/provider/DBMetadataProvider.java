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

package com.liferay.saml.opensaml.integration.internal.provider;

import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.saml.opensaml.integration.internal.util.SamlUtil;
import com.liferay.saml.persistence.exception.NoSuchIdpSpConnectionException;
import com.liferay.saml.persistence.exception.NoSuchSpIdpConnectionException;
import com.liferay.saml.persistence.model.SamlIdpSpConnection;
import com.liferay.saml.persistence.model.SamlSpIdpConnection;
import com.liferay.saml.persistence.service.SamlIdpSpConnectionLocalService;
import com.liferay.saml.persistence.service.SamlSpIdpConnectionLocalService;
import com.liferay.saml.runtime.configuration.SamlProviderConfigurationHelper;

import java.io.StringReader;

import java.util.Collections;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.shibboleth.utilities.java.support.resolver.CriteriaSet;
import net.shibboleth.utilities.java.support.resolver.ResolverException;
import net.shibboleth.utilities.java.support.xml.ParserPool;

import org.opensaml.core.criterion.EntityIdCriterion;
import org.opensaml.core.xml.XMLObject;
import org.opensaml.core.xml.util.XMLObjectSupport;
import org.opensaml.saml.metadata.resolver.MetadataResolver;
import org.opensaml.saml.metadata.resolver.filter.MetadataFilter;
import org.opensaml.saml.metadata.resolver.impl.AbstractMetadataResolver;
import org.opensaml.saml.metadata.resolver.impl.DOMMetadataResolver;
import org.opensaml.saml.saml2.metadata.EntityDescriptor;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Mika Koivisto
 */
@Component(immediate = true, service = MetadataProvider.class)
public class DBMetadataProvider extends BaseMetadataProvider {

	@Override
	public EntityDescriptor getEntityDescriptor(String entityId)
		throws MetadataProviderException {

		try {
			String metadataXml = getMetadataXml(entityId);

			if (Validator.isNull(metadataXml)) {
				return null;
			}

			XMLObject metadataXmlObject = XMLObjectHelper.unmarshallFromReader(
				_parserPool, new StringReader(metadataXml));

			EntityDescriptor entityDescriptor =
				SamlUtil.getEntityDescriptorById(entityId, metadataXmlObject);

			return entityDescriptor;
		}
		catch (Exception e) {
			throw new MetadataProviderException(e);
		}
	}

	@Override
	public XMLObject getMetadata() {
		return new DBEntitiesDescriptor();
	}

	@Override
	public List<RoleDescriptor> getRole(String entityId, QName qName)
		throws MetadataProviderException {

		EntityDescriptor entityDescriptor = getEntityDescriptor(entityId);

		if (entityDescriptor != null) {
			return entityDescriptor.getRoleDescriptors(qName);
		}

		return null;
	}

	@Override
	public RoleDescriptor getRole(
			String entityId, QName qName, String supportedProtocol)
		throws MetadataProviderException {

		List<RoleDescriptor> roleDescriptors = getRole(entityId, qName);

		if ((roleDescriptors == null) || roleDescriptors.isEmpty()) {
			return null;
		}

		for (RoleDescriptor roleDescriptor : roleDescriptors) {
			if (roleDescriptor.isSupportedProtocol(supportedProtocol)) {
				return roleDescriptor;
			}
		}

		return null;
	}

	public void setParserPool(ParserPool parserPool) {
		_parserPool = parserPool;
	}

	protected String getMetadataXml(String entityId) throws Exception {
		long companyId = CompanyThreadLocal.getCompanyId();

		if (_samlProviderConfigurationHelper.isRoleIdp()) {
			try {
				SamlIdpSpConnection samlIdpSpConnection =
					_samlIdpSpConnectionLocalService.getSamlIdpSpConnection(
						companyId, entityId);

				if (!samlIdpSpConnection.isEnabled()) {
					return null;
				}

				return samlIdpSpConnection.getMetadataXml();
			}
			catch (NoSuchIdpSpConnectionException nsisce) {
				return null;
			}
		}
		else if (_samlProviderConfigurationHelper.isRoleSp()) {
			try {
				SamlSpIdpConnection samlSpIdpConnection =
					_samlSpIdpConnectionLocalService.getSamlSpIdpConnection(
						companyId, entityId);

				if (!samlSpIdpConnection.isEnabled()) {
					return null;
				}

				return samlSpIdpConnection.getMetadataXml();
			}
			catch (NoSuchSpIdpConnectionException nssice) {
				return null;
			}
		}

		return null;
	}

	@Reference
	private ParserPool _parserPool;

	@Reference
	private SamlIdpSpConnectionLocalService _samlIdpSpConnectionLocalService;

	@Reference
	private SamlProviderConfigurationHelper _samlProviderConfigurationHelper;

	@Reference
	private SamlSpIdpConnectionLocalService _samlSpIdpConnectionLocalService;

}