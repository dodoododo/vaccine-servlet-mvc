package com.cnw.model.bo;

import java.util.ArrayList;
import com.cnw.model.bean.KhachHang;
import com.cnw.model.dao.KhachHangDAO;

public class KhachHangBO {

    private KhachHangDAO khachHangDAO = new KhachHangDAO();

    // Lấy thông tin 1 khách hàng theo mã
    public KhachHang getKhachHang(String maKH) {
        return khachHangDAO.getKhachHang(maKH);
    }

    // Lấy toàn bộ danh sách khách hàng
    public ArrayList<KhachHang> getAllKhachHang() {
        return khachHangDAO.getAll();
    }
}
