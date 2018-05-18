/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:25:39 
 */
package com.tianli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianli.dao.BlogDao;
import com.tianli.entity.Blog;
import com.tianli.service.BlogService;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:25:39  
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogDao blogDao;
	
	@Override
	public void addBlog(Blog blog) {
		blogDao.addBlog(blog);
	}

	@Override
	public void deleteBlog(int id) {
		blogDao.deleteBlog(id);
	}

	@Override
	public void refreshBlog(int id, String content) {
		blogDao.refreshBlog(id, content);
	}

	@Override
	public Blog queryBlogById(int id) {

		return blogDao.queryBlogById(id);
	}

}
