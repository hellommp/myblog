/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:27:53 
 */
package com.tianli.service;

import com.tianli.entity.Category;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:27:53  
 */
public interface CategoryService {

	int addCategory(Category category);
	
	int updateCategory(Category category);
	
	void deleteCategory(int id);
	
	//分页查询
    PageBean<Category> listByPage(PageBean<Category> pageBean);
}
