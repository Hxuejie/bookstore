package com.hxj.web.bookstore.user.action;

import org.apache.commons.lang3.StringUtils;

import com.hxj.web.bookstore.user.bean.User;
import com.hxj.web.bookstore.user.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户注册
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class UserRegisterAction extends ActionSupport {
	private static final long	serialVersionUID	= 1L;

	private String				username;
	private String				password;

	private UserDao				userDao				= new UserDao();

	@Override
	public String execute() throws Exception {
		if (StringUtils.isAnyEmpty(username, password)) {
			return ERROR;
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userDao.addUser(user);
		return SUCCESS;
	}

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

}
