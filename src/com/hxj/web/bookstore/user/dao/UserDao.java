package com.hxj.web.bookstore.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hxj.web.bookstore.base.BaseDao;
import com.hxj.web.bookstore.user.bean.User;

public class UserDao extends BaseDao {
	public void addUser(User user) {
		try {
			db.insert(String.format("insert into t_users values(null,%s,%s,%s,%s,%s)",
					user.getUsername(), user.getPassword(), user.getPhone(), user.getAddress(),
					user.getEmail()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User loginUser(String username, String password) {
		try {
			ResultSet ret = db.select(
					String.format("select * from t_users where username='%s' and password='%s'",
							username, password));
			if (ret.next()) {
				return createUserObject(ret);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 创建用户对象
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private User createUserObject(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("Id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setPhone(rs.getString("phone"));
		user.setAddress(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		return user;
	}
}
