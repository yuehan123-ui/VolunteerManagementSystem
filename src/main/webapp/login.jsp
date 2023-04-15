<%--
  Created by IntelliJ IDEA.
  User: 王政翔
  Date: 2022/12/12
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link href="css/login.css" rel="stylesheet">
</head>

<body>

<div id="loginDiv" style="height: 350px">
    <form action="loginServlet" method="post" id="form">
        <h1 id="loginMsg">登陆界面</h1>
        <div id="errorMsg">${login_msg}${register_msg}</div>
        <p>用户名:<input id="username" name="username" type="text"></p>
        <p>密码&nbsp;&nbsp;&nbsp;:<input id="password" name="password" type="password"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="登录">
            <input type="reset" class="button" value="重置">&nbsp;&nbsp;&nbsp;
            <a href="register.jsp">没有账号？</a>
        </div>
    </form>
</div>

</body>
</html>
