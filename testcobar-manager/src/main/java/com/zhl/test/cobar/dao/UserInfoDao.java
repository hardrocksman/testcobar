package com.zhl.test.cobar.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.zhl.test.cobar.model.UserInfo;

@SuppressWarnings("deprecation")
@Repository
public class UserInfoDao {
	
	@Resource
	SqlMapClientTemplate sqlMapClientTemplate;
	
	/**
	 *  取得�?��用户信息
	 * @param param
	 * @return
	 */
	@SuppressWarnings({ "unchecked"})
	public List<UserInfo> selectAllUser(Map<String, Object> param){
		return (List<UserInfo>) this.sqlMapClientTemplate.queryForList(
				"selectAllUser", param);
	}
	

	public void insert(UserInfo userInfo){
		sqlMapClientTemplate.insert("user.insertUser", userInfo);
	}
}
