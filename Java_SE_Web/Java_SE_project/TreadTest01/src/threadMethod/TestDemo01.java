package threadMethod;

/**
 * Created with IntelliJ IDEA.
 * Descripetion: sleep,inte
 * User: WUHONGYUN
 * Date: 2022-12-20
 * Time: 9:02
 */
public class TestDemo01 {


    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable());
        String tName =  t.getName();
        System.out.println(tName);
        t.setName("t1");
        tName = t.getName();
        System.out.println(tName);

        Thread m = Thread.currentThread();
        tName = m.getName();
        System.out.println(tName);
        m.setName("zhuhanshu");
        tName = m.getName();
        System.out.println(tName);

        t.start();
        System.out.println("主线程");


    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName());

            System.out.println("分支线程");
        }
    }
}