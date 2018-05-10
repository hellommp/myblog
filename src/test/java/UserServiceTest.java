import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.entity.User;
import com.tianli.service.UserService;

/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月10日 下午9:22:55 
 */

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月10日 下午9:22:55  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Test
	public void getUserByName(){
		
		String name = "lse";
		
		User user = userService.getUser(name);
		
		System.out.println(user);
	}
}
