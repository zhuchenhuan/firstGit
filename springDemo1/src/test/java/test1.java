import com.ahua.factory.UserServiceFactory1;
import com.ahua.service.IUserService;
import com.ahua.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //new实现类
        IUserService userService = (IUserService)context.getBean("userService");
        userService.add();
        System.out.println(userService);


        //静态工厂
        IUserService userService2 = (IUserService) context.getBean("userService2", IUserService.class);
        userService2.add();
        System.out.println(userService2);

        //实例工厂
        IUserService userService3 = (IUserService) context.getBean("userService3");
        userService3.add();
    }
}
