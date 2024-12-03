/**
 * Created with Intellij IDEA.
 * Description:Math类
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 18:31
 */
public class TestDemo6 {
    public static void main(String[] args) {
        int p1 = -9;
        int p2 = 9;
        int m1 = Math.abs(p1);
        int m2 = Math.abs(p2);
        System.out.println(m1);
        System.out.println(m2);
        double d1 = 12.34;
        double d2 = 12.56;
        System.out.println(Math.ceil(d1));
        System.out.println(Math.ceil(d2));
        double d3 = 12.34;
        double d4 = 12.56;
        System.out.println(Math.floor(d3));
        System.out.println(Math.floor(d4));
        double d5 = 12.34;
        double d6 = 12.56;
        System.out.println(Math.round(d5));
        System.out.println(Math.round(d6));
        double d7 = 12.34;
        double d8 = 12.56;
        System.out.println(Math.max(d7,d8));
        System.out.println(Math.min(d7,d8));
        double d9 = 2.0;
        double d0 = 3.0;
        System.out.println(Math.pow(d9,d0));
        System.out.println((int)(Math.random()*100));
    }
}
