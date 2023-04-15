<%--
  Created by IntelliJ IDEA.
  User: 王政翔
  Date: 2022/12/11
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
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
        <table border="1" cellspacing="0" width="80%" align="center">
            <tr>
                <td colspan="8" align="">
                    <form action="selectBuTjSingleServlet" method="post">
                        <input type="button" value="添加" onclick="window.location.href='insert.jsp'">
                        查找:
                        <select name ="lb">
                            <option value="id">学号</option>
                            <option value="username">姓名</option>
                            <option value="sex">性别</option>
                            <option value="grade">班级</option>
                        </select>
                        <input type="text" name="xx">
                        <input type="submit" value="确定" name="ok">
                        <input type="button" value="返回"  onclick="window.location.href='selectAll.jsp'">
                    </form>
                </td>
            </tr>
            <tr>
                <th>序号</th>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>班级</th>
                <th>电话号码</th>
            </tr>


            <c:forEach items="${volunteers}" var="volunteer" varStatus="status">
                <tr align="center">
                        <%--<td>${brand.id}</td>--%>
                    <td>${status.count}</td>
                    <td>${volunteer.id}</td>
                    <td>${volunteer.name}</td>
                    <td>${volunteer.sex}</td>
                    <td>${volunteer.grade}</td>
                    <td>${volunteer.call}</td>

                </tr>
            </c:forEach>
        </table>
        <p align="center">总共有${fn:length(volunteers)}条数据  <a href="#">上一页</a>&nbsp; <a href="#">下一页</a></p>

    </main>
</div>




</body>
</html>