/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:25:39 
 */
package com.tianli.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianli.dao.BlogDao;
import com.tianli.entity.Blog;
import com.tianli.service.BlogService;
import com.tianli.util.PageBean;

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
	public Integer addBlog(Blog blog) {
		return blogDao.addBlog(blog);
	}

	@Override
	public void deleteBlog(Integer id) {
		blogDao.deleteBlog(id);
	}

	@Override
	public Integer refreshBlog(Blog blog) {
		return blogDao.refreshBlog(blog);
	}

	@Override
	public Blog queryBlogById(Integer id) {

		return blogDao.queryBlogById(id);
	}

	@Override
	public List<Blog> listBlog(Map<String, Object> map) {
		
		return blogDao.listBlog(map);
	}

	@Override
	public PageBean<Blog> listBlog(String title, PageBean<Blog> pageBean) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("start", pageBean.getStart());
		map.put("end", pageBean.getEnd()-pageBean.getStart());
		pageBean.setTotal(blogDao.getTotal(map));
		pageBean.setResult(blogDao.listBlog(map));
		return pageBean;
	}

	@Override
	public Integer deleteBlogByCategory(Integer cid) {
		
		return blogDao.deleteBlogByCategory(cid);
	}




	

}
