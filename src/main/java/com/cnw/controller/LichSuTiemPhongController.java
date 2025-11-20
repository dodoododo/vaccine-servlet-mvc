package com.cnw.controller;

import com.cnw.model.bo.LichSuTiemPhongBO;
import com.cnw.model.bo.KhachHangBO;
import com.cnw.model.bean.LichSuTiemPhong;
import com.cnw.model.bean.KhachHang;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/lichsu")
public class LichSuTiemPhongController extends HttpServlet {

    private LichSuTiemPhongBO lsBO = new LichSuTiemPhongBO();
    private KhachHangBO khBO = new KhachHangBO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String maKH = request.getParameter("maKH");

        KhachHang kh = khBO.getKhachHang(maKH);
        ArrayList<LichSuTiemPhong> list = lsBO.getLichSuTiem(maKH);

        request.setAttribute("khachHang", kh);
        request.setAttribute("lichSu", list);

        request.getRequestDispatcher("/view/lichsu/lichsutiem.jsp").forward(request, response);
    }
}
