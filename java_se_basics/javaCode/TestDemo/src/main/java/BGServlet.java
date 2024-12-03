import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BGServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = request.getParameter("Myname");
        String user = request.getParameter("user");
        String psw = request.getParameter("password");
        String[] sexs = request.getParameterValues("sex");
        String sex = "未选择";
        for (String s:sexs) {
            if(s != null){
                sex = s;
            }
        }
        String xibu = request.getParameter("xueyuan");

        String[] kes = request.getParameterValues("kecheng");
        String ke = "";
        for (String s:kes) {
            if(s != null){
                ke += s;
                ke += " ";
            }
        }

        String dian = request.getParameter("dianyou");
        String bei = request.getParameter("beizhu");

        out.println("<h1 style=\" text-align: center;\">你输入的信息如下</h1>");
        out.print("<table  style=\" background-color: pink;\n" +
                "      border: 1px solid pink;\n" +
                "      border-radius: 10px;\n" +
                "      width: 600px;\n" +
                "      height: 800px;\n" +
                "      margin: 30px auto;\">\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">姓名：</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+name+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">学号：</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+user+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">密码</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+psw+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">性别</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+sex+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">系部</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+xibu+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">所选课程</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+ke+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">电邮</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+dian+"</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">备注</td>\n" +
                "    <td style=\"border: 1px solid #ff00ff;\">"+bei+"</td>\n" +
                "  </tr>\n" +
                "</table>");
    }
}
