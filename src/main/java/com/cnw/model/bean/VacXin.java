package com.cnw.model.bean;

public class VacXin {
    private String maVacxin;
    private String tenVacxin;
    private int soMui;
    private String moTa;
    private double giaVacxin;
    private String tenHangSX;

    public VacXin() {}

    public VacXin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin, String tenHangSX) {
        this.maVacxin = maVacxin;
        this.tenVacxin = tenVacxin;
        this.soMui = soMui;
        this.moTa = moTa;
        this.giaVacxin = giaVacxin;
        this.tenHangSX = tenHangSX;
    }

    public String getMaVacxin() { return maVacxin; }
    public void setMaVacxin(String maVacxin) { this.maVacxin = maVacxin; }

    public String getTenVacxin() { return tenVacxin; }
    public void setTenVacxin(String tenVacxin) { this.tenVacxin = tenVacxin; }

    public int getSoMui() { return soMui; }
    public void setSoMui(int soMui) { this.soMui = soMui; }

    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }

    public double getGiaVacxin() { return giaVacxin; }
    public void setGiaVacxin(double giaVacxin) { this.giaVacxin = giaVacxin; }

    public String getTenHangSX() { return tenHangSX; }
    public void setTenHangSX(String tenHangSX) { this.tenHangSX = tenHangSX; }
}
