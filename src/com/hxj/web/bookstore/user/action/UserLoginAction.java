package com.hxj.web.bookstore.user.action;

import com.hxj.web.bookstore.user.bean.User;
import com.hxj.web.bookstore.user.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户登录
 * 
 * @author Hxuejie hxuejie@126com
 */
public class UserLoginAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private String				username;
	private String				password;

	private UserDao				userDao				= new UserDao();

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

	@Override
	public String execute() throws Exception {
		if (username == null || "".equals(username)) {
			return ERROR;
		}
		User user = userDao.loginUser(username, password);
		if (user == null) {
			return ERROR;
		}
		return SUCCESS;
	}
}
