package tn.esprit.esponline.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.esponline.dao.IUserDAOImpl;
import tn.esprit.esponline.service.IUserServiceImpl;
@Controller
public class UserControllerImpl {
	
	@Autowired
	IUserServiceImpl userService;

	public IUserServiceImpl getUserDAO() { return userService; }

	public void setUserService(IUserServiceImpl userService) { this.userService = userService; }
}
