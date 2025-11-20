package com.cnw.model.dao;

import java.sql.*;
import java.util.ArrayList;
import com.cnw.connection.ConnectJDBC;
import com.cnw.model.bean.KhachHang;

public class ThongKeDAO {

    public ArrayList<Object[]> thongKeTien() {
        ArrayList<Object[]> list = new ArrayList<>();

        String sql = """
					SELECT kh.MaKH, kh.HoTenKH, kh.DiaChiKH,
				    COALESCE(SUM(v.GiaVacxin), 0) AS TongTien
					FROM KHACHHANG kh
					LEFT JOIN LICHUTIEMPHONG ls ON ls.MaKH = kh.MaKH
					LEFT JOIN VACXIN v ON ls.MaVacxin = v.MaVacxin
					GROUP BY kh.MaKH
					ORDER BY TongTien ASC
                """;

        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Object[] row = {
                        rs.getString("MaKH"),
                        rs.getString("HoTenKH"),
                        rs.getString("DiaChiKH"),
                        rs.getDouble("TongTien")
                };
                list.add(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
