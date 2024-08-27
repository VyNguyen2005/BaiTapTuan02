/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT05_KeThua;

/**
 *
 * @author ADMIN
 */
public class XeTai extends PhuongTien{
    public double trongTai;

    public double getTrongTai() {
        return trongTai;
    }

    public XeTai(double trongTai, String ID, String hangSanXuat, String namSanXuat, long giaBan, String mauXe) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.trongTai = trongTai;
    }
    
    @Override
    public String toString() {
        return "XeTai {" + super.toString() + ", " + "Trong tai: " + trongTai + '}';
    }
    
}
