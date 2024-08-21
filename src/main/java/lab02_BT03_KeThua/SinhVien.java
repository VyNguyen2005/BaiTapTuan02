/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT03_KeThua;

/**
 *
 * @author nguye
 */
public abstract class SinhVien {
    public String hoTen;
    public String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        double diem = getDiem();
        String kq = "";
        if(diem < 5){
            kq = "Yeu";
        }
        else if(diem < 6.5 && diem >= 5){
            kq = "Trung binh";
        }
        else if(diem < 7.5 && diem >= 6.5){
            kq = "Kha";
        }
        else if(diem < 9 && diem >= 7.5){
            kq = "Gioi";
        }
        else{
            kq = "Xuat sac";
        }
        return kq;
    }
    public void xuat(){
        System.out.println("Ho ten: " +hoTen);
        System.out.println("Nganh: " +nganh);
        System.out.println("Diem: " +getDiem());
        System.out.println("Hoc luc: " +getHocLuc());
    }
}
