package threadMethod;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2022-12-20
 * Time: 9:52
 */
public class TestDemo02 {
    public static void main(String[] args) {


        MyRunnable1 r = new MyRunnable1();
        Thread t1 = new Thread(r);
        t1.setName("t1");
        t1.start();

        for (int i = 0; i < 10000; i++) {
           /* if(i == 5000){
                t1.stop();
            }*/

            if(i == 5000) {
                r.run = false;
            }
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + i);
        }

       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

//        t1.interrupt();

    }
}

class MyRunnable1 implements Runnable{

    boolean run = true;

    @Override
    public void run() {
      /*  try {
            Thread.sleep(1000 * 60 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        for (int i = 0; i < 10000; i++) {
            if(run){
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + i);
            }else{

                //保存

                return;
            }

        }
    }
}
