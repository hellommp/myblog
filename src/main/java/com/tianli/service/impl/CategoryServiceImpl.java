/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:28:46 
 */
package com.tianli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianli.dao.CategoryDao;
import com.tianli.entity.Category;
import com.tianli.service.CategoryService;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:28:46  
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	@Override
	public int addCategory(Category category) {
		return categoryDao.addCategory(category);
	}

	@Override
	public void deleteCategory(int id) {
		categoryDao.deleteCategory(id);
	}

	@Override
	public PageBean<Category> listByPage(PageBean<Category> pageBean) {
		//查询分页结果
        pageBean.setResult(categoryDao.listByPage(pageBean.getStart(),pageBean.getEnd()-pageBean.getStart()));
        //查询记录总数
        pageBean.setTotal(categoryDao.getTotal());
        return pageBean;
	}

	@Override
	public int updateCategory(Category category) {
		
		return categoryDao.updateCategory(category);
	}

}
