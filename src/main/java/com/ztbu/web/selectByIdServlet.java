package com.ztbu.web;

import com.ztbu.pojo.Volunteer;
import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectByIdServlet")
public class selectByIdServlet extends HttpServlet {
    private VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        //2. 调用service查询
        Volunteer volunteer = service.selectById(Integer.parseInt(id));
        //3. 存储到request中

        request.setAttribute("volunteer",volunteer);
        //4. 转发到update.jsp
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
