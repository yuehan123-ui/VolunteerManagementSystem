<%--
  Created by IntelliJ IDEA.
  User: 王政翔
  Date: 2022/12/13
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/www.css" rel="stylesheet">
</head>
<body>

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
        <h1 align="center">        工号: ${teacher.id}</h1>
        <h1 align="center">        教师姓名：${teacher.username}</h1>
        <h1 align="center">        所属学院:信息工程学院</h1>
        <h1 align="center">        电子邮箱：${teacher.email}</h1>




    </main>
</div>


</body>
</html>
