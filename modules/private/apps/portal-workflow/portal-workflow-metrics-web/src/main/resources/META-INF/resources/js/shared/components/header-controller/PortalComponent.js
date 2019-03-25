import React from 'react';
import ReactDOM from 'react-dom';

export default class PortalComponent extends React.Component {
	componentWillMount() {
		const { container, replace } = this.props;

		if (container && replace) {
			container.innerHTML = '';
		}
	}

	render() {
		const { children, container } = this.props;

		if (!container) {
			return null;
		}

		return ReactDOM.createPortal(children, container);
	}
}