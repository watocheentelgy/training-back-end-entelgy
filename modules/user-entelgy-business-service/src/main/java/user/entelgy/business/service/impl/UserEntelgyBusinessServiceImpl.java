package user.entelgy.business.service.impl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import user.entelgy.business.service.api.UserEntelgyBusinessService;
import user.entelgy.data.service.service.UserEntelgyLocalService;

/**
 * @author Soporte
 */
@Component(
		immediate = true,
		service = UserEntelgyBusinessService.class
	)
public class UserEntelgyBusinessServiceImpl implements UserEntelgyBusinessService{
	
	@Reference
	private UserEntelgyLocalService userEntelgyLocalService;

	@Override
	public int countUserEntely() {
		return userEntelgyLocalService.countAllUserEntelgy();
	}
}