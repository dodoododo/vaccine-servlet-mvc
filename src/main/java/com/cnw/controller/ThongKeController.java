package com.cnw.controller;

import com.cnw.model.bo.ThongKeBO;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/thongke")
public class ThongKeController extends HttpServlet {

    private ThongKeBO thongKeBO = new ThongKeBO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        ArrayList<Object[]> list = thongKeBO.thongKeTongTien();

        request.setAttribute("thongKeList", list);
        request.getRequestDispatcher("/view/thongke/thongke.jsp").forward(request, response);
    }
}
