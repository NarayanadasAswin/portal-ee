import React, {createContext, useState, useContext} from 'react';
import ReloadButton from '../list/ReloadButton';

function useError() {
	const [error, setError] = useState(null);

	return {
		error,
		setError
	};
}

const ErrorContext = createContext(null);

function Error({children}) {
	const {error} = useContext(ErrorContext);

	return (
		error &&
		(children || (
			<div className="pb-6 pt-5 text-center">
				<p className="small">
					{Liferay.Language.get(
						'there-was-a-problem-retrieving-data-please-try-reloading-the-page'
					)}
				</p>
				<ReloadButton />
			</div>
		))
	);
}

export {Error, ErrorContext, useError};
