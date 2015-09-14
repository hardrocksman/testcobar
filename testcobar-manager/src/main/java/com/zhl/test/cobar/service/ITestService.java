package com.zhl.test.cobar.service;

import java.util.List;
import java.util.Map;

import com.zhl.test.cobar.model.UserInfo;

/**
 * Created by Administrator on 2015/9/11.
 */
public interface ITestService {
	
	/**
	 * 新增数据
	 * @param userInfo
	 */
    public void insert(UserInfo userInfo);
    
    /**
     * 查询数据
     * @param param
     * @return
     */
    public List<UserInfo> getUserInfoList(Map<String, Object> param);
}
