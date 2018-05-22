/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:32:17 
 */
package com.tianli.service.impl;

import java.util.ArrayList;
import java.util.Date;

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
	public void addComment(String content, Date createDate, int bid) {
		commentDao.addComment(content, createDate, bid);
	}

	@Override
	public ArrayList<Comment> queryCommentsById(int id) {

		return commentDao.queryCommentsById(id);
	}

	@Override
	public void deleteComment(int id) {
		commentDao.deleteComment(id);
	}

	@Override
	public PageBean<Comment> listByPage(PageBean<Comment> pageBean) {
		
		 //查询分页结果
        pageBean.setResult(commentDao.listByPage(pageBean.getStart(),pageBean.getEnd()-pageBean.getStart()));
        //查询记录总数
        pageBean.setTotal(commentDao.getTotal());
        return pageBean;
	}

}
