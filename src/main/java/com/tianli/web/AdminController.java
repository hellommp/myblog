/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:01:50 
 */
package com.tianli.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tianli.dao.CategoryDao;
import com.tianli.service.UserService;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午1:01:50  
 */
@Controller
@RequestMapping("")
public class AdminController {
	
	@Autowired
	CategoryDao CategoryDao;
	
	@RequestMapping("/index")
	public String adminindex(){
		return "admin/adminindex";
	}
	
	@RequestMapping("admin/writeBlog")
	public ModelAndView writeBlog(){
		System.out.println(1111);
		ModelAndView mv = new ModelAndView("/admin/writeBlog");
		mv.addObject("list", CategoryDao.queryAllCategory());
		
		return mv;
	}
	
	@RequestMapping("admin/blgl")
	public String blgl(){
		return "admin/blgl";
	}
	
	@RequestMapping("admin/blogManage")
	public String blogManage(){
		ModelAndView mv = new ModelAndView();
		return "admin/blogManage";
	}
	
	@RequestMapping("admin/comments")
	public String comments(){
		return "admin/comments";
	}
	
	@RequestMapping("admin/commentManage")
	public String commentManage(){
		return "admin/commentManage";
	}
	
	@RequestMapping("/fore_index")
	public String foreindex(){
		return "fore/frontPage";
	}
}

