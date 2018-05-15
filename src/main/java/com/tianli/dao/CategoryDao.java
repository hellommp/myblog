/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:04:27 
 */
package com.tianli.dao;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午1:04:27  
 */
public interface CategoryDao {
	
	/**
	 * 增加一个分类
	 */
	void addCategory(String  name);
	/**
	 * 删除一个分类
	 */
	void deleteCategory(int id);
}
