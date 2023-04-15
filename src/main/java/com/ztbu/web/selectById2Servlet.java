package com.ztbu.web;

import com.ztbu.pojo.Volunteer;
import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/selectById2Servlet")
public class selectById2Servlet extends HttpServlet {
    private VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        Volunteer volunteer = service.selectById(Integer.parseInt(id));


        request.setAttribute("volunteer",volunteer);
        request.getRequestDispatcher("/detail.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
