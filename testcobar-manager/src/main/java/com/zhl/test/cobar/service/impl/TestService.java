package com.zhl.test.cobar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhl.test.cobar.dao.UserInfoDao;
import com.zhl.test.cobar.model.UserInfo;
import com.zhl.test.cobar.service.ITestService;

/**
 * Created by Administrator on 2015/9/11.
 */
@Service
public class TestService implements ITestService{
	
	@Resource
	UserInfoDao userInfoMapperCustomize;
    
	@Override
    public void insert(UserInfo userInfo) {
		userInfoMapperCustomize.insert(userInfo);
    }
}
