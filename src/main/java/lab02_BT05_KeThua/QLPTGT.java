/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT05_KeThua;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLPTGT{

    static ArrayList<PhuongTien> dsPhuongTien = new ArrayList<>();
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    public static void ThemPhuongTien() {
        PhuongTien phuongtien = null;
        String tieptuc ="";
        do {
            System.out.println("Thuc hien them phuong tien giao thong thuoc loai (O to - Xe may - Xe tai)");
            System.out.print("Ban muon them loai phuong tien nao(1. O to - 2. Xe may - 3. Xe tai): ");
            int chon = sc1.nextInt();
            if (chon == 1) {
                System.out.print("Nhap ID: ");
                String idOto = sc2.nextLine();
                System.out.print("Nhap hang san xuat: ");
                String hangSXOto = sc2.nextLine();
                System.out.print("Nhap nam san xuat: ");
                String namSXOto = sc2.nextLine();
                System.out.print("Nhap gia ban: ");
                long giaBanOto = sc1.nextLong();
                System.out.print("Nhap mau xe: ");
                String mauXeOto = sc2.nextLine();
                System.out.print("Nhap so cho ngoi: ");
                int soChoNgoi = sc1.nextInt();
                System.out.print("Nhap kieu dong co: ");
                String kieuDongCo = sc2.nextLine();
                phuongtien = new XeOto(soChoNgoi, kieuDongCo, idOto, hangSXOto, namSXOto, giaBanOto, mauXeOto);
            } else if (chon == 2) {
                System.out.print("Nhap ID: ");
                String idMay = sc2.nextLine();
                System.out.print("Nhap hang san xuat: ");
                String hangSXMay = sc2.nextLine();
                System.out.print("Nhap nam san xuat: ");
                String namSXMay = sc2.nextLine();
                System.out.print("Nhap gia ban: ");
                long giaBanMay = sc1.nextLong();
                System.out.print("Nhap mau xe: ");
                String mauXeMay = sc2.nextLine();
                System.out.print("Nhap cong xuat: ");
                double congXuat = sc1.nextDouble();
                phuongtien = new XeMay(congXuat, idMay, hangSXMay, namSXMay, giaBanMay, mauXeMay);
            } else if (chon == 3) {
                System.out.print("Nhap ID: ");
                String idTai = sc2.nextLine();
                System.out.print("Nhap hang san xuat: ");
                String hangSXTai = sc2.nextLine();
                System.out.print("Nhap nam san xuat: ");
                String namSXTai = sc2.nextLine();
                System.out.print("Nhap gia ban: ");
                long giaBanTai = sc1.nextLong();
                System.out.print("Nhap mau xe: ");
                String mauXeTai = sc2.nextLine();
                System.out.print("Nhap trong tai: ");
                double trongtai = sc1.nextDouble();
                phuongtien = new XeTai(trongtai, idTai, hangSXTai, namSXTai, giaBanTai, mauXeTai);
            } else {
                System.out.println("Loai phuong tien khong hop le!");
                continue;
            }
            if(phuongtien != null){
                dsPhuongTien.add(phuongtien);
            }
            System.out.print("Ban co muon tiep tuc them phuong tien(y/n): ");
            tieptuc = sc2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }
    
    public static void Xuat(){
        for (PhuongTien phuongTien : dsPhuongTien) {
            phuongTien.toString();
        }
    }
    public static void Xoa(){
        System.out.print("Nhap ID phuong tien muon xoa: ");
        String idXoa = sc2.nextLine();
        for (PhuongTien phuongTien : dsPhuongTien) {
            if (phuongTien.getID().equals(idXoa)) { // So sánh ID sử dụng equals() thay vì ==
            dsPhuongTien.remove(phuongTien);
            System.out.println("Phương tiện với ID " + idXoa + " đã được xóa.");
        }
        }
    }
}
