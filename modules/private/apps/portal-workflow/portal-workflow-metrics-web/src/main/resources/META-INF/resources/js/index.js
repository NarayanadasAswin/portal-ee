import AppComponent from './components/App';
import React from 'react';
import ReactDOM from 'react-dom';

export default function(elementId, namespace, defaultDelta, deltas, maxPages) {
	const container = document.getElementById(elementId);

	ReactDOM.render(
		<AppComponent
			companyId={Liferay.ThemeDisplay.getCompanyId()}
			defaultDelta={defaultDelta}
			deltas={deltas}
			maxPages={maxPages}
			namespace={namespace}
		/>,
		container
	);

	Liferay.once('destroyPortlet', () => {
		ReactDOM.unmountComponentAtNode(container);
	});
}