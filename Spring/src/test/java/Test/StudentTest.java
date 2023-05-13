package Test;

import Spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("SpringTest.xml");
        //获取IOC中的bean
        Student student = ioc.getBean("Student", Student.class);

       System.out.println(student);
    }
}
