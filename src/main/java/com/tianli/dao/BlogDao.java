/**   
 * 

 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:04:47 
 */
package com.tianli.dao;

import java.util.Date;

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
	void addBlog(Blog blog);
	/**
	 * 删除一篇文章
	 */
	void deleteBlog(int id);
	/**
	 * 修改一篇文章
	 */
	void refreshBlog(@Param("id")int id,@Param("content")String content);
	/**
	 * 根据id查询一篇文章 
	 */
	Blog queryBlogById(int id);
	
}

