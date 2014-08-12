package org.superhy.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	private static SqlSessionFactory sessionFactory;
	
	static{
		
		try {
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			sessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static SqlSession createSession() {
		
		return sessionFactory.openSession();
	}
	
	public static void closeSession(SqlSession session) {
		
		if (session != null) {
			session.close();
		}
	}
}
