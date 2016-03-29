package com.hxj.web.bookstore.store.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.hxj.web.bookstore.base.BaseDao;

/**
 * 订单数据服务接口
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class OrderDao extends BaseDao {

	/**
	 * 创建订单
	 * 
	 * @param userID
	 * @param books
	 */
	public void createOrder(int userID, List<Integer> books) {
		float price = 0.0F;
		try {
			db.insert(String.format(
					"insert into t_order values (null,%d,now(),%f)", userID,
					price));
			ResultSet ret = db.select("select max(Id) maxid from t_order");
			ret.next();
			int orderId = ret.getInt("maxid");
			for (int bookid : books) {
				db.insert(String.format(
						"insert into t_orderitems values (null,%d,%d,%d,%f)",
						orderId, bookid, 1, 0.0F));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
