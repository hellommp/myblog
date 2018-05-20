/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月19日 下午3:55:48 
 */
package com.tianli.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tianli.dao.BlogDao;
import com.tianli.dao.CategoryDao;
import com.tianli.entity.Blog;
import com.tianli.service.BlogService;
import com.tianli.util.DateUtil;
import com.tianli.util.PageBean;
import com.tianli.util.ResponseUtil;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月19日 下午3:55:48  
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	//(#{title},#{publishDate},#{category.id},#{keyWord},#{user.id},#{content})
	@RequestMapping("/save")
	@ResponseBody
	public  Object  saveBlog( Blog blog){
		System.out.println("123");
		blog.getUser().setId(1);
		blog.setPublishDate(DateUtil.d2t(new Date()));
		blogService.addBlog(blog);
		return "123";
	}
	
	//后台分页查询博客信息
    @RequestMapping("/listBlog")
    public String listBlog(
            @RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows,
            Blog s_blog,
            HttpServletResponse response) throws Exception {

        PageBean<Blog> pageBean = new PageBean<Blog>(Integer.parseInt(page), Integer.parseInt(rows));

        pageBean = blogService.listBlog(s_blog.getTitle(), pageBean);

        //创建json对象
        JSONObject result = new JSONObject();
        //设置json序列化日期格式
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:MM:SS";
        //禁止对象循环引用
        //使用默认日期格式化
        String jsonStr = JSONObject.toJSONString(pageBean.getResult(),
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteDateUseDateFormat);
        //得到json数组
        JSONArray array = JSON.parseArray(jsonStr);
        //把结果放入json
        result.put("rows", array);
        result.put("total", pageBean.getTotal());
        //返回
        System.out.println(result);
        ResponseUtil.write(response, result);
        return null;
    }
}
