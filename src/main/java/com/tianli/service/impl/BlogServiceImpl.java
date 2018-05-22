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

import com.github.pagehelper.PageHelper;
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

	@Override
	public List<Blog> listBlog(Map<String, Object> map) {
		
		return blogDao.listBlog(map);
	}

	@Override
	public PageBean<Blog> listBlog(String title, PageBean<Blog> pageBean) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		
        //总记录放入pageBean
        pageBean.setTotal(blogDao.getTotal());
        
        map.put("start",pageBean.getStart());
        map.put("end",pageBean.getEnd()-pageBean.getStart());
        //把分页结果放入pageBean
        pageBean.setResult(blogDao.listBlog(map));
        
        System.out.println(blogDao.listBlog(map));
        return pageBean;
	}

}
