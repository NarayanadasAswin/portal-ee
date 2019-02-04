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

package com.liferay.saml.runtime.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Mika Koivisto
 */
@ExtendedObjectClassDefinition(
	category = "foundation", factoryInstanceLabelAttribute = "companyId",
	scope = ExtendedObjectClassDefinition.Scope.COMPANY
)
@Meta.OCD(
	factory = true,
	id = "com.liferay.saml.runtime.configuration.SamlProviderConfiguration",
	localization = "content/Language", name = "saml-provider-configuration-name"
)
public interface SamlProviderConfiguration {

	@Meta.AD(deflt = "0", name = "company-id", required = false)
	public long companyId();

	@Meta.AD(
		deflt = "liferay",
		description = "saml-keystore-credential-password-description",
		id = "saml.keystore.credential.password",
		name = "saml-keystore-credential-password", required = false
	)
	public String keyStoreCredentialPassword();

	@Meta.AD(
		description = "saml-sp-assertion-signature-required-description",
		id = "saml.sp.assertion.signature.required",
		name = "saml-sp-assertion-signature-required", required = false
	)
	public boolean assertionSignatureRequired();

	@Meta.AD(
		deflt = "true",
		description = "saml-idp-authn-request-signature-required-description",
		id = "saml.idp.authn.request.signature.required",
		name = "saml-idp-authn-request-signature-required", required = false
	)
	public boolean authnRequestSignatureRequired();

	@Meta.AD(
		deflt = "3000", description = "saml-sp-clock-skew-description",
		id = "saml.sp.clock.skew", name = "saml-sp-clock-skew", required = false
	)
	public long clockSkew();

	@Meta.AD(
		deflt = "1800", description = "saml-idp-assertion-lifetime-description",
		id = "saml.idp.assertion.lifetime",
		name = "saml-idp-assertion-lifetime", required = false
	)
	public int defaultAssertionLifetime();

	@Meta.AD(id = "saml.enabled", name = "saml-enabled", required = false)
	public boolean enabled();

	@Meta.AD(
		description = "saml-entity-id-description", id = "saml.entity.id",
		name = "saml-entity-id", required = false
	)
	public String entityId();

	@Meta.AD(
		description = "saml-sp-ldap-import-enabled-description",
		id = "saml.sp.ldap.import.enabled",
		name = "saml-sp-ldap-import-enabled", required = false
	)
	public boolean ldapImportEnabled();

	@Meta.AD(
		deflt = "idp", id = "saml.role", name = "saml-role",
		optionLabels = {"saml-role-idp", "saml-role-sp"},
		optionValues = {"idp", "sp"}, required = false
	)
	public String role();

	@Meta.AD(
		description = "saml-idp-session-maximum-age-description",
		id = "saml.idp.session.maximum.age",
		name = "saml-idp-session-maximum-age", required = false
	)
	public long sessionMaximumAge();

	@Meta.AD(
		description = "saml-idp-session-timeout-description",
		id = "saml.idp.session.timeout", name = "saml-idp-session-timeout",
		required = false
	)
	public long sessionTimeout();

	@Meta.AD(
		deflt = "true", description = "saml-sp-sign-authn-request-description",
		id = "saml.sp.sign.authn.request", name = "saml-sp-sign-authn-request",
		required = false
	)
	public boolean signAuthnRequest();

	@Meta.AD(
		deflt = "true", description = "saml-sign-metadata-description",
		id = "saml.sign.metadata", name = "saml-sign-metadata", required = false
	)
	public boolean signMetadata();

	@Meta.AD(
		description = "saml-ssl-required-description", id = "saml.ssl.required",
		name = "saml-ssl-required", required = false
	)
	public boolean sslRequired();

	/**
	 * If no SAML IdP is matched then show the login portlet
	 */
	@Meta.AD(
		deflt = "true",
		description = "saml-sp-allow-showing-the-login-portlet-description",
		id = "saml.sp.allow.showing.the.login.portlet",
		name = "saml-sp-allow-showing-the-login-portlet", required = false
	)
	public boolean allowShowingTheLoginPortlet();

}