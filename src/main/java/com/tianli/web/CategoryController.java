/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月19日 下午3:55:48 
 */
package com.tianli.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tianli.dao.CategoryDao;
import com.tianli.entity.Category;
import com.tianli.service.BlogService;
import com.tianli.service.CategoryService;
import com.tianli.util.PageBean;
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
	CategoryService categoryService;
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping("/category_list")
	public @ResponseBody List<Category> categoryList(@RequestParam(value = "page", required = false) String page,
	        @RequestParam(value = "rows", required = false) String rows,
	        HttpServletResponse response) throws Exception {
	    //定义分页bean
	    PageBean<Category> pageBean = new PageBean<Category>(Integer.parseInt(page)
	            ,Integer.parseInt(rows));
	    //拿到分页结果已经记录总数的pageBean
	    pageBean = categoryService.listByPage(pageBean);
	    //使用阿里巴巴的fastJson创建JSONObject
	    JSONObject result = new JSONObject();
	    //通过fastJson序列化list为jsonArray
	    String jsonArray = JSON.toJSONString(pageBean.getResult());
	    JSONArray array = JSONArray.parseArray(jsonArray);
	    //将序列化结果放入json对象中
	    result.put("rows", array);
	    result.put("total", pageBean.getTotal());
	    System.out.println(result);
	    //使用自定义工具类向response中写入数据
	    ResponseUtil.write(response, result);
	    return null;
		
	}
	// 添加和更新博客类别
    @RequestMapping("/save")
    public String save(Category category, HttpServletResponse response)
            throws Exception {

        int resultTotal = 0; // 接收返回结果记录数
        if (category.getId() == null) { // 说明是第一次插入
        	
            resultTotal = categoryService.addCategory(category);
        } else { // 有id表示修改
            resultTotal = categoryService.updateCategory(category);
        }

        JSONObject result = new JSONObject();
        if (resultTotal > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        return null;
    }
 // 删除博客类别
    @RequestMapping("/delete")
    public String delete(String ids, HttpServletResponse response)
            throws Exception {

    	String[] idsStr = ids.split(",");
        for(int i = 0; i < idsStr.length; i++) {
            int id = Integer.parseInt(idsStr[i]);
            //先删除相对应博客类别的所有文章
            blogService.deleteBlogByCategory(id);
            categoryService.deleteCategory(id);
        }
        JSONObject result = new JSONObject();
        result.put("success", true);
        ResponseUtil.write(response, result);
        return null;
    }
}
