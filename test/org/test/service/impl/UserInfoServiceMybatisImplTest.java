package org.test.service.impl;

import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.superhy.model.UserInfo;
import org.superhy.service.impl.UserInfoServiceMybatisImpl;

public class UserInfoServiceMybatisImplTest {

	@Test
	public void testAdd() {
		UserInfoServiceMybatisImpl testObj = new UserInfoServiceMybatisImpl();

		UserInfo user = new UserInfo();
		user.setName("DaiDan");
		user.setPass(Integer.toString((int) (Math.random() * 999999))); // 随机生成一个六位数字符串
		user.setWeight(57.5);
		user.setBirth(Timestamp.valueOf(new SimpleDateFormat(
				"yyyy-mm-dd hh:mm:ss").format(new Date())));

		testObj.add(user);
	}

	@Test
	public void testUpdate() {
		UserInfoServiceMybatisImpl testObj = new UserInfoServiceMybatisImpl();

		UserInfo user = new UserInfo();
		user.setId(1);
		user.setName("DaiDan");
		user.setPass(Integer.toString((int) (Math.random() * 999999))); // 随机生成一个六位数字符串
		user.setWeight(57.5);
		user.setBirth(Timestamp.valueOf(new SimpleDateFormat(
				"yyyy-mm-dd hh:mm:ss").format(new Date())));
		
		testObj.update(user);
	}

	@Test
	public void testDelete() {
		UserInfoServiceMybatisImpl testObj = new UserInfoServiceMybatisImpl();
		
		int id = new Scanner(System.in).nextInt();
		testObj.delete(id);
	}

	@Test
	public void testLoad() {
		UserInfoServiceMybatisImpl testObj = new UserInfoServiceMybatisImpl();
		
		int id = new Scanner(System.in).nextInt();
		UserInfo userInfo = testObj.load(id);
		System.out.println(userInfo.getName());
	}

	@Test
	public void testList() {
		UserInfoServiceMybatisImpl testObj = new UserInfoServiceMybatisImpl();

		List<UserInfo> userInfos = testObj.list();
		for (UserInfo userInfo : userInfos) {
			System.out.println(userInfo.getName());
		}
	}
}
