import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with Intellij IDEA.
 * Description:集合
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 18:43
 */
public class TestDemo7 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<String>();
        arr.add("kk");
        arr.add("love");
        arr.add("jk");
        arr.add("pp");
        arr.add("jk");
//        System.out.println(arr.size());
//        System.out.println(arr.isEmpty());
//        arr.clear();
//        System.out.println(arr.size());
//        System.out.println(arr.isEmpty());
//        arr.remove("kk");
//        System.out.println(arr.contains("love"));
        arr.remove("jk");
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
