import PendingItemsCard from './pending-items/PendingItemsCard';
import React from 'react';
import WorkloadByStepCard from './workload-by-step/WorkloadByStepCard';

const CLASSNAME = 'workflow-process-dashboard';

export default class ProcessDashboard extends React.Component {
	constructor(props) {
		super(props);
	}

	render() {
		const { processId, ...props } = this.props;

		return (
			<div className={CLASSNAME}>
				<PendingItemsCard processId={processId} />
				<WorkloadByStepCard processId={processId} {...props} />
			</div>
		);
	}
}