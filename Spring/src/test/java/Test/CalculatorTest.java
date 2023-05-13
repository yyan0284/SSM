package Test;

import Spring.proxy.Calculator;
import Spring.proxy.CalculatorStaticProxy;
import Spring.proxy.Calculatorimpl;
import Spring.proxy.ProxyFactory;

public class CalculatorTest {
    public static void main(String[] args) {
//        CalculatorStaticProxy C1 = new CalculatorStaticProxy(new Calculatorimpl());
//        int add = C1.add(1, 2);

        ProxyFactory proxyFactory = new ProxyFactory(new Calculatorimpl());
       Calculator proxyFactoryCalculatorimpl = (Calculator) proxyFactory.getCalculatorimpl();

       proxyFactoryCalculatorimpl.add(1,2);

    }
}
