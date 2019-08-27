import {
	formatDate,
	formatQueryDate,
	parseDate,
	parseDateMoment
} from '../../util/timeRangeUtil';
import {
	parse,
	stringify
} from '../../../../shared/components/router/queryString';
import {useContext, useState} from 'react';
import moment from '../../../../shared/util/moment';
import {pushToHistory} from '../../../../shared/components/filter/util/filterUtil';
import {TimeRangeContext} from './TimeRangeStore';
import {useRouter} from '../../../../shared/components/router/useRouter';

const useCustomTimeRange = filterKey => {
	const [errors, setErrors] = useState(undefined);
	const {getSelectedTimeRange, setTimeRanges, timeRanges} = useContext(
		TimeRangeContext
	);
	const routerProps = useRouter();

	const selectedTimeRange = getSelectedTimeRange() || {};

	const [dateEnd, setDateEnd] = useState(
		formatDate(selectedTimeRange.dateEnd)
	);
	const [dateStart, setDateStart] = useState(
		formatDate(selectedTimeRange.dateStart)
	);

	const applyCustomFilter = () => {
		if (!errors) {
			setTimeRanges([
				{
					...timeRanges[0],
					active: true,
					dateEnd: parseDate(dateEnd, true),
					dateStart: parseDate(dateStart)
				},
				...timeRanges.slice(1, timeRanges.length).map(item => ({
					...item,
					active: false
				}))
			]);

			updateQueryString();
		}
	};

	const updateQueryString = () => {
		const query = parse(routerProps.location.search);

		query.filters = {
			...query.filters,
			[filterKey]: 'custom',
			dateEnd: formatQueryDate(dateEnd, true),
			dateStart: formatQueryDate(dateStart)
		};

		pushToHistory(stringify(query), routerProps);
	};

	const validate = () => {
		const dateEndMoment = parseDateMoment(dateEnd);
		const dateStartMoment = parseDateMoment(dateStart);

		let errors = checkValidDate(dateEndMoment, dateStartMoment);

		if (!errors) {
			errors = checkRangeConsistency(dateEndMoment, dateStartMoment);
		}

		if (!errors) {
			errors = checkEarlierDate(dateEndMoment, dateStartMoment);
		}

		setErrors(errors);

		return errors;
	};

	return {
		applyCustomFilter,
		dateEnd,
		dateStart,
		errors,
		setDateEnd,
		setDateStart,
		validate
	};
};

const checkEarlierDate = (dateEndMoment, dateStartMoment) => {
	const earlierDate = moment()
		.date(1)
		.month(1)
		.year(1970);
	let errors;

	if (dateEndMoment.isBefore(earlierDate)) {
		errors = updateErrors(
			errors,
			'dateEnd',
			Liferay.Language.get('the-date-cannot-be-earlier-than-1970')
		);
	}

	if (dateStartMoment.isBefore(earlierDate)) {
		errors = updateErrors(
			errors,
			'dateStart',
			Liferay.Language.get('the-date-cannot-be-earlier-than-1970')
		);
	}

	return errors;
};

const checkRangeConsistency = (dateEndMoment, dateStartMoment) => {
	let errors;

	if (dateEndMoment.isBefore(dateStartMoment)) {
		errors = updateErrors(
			errors,
			'dateEnd',
			Liferay.Language.get(
				'the-end-date-cannot-be-earlier-than-the-start-date'
			)
		);
	}

	if (dateStartMoment.isAfter(dateEndMoment)) {
		errors = updateErrors(
			errors,
			'dateStart',
			Liferay.Language.get(
				'the-start-date-cannot-be-later-than-the-end-date'
			)
		);
	}

	return errors;
};

const checkValidDate = (dateEndMoment, dateStartMoment) => {
	const dateNow = new Date();
	let errors;

	if (!dateEndMoment.isValid() || dateEndMoment.isAfter(dateNow)) {
		errors = updateErrors(
			errors,
			'dateEnd',
			Liferay.Language.get('please-enter-a-valid-date')
		);
	}

	if (!dateStartMoment.isValid() || dateStartMoment.isAfter(dateNow)) {
		errors = updateErrors(
			errors,
			'dateStart',
			Liferay.Language.get('please-enter-a-valid-date')
		);
	}

	return errors;
};

const updateErrors = (errors, fieldName, message) => ({
	...(errors || {}),
	[fieldName]: message
});

export {useCustomTimeRange};
