package org.superhy.dao;

import java.util.List;

import org.superhy.model.UserInfo;

public interface UserInfoMapper {

	void add(UserInfo userInfo);

	void update(UserInfo userInfo);

	void delete(int id);

	UserInfo load(int id);

	List<UserInfo> list();
}
