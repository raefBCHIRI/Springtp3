package tn.esprit.esponline.service;

import tn.esprit.esponline.dao.IUserDAOImpl;

public class UserServiceImpl implements IUserServiceImpl{

	IUserDAOImpl userDAO;
	public IUserDAOImpl getUserDAO() {
	return userDAO;
	}
	public void setUserDAO(IUserDAOImpl userDAO) {
	this.userDAO = userDAO;
	}
	
}
