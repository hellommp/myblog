/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:20:23 
 */
package com.tianli.service;

import com.tianli.entity.Blog;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:20:23  
 */
public interface BlogService {

	void addBlog(Blog blog);
	
	void deleteBlog(int id);
	
	void refreshBlog(int id,String content);
	
	Blog queryBlogById(int id);
}
