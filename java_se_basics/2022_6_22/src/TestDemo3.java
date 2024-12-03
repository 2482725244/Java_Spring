/**
 * Created with Intellij IDEA.
 * Description:局部内部类
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 18:14
 */
class Person1 {
    private int cont = 1;
    void pp(){
        class Son1 {
            void pj(){
                System.out.println(cont);
                System.out.println("neibu");
            }
        }
        Son1 e = new Son1();
        e.pj();
    }
}


public class TestDemo3 {
    public static void main(String[] args) {
        Person1 s = new Person1();
        s.pp();
    }
}
