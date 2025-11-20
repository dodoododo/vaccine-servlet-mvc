package com.cnw.model.bean;

import java.util.Date;

public class LichSuTiemPhong {
    private String maKH;
    private String maVacxin;
    private int sttMui;
    private Date ngayTiem;
    private Date ngayHen;
    private String tenBenh;

    private String tenKH;
    private String tenVacxin;
    private int tongSoMui;

    public LichSuTiemPhong() {}

    public LichSuTiemPhong(String maKH, String maVacxin, int sttMui, Date ngayTiem, Date ngayHen) {
        this.maKH = maKH;
        this.maVacxin = maVacxin;
        this.sttMui = sttMui;
        this.ngayTiem = ngayTiem;
        this.ngayHen = ngayHen;
    }

    // getters + setters
    public String getMaKH() { return maKH; }
    public void setMaKH(String maKH) { this.maKH = maKH; }

    public String getMaVacxin() { return maVacxin; }
    public void setMaVacxin(String maVacxin) { this.maVacxin = maVacxin; }

    public int getSttMui() { return sttMui; }
    public void setSttMui(int sttMui) { this.sttMui = sttMui; }

    public Date getNgayTiem() { return ngayTiem; }
    public void setNgayTiem(Date ngayTiem) { this.ngayTiem = ngayTiem; }

    public Date getNgayHen() { return ngayHen; }
    public void setNgayHen(Date ngayHen) { this.ngayHen = ngayHen; }

    public String getTenKH() { return tenKH; }
    public void setTenKH(String tenKH) { this.tenKH = tenKH; }

    public String getTenVacxin() { return tenVacxin; }
    public void setTenVacxin(String tenVacxin) { this.tenVacxin = tenVacxin; }

    public int getTongSoMui() { return tongSoMui; }
    public void setTongSoMui(int tongSoMui) { this.tongSoMui = tongSoMui; }
    
    public String getTenBenh() { return tenBenh; }
    public void setTenBenh(String tenBenh) { this.tenBenh = tenBenh; }
}
