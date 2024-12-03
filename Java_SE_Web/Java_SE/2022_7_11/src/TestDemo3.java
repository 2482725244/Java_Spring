import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-11
 * Time: 20:46
 */
public class TestDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("tu.png");
        FileInputStream fis = new FileInputStream("D:\\tupian.png");
//        byte[] bys = new byte[3];
//        int len = 0;
//        len = fis.read(bys);
//        System.out.println(Arrays.toString(bys));
//        System.out.println(len);
//        len = fis.read(bys);
//        System.out.println(Arrays.toString(bys));
//        System.out.println(len);
//        len = fis.read(bys);                 //     abcd
//        System.out.println(Arrays.toString(bys));
//        System.out.println(len);
//        byte[] bys = new byte[4];
//        int len = 0;
//        while((len = fis.read(bys)) != -1){
//            fos.write(bys,0,len);
//            String s = new String(bys,0,len);
//            System.out.println(s);
//        }
//        fis.close();
//        fos.close();
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
