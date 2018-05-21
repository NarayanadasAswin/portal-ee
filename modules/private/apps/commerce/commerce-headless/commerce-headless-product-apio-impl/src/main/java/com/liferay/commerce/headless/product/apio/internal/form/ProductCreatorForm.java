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

package com.liferay.commerce.headless.product.apio.internal.form;

import com.liferay.apio.architect.form.Form;
import com.liferay.apio.architect.form.Form.Builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Instances of this class represent the values extracted from a product form.
 *
 * @author Zoltán Takács
 * @review
 */
public class ProductCreatorForm {

	/**
	 * Builds a {@code Form} that generates {@code ProductCreatorForm} depending
	 * on the HTTP body.
	 *
	 * @param  formBuilder the {@code Form} builder
	 * @return a product creator form
	 * @review
	 */
	public static Form<ProductCreatorForm> buildForm(
		Builder<ProductCreatorForm> formBuilder) {

		return formBuilder.title(
			__ -> "The product creator form"
		).description(
			__ -> "This form can be used to create a product"
		).constructor(
			ProductCreatorForm::new
		).addOptionalLongList(
			"assetCategoryIds", ProductCreatorForm::_setAssetCategoryIds
		).addRequiredString(
			"description", ProductCreatorForm::_setDescription
		).addOptionalString(
			"shortDescription", ProductCreatorForm::_setShortDescription
		).addRequiredString(
			"productTypeName", ProductCreatorForm::_setProductTypeName
		).addRequiredString(
			"title", ProductCreatorForm::_setTitle
		).addRequiredString(
			"externalReferenceCode",
			ProductCreatorForm::_setExternalReferenceCode
		).addOptionalString(
			"defaultSku", ProductCreatorForm::_setDefaultSku
		).build();
	}

	public List<Long> getAssetCategoryIds() {
		if (_assetCategoryIds == null) {
			return new ArrayList<>();
		}

		return _assetCategoryIds;
	}

	public String getDefaultSku() {
		return _defaultSku;
	}

	public Map<Locale, String> getDescriptionMap() {
		return Collections.singletonMap(Locale.getDefault(), _description);
	}

	public String getExternalReferenceCode() {
		return _externalReferenceCode;
	}

	public String getProductTypeName() {
		return _productTypeName;
	}

	public Map<Locale, String> getShortDescriptionMap() {
		return Collections.singletonMap(Locale.getDefault(), _shortDescritpion);
	}

	public Map<Locale, String> getTitleMap() {
		return Collections.singletonMap(Locale.getDefault(), _title);
	}

	private void _setAssetCategoryIds(List<Long> assetCategoryIds) {
		_assetCategoryIds = assetCategoryIds;
	}

	private void _setDefaultSku(String defaultSku) {
		_defaultSku = defaultSku;
	}

	private void _setDescription(String description) {
		_description = description;
	}

	private void _setExternalReferenceCode(String externalReferenceCode) {
		_externalReferenceCode = externalReferenceCode;
	}

	private void _setProductTypeName(String productTypeName) {
		_productTypeName = productTypeName;
	}

	private void _setShortDescription(String shortDescription) {
		_shortDescritpion = shortDescription;
	}

	private void _setTitle(String title) {
		_title = title;
	}

	private List<Long> _assetCategoryIds;
	private String _defaultSku;
	private String _description;
	private String _externalReferenceCode;
	private String _productTypeName;
	private String _shortDescritpion;
	private String _title;

}