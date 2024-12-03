import bean.Man;
import bean.OrdinaryMan;
import bean.VIPMain;
import panel.Enroll;
import panel.Login;
import panel.Panel;
import utill.Taverse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 9:45
 */
public class IndexMain {

    static VIPMain vml;
    static OrdinaryMan oml;

    private static int choose = -1;
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        initList();
        while(choose != 0){
            choose = display() ;
            index(choose);
        }



    }

    private static void initList() {
        vml = new VIPMain();
        oml = new OrdinaryMan();
    }

    private static void index(int choose) {
        Panel p = null;
        if(choose == 1){
            p = new Login();
        }else if(choose == 2){
            p = new Enroll(oml,vml);
        }else if(choose == 3){
            Taverse.traverseArray(vml.getVm());
        }else if(choose == 4){
            Taverse.traverseArray(oml.getOm());
        }

        if(p != null){
            p.index();
        }
    }

    private static int display() {
        int choose = 0;

        System.out.println("登陆界面--->请选择");
        System.out.println("登录-->1");
        System.out.println("注册-->2");
        System.out.println("查看会员名单-->3");
        System.out.println("查看普通人员名单-->4");
        System.out.println("退出-->0");

        choose = sc.nextInt();
        return choose;

    }
}
