import java.io.File;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 21:07
 */
public class TestDemo1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\itjava\\java.txt");
        System.out.println(f1);
        File f2 = new File("D:\\itjava","javase.txt");
        System.out.println(f2);
        File f3 = new File("D:\\itjava");
        File f4 = new File(f3,"javaee.txt");
        System.out.println(f4);
    }
}
