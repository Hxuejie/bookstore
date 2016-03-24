package com.hxj.web.bookstore.store.bean;

/**
 * 书
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class Book {
	private int		id;
	private String	name;
	private float	price;
	private String	author;
	private String	desc;
	private String	picture;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author
				+ ", desc=" + desc + ", picture=" + picture + "]";
	}

}
