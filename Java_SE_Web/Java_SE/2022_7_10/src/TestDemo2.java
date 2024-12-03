import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:文字解码
 * User: 吴洪赟
 * Date: 2022-07-10
 * Time: 21:27
 */
public class TestDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要解码的文字");
        String s = sc.nextLine();
        byte[] bys = s.getBytes("gbk");
        String ss = new String(bys,"utf-8");
        System.out.println("你解码的文字为：" + ss);
    }
}
