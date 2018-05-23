/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:55:28 
 */
package com.tianli.service;

import com.tianli.entity.User;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月8日 下午5:55:28  
 */
public interface UserService {
	
	User getUserByName(String name);
	
	User getUserById(Integer id);
}
