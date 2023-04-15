package com.ztbu.web;

import com.ztbu.pojo.Teacher;

import com.ztbu.service.TeacherService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    private TeacherService service = new TeacherService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //2. 调用service查询
        Teacher teacher= service.login(username, password);

        //3. 判断
        if(teacher != null){


            HttpSession session = request.getSession();
            session.setAttribute("teacher",teacher);

            String contextPath = request.getContextPath();
/*            response.sendRedirect(contextPath+"/selectAllServlet");*/
            response.sendRedirect("main.jsp");
        }else {
            // 登录失败,
            // 存储错误信息到request
            request.setAttribute("login_msg", "用户名或密码错误");
            // 跳转到login.jsp
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
