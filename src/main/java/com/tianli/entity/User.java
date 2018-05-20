/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:23:56 
 */
package com.tianli.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** 
 * @Description: 用户表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:23:56  
 */
public class User implements Serializable{

	private int id;
	
	private String name;
	
	private String passWord;
	
	List<Blog>myBlogList = new ArrayList<>(); 

	public List<Blog> getMyBlogList() {
		return myBlogList;
	}

	public void setMyBlogList(List<Blog> myBlogList) {
		this.myBlogList = myBlogList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public User(int id, String name, String passWord) {
		super();
		this.id = id;
		this.name = name;
		this.passWord = passWord;
	}
	
	public User() {}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passWord=" + passWord + ", myBlogList=" + myBlogList.toString() + "]";
	}

	
	
}
