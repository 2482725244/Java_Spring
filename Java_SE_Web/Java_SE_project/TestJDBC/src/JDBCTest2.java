import java.sql.*;

public class JDBCTest2 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            //1.注册驱动
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //2.获取连接
            String url = "jdbc:mysql://localhost:3306/test001";
            String user = "root";
            String password = "111111";
            connection = DriverManager.getConnection(url,user,password);
            //3.创建数据库操作对象
            statement = connection.createStatement();
            //4.执行SQl语句
            String sql = "select id,type,sum,name from tt";
            resultSet = statement.executeQuery(sql);
                if(resultSet != null) {
                    System.out.println("查询成功");
                }else {
                    System.out.println("查询失败");
                }
            //5.处理查询集
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                int sum = resultSet.getInt("sum");
                String name = resultSet.getString("name");
                System.out.println(id + "," + type + "," + sum + "," + name);
            }


        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(resultSet != null){
                    resultSet.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(statement != null) {
                    statement.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

        }

    }
}
