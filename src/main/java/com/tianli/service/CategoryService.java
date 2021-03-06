/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:27:53 
 */
package com.tianli.service;

import java.util.ArrayList;

import com.tianli.entity.Category;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:27:53  
 */
public interface CategoryService {

	Integer addCategory(Category category);
	
	Integer updateCategory(Category category);
	
	Integer deleteCategory(Integer id);

	//分页查询
    PageBean<Category> listByPage(PageBean<Category> pageBean);
    
    //查询全部分类
    ArrayList<Category>queryAllCategory();
}
