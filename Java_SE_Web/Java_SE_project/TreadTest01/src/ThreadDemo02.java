import threadRunnable.GetMsickThread;
import threadRunnable.GetXuanranThread;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:创建线程的第二种方法
 * User: WUHONGYUN
 * Date: 2022-12-19
 * Time: 14:33
 */
public class ThreadDemo02 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new GetMsickThread());
        Thread t2 = new Thread(new GetInternet());
        Thread t3 = new Thread(new GetXuanranThread());

        t1.start();

        for (int i = 0; i < 1000; i++){
            System.out.println("未执行下一个线程创建");
        }

        t2.start();
        t3.start();




        for (int i = 0; i < 1000; i++){
            System.out.println("主线程--》我在执行主操作");
        }
    }
}

class GetInternet implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            System.out.println("分支线程--》我在执行网络操作");
        }
    }
}
