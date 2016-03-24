package com.hxj.web.bookstore.store.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 添加到购物车
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class CartAddAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private int					bookID;
	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		Book book = bookDao.findSellingByID(bookID);
		if (book == null) {
			return ERROR;
		}
		Map<String, Object> session = ActionContext.getContext().getSession();
		List<Integer> cart;
		if (session.containsKey("cart")) {
			cart = (List<Integer>) session.get("cart");
		} else {
			cart = new ArrayList<>();
			session.put("cart", cart);
		}
		cart.add(bookID);
		return SUCCESS;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

}
