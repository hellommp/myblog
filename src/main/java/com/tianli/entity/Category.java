/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:30:11 
 */
package com.tianli.entity;

/** 
 * @Description: 博客类型表
 * @author: TianLi
 * @date: 2018年5月8日 下午5:30:11  
 */
public class Category {

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

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
