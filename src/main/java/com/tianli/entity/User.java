/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:23:56 
 */
package com.tianli.entity;

/** 
 * @Description: 用户表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:23:56  
 */
public class User {

	private int id;
	
	private String name;
	
	private String passWord;

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
		return "User [id=" + id + ", name=" + name + ", passWord=" + passWord + "]";
	}
	
	
}
