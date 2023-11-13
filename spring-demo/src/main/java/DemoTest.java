import com.cmc.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chengmingchao
 * @date 2022/12/16 13:52
 */
@SuppressWarnings("all")
public class DemoTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) classPathXmlApplicationContext.getBean("user");
		System.out.println(user.getBeanName());
	}
}
