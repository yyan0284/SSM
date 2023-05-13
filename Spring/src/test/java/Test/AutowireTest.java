package Test;

import Spring.pojo.Controller.UserController;
import Spring.pojo.DAO.UserDao;
import Spring.pojo.Service.UserService;
import Spring.pojo.Service.impl.UserSeviceimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("SpringTest.xml");
        UserController userController = ioc.getBean(UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean(UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean(UserDao.class);
//        System.out.println(userDao);
        userController.saveUser();
    }

}
