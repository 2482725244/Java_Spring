package user;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-09-03
 * Time: 9:46
 */
public class Ope {
    Panel pl = null;
    Scanner sc = new Scanner(System.in);
    private int choose;
    private String name;
    private String getPassWord;
    private String adminPassword = "qq111111";
    public void indexPrint(){
        System.out.println("欢迎进入图书管理系统");
        System.out.println("请输入你的名字");
        name = sc.nextLine();
        System.out.println("欢迎<" + name + ">进入图书管理系统");
        System.out.println("请选择你的身份");
        System.out.println("-->1.管理员");
        System.out.println("-->2.学生");
        choose = sc.nextInt();
    }
    public void choosePanel(){
        if(choose == 1){

            int fre = 3;
            for (int i = 0; i < 3; i++) {

                System.out.println("请输入管理员密码");
                getPassWord = sc.next();

                if(getPassWord.equals(adminPassword)){

                    pl = new AdminPanel();
                    System.out.println("身份确认成功");
                    System.out.println("已帮您开启管理员权限");
                    break;

                } else{

                    fre--;
                    System.out.println("对不起，你的管理员密码错误");
                    System.out.println("请重试，您还有" + fre + "次机会");

                }
            }

        } else if(choose == 2) {
            pl = new UserPanel();
        } else {
            System.out.println("输入错误");
        }

        if(pl == null){
            System.out.println("程序异常失败");
        } else {
            System.out.println("请开始你的管理员操作");
        }
    }
    public void psonPanel(){
        pl.choise();
    }
}
