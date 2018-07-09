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
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tianli.dao.CategoryDao;
import com.tianli.entity.Blog;
import com.tianli.entity.Category;
import com.tianli.entity.Comment;
import com.tianli.service.CategoryService;
import com.tianli.service.CommentService;
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
			@RequestParam(value = "title", required = false) String title, HttpServletResponse response)
			throws Exception {
		// 定义分页bean
		PageBean<Comment> pageBean = new PageBean<Comment>(Integer.parseInt(page), Integer.parseInt(rows));
		// 拿到分页结果已经记录总数的pageBean
		pageBean = commentService.listByPage(content, title, pageBean);
		// 创建json对象
		JSONObject result = new JSONObject();
		// 设置json序列化日期格式
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:MM:SS";
		// 禁止对象循环引用
		// 使用默认日期格式化
		String jsonStr = JSONObject.toJSONString(pageBean.getResult(), SerializerFeature.DisableCircularReferenceDetect,
				SerializerFeature.WriteDateUseDateFormat);
		// 得到json数组
		JSONArray array = JSON.parseArray(jsonStr);
		// 将序列化结果放入json对象中
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

}
