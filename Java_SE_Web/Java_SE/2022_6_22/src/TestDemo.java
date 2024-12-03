import java.util.ArrayList;

/**
 * Created with Intellij IDEA.
 * Description:Arraylist
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 17:01
 */
public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("word");
        arr.add("java");
        arr.add("you");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }


        arr.add(1,"javase");


        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println(arr.size());

        System.out.println(arr.set(4,"tou"));
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("----------");
        arr.remove("java");

        arr.remove(0);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
