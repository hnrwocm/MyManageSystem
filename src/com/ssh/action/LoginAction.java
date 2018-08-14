package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.dmain.Login;
import com.ssh.dmain.Student;
import com.ssh.service.ILoginService;

public class LoginAction extends ActionSupport implements ModelDriven<Login>{
	private ILoginService loginService;
	
	private Login login = new Login();
	
		public void setLogin(Login login) {
		this.login = login;
	}

		public ILoginService getLoginService() {
		return loginService;
		}
	
		public void setLoginService(ILoginService loginService) {
			this.loginService = loginService;
		}

		//用户名和密码
		private String username;
		private String password;
		
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		//登录
		public String login() {
			
			if(loginService.verify(username, password)){
				return "success";
			}		
			return "failure";
		}
		
		public String register() {
			loginService.save(login);
			return "success";
		}

		@Override
		public Login getModel() {
			// TODO Auto-generated method stub
			return login;
		}
}
