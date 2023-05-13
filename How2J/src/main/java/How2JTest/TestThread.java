package How2JTest;

import charactor.Hero2;
import charactor.KillThread;

import java.io.File;

public class TestThread {

    public static void main(String[] args) {
        final Hero2 gareen = new Hero2();
        gareen.name = "盖伦";
        gareen.hp = 616;

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    gareen.hurt();

                    try {
                        //减慢掉血的速度
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();

                    try {
                        //加快回血的速度
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        };
        t2.start();
    }
}
