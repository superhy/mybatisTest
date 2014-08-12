package org.superhy.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.superhy.dao.UserInfoMapper;
import org.superhy.model.UserInfo;
import org.superhy.service.UserInfoService;
import org.superhy.util.MybatisUtil;

public class UserInfoServiceMybatisImpl implements UserInfoService {

	public void add(UserInfo userInfo) {

		SqlSession session = null;

		try {
			session = MybatisUtil.createSession();

			session.getMapper(UserInfoMapper.class).add(userInfo);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		} finally {

			if (session != null) {
				session.close();
			}
		}

	}

	public void update(UserInfo userInfo) {

		SqlSession session = null;

		try {
			session = MybatisUtil.createSession();

			session.getMapper(UserInfoMapper.class).update(userInfo);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void delete(int id) {

		SqlSession session = null;

		try {
			session = MybatisUtil.createSession();

			session.getMapper(UserInfoMapper.class).delete(id);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public UserInfo load(int id) {

		SqlSession session = null;
		UserInfo userInfo = null;
		try {
			session = MybatisUtil.createSession();
			userInfo = session.getMapper(UserInfoMapper.class).load(id);
		} finally {
			MybatisUtil.closeSession(session);
		}

		return userInfo;
	}

	public List<UserInfo> list() {

		SqlSession session = null;
		List<UserInfo> users = null;
		try {
			session = MybatisUtil.createSession();
			users = session.getMapper(UserInfoMapper.class).list();
		} finally {
			MybatisUtil.closeSession(session);
		}

		return users;
	}
	
	/*
	 * find方法，等实现baseDao再说
	 */
}
