/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:04:27 
 */
package com.tianli.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tianli.entity.Category;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午1:04:27  
 */
public interface CategoryDao {
	
	Category queryCategoryById(Integer id);
	/**
	 * 增加一个分类
	 */
	Integer addCategory(Category category);
	
	Integer updateCategory(Category category);
	/**
	 * 删除一个分类
	 * @return 
	 */
	Integer deleteCategory(Integer id);
	/**
	 * 查找所有分类
	 */
	ArrayList<Category>queryAllCategory();
	 /**
     * 分页查询博客类别信息
     * @param start
     * @param end
     * @return
     */
    List<Category> listByPage(@Param("start") Integer start, @Param("end") Integer end);

    /**
     * 查询总记录数
     * @return
     */
    Integer getTotal();
}
