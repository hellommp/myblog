/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月19日 下午3:55:48 
 */
package com.tianli.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tianli.dao.CategoryDao;
import com.tianli.entity.Category;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月19日 下午3:55:48  
 */
@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping("/category_list")
	public @ResponseBody List<Category> categoryList(){
		ArrayList<Category>list = categoryDao.queryAllCategory();
		return list;
	}
}
