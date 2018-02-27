<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
	<head>
		<title>${the_title} - ${company_name}</title>

		<meta content="initial-scale=1.0, width=device-width" name="viewport" />

		<@liferay_util["include"] page=top_head_include />
	</head>

	<body class="${css_class}">
		<@liferay_ui["quick-access"] contentId="#main-content" />

		<@liferay_util["include"] page=body_top_include />

		<@liferay.control_menu />

		<div class="main-wrapper" id="wrapper">
			<#if is_signed_in>
				<#if validator.isNotNull(currentOrganization)>
					<#include "${full_templates_path}/application_bar.ftl" />

					<div class="container-fluid">
						<div class="b2b-wrapper row">
							<#include "${full_templates_path}/sidebar.ftl" />

							<div class="col">
								<main class="container-fluid" id="content" role="main">
									<#if demo_mode>
										<#include "${full_templates_path}/demo_content.ftl" />
									<#else>
										<#if selectable>
											<@liferay_util["include"] page=content_include />
										<#else>
											${portletDisplay.recycle()}

											${portletDisplay.setTitle(the_title)}

											<@liferay_theme["wrap-portlet"] page="portlet.ftl">
												<@liferay_util["include"] page=content_include />
											</@>
										</#if>
									</#if>
								</main>

								<#include "${full_templates_path}/footer.ftl" />
							</div>
						</div>
					</div>
				<#else>
					<div class="modal-backdrop fade show"></div>
					<div class="account-selector-modal modal show" role="dialog" tabindex="-1">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-body">
									<@commerce_search_organization default_preferences=freeMarkerPortletPreferences.getPreferences("portletSetupPortletDecoratorId", "barebone") />
								</div>
							</div>
						</div>
					</div>
				</#if>
			<#else>
				<#include "${full_templates_path}/login.ftl" />
			</#if>
		</div>

		<@liferay_util["include"] page=body_bottom_include />

		<@liferay_util["include"] page=bottom_include />
	</body>
</html>