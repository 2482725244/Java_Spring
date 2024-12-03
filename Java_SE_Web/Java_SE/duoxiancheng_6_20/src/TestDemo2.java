/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-20
 * Time: 19:11
 */
public class TestDemo2 implements Runnable{
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("-->>新线程" + i + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TestDemo2 t = new TestDemo2();
        new Thread(t,"兔子").start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程<<--" + i);
        }
    }
}
