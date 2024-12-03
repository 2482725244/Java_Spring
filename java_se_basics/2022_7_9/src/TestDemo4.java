import java.io.File;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 22:10
 */
public class TestDemo4 {
    public static void main(String[] args) {
//        File f1 = new File("D:\\itjava\\javase.txt");
//        System.out.println(f1.delete());
//        File f2 = new File("D:\\itjava\\you");
//        File f3 = new File("D:\\itjava\\you\\pe.txt");
//
//        System.out.println(f3.delete());
//        System.out.println(f2.delete());



        File f1 = new File("D:\\itjava\\dw");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
//        System.out.println(f1.delete());
        Delete(f1);



    }
    //  删文件夹
    public static void Delete(File f){
        if(f.delete()){
            System.out.println("删除空文件夹成功");
        } else{
            File[] fis = f.listFiles();
            for(File file : fis){
                if(file.isFile()){
                    System.out.println(file.delete());
                } else{
                    Delete(file);
                }
            }
            f.delete();
        }
    }
}
