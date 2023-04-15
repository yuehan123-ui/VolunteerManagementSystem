package com.ztbu.web;

import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deleteByIdServlet")
public class deleteByIdServlet extends HttpServlet {
    private VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        service.deleteById(Integer.parseInt(id));
        request.getRequestDispatcher("/selectAllServlet").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
