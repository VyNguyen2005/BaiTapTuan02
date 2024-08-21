/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT03_KeThua;

/**
 *
 * @author nguye
 */
public class SinhVienIT extends SinhVien{
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    @Override
    public double getDiem(){
        return ((2 * diemJava) + diemHtml + diemCss) / 4;
    }
}
