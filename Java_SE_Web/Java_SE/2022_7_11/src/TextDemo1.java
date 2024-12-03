import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-11
 * Time: 20:08
 */
public class TextDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("put.txt");
        for (int i = 0; i < 10; i++){
            fos.write("hello".getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
    }
}
