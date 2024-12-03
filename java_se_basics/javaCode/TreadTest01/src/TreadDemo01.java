/**
 * Created with IntelliJ IDEA.
 * Descripetion：创建线程的第一种方法
 * User: WUHONGYUN
 * Date: 2022-12-19
 * Time: 14:25
 */
public class TreadDemo01 {
    public static void main(String[] args) {

        MyThread m = new MyThread();

        m.start();


        for (int i = 0; i < 1000; i++){
            System.out.println("主线程-->"+i);
        }
    }
}


class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("分支线程-->"+i);
        }
    }
}
