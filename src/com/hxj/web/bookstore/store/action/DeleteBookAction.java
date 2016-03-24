package com.hxj.web.bookstore.store.action;

import com.hxj.web.bookstore.base.DaoException;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 删除书籍
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class DeleteBookAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private int					bookID;
	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		if (bookID == 0) {
			return ERROR;
		}
		try {
			bookDao.deleteBook(bookID);
		} catch (DaoException e) {
			e.printStackTrace();
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

}
