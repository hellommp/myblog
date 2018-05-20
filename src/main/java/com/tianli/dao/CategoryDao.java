/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:04:27 
 */
package com.tianli.dao;

import java.util.ArrayList;

import com.tianli.entity.Category;

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
	/**
	 * 查找所有分类
	 */
	ArrayList<Category>queryAllCategory();
}
