package bean;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 10:05
 */
public class OrdinaryMan{

    private ArrayList<Man> om = new ArrayList<Man>();

    public void  addMan(Man man){
        this.om.add(man);
        //jdbc操作
        //insert into ***(**,**,**) value();
    }

    public void seleseOrdinaryMan(){
        System.out.println(om);
        //jdbc操作
        //select ***,***from *** where state = 1;
    }

    public ArrayList<Man> getOm() {
        return om;
    }
}
