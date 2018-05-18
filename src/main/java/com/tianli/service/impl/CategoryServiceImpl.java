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
import com.tianli.service.CategoryService;

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
	public void addCategory(String name) {
		categoryDao.addCategory(name);
	}

	@Override
	public void deleteCategory(int id) {
		categoryDao.deleteCategory(id);
	}

}
