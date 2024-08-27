/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT05_KeThua;

/**
 *
 * @author ADMIN
 */
public class PhuongTien {
    public String ID;
    public String hangSanXuat;
    public String namSanXuat;
    public long giaBan;
    public String mauXe;

    public String getID() {
        return ID;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public PhuongTien(String ID, String hangSanXuat, String namSanXuat, long giaBan, String mauXe) {
        this.ID = ID;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Hang san xuat: " + hangSanXuat + ", Nam san xuat: " + namSanXuat + ", Gia ban: " + giaBan + ", Mau xe: " + mauXe;
    }
    
}
