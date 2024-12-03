import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-11
 * Time: 20:21
 */
public class TestDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");
//        byte by = (byte) fis.read();
//        System.out.println(by);
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
//        by = (byte) fis.read();
//        System.out.println(by);
        int by = 0;
        while((by = fis.read()) != -1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
