package com.cnw.model.bo;

import java.util.ArrayList;
import com.cnw.model.bean.VacXin;
import com.cnw.model.dao.VacXinDAO;

public class VacXinBO {

    private VacXinDAO vacxinDAO = new VacXinDAO();

    // Lấy toàn bộ vacxin
    public ArrayList<VacXin> getAllVacxin() {
        return vacxinDAO.getAll();
    }

    // Lấy 1 vacxin theo mã
    public VacXin getVacxinById(String maVacxin) {
        return vacxinDAO.getVacxin(maVacxin);
    }

    // Tìm kiếm vacxin theo mã hoặc tên
    public ArrayList<VacXin> searchVacxin(String key) {
        return vacxinDAO.searchVacxin(key);
    }

    // Thêm mới vacxin
    public boolean addVacxin(VacXin v) {
        if (v.getMaVacxin() == null || v.getMaVacxin().trim().isEmpty())
            return false;
        return vacxinDAO.addVacxin(v);
    }

    // Cập nhật vacxin
    public boolean updateVacxin(VacXin v) {
        return vacxinDAO.updateVacxin(v);
    }
}
