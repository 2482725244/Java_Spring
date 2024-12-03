<%@page pageEncoding="utf-8" language="java" import="java.util.*" %>
<html>
<head>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        table {
            width: 600px;
            height: 800px;
            margin: 30px auto;
            border:1px solid #000;
            border-radius: 10px;
            background-color: pink;
        }
        td {
            border: 1px solid #000;
        }
    </style>
</head>
<body>
<form action="/AddTest/servlet/BehindGetServlet" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name = "Myname"></td>
        </tr>
        <tr>
            <td>学号</td>
            <td><input type="text" name = "user"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name = "password"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="radio" value="男" name = "sex">男
                <input type="radio" value="女" name = "sex">女
            </td>
        </tr>
        <tr>
            <td>系部</td>
            <td>
                <select name = "xueyuan">
                    <option value="曙光学院">曙光学院</option>
                    <option value="天津海运职业学院">天津海运职业学院</option>
                    <option value="学院">学院</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>所选课程</td>
            <td>
                <input type="checkbox" value="排球" name = "kecheng">排球
                <input type="checkbox" value="篮球" name = "kecheng">篮球
                <input type="checkbox" value="足球" name = "kecheng">足球
                <input type="checkbox" value="健美操" name = "kecheng">健美操
                <input type="checkbox" value="街舞" name = "kecheng">街舞
            </td>
        </tr>
        <tr>
            <td>电邮</td>
            <td><input type="text" name = "dianyou"></td>
        </tr>
        <tr>
            <td>备注</td>
            <td><textarea cols="20" rows="5" name = "beizhu">我喜欢javaweb编程</textarea></td>
        </tr>
        <tr>
            <td><input type="reset" value="重置"></td>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>

</body>
</html>
