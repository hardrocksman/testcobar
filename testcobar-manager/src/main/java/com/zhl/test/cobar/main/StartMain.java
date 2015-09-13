package com.zhl.test.cobar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhl.test.cobar.model.UserInfo;
import com.zhl.test.cobar.service.ITestService;

public class StartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ITestService testService = (ITestService) context.getBean("testService");
		
		for(int i = 0; i < 1000; i++){
			UserInfo userInfo = new UserInfo();
			userInfo.setAge(10);
			userInfo.setCobarId(i);
			userInfo.setPassword("aaaaaaaaaaaab" + i);
			userInfo.setUserId(i);
			userInfo.setUsername("aaaaa" + i);
			
			testService.insert(userInfo);
		}
	}

}
