/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT01_KeThua;

/**
 *
 * @author nguye
 */
public class Vuong extends ChuNhat{
    public double canh;

    public Vuong(double canh) {
        super(canh, canh);
    }
    @Override
    public void xuat(){
        System.out.println("Hinh vuong: Chieu dai: " +dai + ", Chieu rong: " +rong + ", Chu vi: " +getChuVi() + ", Dien tich: " +getDienTich());
    }
}