/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:33:44 
 */
package com.tianli.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/** 
 * @Description: 评论表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:33:44  
 */
public class Comment implements Serializable{

	private Integer id;
	
	private String content;
	
	private Date createDate;
	
	private Blog blog;
	
	private String email; 
	
	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}

	
	public Blog getBlog() {
		return blog;
	}


	public void setBlog(Blog blog) {
		this.blog = blog;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
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
	 * @param name
	 */
	public Comment(Integer id, String content, Date createDate, Blog blog, String email,String name) {
		super();
		this.id = id;
		this.content = content;
		this.createDate = createDate;
		this.blog = blog;
		this.email = email;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", createDate=" + createDate + ", blog=" + blog
				+ ", email=" + email + ", name=" + name + "]";
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
