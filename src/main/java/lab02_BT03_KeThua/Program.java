/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT03_KeThua;

import java.util.ArrayList;
/**
 *
 * @author nguye
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("---Danh sach sinh vien IT---");
        ArrayList<SinhVienIT> danhSachSinhVienIT = new ArrayList<>();
        
        danhSachSinhVienIT.add(new SinhVienIT("Nguyen Van A", 8, 9, 10));
        danhSachSinhVienIT.add(new SinhVienIT("Tran Thi B", 7.5, 8, 9));
        danhSachSinhVienIT.add(new SinhVienIT("Le Van C", 6.5, 7, 8));
        danhSachSinhVienIT.add(new SinhVienIT("Pham Thi D", 3, 4, 2));
        
        for (SinhVienIT sinhVienIT : danhSachSinhVienIT) {
            sinhVienIT.xuat();
        }
        
        System.out.println("---Danh sach sinh vien Biz---");
        ArrayList<SinhVienBiz> danhSachSinhVienBiz = new ArrayList<>();
        
        danhSachSinhVienBiz.add(new SinhVienBiz("Ha Thi A", 5, 4));
        danhSachSinhVienBiz.add(new SinhVienBiz("Nguyen Thi B", 7.5, 6));
        danhSachSinhVienBiz.add(new SinhVienBiz("Mai Van E", 8, 8.5));
        danhSachSinhVienBiz.add(new SinhVienBiz("Hoang Xuan D", 9, 10));
        
        for (SinhVienBiz sinhVienBiz : danhSachSinhVienBiz) {
            sinhVienBiz.xuat();
        }
        
        System.out.println("---Danh sach sinh vien co hoc luc GIOI---");
        for (SinhVienBiz sinhVienBiz : danhSachSinhVienBiz) {
            if(sinhVienBiz.getDiem() < 9 && sinhVienBiz.getDiem() >= 7.5){
                sinhVienBiz.xuat();
            }
        }
        for (SinhVienIT sinhVienIT : danhSachSinhVienIT) {
            if(sinhVienIT.getDiem() < 9 && sinhVienIT.getDiem() >= 7.5){
                sinhVienIT.xuat();
            }
        }
    }
    
}
