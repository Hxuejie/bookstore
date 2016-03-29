package com.hxj.web.bookstore.store.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hxj.web.bookstore.base.BaseDao;
import com.hxj.web.bookstore.base.DaoException;
import com.hxj.web.bookstore.store.bean.Book;

/**
 * 书籍数据访问接口
 * 
 * @author Hxuejie hxuejie@126.com
 */
public class BookDao extends BaseDao {
	/**
	 * 获取所有出售中的书籍
	 * 
	 * @return
	 */
	public List<Book> getAllSelling() {
		try {
			ResultSet set = db.select("select * from t_books where state=1");
			List<Book> list = new ArrayList<Book>();
			while (set.next()) {
				Book book = createBookObject(set);
				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	/**
	 * 通过ID摸查书籍
	 * 
	 * @param id 书籍ID
	 * @return 返回书籍对象，没有找到时返回NULL
	 * @throws DaoException
	 */
	public Book findSellingByID(int id) throws DaoException {
		try {
			ResultSet set = db.select("select * from t_books where id = " + id);
			if (!set.next()) {
				return null;
			}
			return createBookObject(set);
		} catch (SQLException e) {
			throw new DaoException("find book error,bookid=" + id, e);
		}
	}

	/**
	 * 通过书籍名称摸查书籍
	 * 
	 * @param name 书籍名称
	 * @return 返回书籍列表
	 * @throws DaoException
	 */
	public List<Book> findSellingByName(String name) throws DaoException {
		List<Book> list = new ArrayList<Book>();
		try {
			ResultSet set = db.select("select * from t_books where name like '" + name + "'");
			while (set.next()) {
				list.add(createBookObject(set));
			}
			return list;
		} catch (SQLException e) {
			throw new DaoException("find book error,book name like:" + name, e);
		}
	}

	/**
	 * 摸查书籍
	 * 
	 * @param keyword 关键字
	 * @return 返回书籍列表
	 * @throws DaoException
	 */
	public List<Book> findSellingByAll(String keyword) throws DaoException {
		List<Book> list = new ArrayList<Book>();
		try {
			ResultSet set = db.select("select * from t_books where find_in_set('" + keyword
					+ "',name) or " + "find_in_set('" + keyword + "',author)");
			while (set.next()) {
				list.add(createBookObject(set));
			}
			return list;
		} catch (SQLException e) {
			throw new DaoException("find book error,keyword=" + keyword, e);
		}
	}

	/**
	 * 添加书籍
	 * 
	 * @param book
	 * @throws DaoException
	 */
	public void addBook(Book book) throws DaoException {
		try {
			db.insert(String.format("insert into t_books values (null,'%s','%s',%f,'%s','%s',1)",
					book.getName(), book.getAuthor(), book.getPrice(), book.getDesc(),
					book.getPicture()));
		} catch (SQLException e) {
			throw new DaoException("insert book error,book=" + book, e);
		}
	}

	/**
	 * 更新书籍
	 * 
	 * @param book
	 * @throws DaoException
	 */
	public void updateBook(Book book) throws DaoException {
		try {
			db.update(String.format(
					"update t_books set name='%s',author='%s',price=%f,`desc`='%s',picture='%s' where id=%d",
					book.getName(), book.getAuthor(), book.getPrice(), book.getDesc(),
					book.getPicture(), book.getId()));
		} catch (SQLException e) {
			throw new DaoException("update book error,book=" + book, e);
		}
	}

	/**
	 * 删除书籍
	 * 
	 * @param bookID
	 * @throws DaoException
	 */
	public void deleteBook(int bookID) throws DaoException {
		try {
			db.insert("update t_books set state=0 where id=" + bookID);
		} catch (SQLException e) {
			throw new DaoException("insert book error,bookID=" + bookID, e);
		}
	}

	/**
	 * 创建书籍对象
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private Book createBookObject(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setName(rs.getString("name"));
		book.setAuthor(rs.getString("author"));
		book.setPrice(rs.getFloat("price"));
		book.setDesc(rs.getString("desc"));
		book.setPicture(rs.getString("picture"));
		return book;
	}
}
