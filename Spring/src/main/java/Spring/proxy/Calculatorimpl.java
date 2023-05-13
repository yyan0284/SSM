package Spring.proxy;

import org.springframework.stereotype.Component;

@Component
public class Calculatorimpl implements Calculator{
    public int add(int i, int j){

        int result = i+j;
        System.out.println("本体类:做加法运算");

        return result;

    };

    @Override
    public int sub(int i, int j) {

        int result = i-j;
        System.out.println("本体类:做减法运算");

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i*j;
        System.out.println("本体类 做乘法运算:");

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i/j;
        System.out.println("本体类 做除法运算:");

        return result;
    }
}
