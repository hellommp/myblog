/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:57:34 
 */
package com.tianli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianli.dao.UserDao;
import com.tianli.entity.User;
import com.tianli.service.UserService;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月8日 下午5:57:34  
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public User getUserByName(String name) {
		
		return userDao.queryUserByName(name);
	}


	@Override
	public User getUserById(Integer id) {
		
		return userDao.queryUserById(id);
	}

}
