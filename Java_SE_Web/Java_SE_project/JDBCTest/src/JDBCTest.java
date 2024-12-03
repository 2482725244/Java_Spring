import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:JDBC集合测试--基础测试--JDBC自动提交问题
 * User: WUHONGYUN
 * Date: 2022-12-09
 * Time: 8:15
 */
public class JDBCTest {
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        ResultSet res = null;

        //配置文件参数设置
        int sum = 0;
        String url = "jdbc:mysql://localhost:3306/test001";
        String user = "root";
        String pwd = "111111";

        try {
            //注册驱动
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            con = DriverManager.getConnection(url,user,pwd);
            con.setAutoCommit(false);
            //创建数据库操作对象
            state = con.createStatement();
            //执行sql语句
            String sql1 = "update money set money = 10000 where id =1";
            sum += state.executeUpdate(sql1);

//            int[] arr = new int[2];
//            int p = arr[2];

            String sql2 = "update money set money = 10000 where id = 2";
            sum += state.executeUpdate(sql2);


            System.out.println(sum==2?"转账成功":"转账失败");
            con.commit();
        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally{
            if(res != null){
                try{
                    res.close();
                }catch (Exception exc){
                    exc.printStackTrace();
                }
            }
            if(state != null){
                try{
                    state.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(con != null){
                try{
                    con.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
