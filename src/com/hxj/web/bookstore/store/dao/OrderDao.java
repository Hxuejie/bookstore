package com.hxj.web.bookstore.store.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.hxj.web.bookstore.base.BaseDao;
import com.hxj.web.bookstore.store.bean.Order;

/**
 * 订单数据服务接口
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class OrderDao extends BaseDao {

	public void createOrder(int userID, List<Integer> books) {
		float price = 0;
		try {
			db.insert(String.format("insert into order values (null,%d,%s,%d,%f)", userID,
					new Date().toString(), 0, price));
			for (int i : books) {
				db.insert(String.format("insert into orderitems values (null,%d,%s,%d,%f)", userID,
						new Date().toString(), 0, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
