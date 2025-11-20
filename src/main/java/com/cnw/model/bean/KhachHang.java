package com.cnw.model.bean;

import java.util.Date;

public class KhachHang {
    private String maKH;
    private String hoTenKH;
    private String soDienThoai;
    private String diaChiKH;
    private Date ngaySinh;
    private String gioiTinh;

    public KhachHang() {}

    public KhachHang(String maKH, String hoTenKH, String soDienThoai, String diaChiKH, Date ngaySinh, String gioiTinh) {
        this.maKH = maKH;
        this.hoTenKH = hoTenKH;
        this.soDienThoai = soDienThoai;
        this.diaChiKH = diaChiKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaKH() { return maKH; }
    public void setMaKH(String maKH) { this.maKH = maKH; }

    public String getHoTenKH() { return hoTenKH; }
    public void setHoTenKH(String hoTenKH) { this.hoTenKH = hoTenKH; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public String getDiaChiKH() { return diaChiKH; }
    public void setDiaChiKH(String diaChiKH) { this.diaChiKH = diaChiKH; }

    public Date getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(Date ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }
}
