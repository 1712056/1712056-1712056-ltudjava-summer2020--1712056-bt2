/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

/**
 *
 * @author NvHuy
 */
public class SinhVien {
    
    int MSSV;
    String HoTen;
    String Gioitinh;
    int CMND;

    public SinhVien(int MSSV, String hoTen, String gioitinh, int CMND) {
        this.MSSV = MSSV;
        HoTen = hoTen;
        Gioitinh = gioitinh;
        this.CMND = CMND;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }
    
    @Override
    public String toString() {
        return "SinhVien{" +
                "MSSV=" + MSSV +
                ", HoTen='" + HoTen + '\'' +
                ", Gioitinh='" + Gioitinh + '\'' +
                ", CMND=" + CMND +
                '}';
    }
}


