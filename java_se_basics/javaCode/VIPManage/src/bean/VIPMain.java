package bean;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 10:05
 */
public class VIPMain{

    private ArrayList<Man> vm = new ArrayList<Man>();

    public void  addMan(Man man){
        this.vm.add(man);
        //jdbc操作

    }

    public void seleseVIPMan(){
        System.out.println(vm);
        //jdbc操作

    }

    public ArrayList<Man> getVm() {
        return vm;
    }
}
