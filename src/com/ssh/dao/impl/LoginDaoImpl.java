package com.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.ssh.dao.ILoginDao;
import com.ssh.dmain.Login;

public class LoginDaoImpl implements ILoginDao {
	private HibernateTemplate hibernateTemplate;

	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public Boolean verify(String username, String password) {
		List list = hibernateTemplate.find("from Login where lUsername = ? and lPassword = ?",username,password);
		if(list.size()==0) {
			return false;
		}
		return true;
		
	}
	@Override
	public void save(Login login) {
		
		hibernateTemplate.save(login);
	}

}
