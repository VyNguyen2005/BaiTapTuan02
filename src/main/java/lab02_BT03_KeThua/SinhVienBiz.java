/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT03_KeThua;

/**
 *
 * @author nguye
 */
public class SinhVienBiz extends SinhVien{
    public double diemMarketing;
    public double diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Marketing");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem(){
        return ((2 * diemMarketing) + diemSales) / 3;
    }
}
