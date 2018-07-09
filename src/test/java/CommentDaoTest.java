import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tianli.dao.BlogDao;
import com.tianli.dao.CommentDao;
import com.tianli.entity.Blog;
import com.tianli.entity.Category;
import com.tianli.entity.Comment;
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
public class CommentDaoTest {
	
	@Autowired
	CommentDao commentDao;
	
	/*@Test
	public void addCommentTest(){
		commentDao.addComment("666", DateUtil.d2t(new Date()), 2);
		commentDao.addComment("777", DateUtil.d2t(new Date()), 2);
	}*/
	
	@Test
	public void queryCommentsByIdTest(){
		ArrayList<Comment>list = commentDao.queryCommentsById(2);
		System.out.println(list.toString());
	}
	
	@Test
	public void deleteCommentTest(){
		commentDao.deleteComment(1);
	}
}
