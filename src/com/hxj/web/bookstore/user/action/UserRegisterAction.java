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
	private String				phone;
	private String				address;
	private String				email;

	private UserDao				userDao				= new UserDao();

	@Override
	public String execute() throws Exception {
		if (StringUtils.isAnyEmpty(username, password)) {
			return ERROR;
		}
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAddress(address);
		user.setEmail(email);
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
