/**
 * Created with IntelliJ IDEA.
 * Descripetion:匿名内部类
 * User: WUHONGYUN
 * Date: 2022-12-19
 * Time: 14:52
 */
public class ThreadDemo03 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<1000; i++){
                    System.out.println("分支线程--》");
                }
            }
        });

        t.start();

        for (int i = 0; i < 1000; i++)
        {
            System.out.println("主线程--》");
        }

    }
}
