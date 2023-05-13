package Spring.proxy;

public class CalculatorStaticProxy implements Calculator {
    private Calculatorimpl calculatorimpl;

    public CalculatorStaticProxy(Calculatorimpl calculatorimpl) {
        this.calculatorimpl = calculatorimpl;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
        int add = calculatorimpl.add(i, j);
        System.out.println("代理类");
        System.out.println("[日志] add 方法结束了，结果是：" + add);
        return add;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        int sub = calculatorimpl.sub(i, j);
        System.out.println("代理类");
        System.out.println("[日志] sub 方法结束了，结果是：" +sub);
        return sub;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
        int mul = calculatorimpl.mul(i, j);
        System.out.println("代理类");
        System.out.println("[日志] mul 方法结束了，结果是：" +mul);
        return mul;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int div = calculatorimpl.div(i, j);
        System.out.println("代理类");
        System.out.println("[日志] div 方法结束了，结果是：" + div);
        return div;
    }
}
