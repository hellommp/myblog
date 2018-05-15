/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:05:20 
 */
package com.tianli.dao;

import java.util.ArrayList;
import java.util.Date;

import com.tianli.entity.Comment;
import com.tianli.entity.User;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午1:05:20  
 */
public interface CommentDao {

	/**
	 * 增加评论
	 */
	void addComment(String content,Date createDate,int bid);
	/**
	 *根据文章id查找评论 
	 */
	ArrayList<Comment>queryCommentsById(int id);
	/**
	 * 删除评论
	 */
	void deleteComment(int id);
	
}
