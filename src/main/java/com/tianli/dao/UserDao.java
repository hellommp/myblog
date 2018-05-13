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
	
	//通过名字查询用户
	User queryUserByName(String name);
	
	//通过id查询用户
	User queryUserById(int id);
	
	//通过id查询所有博客
	List<Blog>queryBlogListById(int id);
	
}
