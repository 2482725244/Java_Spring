/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-22
 * Time: 18:20
 */
class An {
    void jk(){
//        new TestDemo5(){
//            public void nb(){
//              System.out.println("niubi");
//          }
//        }.nb();
        TestDemo5 t = new TestDemo5(){
            public void nb(){
                System.out.println("niubi");
            }
        };
        t.nb();
        t.nb();
        t.nb();
    }
}
public class TestDmo4 {
    public static void main(String[] args) {
        An a = new An();
        a.jk();
    }
}
