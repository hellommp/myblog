import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.dao.BlogDao;
import com.tianli.entity.Blog;
import com.tianli.entity.Category;
import com.tianli.entity.User;
import com.tianli.util.DateUtil;

/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午3:43:28 
 */

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午3:43:28  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BlogDaoTest {
	
	@Autowired
	BlogDao blogDao;
	
	@Test
	public void insertBlogTest(){
		Blog blog = new Blog();
		Category category = new Category();
		User user = new User();
		user.setId(1);
		category.setId(1);
		
		blog.setCategory(category);
		blog.setContent("hello");
		blog.setKeyWord("java");
		blog.setPublishDate(DateUtil.d2t(new Date()));
		blog.setTitle("321");
		blog.setUser(user);
		
		blogDao.addBlog(blog);
	}
	
}
