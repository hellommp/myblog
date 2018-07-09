/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午1:05:20 
 */
package com.tianli.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

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
	int addComment(Comment comment);
	/**
	 *根据文章id查找评论 
	 */
	ArrayList<Comment>queryCommentsById(Integer id);
	/**
	 * 删除评论
	 */
	void deleteComment(Integer id);
	/**
     * 分页查询评论信息
     * @param start
     * @param end
     * @return
     */
    List<Comment> listByPage(Map<String, Object> map);

    /**
     * 查询总记录数
     * @return
     */
    Integer getTotal(Map<String ,Object> map);
}
