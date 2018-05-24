/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:32:17 
 */
package com.tianli.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianli.dao.CommentDao;
import com.tianli.entity.Comment;
import com.tianli.service.CommentService;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:32:17  
 */
@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao commentDao;
	
	@Override
	public void addComment(String content, Date createDate, Integer bid) {
		commentDao.addComment(content, createDate, bid);
	}

	@Override
	public ArrayList<Comment> queryCommentsById(Integer id) {

		return commentDao.queryCommentsById(id);
	}

	@Override
	public void deleteComment(Integer id) {
		commentDao.deleteComment(id);
	}

	@Override
	public PageBean<Comment> listByPage(String title,PageBean<Comment> pageBean) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("start", pageBean.getStart());
		map.put("end", pageBean.getEnd()-pageBean.getStart());
		pageBean.setTotal(commentDao.getTotal(map));
		pageBean.setResult(commentDao.listByPage(map));
		return pageBean;
	}

}
