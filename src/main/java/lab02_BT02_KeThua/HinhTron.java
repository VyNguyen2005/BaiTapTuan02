/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT02_KeThua;

/**
 *
 * @author nguye
 */
public class HinhTron {
    public double bankinh;

    public HinhTron() {
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double tinhDienTich(){
        return Math.PI * (bankinh * bankinh);
    }
    public double tinhChuVi(){
        return (2 * Math.PI * bankinh);
    }

}
