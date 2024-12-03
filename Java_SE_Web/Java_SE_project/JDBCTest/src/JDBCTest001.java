import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:JDBC集合测试--基础测试
 * User: WUHONGYUN
 * Date: 2022-12-09
 * Time: 8:15
 */
public class JDBCTest001 {
    public static void main(String[] args) {
        Connection con = null;
        Statement state = null;
        ResultSet res = null;

        //配置文件参数设置
        String url = "jdbc:mysql://localhost:3306/test001";
        String user = "root";
        String pwd = "111111";

        try {
            //注册驱动
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            con = DriverManager.getConnection(url,user,pwd);
            //创建数据库操作对象
            state = con.createStatement();
            //执行sql语句--获取查询结果集
            String sql = "select * from tt";
            res = state.executeQuery(sql);
            while(res.next()){
                int id = res.getInt("id");
                String type = res.getString("type");
                int sum = res.getInt("sum");
                String name = res.getString("name");
                System.out.println(id+type+sum+name);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
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
