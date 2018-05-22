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
CommerceCloudClientConfigurationDisplayContext commerceCloudClientConfigurationDisplayContext = (CommerceCloudClientConfigurationDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

CommerceCloudClientConfiguration commerceCloudClientConfiguration = commerceCloudClientConfigurationDisplayContext.getCommerceCloudClientConfiguration();
JSONObject projectConfigurationJSONObject = commerceCloudClientConfigurationDisplayContext.getProjectConfiguration();
String redirect = portletDisplay.getURLBack();

String callbackHost = projectConfigurationJSONObject.getString("callbackHost");

boolean pushSynchronizationEnabled = false;

if (Validator.isNotNull(callbackHost)) {
	pushSynchronizationEnabled = true;
}
else {
	callbackHost = commerceCloudClientConfigurationDisplayContext.getDefaultCallbackHost();
}
%>

<aui:input name="<%= Constants.CMD %>" type="hidden" value="synchronization" />

<aui:fieldset-group markupView="lexicon">
	<aui:fieldset>
		<c:choose>
			<c:when test='<%= projectConfigurationJSONObject.has("exception") %>'>
				<div class="alert alert-danger">
					<liferay-ui:message key="commerce-cloud-is-temporarily-unavailable-or-not-configured-properly" />
				</div>
			</c:when>
			<c:otherwise>
				<aui:input checked="<%= pushSynchronizationEnabled %>" id="pushSynchronizationEnabled" label="get-new-data-as-soon-as-it-is-available" name="pushSynchronizationEnabled" type="radio" value="true" />

				<div class="<%= pushSynchronizationEnabled ? StringPool.BLANK : "hide" %>" id="<portlet:namespace />pushSynchronizationOptions">
					<aui:input name="callbackHost" value="<%= callbackHost %>" />
				</div>

				<aui:input checked="<%= !pushSynchronizationEnabled %>" id="pushSynchronizationDisabled" label="get-new-data-periodically" name="pushSynchronizationEnabled" type="radio" value="false" />

				<div class="<%= pushSynchronizationEnabled ? "hide" : StringPool.BLANK %>" id="<portlet:namespace />pullSynchronizationOptions">
					<aui:input label="check-for-new-forecasts-every" name="forecastingEntriesCheckInterval" suffix="minutes" value="<%= commerceCloudClientConfiguration.forecastingEntriesCheckInterval() %>" />
				</div>
			</c:otherwise>
		</c:choose>

		<aui:button-row>
			<aui:button type="submit" />

			<aui:button href="<%= redirect %>" type="cancel" />
		</aui:button-row>
	</aui:fieldset>
</aui:fieldset-group>

<aui:script>
	Liferay.Util.toggleRadio('<portlet:namespace />pushSynchronizationDisabled', '<portlet:namespace />pullSynchronizationOptions', '<portlet:namespace />pushSynchronizationOptions');
	Liferay.Util.toggleRadio('<portlet:namespace />pushSynchronizationEnabled', '<portlet:namespace />pushSynchronizationOptions', '<portlet:namespace />pullSynchronizationOptions');
</aui:script>