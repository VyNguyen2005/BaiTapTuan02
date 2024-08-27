/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT05_KeThua;

/**
 *
 * @author ADMIN
 */
public class XeMay extends PhuongTien{
    public double congXuat;

    public void setCongXuat(double congXuat) {
        this.congXuat = congXuat;
    }

    public XeMay(double congXuat, String ID, String hangSanXuat, String namSanXuat, long giaBan, String mauXe) {
        super(ID, hangSanXuat, namSanXuat, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay {" + super.toString() + ", " + "Cong suat: " + congXuat + '}';
    }
    
}
