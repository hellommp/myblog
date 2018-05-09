/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:33:44 
 */
package com.tianli.entity;

import java.util.Date;

/** 
 * @Description: 评论表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:33:44  
 */
public class Comment {

	private int id;
	
	private String content;
	
	private Date createDate;
	
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment(int id, String content, Date createDate, User user) {
		super();
		this.id = id;
		this.content = content;
		this.createDate = createDate;
		this.user = user;
	}
	
	/**
	 * 
	 */
	public Comment() {
		// TODO Auto-generated constructor stub
	}
}
