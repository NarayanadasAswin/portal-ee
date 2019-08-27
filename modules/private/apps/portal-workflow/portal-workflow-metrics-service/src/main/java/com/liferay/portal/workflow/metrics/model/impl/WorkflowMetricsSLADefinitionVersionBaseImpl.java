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

package com.liferay.portal.workflow.metrics.model.impl;

import com.liferay.portal.workflow.metrics.model.WorkflowMetricsSLADefinitionVersion;
import com.liferay.portal.workflow.metrics.service.WorkflowMetricsSLADefinitionVersionLocalServiceUtil;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model base implementation for the WorkflowMetricsSLADefinitionVersion service. Represents a row in the &quot;WMSLADefinitionVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkflowMetricsSLADefinitionVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WorkflowMetricsSLADefinitionVersionImpl
 * @see WorkflowMetricsSLADefinitionVersion
 * @generated
 */
@ProviderType
public abstract class WorkflowMetricsSLADefinitionVersionBaseImpl
	extends WorkflowMetricsSLADefinitionVersionModelImpl
	implements WorkflowMetricsSLADefinitionVersion {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a workflow metrics sla definition version model instance should use the <code>WorkflowMetricsSLADefinitionVersion</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			WorkflowMetricsSLADefinitionVersionLocalServiceUtil.
				addWorkflowMetricsSLADefinitionVersion(this);
		}
		else {
			WorkflowMetricsSLADefinitionVersionLocalServiceUtil.
				updateWorkflowMetricsSLADefinitionVersion(this);
		}
	}

}