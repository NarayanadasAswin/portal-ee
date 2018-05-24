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
CommerceDashboardDisplayContext commerceDashboardDisplayContext = (CommerceDashboardDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);
%>

<portlet:actionURL name="editCommerceDashboardDateRange" var="editCommerceDashboardDateRangeURL" />

<aui:form action="<%= editCommerceDashboardDateRangeURL %>" cssClass="form-group-autofit" method="post" name="fm">
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />

	<liferay-ui:input-date
		cssClass="form-group-item"
		dayParam="startDateDay"
		dayValue="<%= commerceDashboardDisplayContext.getStartDateDay() %>"
		firstDayOfWeek="<%= commerceDashboardDisplayContext.getFirstDayOfWeek() - 1 %>"
		monthParam="startDateMonth"
		monthValue="<%= commerceDashboardDisplayContext.getStartDateMonth() %>"
		name="startDate"
		yearParam="startDateYear"
		yearValue="<%= commerceDashboardDisplayContext.getStartDateYear() %>"
	/>

	<liferay-ui:input-date
		cssClass="form-group-item"
		dayParam="endDateDay"
		dayValue="<%= commerceDashboardDisplayContext.getEndDateDay() %>"
		firstDayOfWeek="<%= commerceDashboardDisplayContext.getFirstDayOfWeek() - 1 %>"
		monthParam="endDateMonth"
		monthValue="<%= commerceDashboardDisplayContext.getEndDateMonth() %>"
		name="endDate"
		yearParam="endDateYear"
		yearValue="<%= commerceDashboardDisplayContext.getEndDateYear() %>"
	/>

	<aui:button type="submit" value="refresh" />
</aui:form>