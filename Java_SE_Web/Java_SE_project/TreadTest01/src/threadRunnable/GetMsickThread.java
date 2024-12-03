package threadRunnable;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2022-12-19
 * Time: 14:45
 */
public class GetMsickThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("分支线程--》我在执行获取背景音乐");
        }
    }
}
