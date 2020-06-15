/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import quanlysinhvien.Layout.DangNhapJDialog;

/**
 *
 * @author NvHuy
 */
public class Quanlysinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DangNhapJDialog loginJDialog = new DangNhapJDialog(null, true);
        loginJDialog.setTitle("Đăng nhập hệ thống");
        loginJDialog.setResizable(false);
        loginJDialog.setLocationRelativeTo(null);
        loginJDialog.setVisible(true);
    }
    
}
