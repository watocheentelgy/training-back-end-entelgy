package user.entelgy.business.web.portlet;

import user.entelgy.business.service.api.UserEntelgyBusinessService;
import user.entelgy.business.web.constants.UserEntelgyBusinessWebPortletKeys;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Soporte
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Entelgy User",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserEntelgyBusinessWebPortletKeys.USERENTELGYBUSINESSWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserEntelgyBusinessWebPortlet extends MVCPortlet {
	
	private static final Log LOG = LogFactoryUtil.getLog(UserEntelgyBusinessWebPortlet.class);
	
	@Reference
	private UserEntelgyBusinessService userEntelgyBusinessService;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		super.doView(renderRequest, renderResponse);
		LOG.info("countUserEntely: " + userEntelgyBusinessService.countUserEntely());
		
	}
}