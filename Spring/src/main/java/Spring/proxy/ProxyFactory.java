package Spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object  calculatorimpl;

    public ProxyFactory(Object calculatorimpl) {
        this.calculatorimpl = calculatorimpl;
    }

    public Object getCalculatorimpl(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = calculatorimpl.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[日志] add 方法开始了，参数是：" +  Arrays.toString(args));
                //proxy表示代理对象，method表示要执行的方法，args表示要执行的方法的参数列表
                Object invoke = method.invoke(calculatorimpl, args);
                System.out.println("代理类");
                System.out.println("[日志] add 方法结束了，结果是：" + invoke);
                return invoke;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
