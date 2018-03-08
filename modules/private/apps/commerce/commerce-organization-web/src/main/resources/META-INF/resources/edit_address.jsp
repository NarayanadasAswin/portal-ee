<%--
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
--%>

<%@ include file="/init.jsp" %>

<%
CommerceOrganizationAddressesDisplayContext commerceOrganizationAddressesDisplayContext = (CommerceOrganizationAddressesDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

CommerceAddress commerceAddress = commerceOrganizationAddressesDisplayContext.getCommerceAddress();
Organization organization = commerceOrganizationAddressesDisplayContext.getCurrentOrganization();

long commerceAddressId = commerceOrganizationAddressesDisplayContext.getCommerceAddressId();
long commerceCountryId = commerceOrganizationAddressesDisplayContext.getCommerceCountryId();
long commerceRegionId = commerceOrganizationAddressesDisplayContext.getCommerceRegionId();

String languageId = LanguageUtil.getLanguageId(locale);
%>

<portlet:actionURL name="editCommerceAddress" var="editCommerceAddressActionURL" />

<aui:form action="<%= editCommerceAddressActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (commerceAddress == null) ? Constants.ADD : Constants.UPDATE %>" />
	<aui:input name="commerceAddressId" type="hidden" value="<%= commerceAddressId %>" />
	<aui:input name="organizationId" type="hidden" value="<%= (commerceAddress == null) ? organization.getOrganizationId() : commerceAddress.getClassPK() %>" />

	<aui:model-context bean="<%= commerceAddress %>" model="<%= CommerceAddress.class %>" />

	<div class="lfr-form-content row">
		<liferay-ui:error exception="<%= CommerceAddressCityException.class %>" message="please-enter-a-valid-city" />
		<liferay-ui:error exception="<%= CommerceAddressCountryException.class %>" message="please-select-a-country" />
		<liferay-ui:error exception="<%= CommerceAddressStreetException.class %>" message="please-enter-a-valid-street" />

		<div class="col-sm-6">
			<aui:input name="name" />

			<aui:input name="description" />

			<aui:input name="street1" />

			<aui:input name="street2" />

			<aui:input name="street3" />
		</div>

		<div class="col-sm-6">
			<aui:input name="city" />

			<aui:input label="postal-code" name="zip" />

			<aui:select label="country" name="commerceCountryId" showEmptyOption="<%= true %>">

				<%
				List<CommerceCountry> commerceCountries = commerceOrganizationAddressesDisplayContext.getCommerceCountries();

				for (CommerceCountry commerceCountry : commerceCountries) {
				%>

					<aui:option
						label="<%= commerceCountry.getName(languageId) %>"
						selected="<%= (commerceAddress != null) && (commerceAddress.getCommerceCountryId() == commerceCountry.getCommerceCountryId()) %>"
						value="<%= commerceCountry.getCommerceCountryId() %>"
					/>

				<%
				}
				%>

			</aui:select>

			<aui:select label="region" name="commerceRegionId" showEmptyOption="<%= true %>">

				<%
				List<CommerceRegion> commerceRegions = commerceOrganizationAddressesDisplayContext.getCommerceRegions();

				for (CommerceRegion commerceRegion : commerceRegions) {
				%>

					<aui:option
						label="<%= commerceRegion.getName() %>"
						selected="<%= (commerceAddress != null) && (commerceAddress.getCommerceRegionId() == commerceRegion.getCommerceRegionId()) %>"
						value="<%= commerceRegion.getCommerceRegionId() %>"
					/>

				<%
				}
				%>

			</aui:select>

			<aui:input name="phoneNumber" />

			<aui:input name="defaultBilling" />

			<aui:input name="defaultShipping" />
		</div>
	</div>

	<aui:button-row>
		<aui:button cssClass="btn-lg" name="saveButton" value="save" />

		<aui:button cssClass="btn-lg" name="cancelButton" type="cancel" />
	</aui:button-row>
</aui:form>

<aui:script use="aui-base,liferay-dynamic-select">
	new Liferay.DynamicSelect(
		[
			{
				select: '<portlet:namespace />commerceCountryId',
				selectData: function(callback) {
					Liferay.Service(
						'/commerce.commercecountry/get-commerce-countries',
						{
							groupId: <%= scopeGroupId %>,
							active: true
						},
						callback
					);
				},
				selectDesc: 'nameCurrentValue',
				selectId: 'commerceCountryId',
				selectSort: '<%= true %>',
				selectVal: '<%= commerceCountryId %>'
			},
			{
				select: '<portlet:namespace />commerceRegionId',
				selectData: function(callback, selectKey) {
					Liferay.Service(
						'/commerce.commerceregion/get-commerce-regions',
						{
							commerceCountryId: Number(selectKey),
							active: true
						},
						callback
					);
				},
				selectDesc: 'name',
				selectId: 'commerceRegionId',
				selectVal: '<%= commerceRegionId %>'
			}
		]
	);
</aui:script>

<aui:script use="aui-base,aui-io-request">
	A.one('#<portlet:namespace/>saveButton').on(
		'click',
		function(event) {
			var A = AUI();

			var url = '<%= editCommerceAddressActionURL.toString() %>';

			A.io.request(
				url,
				{
					form: {
						id: '<portlet:namespace/>fm'
					},
					method: 'POST',
					on: {
						success: function() {
							Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>');

							Liferay.Util.getOpener().closePopup('editCommerceAddressDialog');
						}
					}
				}
			);
		}
	);

	A.one('#<portlet:namespace/>cancelButton').on(
		'click',
		function(event) {
			Liferay.Util.getOpener().closePopup('editCommerceAddressDialog');
		}
	);
</aui:script>