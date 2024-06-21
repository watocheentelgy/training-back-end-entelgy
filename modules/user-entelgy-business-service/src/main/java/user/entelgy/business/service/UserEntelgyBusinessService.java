package user.entelgy.business.service;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import user.entelgy.data.service.service.UserEntelgyLocalService;

/**
 * @author Soporte
 */
@Component(
		immediate = true,
		service = UserEntelgyBusinessService.class
	)
public class UserEntelgyBusinessService {
	
	@Reference
	private UserEntelgyLocalService userEntelgyLocalService;

	public int countUserEntely() {
		return userEntelgyLocalService.countAllUserEntelgy();
	}
}