package Test;

import Spring.proxy.Calculator;
import Spring.proxy.Calculatorimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
    @Test
    public void testAspect(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        int add = calculator.sub(9, 2);
    }
}
