<%--
  Created by IntelliJ IDEA.
  User: WUHONGYUN
  Date: 2022/11/20
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" language="java" %>
<%
  request.setCharacterEncoding("utf-8");
  response.setCharacterEncoding("utf-8");
  response.setContentType("text/html");
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <style>
    * {
      margin: 0;
      padding: 0;
    }


    table {
      background-color: pink;
      border: 1px solid pink;
      border-radius: 10px;
      width: 600px;
      height: 800px;
      margin: 30px auto;
    }
    td {
      border: 1px solid #ff00ff;
    }
    h1 {
      text-align: center;
    }
  </style>
</head>

<body>
<p></p>
<h1>您输入的信息如下</h1>
<table>
  <tr>
    <td>姓名：</td>
    <td><%out.print(request.getParameter("Myname"));%></td>
  </tr>
  <tr>
    <td>学号：</td>
    <td><%out.print(request.getParameter("user"));%></td>
  </tr>
  <tr>
    <td>密码</td>
    <td><%out.print(request.getParameter("password"));%></td>
  </tr>
  <tr>
    <td>性别</td>
    <td>
      <%
       String[] sexs = request.getParameterValues("sex");
       out.print(sexs[0]);
      %>
    </td>
  </tr>
  <tr>
    <td>系部</td>
    <td><%out.print(request.getParameter("xueyuan"));%></td>
  </tr>
  <tr>
    <td>所选课程</td>
    <td>
      <%
        String[] checks = request.getParameterValues("kecheng");
        for (String s: checks) {
          if(s != null){
            out.print(s+",");
          }
        }
      %>

    </td>
  </tr>
  <tr>
    <td>电邮</td>
    <td><%out.print(request.getParameter("dianyou"));%></td>
  </tr>
  <tr>
    <td>备注</td>
    <td><%out.print(request.getParameter("beizhu"));%></td>
  </tr>
</table>
</body>
</html>
