/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-04-23
 * Time: 11:04
 */

class Text {
           public int a;
           private int b;
           static int c;
           private int ai() {
               return 1;
           }
           private static int mi() {
               return 5;
           }
           public static int ni() {
               return 1;
           }
           public Text() {
               this(2,3);
//               this(2,3);
               int p = this.ai();
                this.a = 6;
                this.b = 3;


               System.out.println("gouzao--1");
           }
           public Text(int a, int x) {
               System.out.println("G2");
           }
        }
public class TextDome3 {
    public static void main(String[] args) {
        Text s1 = new Text();
        //Text s2 = new Text(2,3);
    }
}
