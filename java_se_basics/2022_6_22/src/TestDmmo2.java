/**
 * Created with Intellij IDEA.
 * Description:内部类
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 17:52
 */

class Person {
    private int cont = 1;
    public class Son{
        public void say(){
            cont = 6;
            System.out.println("feixiang");
            System.out.println(cont);
        }
    }
    public void ps(){
        Son s = new Son();
        s.say();
    }
}
public class TestDmmo2 {
    public static void main(String[] args) {
        Person.Son t = new Person().new Son();
        t.say();
        Person s = new Person();
        s.ps();
    }
}
