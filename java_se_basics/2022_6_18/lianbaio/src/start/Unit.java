package start;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-06-18
 * Time: 21:28
 */
public class Unit {
    private int data;
    Unit next = null;

    public Unit(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }

    public void setnext(Unit next) {
        this.next = next;
    }
    public Unit getnext(){
        return next;
    }
}
