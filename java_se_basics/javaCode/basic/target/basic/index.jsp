<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
  <h1>简易计算器</h1>
  <p>2135161116-杨宗霖</p>
   <form action ="/basic/servlet/TestServlet1" method = "get">
   
   		<table>
   			<tr>
   				<td>请输入第一个数：</td>
   				<td><input type = "text" name = "num1"></td>
   			</tr>
   			<tr>
   				<td>
	   				<select name = "opr">
			   			<option value = "1">+</option>
			   			<option value = "2">-</option>
			   			<option value = "3">*</option>
			   			<option value = "4">/</option>
			   		</select>
		   		</td>
   			</tr>
   			<tr>
   				<td>请输入第二个数：</td>
   				<td><input type = "text" name = "num2"></td>
   			</tr>
	   		<tr>
	   			<td><input type = "submit" value = "计算"></td>
	   		</tr>
   		</table>
 
   </form>
   <%
   		out.println("结果为：");
   		out.println(request.getSession().getAttribute("endNum"));
    %>
  </body>
</html>
