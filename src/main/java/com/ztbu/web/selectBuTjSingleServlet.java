package com.ztbu.web;

import com.ztbu.pojo.Volunteer;
import com.ztbu.service.VolunteerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectBuTjSingleServlet")
public class selectBuTjSingleServlet extends HttpServlet {
    private VolunteerService service = new VolunteerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String lb = request.getParameter("lb");
        String xx = request.getParameter("xx");
        String tj = "";
        Volunteer volunteer;
        List<Volunteer> volunteers ;
        switch (lb){
            case "id":
                tj = xx;
                //3. 存储到request中
                volunteer = service.selectById(Integer.parseInt(tj));
                volunteers = service.selectByTjSingle(volunteer);
                request.setAttribute("volunteers",volunteers);
                request.getRequestDispatcher("/selectAll.jsp").forward(request,response);
                break;
            case "username":
                tj = "%" + xx + "%";
                volunteer = new Volunteer();
                volunteer.setName(tj);
                volunteers = service.selectByTjSingle(volunteer);
                request.setAttribute("volunteers",volunteers);
                request.getRequestDispatcher("/selectAll.jsp").forward(request,response);
                break;
            case "sex":
                tj = xx;
                volunteer = new Volunteer();
                volunteer.setSex(tj);
                volunteers = service.selectByTjSingle(volunteer);
                request.setAttribute("volunteers",volunteers);
                request.getRequestDispatcher("/selectAll.jsp").forward(request,response);
                break;
            case "grade":
                tj = "%" + xx + "%";
                volunteer = new Volunteer();
                volunteer.setGrade(tj);
                volunteers = service.selectByTjSingle(volunteer);
                request.setAttribute("volunteers",volunteers);
                //4. 转发到update.jsp
                request.getRequestDispatcher("/selectAll.jsp").forward(request,response);
                break;
        }
    /*    if (lb.equals("id")){
            String tj = xx;
            Volunteer volunteer = new Volunteer();
            volunteer.setId(Integer.parseInt(tj));
            //3. 存储到request中
            List<Volunteer> volunteers = service.selectByTjSingle(volunteer);
            //3. 存储到request中
            request.setAttribute("volunteers",volunteers);
            //4. 转发到update.jsp
            request.getRequestDispatcher("/selectAll.jsp").forward(request,response);
        }else  {
            //处理数据
            String tj = "%" + xx + "%";
            List<Volunteer> volunteers = service.selectByTjSingle(tj);
            request.setAttribute("volunteers",volunteers);
            //4. 转发到update.jsp
            request.getRequestDispatcher("/selectAll.jsp").forward(request,response);

        }*/

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
