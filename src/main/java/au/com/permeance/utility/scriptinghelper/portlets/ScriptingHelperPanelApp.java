package au.com.permeance.utility.scriptinghelper.portlets;

import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;

import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true, 
	property = {
		"panel.category.key=" + PanelCategoryKeys.CONTROL_PANEL_CONFIGURATION,
		"service.ranking:Integer=100"
	}, 
	service = PanelApp.class
)
public class ScriptingHelperPanelApp extends BasePanelApp {

	@Override
	public Portlet getPortlet() {
		return _portlet;
	}

	@Override
	public String getPortletId() {
		return ScriptingHelperPortlet.PORTLET_ID;
	}

	@Reference(
		target = "(javax.portlet.name=" + ScriptingHelperPortlet.PORTLET_ID + ")",
		unbind = "-"
	)
	private Portlet _portlet;

}
