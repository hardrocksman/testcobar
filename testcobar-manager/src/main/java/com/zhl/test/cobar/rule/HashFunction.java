package com.zhl.test.cobar.rule;

public class HashFunction {
	
	public int apply(Long cabarId) {  
        //先从缓存获取 没有则查询数据库  
        //input 可能是taobaoId，拿taobaoId到缓存里去查用户的DB坐标信息。然后把库的编号输出  
        System.out.println("taobaoId：" + cabarId);  
        int result = (int)(cabarId % 3);  
        System.out.println("在第"+(result + 1)+"个数据库中");  
        return result;  
    }  
}
