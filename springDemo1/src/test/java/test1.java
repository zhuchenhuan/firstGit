import com.ahua.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IUserService userService = (IUserService)context.getBean("userService");
        userService.add();
        System.out.println(userService);
    }
}
