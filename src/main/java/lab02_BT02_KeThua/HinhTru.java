/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT02_KeThua;

/**
 *
 * @author nguye
 */
public class HinhTru extends HinhTron{
    public double chieucao;

    public HinhTru() {
        
    }

    public HinhTru(double chieucao, double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
    public double tinhTheTich(){
        return super.tinhDienTich() * chieucao;
    }
    @Override
    public double tinhDienTich(){
        double s_day = super.tinhDienTich();
        double s_xq = super.tinhChuVi() * chieucao;
        return s_xq + (2 * s_day);
    } 
}
