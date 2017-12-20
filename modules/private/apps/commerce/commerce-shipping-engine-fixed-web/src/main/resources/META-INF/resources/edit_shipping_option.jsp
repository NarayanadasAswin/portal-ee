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
long commerceShippingMethodId = ParamUtil.getLong(request, "commerceShippingMethodId");

CommerceShippingFixedOption commerceShippingFixedOption = (CommerceShippingFixedOption)request.getAttribute(CommerceShippingEngineFixedWebKeys.COMMERCE_SHIPPING_FIXED_OPTION);

long commerceShippingFixedOptionId = 0;

if (commerceShippingFixedOption != null) {
	commerceShippingFixedOptionId = commerceShippingFixedOption.getCommerceShippingFixedOptionId();
}
%>

<portlet:actionURL name="editCommerceShippingFixedOption" var="editCommerceShippingFixedOptionActionURL" />

<aui:form action="<%= editCommerceShippingFixedOptionActionURL %>" cssClass="container-fluid-1280" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= (commerceShippingFixedOption == null) ? Constants.ADD : Constants.UPDATE %>" />
	<aui:input name="commerceShippingFixedOptionId" type="hidden" value="<%= commerceShippingFixedOptionId %>" />
	<aui:input name="commerceShippingMethodId" type="hidden" value="<%= commerceShippingMethodId %>" />

	<div class="lfr-form-content">
		<aui:model-context bean="<%= commerceShippingFixedOption %>" model="<%= CommerceShippingFixedOption.class %>" />

		<aui:input name="name" />

		<aui:input name="description" />

		<aui:input name="amount" />

		<aui:input name="priority" />
	</div>

	<aui:button-row>
		<aui:button cssClass="btn-lg" name="saveButton" value="save" />

		<aui:button cssClass="btn-lg" name="cancelButton" type="cancel" />
	</aui:button-row>
</aui:form>

<aui:script use="aui-base,aui-io-request">
	A.one('#<portlet:namespace/>saveButton').on(
		'click',
		function(event) {
			var A = AUI();

			var url = '<%= editCommerceShippingFixedOptionActionURL.toString() %>';

			A.io.request(
				url,
				{
					method: 'POST',
					form: {
						id: '<portlet:namespace/>fm'
					},
					on: {
						success: function() {
							Liferay.Util.getOpener().refreshPortlet();
							Liferay.Util.getOpener().closePopup('editShippingFixedOptionDialog');
						}
					}
				}
			);
		}
	);

	A.one('#<portlet:namespace/>cancelButton').on(
		'click',
		function(event) {
			Liferay.Util.getOpener().closePopup('editShippingFixedOptionDialog');
		}
	);
</aui:script>