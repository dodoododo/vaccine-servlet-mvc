package com.cnw.controller;

import com.cnw.model.bo.VacXinBO;
import com.cnw.model.bean.VacXin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/vacxin")
public class VacXinController extends HttpServlet {

    private VacXinBO vacxinBO = new VacXinBO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) action = "list";

        switch (action) {

            case "create":
                request.getRequestDispatcher("/view/vacxin/vacxin-add.jsp").forward(request, response);
                break;

            case "edit":
                String id = request.getParameter("id");
                VacXin v = vacxinBO.getVacxinById(id);
                request.setAttribute("vacxin", v);
                request.getRequestDispatcher("/view/vacxin/vacxin-edit.jsp").forward(request, response);
                break;

            case "search":
                String key = request.getParameter("keyword");
                ArrayList<VacXin> result = vacxinBO.searchVacxin(key);
                request.setAttribute("vacxinList", result);
                request.getRequestDispatcher("/view/vacxin/vacxin-list.jsp").forward(request, response);
                break;

            default: // list
                ArrayList<VacXin> list = vacxinBO.getAllVacxin();
                request.setAttribute("vacxinList", list);
                request.getRequestDispatcher("/view/vacxin/vacxin-list.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");

        if (action.equals("create")) {
            VacXin v = new VacXin(
                    request.getParameter("MaVacxin"),
                    request.getParameter("TenVacxin"),
                    Integer.parseInt(request.getParameter("SoMui")),
                    request.getParameter("MoTa"),
                    Double.parseDouble(request.getParameter("GiaVacxin")),
                    request.getParameter("TenHangSX")
            );

            vacxinBO.addVacxin(v);
            response.sendRedirect("vacxin");

        } else if (action.equals("edit")) {

            VacXin v = new VacXin(
                    request.getParameter("MaVacxin"),
                    request.getParameter("TenVacxin"),
                    Integer.parseInt(request.getParameter("SoMui")),
                    request.getParameter("MoTa"),
                    Double.parseDouble(request.getParameter("GiaVacxin")),
                    request.getParameter("TenHangSX")
            );

            vacxinBO.updateVacxin(v);
            response.sendRedirect("vacxin");
        }
    }
}
