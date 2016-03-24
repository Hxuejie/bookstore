package com.hxj.web.bookstore.store.action;

import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 书籍详细信息
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class BookDescAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private int					bookID				= -1;
	private Book				book;
	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		if (bookID < 0) {
			return ERROR;
		}
		book = bookDao.findSellingByID(bookID);
		if (book == null) {
			return ERROR;
		}
		return SUCCESS;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

}
