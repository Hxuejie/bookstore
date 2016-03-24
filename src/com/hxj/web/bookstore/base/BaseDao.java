package com.hxj.web.bookstore.base;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;

public class BaseDao {
	protected static final DB db;

	static {
		db = new DB();
		db.connect();
	}

	protected static void setData(Class<?> cls, ResultSet rs) {
		try {
			Object obj = cls.newInstance();
			Field[] fields = cls.getFields();
			for (Field field : fields) {
				String mtd = toSetMethodName(field.getName());
				Method method = cls.getMethod(mtd, field.getType());
				// method.invoke(obj, arg1);
			}
		} catch (SecurityException | NoSuchMethodException | InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	protected static String toSetMethodName(String field) {
		StringBuilder sb = new StringBuilder();
		sb.append("set");
		sb.append(Character.toUpperCase(field.charAt(0)));
		if (field.length() > 1) {
			sb.append(field.substring(1));
		}
		return sb.toString();
	}

}
