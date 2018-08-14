package com.ssh.service.impl;

import com.ssh.dao.ILoginDao;
import com.ssh.dmain.Login;
import com.ssh.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
	private ILoginDao loginDao;
	
	

	public ILoginDao getLoginDao() {
		return loginDao;
	}



	public void setLoginDao(ILoginDao loginDao) {
		this.loginDao = loginDao;
	}



	@Override
	public Boolean verify(String username, String password) {

		return loginDao.verify(username,password);
	}



	@Override
	public void save(Login login) {
		loginDao.save(login);
		
	}

}
