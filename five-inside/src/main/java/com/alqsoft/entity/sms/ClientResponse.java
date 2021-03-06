package com.alqsoft.entity.sms;

import org.alqframework.orm.hibernate.IdEntity;

/**
 * @Title: ClientResponse.java
 * @Description: 客户端响应实体）（信息接收成功时响应给服务端）
 * @author 陈振兵
 * @e-mail chenzhenbing@139.com
 * @version v1.0
 * @copyright 2010-2015
 * @create-time 2015年5月13日 下午8:29:08
 * Copyright © 2013 厦门卓讯信息技术有限公司 All rights reserved.
 * 
 */
public class ClientResponse extends IdEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messageKey;// clientResponse 或 chatGroupClientResponse
	private String uniqueKey;//唯一标识 
	private String accountId;//用户id
	public String getMessageKey() {
		return messageKey;
	}
	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
	public String getUniqueKey() {
		return uniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
}
