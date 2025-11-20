package com.cnw.model.dao;

import java.sql.*;
import java.util.ArrayList;
import com.cnw.model.bean.KhachHang;
import com.cnw.connection.ConnectJDBC;

public class KhachHangDAO {

    public KhachHang getKhachHang(String maKH) {
        String sql = "SELECT * FROM KHACHHANG WHERE MaKH=?";

        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, maKH);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new KhachHang(
                        rs.getString("MaKH"),
                        rs.getString("HoTenKH"),
                        rs.getString("SoDienThoai"),
                        rs.getString("DiaChiKH"),
                        rs.getDate("NgaySinh"),
                        rs.getString("GioiTinh")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "SELECT * FROM KHACHHANG";
        try (Connection conn = ConnectJDBC.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new KhachHang(
                        rs.getString("MaKH"),
                        rs.getString("HoTenKH"),
                        rs.getString("SoDienThoai"),
                        rs.getString("DiaChiKH"),
                        rs.getDate("NgaySinh"),
                        rs.getString("GioiTinh")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
