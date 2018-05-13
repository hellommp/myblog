/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月8日 下午5:46:57 
 */
package com.tianli.dao;

import org.springframework.stereotype.Repository;
import com.tianli.entity.User;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月8日 下午5:46:57  
 */
@Repository
public interface UserDao {
	
	User queryUserByName(String name);
	
}
