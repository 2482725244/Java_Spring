import start.List;
import start.Unit;

/**
 * Created with Intellij IDEA.
 * Description:单链表实验操作（未完成）
 * User: 吴洪赟
 * Date: 2022-06-18
 * Time: 21:21
 */
public class TestMain {
    public static void main(String[] args) {
        List utl = new List();
        Unit head = null;
        head = utl.frontPush(1,head);
        head = utl.frontPush(2,head);
        head = utl.frontPush(3,head);
        head = utl.frontPush(4,head);
        utl.listDisplay(head);

    }
}
