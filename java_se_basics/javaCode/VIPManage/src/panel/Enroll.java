package panel;

import bean.Man;
import bean.OrdinaryMan;
import bean.VIPMain;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 10:02
 */
public class Enroll extends Panel{

    Scanner sc = new Scanner(System.in);
    private int state;
    private String name;
    private String sex;
    private int age;
    private String user;
    private String passWord;
    private OrdinaryMan oml;
    private VIPMain vml;

    public Enroll(OrdinaryMan oml, VIPMain vml) {
        this.oml = oml;
        this.vml = vml;
    }

    @Override
    public void index() {
        System.out.println("请输入你的姓名");
        name = sc.next();

        System.out.println("请设置你的账号");
        user = sc.next();

        System.out.println("请设置你的密码");
        passWord = sc.next();

        System.out.println("请输入你的性别");
        sex = sc.next();

        System.out.println("请输入你的年龄");
        age = sc.nextInt();

        System.out.println("是否成为会员");
        System.out.println("确定选择-->1");
        System.out.println("取消选择-->2");
        state = sc.nextInt();

        if(state == 1){
            Man m = new Man(name, sex, age, user, passWord,state);

            vml.addMan(m);


            System.out.println("恭喜您成为尊贵的会员");
        }else{

            Man m = new Man(name, sex, age, user, passWord,state);

            oml.addMan(m);
            System.out.println("注册成功");
        }


    }
}
