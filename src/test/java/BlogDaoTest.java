import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
	@Test
	public void updateBlogTest(){
		int id = 1;
		String content = "demo";
		//blogDao.refreshBlog(id, content);
	}
	
	@Test
	public void queryBlogByIdTest(){
		int id = 1;
		Blog blog = blogDao.queryBlogById(id);
		System.out.println(blog);
	}
	
	@Test
	public void deleteBlogTest(){
		int id = 1;
		blogDao.deleteBlog(id);
	}
	@Test 
	public void listBlogTest(){
		Map<String,Object>map = new HashMap<String, Object>();
		map.put("start",1);
		map.put("end", 5);
		System.out.println(blogDao.listBlog(map));
	}
}
