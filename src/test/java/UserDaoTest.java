

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.dao.UserDao;
import com.tianli.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
	
	@Autowired
	UserDao userDao;
	
	@Test
	public void queryByIdTest() throws Exception{
		String  name = "lse";
		User user = userDao.queryUserByName(name);
		System.out.println(user);
	}
}
