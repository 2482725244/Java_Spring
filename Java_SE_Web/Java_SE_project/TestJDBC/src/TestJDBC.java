import java.sql.*;

public class TestJDBC {
    public static void main1(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;

        try {
            //1.注册驱动
           Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            String url = "jdbc:mysql://localhost:3306/test001";
            String user = "root";
            String password = "111111";
            connection = DriverManager.getConnection(url,user,password);
            //3.创建数据库操作对象
            statement = connection.createStatement();
            //4.执行SQL语句
            String sql = "insert into tt value(19,'杏',23,'jiao')";
            int flag = statement.executeUpdate(sql);
            if(flag == 1){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }

            //5.操作查询集



        }catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            //6.关闭资源
            try{
                statement.close();
            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }

        }

    }
}
