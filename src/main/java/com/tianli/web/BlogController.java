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
import org.springframework.web.bind.annotation.RequestMethod;
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
import com.tianli.entity.Category;
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
	
	@RequestMapping("/save")
	@ResponseBody
	public  Object  saveBlog(Blog blog,HttpServletResponse response) throws Exception{
		int resultTotal = 0;

		blog.setPublishDate(DateUtil.d2t(new Date()));
		System.out.println(blog);
        if(blog.getId()!=null){
            //更新操作
            resultTotal = blogService.refreshBlog(blog);
//            //更新索引
//            blogIndex.updateIndex(blog);
        }else{
            //新增操作
            resultTotal = blogService.addBlog(blog);
//            //添加索引
//            blogIndex.addIndex(blog);
        }
        JSONObject result = new JSONObject();
        if(resultTotal > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        System.out.println(result);
        return null;
	}
	
	//后台分页查询博客信息
    @RequestMapping("/listBlog")
    public String listBlog(
            @RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows,
            Blog s_blog,
            HttpServletResponse response) throws Exception {
        PageBean<Blog> pageBean = new PageBean<Blog>(Integer.parseInt(page), Integer.parseInt(rows));
        System.out.println(page+"当前页数" +rows);

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
        
        System.out.println("result"+result);
        //返回
        ResponseUtil.write(response, result);
        return null;
    }
    @RequestMapping("/delete")
    public String deleBlog(String ids,HttpServletResponse response) throws Exception{
    	String[] idsStr = ids.split(",");
        for(int i = 0; i < idsStr.length; i++) {
            int id = Integer.parseInt(idsStr[i]);
            //先删除博客所关联的评论 现在没有完成评论的功能 先注释
            //commentService.deleteCommentByBlogId(id);
            blogService.deleteBlog(id);
        }
        JSONObject result = new JSONObject();
        result.put("success", true);
        ResponseUtil.write(response, result);
        return null;
    }
    
  //前台分页查询博客信息
    @RequestMapping("/blogList")
    public String blogList(
    		@RequestParam(value = "page", required = false) String page,
            @RequestParam(value = "rows", required = false) String rows,
           HttpServletResponse response) throws Exception {
        PageBean<Blog> pageBean = new PageBean<Blog>(Integer.parseInt(page), Integer.parseInt(rows));
        System.out.println(page+"当前页数" +rows);

        pageBean = blogService.listBlog(null, pageBean);
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
        int number = 0;
        if(pageBean.getTotal()%pageBean.getPageSize()==0){
        	number = (int) (pageBean.getTotal()/pageBean.getPageSize());
        }else{
        	number = (int) (pageBean.getTotal()/pageBean.getPageSize())+1;
        }
        result.put("number", number);
        result.put("success", true);
        //把结果放入json
        result.put("rows", array);
        result.put("total", pageBean.getTotal());
        
        System.out.println("result"+result);
        //返回
        ResponseUtil.write(response, result);
        return null;
    }
    
    /**
     * 根据id查找博客
     * */
    
    @RequestMapping("/blogDetail")
    public String blogDetail(
    		@RequestParam(value = "id", required = false) Integer id,Model model) throws Exception {
        System.out.println("当前id:" +id);
        Blog blog = blogService.queryBlogById(id);
        System.out.println("当前博客:" +blog);
        model.addAttribute("Blog", blog);
        return "fore/articleDetial";
    }
    
    
}


