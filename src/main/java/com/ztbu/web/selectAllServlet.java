package com.ztbu.web;

import com.ztbu.pojo.Volunteer;
import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class selectAllServlet extends HttpServlet {
    private  VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        List<Volunteer> volunteers = service.selectAll();
        HttpSession session = request.getSession();
        session.setAttribute("volunteers",volunteers);
        response.sendRedirect("selectAll.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
