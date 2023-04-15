package com.ztbu.web;

import com.ztbu.pojo.Teacher;
import com.ztbu.service.TeacherService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    private TeacherService service = new TeacherService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1. 获取用户名和密码数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        Teacher teacher = new Teacher();
        teacher.setUsername(username);
        teacher.setPassword(password);
        teacher.setEmail(email);

        //2. 调用service 注册
        boolean flag = service.register(teacher);
        //3. 判断注册成功与否
        if(flag){
            //注册功能，跳转登陆页面
            request.setAttribute("register_msg","注册成功，请登录");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }else {
            //注册失败，跳转到注册页面

            request.setAttribute("register_msg","用户名已存在");
            request.getRequestDispatcher("/register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
