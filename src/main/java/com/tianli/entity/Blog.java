/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:26:28 
 */
package com.tianli.entity;

import java.util.Date;

/** 
 * @Description: 博客表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:26:28  
 */
public class Blog {

	private  int id;
	
	private String title;
	
	private Date publishDate;
	
	private Category category;
	
	private KeyWord keyWord;
	
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


	public KeyWord getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(KeyWord keyWord) {
		this.keyWord = keyWord;
	}

	/**
	 * 
	 */
	public Blog() {
		// TODO Auto-generated constructor stub
	}

	public Blog(int id, String title, Date publishDate, Category category, KeyWord keyWord) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.category = category;
		this.keyWord = keyWord;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", publishDate=" + publishDate + ", category=" + category
				+ ", keyWord=" + keyWord + "]";
	}
	
	
}
