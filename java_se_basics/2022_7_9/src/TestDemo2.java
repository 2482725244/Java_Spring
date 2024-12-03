import java.io.File;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 21:16
 */
public class TestDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\itjava\\javase.txt");
        System.out.println(f1.createNewFile());
        File f2 = new File("D:\\itjava\\javaee");
        System.out.println(f2.mkdir());
        File f3 = new File("D:\\itjava\\javame\\itse");
        System.out.println(f3.mkdirs());
        File f4 = new File("D:\\itjava\\javaee\\yuto.txt");
        System.out.println(f4.mkdir());
        File f5 = new File("javaee\\hao");
        System.out.println(f5.mkdirs());
        File f6 = new File("D:\\itjava\\javaee\\je\\yute.txt");
        System.out.println(f6.mkdirs());
        File f11 = new File("jk");
        System.out.println(f11.mkdir());
        File f12 = new File("src\\TestDemo3.java");
        System.out.println(f12.createNewFile());
    }
}
