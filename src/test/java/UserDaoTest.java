

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.dao.UserDao;
import com.tianli.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserDaoTest {
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void queryByIdTest() throws Exception{
		int id = 1;
		User user = userDao.queryUserById(id);
		System.out.println(user);
	}
}
