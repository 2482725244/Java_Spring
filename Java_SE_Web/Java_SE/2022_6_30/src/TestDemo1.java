/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-30
 * Time: 8:24
 */
public class TestDemo1 {
    //求某月的兔子数
    public static int fx(int n){
        if(n == 1 || n == 2){
            return 1;
        } else {
            return fx(n-2) + fx(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fx(5));//11235;
    }
}
