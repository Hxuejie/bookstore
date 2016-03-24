package com.hxj.web.bookstore.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	private Connection	con;
	private Statement	statement;

	/**
	 * 连接数据库
	 */
	public void connect() {
		if (con != null) {
			return;
		}
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			// connect
			String url = "jdbc:mysql://localhost:3306/mystore?useUnicode=true&characterEncoding=UTF-8";
			String username = "root";
			String password = "123321";
			con = DriverManager.getConnection(url, username, password);
			statement = con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 断开数据库链接
	 */
	public void disconnect() {
		if (con == null) {
			return;
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		con = null;
	}

	/**
	 * 查询
	 * 
	 * @param sql
	 * @return
	 * @throws SQLException
	 */
	public ResultSet select(String sql) throws SQLException {
		if (con == null) {
			return null;
		}
		System.out.println("select sql->: " + sql);
		return statement.executeQuery(sql);
	}

	/**
	 * 插入
	 * 
	 * @param sql
	 * @throws SQLException
	 */
	public void insert(String sql) throws SQLException {
		if (con == null) {
			return;
		}
		System.out.println("insert sql->: " + sql);
		statement.executeUpdate(sql);
	}

	/**
	 * 更新
	 * 
	 * @param sql
	 * @throws SQLException
	 */
	public void update(String sql) throws SQLException {
		if (con == null) {
			return;
		}
		System.out.println("update sql->: " + sql);
		statement.executeUpdate(sql);
	}

}
