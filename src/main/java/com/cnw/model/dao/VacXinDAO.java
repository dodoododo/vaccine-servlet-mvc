package com.cnw.model.dao;

import java.sql.*;
import java.util.ArrayList;
import com.cnw.model.bean.VacXin;
import com.cnw.connection.ConnectJDBC;

public class VacXinDAO {

    // Thêm mới vacxin
    public boolean addVacxin(VacXin v) {
        String sql = "INSERT INTO VACXIN VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, v.getMaVacxin());
            ps.setString(2, v.getTenVacxin());
            ps.setInt(3, v.getSoMui());
            ps.setString(4, v.getMoTa());
            ps.setDouble(5, v.getGiaVacxin());
            ps.setString(6, v.getTenHangSX());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Update vacxin
    public boolean updateVacxin(VacXin v) {
        String sql = "UPDATE VACXIN SET TenVacxin=?, SoMui=?, MoTa=?, GiaVacxin=?, TenHangSX=? WHERE MaVacxin=?";
        try (Connection conn = ConnectJDBC.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, v.getTenVacxin());
            ps.setInt(2, v.getSoMui());
            ps.setString(3, v.getMoTa());
            ps.setDouble(4, v.getGiaVacxin());
            ps.setString(5, v.getTenHangSX());
            ps.setString(6, v.getMaVacxin());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // Tìm theo mã hoặc tên
    public ArrayList<VacXin> searchVacxin(String key) {
        ArrayList<VacXin> list = new ArrayList<>();
        String sql = "SELECT * FROM VACXIN WHERE MaVacxin LIKE ? OR TenVacxin LIKE ?";
        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + key + "%");
            ps.setString(2, "%" + key + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new VacXin(
                        rs.getString("MaVacxin"),
                        rs.getString("TenVacxin"),
                        rs.getInt("SoMui"),
                        rs.getString("MoTa"),
                        rs.getDouble("GiaVacxin"),
                        rs.getString("TenHangSX")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Lấy 1 vacxin theo mã
    public VacXin getVacxin(String ma) {
        String sql = "SELECT * FROM VACXIN WHERE MaVacxin=?";
        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new VacXin(
                        rs.getString("MaVacxin"),
                        rs.getString("TenVacxin"),
                        rs.getInt("SoMui"),
                        rs.getString("MoTa"),
                        rs.getDouble("GiaVacxin"),
                        rs.getString("TenHangSX")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Lấy toàn bộ danh sách
    public ArrayList<VacXin> getAll() {
        ArrayList<VacXin> list = new ArrayList<>();
        String sql = "SELECT * FROM VACXIN";
        try (Connection conn = ConnectJDBC.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new VacXin(
                        rs.getString("MaVacxin"),
                        rs.getString("TenVacxin"),
                        rs.getInt("SoMui"),
                        rs.getString("MoTa"),
                        rs.getDouble("GiaVacxin"),
                        rs.getString("TenHangSX")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
