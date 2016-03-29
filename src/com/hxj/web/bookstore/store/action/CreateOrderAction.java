package com.hxj.web.bookstore.store.action;

import java.util.List;
import java.util.Map;

import com.hxj.web.bookstore.store.dao.OrderDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 创建订单
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class CreateOrderAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private OrderDao			orderDao			= new OrderDao();

	@Override
	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (!session.containsKey("cart")) {
			return ERROR;
		}
		List<Integer> cart = (List<Integer>) session.get("cart");
		if (cart.isEmpty()) {
			return ERROR;
		}
		int userID = (Integer)session.get("userID");
		orderDao.createOrder(userID, cart);

		return SUCCESS;
	}

}
