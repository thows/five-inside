package com.alqsoft.hibernatedao.sms;

import org.alqframework.orm.hibernate.BaseDao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alqsoft.entity.sms.ChatGroupContentLog;

/**
 * 
 * @Title: ChatGroupContentLogDao.java
 * @Description: dao
 * @author chenzhenbing
 * @e-mail chenzb@jinledou.com
 * @version v1.0
 * @copyright 2010-2015
 * @create-time 2015年1月7日 下午6:07:38
 * Copyright © 2013 厦门卓讯信息技术有限公司 All rights reserved.
 * 
 */
public interface ChatGroupContentLogDao extends BaseDao<ChatGroupContentLog>{
	
	@Query("from ChatGroupContentLog cl where cl.uniqueKey=:uniqueKey")
	public ChatGroupContentLog getChatGroupContentLogByUniqueKey(@Param("uniqueKey") String uniqueKey);
}
