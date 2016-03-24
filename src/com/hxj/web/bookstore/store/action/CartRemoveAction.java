package com.hxj.web.bookstore.store.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 从购物车删除书籍
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class CartRemoveAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private int					bookID;

	@Override
	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		List<Integer> cart;
		if (!session.containsKey("cart")) {
			return ERROR;
		} 
		cart = (List<Integer>) session.get("cart");
		cart.remove(Integer.valueOf(bookID));
		return SUCCESS;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

}
