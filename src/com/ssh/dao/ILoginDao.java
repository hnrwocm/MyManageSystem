package com.ssh.dao;

import com.ssh.dmain.Login;

public interface ILoginDao {

	Boolean verify(String username,String password);

	void save(Login login);


	
}
