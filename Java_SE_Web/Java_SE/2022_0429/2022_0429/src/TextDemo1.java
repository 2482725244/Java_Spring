/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * 主题：字符串类型
 * Date: 2022-04-29
 * Time: 18:12
 */
public class TextDemo1 {
    public static void jk(String s1, char[] val) {
        s1 = "abcdef";
        val[0] = 'q';
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello").intern();
        System.out.println(s1 == s2);
//        System.out.println("hello word");
//        String s1 = "hello";
//        String s2 = new String("hello");
//        char[] val = {'h','e','l','l','o'};
//        String s3 = new String(val);
//        String s4 = null;
//        String s5 = new String("hel") + "lo";
//        System.out.println(s5.equals(s4));
//        System.out.println(s1.equals(s5));
//        System.out.println(s1.equals(s2));

//        System.out.println(s1.equals(val));
//        System.out.println("hello".equals(s2));
//        System.out.println(s4.equals(s1));
//        String s1 = "hello";
//        char[] val = {'a'};
//        jk(s1, val);
//        System.out.println(s1);
//        System.out.println(val[0]);
//        String s1 = "hello";
//        String s2 = "hel" + "lo";
//        String s3 = new String("hel") + "lo";
//        System.out.println(s1 == s2);//true
//        System.out.println(s1 == s3);//false
//        System.out.println(s2 == s3);//false



//        String s1 = "hello";
//        String s2 = new String("hello");
//        char[] arr = {'h','e','l','l','o'};

//        System.out.println("hello" == s1);
//        String s3 = new String(arr);
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
    }
}
