/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-04-26
 * Time: 18:15
 */

class Kuhs {
    public int a = 1;
    public void fx() {
        System.out.println("Zu Bei");
    }
}

class Son extends Kuhs {
    public Son() {
        super();
        super.a = 2;
    }
    @Override
    public void fx() {
        System.out.println("Eat");
    }
    public void eat() {
        System.out.println("hui Chi");
    }
}


class Som extends Kuhs {

    public Som() {
        super();
    }
    public void fly() {
        System.out.println("hui fei");
    }
    public void fx() {
        System.out.println("Wo De Fly!");
    }
}

public class TextDemo1 {
    public static void main(String[] args) {
//        Kuhs s1 = new Son();
//        s1.a = 5;
//        System.out.println(s1.a);
//        s1.fx();
//        Kuhs s2 = new Kuhs();
//        s2.fx();
//        Son s3 = new Son();
//        s3.fx();
//        Kuhs s1 = new Son();
//        s1.fx();
//        Kuhs s2 = new Som();
//        s2.fx();
//        System.out.println(s2.a);
        //向下转型

//        Kuhs s1 = new Son();
//        Son s2 = (Son)s1;
//        s2.eat();

//        Kuhs s1 = new Kuhs();
//        Som s2 = new Som();
//        s2 = (Som)s1;
//        s2.fx();

//        Kuhs s1 = new Som();
//        System.out.println(s1.a);
//        Kuhs s1 = new Som();
//        Som s2 = (Som)s1;
//        s2.fly();
//        Kuhs s1 = new Som();
//        System.out.println(s1 instanceof Son);
        //传参法
//        Som s2 = new Som();
//        jk(s2);
        //返回值法
//        Kuhs s1 = jk();
//        s1.fx();
        //多态
//        Kuhs s1 = new Som();
//        Kuhs s2 = new Son();
//        jk(s1);
//        jk(s2);
       //类引用数组
//        Kuhs[] s1 = {new Som(), new Son()};
//        s1[0].fx();
//        s1[1].fx();
//        for (Kuhs ps:s1) {
//            ps.fx();

        }
        //    public static void jk(Kuhs ps) {
        //        ps.fx();
        //    }
        //    public static void jk(Kuhs s1) {
        //        s1.fx();
        //    }
        //    public static Kuhs jk() {
        //        return new Som();
        //    }
    }


