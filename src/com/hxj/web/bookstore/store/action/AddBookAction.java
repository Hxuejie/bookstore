package com.hxj.web.bookstore.store.action;

import org.apache.commons.lang3.StringUtils;

import com.hxj.web.bookstore.base.DaoException;
import com.hxj.web.bookstore.store.bean.Book;
import com.hxj.web.bookstore.store.dao.BookDao;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 添加书籍
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class AddBookAction extends ActionSupport {

	private static final long	serialVersionUID	= 1L;

	private String				name;
	private String				author;
	private float				price;
	private String				desc;
	private String				picture;

	private BookDao				bookDao				= new BookDao();

	@Override
	public String execute() throws Exception {
		if (StringUtils.isAnyEmpty(name, author, desc)) {
			return ERROR;
		}
		try {
			Book book = new Book();
			book.setName(name);
			book.setAuthor(author);
			book.setPrice(price);
			book.setDesc(desc);
			book.setPicture(picture);
			bookDao.addBook(book);
			return SUCCESS;
		} catch (DaoException e) {
			e.printStackTrace();
			return ERROR;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	

}
