package start;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-18
 * Time: 21:26
 */
public class List {
    //记录节点数量
    private int number;


    //创建新节点
    private Unit addUnit(int data){
        return new Unit(data);
    }

    //头插一个新节点
    public Unit frontPush(int data, Unit head){
        if(head == null){
            number++;
            return new Unit(data);
        }
        number++;
        Unit prev = addUnit(data);
        prev.setnext(head);
        return prev;
    }
    //显示
    public void listDisplay(Unit head){
        for(int i = 0; i < number; i++){
            System.out.println(head.getData());
            head = head.getnext();
        }
    }
}
