package com.ssh.service;

import com.ssh.dmain.Login;

public interface ILoginService {
	
	Boolean verify(String username,String password);

	void save(Login login);

}
