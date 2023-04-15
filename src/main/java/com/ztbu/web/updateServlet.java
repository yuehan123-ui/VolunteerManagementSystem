package com.ztbu.web;

import com.ztbu.pojo.Volunteer;
import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
    private VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        //1. 接收表单提交的数据
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String grade = request.getParameter("grade");
        String call = request.getParameter("call");


        Volunteer volunteer  = new Volunteer();
        volunteer.setId(Integer.parseInt(id));
        volunteer.setName(name);
        volunteer.setSex(sex);
        volunteer.setGrade(grade);
        volunteer.setCall(call);

        //2. 调用service 完成修改
        service.update(volunteer);

        //3. 转发到查询所有Servlet
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
