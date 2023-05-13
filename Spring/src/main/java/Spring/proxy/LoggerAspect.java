package Spring.proxy;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
//在切面中，需要通过指定的注解将方法标识为通知方法
@Aspect//将当前组件表示为切面
public class LoggerAspect {
    @Pointcut("execution(* Spring.proxy.Calculatorimpl.*(..))")
    public void pointcut(){}
    //Before前置通知，在目标对象之前执行
    @Before("pointcut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取方法名
        Signature signature = joinPoint.getSignature();
        //获取方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("方法名："+signature.getName());
        System.out.println("参数："+ Arrays.toString(args));
    }

    @After("pointcut()")
    public void afterAdviceMethod(){
        System.out.println("后置通知");
    }

    @AfterReturning("pointcut()")
    public void afterReturningAdviceMethod(){
        System.out.println("返回通知");
    }
}
