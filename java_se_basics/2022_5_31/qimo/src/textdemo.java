
class YinHang {
    public double yve = 100.0;
    public String password ="qwert";
    public String name = "招商银行";
    public YinHang() {
        yve -= 10;
    }
    public void kaihu(){
        System.out.println("小梦开户成功，账户余额" + yve);
    }
    public void cunqian(double m){
        this.yve = yve + m;
        System.out.println("小梦你好，您的帐户存入" + m+ "元，" + "当前余额"+yve +"元");
    }
    public void Password(String password){
            boolean b = this.password.equals(password);
            if(!b){
                System.out.println("您输入的密码错误");
            }
    }
    public void Hua(double hua){
        if (hua > yve){
            System.out.println("对不起，余额不足！");
        }else {
            yve = yve - hua;
            System.out.println("小梦你好，您的账户已取出" + hua +"元，"+ "当前余额" +yve +"元");
        }
    }
    public void end(){
        System.out.println("请带好随身财务，欢迎下次光临"+ name +"------------");
    }
}
public class textdemo {
    public static void main(String[] args) {
        YinHang person = new YinHang();
        System.out.println("欢迎来到"+person.name+"-----------------");
        person.kaihu();
        person.cunqian(500);
        person.Password("123456");
        person.Hua(3000.0);
        person.Hua(200.0);
        person.end();
    }
}
