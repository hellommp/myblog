/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:26:28 
 */
package com.tianli.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @Description: 博客表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:26:28  
 */
public class Blog implements Serializable{

	private  int id;
	
	private String title;
	
	private Date publishDate;
	
	private Category category = new Category();
	
	private String keyWord;
	
	private User user = new User();
	
	private String content;
	
	
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	/**
	 * 
	 */
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", category=" + category
				+ ", keyWord=" + keyWord + ", user=" + user + ", content=" + content + "]";
	}

	public Blog(int id, String title, Date publishDate, Category category, String keyWord, User user, String content) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.category = category;
		this.keyWord = keyWord;
		this.user = user;
		this.content = content;
	}


	
}
