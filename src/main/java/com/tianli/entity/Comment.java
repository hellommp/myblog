/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:33:44 
 */
package com.tianli.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @Description: 评论表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:33:44  
 */
public class Comment implements Serializable{

	private int id;
	
	private String content;
	
	private Date createDate;
	
	private Blog blog;
	
	private String email; 
	
	public int getId() {
		return id;
	}

	
	public Blog getBlog() {
		return blog;
	}


	public void setBlog(Blog blog) {
		this.blog = blog;
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


	
	/**
	 * @param id
	 * @param content
	 * @param createDate
	 * @param blog
	 * @param email
	 */
	public Comment(int id, String content, Date createDate, Blog blog, String email) {
		super();
		this.id = id;
		this.content = content;
		this.createDate = createDate;
		this.blog = blog;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", createDate=" + createDate + ", blog=" + blog
				+ ", email=" + email + "]";
	}


	/**
	 * 
	 */
	public Comment() {
		// TODO Auto-generated constructor stub
	}





	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	
	
}
