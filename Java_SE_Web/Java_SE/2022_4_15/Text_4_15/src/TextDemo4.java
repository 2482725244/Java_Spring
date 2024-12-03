/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-04-23
 * Time: 11:26
 */
class Ku {
    public int a = 2;
    private int b = 2;
    public static int c = 1;
    public void fx() {
        System.out.println("ok");
    }
    public Ku(int a) {
        System.out.println("kk");
    }
}
class Zi extends Ku{
    public Zi() {
        super(1);
        super.a = 6;
        super.c = 3;
        System.out.println("zz");
    }

}
public class TextDemo4 {
//    private static int ff() {
//        return 1;
//    }
    public static void main(String[] args) {
        Zi s1 = new Zi();
        Ku s2 = new Ku(1);
        System.out.println(s1.a);
        System.out.println(s2.a);
//       int ret =  ff();
//       Zi.c = 6;
//       Ku.c = 3;
//        System.out.println(Zi.c);
//        System.out.println(Ku.c);
    }
}
