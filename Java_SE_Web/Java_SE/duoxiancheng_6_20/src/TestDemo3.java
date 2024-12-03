/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-20
 * Time: 19:25
 */
public class TestDemo3 implements Runnable{
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 80; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TestDemo3 t1 = new TestDemo3();
        TestDemo3 t2 = new TestDemo3();
        TestDemo3 t3 = new TestDemo3();
        new Thread(t1,"aa").start();
        new Thread(t2,"bb").start();
        new Thread(t3,"cc").start();

    }
}
