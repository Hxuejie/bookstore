package com.hxj.web.bookstore.store.action;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 编辑书籍
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class EditBookAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private int					bookID;
	private Book				book;

	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		book = bookDao.findSellingByID(bookID);
		if (book == null) {
			return ERROR;
		}
		return SUCCESS;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
