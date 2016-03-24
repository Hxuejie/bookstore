package com.hxj.web.bookstore.store.action;

import java.util.List;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 书箱列表
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class BookListAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private String				keyword;
	private List<Book>			bookList;
	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		if (keyword != null && keyword.length() > 0) {
			bookList = bookDao.findSellingByAll(keyword);
		} else {
			bookList = bookDao.getAllSelling();
		}
		return SUCCESS;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	

}
