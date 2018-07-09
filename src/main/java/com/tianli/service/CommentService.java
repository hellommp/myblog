/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:30:34 
 */
package com.tianli.service;

import java.util.ArrayList;
import java.util.Date;

import org.omg.PortableInterceptor.INACTIVE;

import com.tianli.entity.Comment;
import com.tianli.util.PageBean;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:30:34  
 */
public interface CommentService {
	
	int addComment(Comment comment);

	ArrayList<Comment>queryCommentsById(Integer id);

	void deleteComment(Integer id);

	 //分页查询
    PageBean<Comment> listByPage(String content,String title,Integer blogid, PageBean<Comment> pageBean);
}
