import java.io.File;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-07-09
 * Time: 22:58
 */
public class TestDemo5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\itjava\\dw");
        find(f1);
    }
    //查找文件夹中的文件
    public static void find(File f){
        if(f.delete()){
            System.out.println("该目录无内容");
        } else{
            File[] fis = f.listFiles();
            for(File file : fis){
                if(file.isFile()){
                    System.out.println(file.getAbsolutePath());
                } else{
                    find(file);
                }
            }
        }
    }
}
