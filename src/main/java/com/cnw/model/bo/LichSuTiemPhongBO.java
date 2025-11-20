package com.cnw.model.bo;

import java.util.ArrayList;
import com.cnw.model.bean.LichSuTiemPhong;
import com.cnw.model.dao.LichSuTiemPhongDAO;

public class LichSuTiemPhongBO {

    private LichSuTiemPhongDAO lsDAO = new LichSuTiemPhongDAO();

    // Lấy toàn bộ lịch sử tiêm của 1 khách hàng
    public ArrayList<LichSuTiemPhong> getLichSuTiem(String maKH) {
        return lsDAO.getLichSu(maKH);
    }
}
