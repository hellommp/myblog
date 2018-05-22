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
	void addComment(@Param("content")String content,@Param("createDate")Date createDate,@Param("bid")int bid);
	/**
	 *根据文章id查找评论 
	 */
	ArrayList<Comment>queryCommentsById(int id);
	/**
	 * 删除评论
	 */
	void deleteComment(int id);
	/**
     * 分页查询评论信息
     * @param start
     * @param end
     * @return
     */
    List<Comment> listByPage(@Param("start") Integer start, @Param("end") Integer end);

    /**
     * 查询总记录数
     * @return
     */
    int getTotal();
}
