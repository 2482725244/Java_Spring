import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:加密文字
 * User: 吴洪赟
 * Date: 2022-07-10
 * Time: 21:34
 */
public class TestDemo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段需要加密的文字");
        System.out.println("请保证你输入的文字个数为偶数！");
        String s = sc.nextLine();
        byte[] bys = s.getBytes("utf-8");
        String ss = new String(bys,"gbk");
        System.out.println("你获得的加密文字为：" + ss);
    }
}
