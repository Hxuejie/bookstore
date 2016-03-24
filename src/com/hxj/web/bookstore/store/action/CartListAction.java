package com.hxj.web.bookstore.store.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 购物车清单
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class CartListAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private BookDao				bookDao				= new BookDao();
	private List<Book>			bookList;

	@Override
	public String execute() throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		List<Integer> cart = (List<Integer>) session.get("cart");
		if (cart == null) {
			bookList = Collections.emptyList();
		} else {
			bookList = new ArrayList<>();
			for (int i : cart) {
				bookList.add(bookDao.findSellingByID(i));
			}
		}
		return SUCCESS;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
