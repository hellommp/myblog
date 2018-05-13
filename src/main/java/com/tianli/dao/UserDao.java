/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:46:57 
 */
package com.tianli.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;

import com.tianli.entity.Blog;

import com.tianli.entity.User;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月8日 下午5:46:57  
 */
@Repository
public interface UserDao {
	
	User queryUserByName(String name);
	
	User queryUserById(int id);
	
	List<Blog>queryBlogListById(int id);
	
}
