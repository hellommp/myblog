/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:38:04 
 */
package com.tianli.entity;

/** 
 * @Description: 关键字表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:38:04  
 */
public class KeyWord {

private int id;
	
	private String name;

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

	public KeyWord(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public KeyWord() {
		super();
	}
}
