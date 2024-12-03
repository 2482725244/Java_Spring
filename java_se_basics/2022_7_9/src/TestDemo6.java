import java.io.File;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 23:13
 */
public class TestDemo6 {
    public static void main(String[] args) {
        File f1 = new File("D:\\itjava\\kong");
//        System.out.println(f1.exists());
        File[] fs = f1.listFiles();
        for(File fl : fs){
            System.out.println(fl.getPath());
        }

    }
}
