/**   
 * 

 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:04:47 
 */
package com.tianli.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.tianli.entity.Blog;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午1:04:47  
 */
public interface BlogDao {
	/**
	 * 添加一篇文章
	 */
	Integer addBlog(Blog blog);
	/**
	 * 删除一篇文章
	 */
	Integer deleteBlog(Integer id);
	/**
	 * 修改一篇文章
	 */
	Integer refreshBlog(Blog blog);
	/**
	 * 根据id查询一篇文章 
	 */
	Blog queryBlogById(Integer id);
	/**
	 * 删除一篇文章(根据类别)
	 */
	Integer deleteBlogByCategory(Integer cid);
	// 分页查询博客
    public List<Blog> listBlog(Map<String, Object> map);

    // 获取总记录数
    public Long getTotal(Map<String ,Object> map);
    
}

