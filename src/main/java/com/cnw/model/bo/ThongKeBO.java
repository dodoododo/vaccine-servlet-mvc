package com.cnw.model.bo;

import java.util.ArrayList;
import com.cnw.model.dao.ThongKeDAO;

public class ThongKeBO {

    private ThongKeDAO thongKeDAO = new ThongKeDAO();

    // Lấy danh sách thống kê tổng tiền đã trả
    public ArrayList<Object[]> thongKeTongTien() {
        return thongKeDAO.thongKeTien();
    }
}
