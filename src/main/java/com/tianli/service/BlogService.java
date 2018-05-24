/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:20:23 
 */
package com.tianli.service;

import java.util.List;
import java.util.Map;

import com.tianli.entity.Blog;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:20:23  
 */
public interface BlogService {

	Integer addBlog(Blog blog);
	
	void deleteBlog(Integer id);
	
	Integer refreshBlog(Blog blog);
	
	Integer deleteBlogByCategory(Integer cid);
	
	Blog queryBlogById(Integer id);
	
	// 分页查询博客
    public List<Blog> listBlog(Map<String,Object> map);

    // 分页查询博客
    public PageBean<Blog> listBlog(String title,PageBean<Blog> pageBean);
}
