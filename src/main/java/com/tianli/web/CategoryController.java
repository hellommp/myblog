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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tianli.dao.CategoryDao;
import com.tianli.entity.Category;
import com.tianli.util.ResponseUtil;

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
	public @ResponseBody ArrayList<Category> categoryList(){
		ArrayList<Category>list = categoryDao.queryAllCategory();
	/*	//创建json对象
        JSONObject result = new JSONObject();
        String jsonStr = JSONObject.toJSONString(list);
        //得到json数组
        JSONArray array = JSON.parseArray(jsonStr);
        result.put("category", array);
        //返回
        System.out.println("返回"+result);*/
		return list;
	}
}
