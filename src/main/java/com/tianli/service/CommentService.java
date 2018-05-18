/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月16日 下午12:30:34 
 */
package com.tianli.service;

import java.util.ArrayList;
import java.util.Date;

import com.tianli.entity.Comment;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月16日 下午12:30:34  
 */
public interface CommentService {
	
	void addComment(String content,Date createDate,int bid);

	ArrayList<Comment>queryCommentsById(int id);

	void deleteComment(int id);

}
