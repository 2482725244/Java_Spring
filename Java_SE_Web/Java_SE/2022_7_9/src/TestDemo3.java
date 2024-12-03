import java.io.File;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 21:45
 */
public class TestDemo3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\itjava");
        System.out.println(f1.isDirectory());
        File f2 = new File("D:\\itjava\\javase.txt");
        System.out.println(f2.isDirectory());
        System.out.println("-------------");
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());
        System.out.println("-------------");
        File f3 = new File("D:\\itjava\\yu.txt");
        File f4 = new File("D:\\itjava\\javase.txt");
        System.out.println(f3.exists());
        System.out.println(f4.exists());
        System.out.println("-------------");
        System.out.println(f3.getAbsolutePath());
        System.out.println(f4.getPath());
        System.out.println("-------------");
        System.out.println(f3.getName());
        System.out.println("-------------");
        File f5 = new File("D:\\itjava");
        String[] arr = f5.list();
        for(String str : arr){
            System.out.println(str);
        }
        File[] fis = f5.listFiles();
        for(File f : fis){
            if(f.isFile()){
                System.out.println(f.getAbsolutePath());
            }
        }
        File f11 = new File("D:\\itjava\\jkl");
        System.out.println(f11.createNewFile());

        File f22 = new File("D:\\itjava\\javame\\itse");
        File[] fiss = f22.listFiles();
        System.out.println(fiss==null);



    }
}
