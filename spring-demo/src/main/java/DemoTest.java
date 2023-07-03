import com.cmc.onfig.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chengmingchao
 * @date 2022/12/16 13:52
 */
public class DemoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object bean = applicationContext.getBean("user");
		System.out.println(bean);
	}
}
