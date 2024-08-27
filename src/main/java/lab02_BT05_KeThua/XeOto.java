/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT05_KeThua;

/**
 *
 * @author ADMIN
 */
public class XeOto extends PhuongTien{
    public int soChoNgoi;
    public String dongCo;

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    public XeOto(int soChoNgoi, String dongCo, String ID, String hangSanXuat, String namSanXuat, long giaBan, String mauXe) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return "XeOto {" + super.toString() + ", " + "So cho ngoi: " + soChoNgoi + ", Dong co: " + dongCo + '}';
    }
    
}
