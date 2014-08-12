package org.superhy.service;

import java.util.List;

import org.superhy.model.UserInfo;

public interface UserInfoService {

	public void add(UserInfo userInfo);

	public void update(UserInfo userInfo);

	public void delete(int id);

	public UserInfo load(int id);

	public List<UserInfo> list();
}
