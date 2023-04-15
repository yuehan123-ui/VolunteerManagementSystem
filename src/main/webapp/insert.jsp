<%--
  Created by IntelliJ IDEA.
  User: 王政翔
  Date: 2022/12/13
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>添加</title>
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

        <h3>添加志愿者</h3>

        <hr>
        <form action="insertServlet" name="insert" id="insert" method="post">
            学号：<input name="id"><br>
            姓名：<input name="name"><br>
            性别：<input name="sex"><br>
            班级：<input name="grade"><br>
            电话：<input name="call"><br>

            <input type="submit" value="提交">
        </form>


        <!-- 引入jQuery类库 -->
        <script src="jquery-3.6.1.js"></script>
        <!-- 引入validator插件 -->
        <script src="jquery.validate.js"></script>
        <script>
            $("#insert").validate({
                rules:{//配置表单项校验的规则
                    id:{
                        required: true

                    },
                    name:{
                        required: true

                    },
                    sex:{
                        required:true

                    },
                    grade:{
                        required:true
                    },
                    call:{
                        required:true,

                    },
                },
                messages:{//配置对应的表单项校验失败后的错误提示信息
                    id:{
                        required: "学号不能为空",
                    },
                    name:{
                        required: "姓名不能为空",
                    },
                    sex:{
                        required:"性别不能为空",
                    },
                    grade:{
                        required:"班级不能为空"
                    },
                    call:{
                        required:"电话号码不能为空",

                    }
                }
            })
        </script>
    </main>
</div>


</body>
</html>