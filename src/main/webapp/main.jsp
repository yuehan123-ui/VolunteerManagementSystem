<%--
  Created by IntelliJ IDEA.
  User: 王政翔
  Date: 2022/12/13
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="css/www.css" rel="stylesheet">
</head>
<body>
<%

        java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义时间格式，不想要时分秒的话，也可以只是yyyy-MM-dd
        java.util.Date currentTime = new java.util.Date();//获取当前系统时间
        String str1 = formatter.format(currentTime); //将当前时间按格式转化为字符串
%>

<div class="s-layout">
    <!-- Sidebar -->
    <div class="s-layout__sidebar">
        <a class="s-sidebar__trigger" href="#0">
            <i class="fa fa-bars"></i>
        </a>

        <nav class="s-sidebar__nav">
            <ul>
                <li>
                    <a class="s-sidebar__nav-link" href="main.jsp">
                        <i class="fa fa-home"></i><em>主页</em>
                    </a>
                </li>
                <li>
                    <a class="s-sidebar__nav-link" href="teacherInfo.jsp">
                        <i class="fa fa-user"></i><em>个人信息</em>
                    </a>
                </li>
                <li>
                    <a class="s-sidebar__nav-link" href="selectAllServlet">
                        <i class="fa fa-camera"></i><em>查看所有志愿者信息</em>
                    </a>
                </li>
                <li>
                    <a class="s-sidebar__nav-link" href="selectAllmodify.jsp">
                        <i class="fa fa-home"></i><em>修改志愿者信息</em>
                    </a>
                </li>
                <li>
                    <a class="s-sidebar__nav-link" href="insert.jsp">
                        <i class="fa fa-home"></i><em>添加志愿者信息</em>
                    </a>
                </li>
                <li>
                    <a class="s-sidebar__nav-link" href="login.jsp">
                        <i class="fa fa-home"></i><em>退出/切换账号</em>
                    </a>
                </li>
            </ul>
        </nav>
    </div>

    <!-- Content -->
    <main class="s-layout__content">
      <h1 align="center"> ${teacher.username}  欢迎来到校园防疫志愿者管理系统！  当前时间为：<%=str1%></h1>
        <p></p>
        <img src="imgs/4.jpg">
    </main>


</div>
</body>
</html>
