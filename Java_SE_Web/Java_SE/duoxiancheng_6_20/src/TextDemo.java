/**
 * Created with Intellij IDEA.
 * Description:多线程
 * User: 吴洪赟
 * Date: 2022-06-20
 * Time: 19:04
 */
public class TextDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("-->新线程");
        }
    }

    public static void main(String[] args) {
        TextDemo t1 = new TextDemo();
        t1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程<--");
        }
    }
}
