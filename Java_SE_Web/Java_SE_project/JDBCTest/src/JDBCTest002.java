import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2022-12-09
 * Time: 10:14
 */
public class JDBCTest002 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        //配置文件属性
        String url = "jdbc:mysql://localhost:3306/test001";
        String user  = "root";
        String pwd = "111111";

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            con = DriverManager.getConnection(url,user,pwd);
            con.setAutoCommit(false);
            //创建预编译的数据库操作对象
            String sql = "select * from money";
            ps = con.prepareStatement(sql);
            //执行sql语句
            res = ps.executeQuery();
            while(res.next()){
                int id = res.getInt("id");
                String name = res.getString("name");
                int money  = res.getInt("money");
                System.out.println(id+", "+name+", "+money);
            }

            String sql3 = "update money set money = ? where id = ?";
            ps = con.prepareStatement(sql3);
            ps.setInt(1,50000);
            ps.setInt(2,2);
            ps.executeUpdate();


            ps.setInt(1,1000);
            ps.setInt(2,1);
            ps.executeUpdate();

            con.commit();


        } catch (Exception e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        }finally{
            if(res != null){
                try{
                    res.close();
                }catch (Exception exc){
                    exc.printStackTrace();
                }
            }
            if(ps != null){
                try{
                    ps.close();
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
