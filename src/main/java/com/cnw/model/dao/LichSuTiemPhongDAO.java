package com.cnw.model.dao;

import java.sql.*;
import java.util.ArrayList;
import com.cnw.model.bean.LichSuTiemPhong;
import com.cnw.connection.ConnectJDBC;

public class LichSuTiemPhongDAO {

    public ArrayList<LichSuTiemPhong> getLichSu(String maKH) {
        ArrayList<LichSuTiemPhong> list = new ArrayList<>();

        String sql = """
        	    SELECT ls.MaKH, kh.HoTenKH, v.MaVacxin, v.TenVacxin, v.SoMui AS TongSoMui, b.TenBenh
        	    FROM LICHUTIEMPHONG ls
        	    JOIN KHACHHANG kh ON ls.MaKH = kh.MaKH
        	    JOIN VACXIN v ON ls.MaVacxin = v.MaVacxin
        	    JOIN PHONGBENH pb ON v.MaVacxin = pb.MaVacxin
        	    JOIN BENH b ON pb.MaBenh = b.MaBenh
        	    WHERE ls.MaKH = ?
        	    ORDER BY ls.STTMui
        	""";
        
        try (Connection conn = ConnectJDBC.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, maKH);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	LichSuTiemPhong ls = new LichSuTiemPhong();
            	ls.setMaKH(rs.getString("MaKH"));
            	ls.setTenKH(rs.getString("HoTenKH"));
            	ls.setTenVacxin(rs.getString("TenVacxin"));
            	ls.setMaVacxin(rs.getString("MaVacxin"));
            	ls.setTongSoMui(rs.getInt("TongSoMui"));
            	ls.setTenBenh(rs.getString("TenBenh"));
            	list.add(ls);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
