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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tianli.dao.CategoryDao;
import com.tianli.entity.Blog;
import com.tianli.entity.Category;
import com.tianli.entity.Comment;
import com.tianli.service.CategoryService;
import com.tianli.service.CommentService;
import com.tianli.util.DateUtil;
import com.tianli.util.PageBean;
import com.tianli.util.ResponseUtil;

/**
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月19日 下午3:55:48
 */
@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	CommentService commentService;

	@RequestMapping("/listComment")
	public @ResponseBody List<Category> categoryList(@RequestParam(value = "page", required = false) String page,
			@RequestParam(value = "rows", required = false) String rows,
			@RequestParam(value = "content", required = false) String content,
			@RequestParam(value = "title", required = false) String title, 
			@RequestParam(value = "blogid", required = false) Integer bid, HttpServletResponse response)
			throws Exception {
		// 定义分页bean
		PageBean<Comment> pageBean = new PageBean<Comment>(Integer.parseInt(page), Integer.parseInt(rows));
		// 拿到分页结果已经记录总数的pageBean
			pageBean = commentService.listByPage(content,title,bid,pageBean);
		// 使用阿里巴巴的fastJson创建JSONObject
		JSONObject result = new JSONObject();
		// 通过fastJson序列化list为jsonArray
		String jsonArray = JSON.toJSONString(pageBean.getResult());
		
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:MM:SS";
		 //使用默认日期格式化
        String jsonStr = JSON.toJSONString(pageBean.getResult(),
                SerializerFeature.DisableCircularReferenceDetect,
                SerializerFeature.WriteDateUseDateFormat);
        
        
        
		JSONArray array = JSONArray.parseArray(jsonStr);
		int number = 0;
        if(pageBean.getTotal()%pageBean.getPageSize()==0){
        	number = (int) (pageBean.getTotal()/pageBean.getPageSize());
        }else{
        	number = (int) (pageBean.getTotal()/pageBean.getPageSize())+1;
        }

		// 将序列化结果放入json对象中
        result.put("number", number);
        result.put("success", true);
		result.put("rows", array);
		result.put("total", pageBean.getTotal());
		System.out.println(result);
		// 使用自定义工具类向response中写入数据
		ResponseUtil.write(response, result);
		return null;

	}
	

	@RequestMapping("/delete")
	public String deleBlog(String ids, HttpServletResponse response) throws Exception {
		String[] idsStr = ids.split(",");
		for (int i = 0; i < idsStr.length; i++) {
			int id = Integer.parseInt(idsStr[i]);
			commentService.deleteComment(id);
		}
		JSONObject result = new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * 跳转链接
	 * 
	 * */
	@RequestMapping("/tempComment")
	public String tempComment(
    		@RequestParam(value = "id", required = false) Integer id,Model model) throws Exception {
        model.addAttribute("id", id);
        System.out.println("id:"+id);
        return "fore/comments";
    } 
	
	/**
	 * 保存评论
	 * 
	 * */
	@RequestMapping("/save")
	@ResponseBody
	public  Object  saveComment(Comment comment,HttpServletResponse response) throws Exception{
		int resultTotal = 0;

		comment.setCreateDate(DateUtil.d2t(new Date()));
		System.out.println(comment);
  
		resultTotal = commentService.addComment(comment);
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

}
