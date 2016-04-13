package com.hxj.web.bookstore.store.action;

import java.util.List;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 管理书箱
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class BookManageAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private List<Book>			bookList;
	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		bookList = bookDao.getAllSelling();
		return SUCCESS;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}


}
