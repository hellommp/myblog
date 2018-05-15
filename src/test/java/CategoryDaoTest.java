import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.dao.CategoryDao;



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
public class CategoryDaoTest {
	
	@Autowired
	CategoryDao categoryDao;
	
	@Test
	public void addCategory(){
		String  name = "hello";
		categoryDao.addCategory(name);
	}
	@Test
	public void deleteCategory(){
		int id = 2;
		categoryDao.deleteCategory(id);
	}
}
