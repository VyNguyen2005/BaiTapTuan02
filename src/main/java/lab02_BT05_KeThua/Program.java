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
public class Program {
    static ArrayList<PhuongTien> dsPhuongTien = new ArrayList<>();
    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    
    public static void main(String[] args) {
        Menu();
    }
    private static void Menu() {
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("CHUONG TRINH QUAN LI CAC PHUONG TIEN GIAO THONG");
            System.out.println("------------------------------------");
            System.out.println("1. Them phuong tien");
            System.out.println("2. Xuat danh sach cac phuong tien");
            System.out.println("3. Xoa phuong tien theo ID");
            System.out.println("4. Tim phuong tien theo hang san xuat");
            System.out.println("5. Tim phuong tien theo mau");
            System.out.println("6. Ket thuc");
            System.out.println("------------------------------------");
            System.out.print("Nhap yeu cau cua ban: ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    ThemPT();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    Xoa();
                    break;
                case 4:
                    TimTheoHangSX();
                    break;
                case 5:
                    TimTheoMau();
                case 6:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (luachon != 6);
    }
    private static void ThemPT() {
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
            System.out.println(phuongTien.toString());
        }
    }
    public static void Xoa(){
        System.out.print("Nhap ID phuong tien muon xoa: ");
        String idXoa = sc2.nextLine();
        ArrayList<PhuongTien> phuongTienCanXoa = new ArrayList<>();
        
        for (PhuongTien phuongTien : dsPhuongTien) {
            if (phuongTien.getID().equals(idXoa)) { 
            phuongTienCanXoa.add(phuongTien);
        }   
        }
        
        if(!phuongTienCanXoa.isEmpty()){
            dsPhuongTien.removeAll(phuongTienCanXoa);
            System.out.println("Phuong tien voi ID " + idXoa + " da duoc xoa.");
        }
        else{
            System.out.println("Khong tim thay phuong tien voi ID " + idXoa + ".");
        }
    }

    private static void TimTheoHangSX() {
        System.out.print("Nhap hang san xuat muon tim: ");
        String hangSX = sc2.nextLine();
        
        for (PhuongTien phuongTien : dsPhuongTien) {
            if(phuongTien.getHangSanXuat().equals(hangSX)){
                System.out.println(phuongTien.toString());
            }
            else{
                System.out.println("Khong tim thay phuong tien voi hang san xuat " +hangSX);
            }
        }
    }

    private static void TimTheoMau() {
        System.out.print("Nhap mau xe muon tim: ");
        String mauXe = sc2.nextLine();
        
        for (PhuongTien phuongTien : dsPhuongTien) {
            if(phuongTien.getMauXe().equals(mauXe)){
                System.out.println(phuongTien.toString());
            }
            else{
                System.out.println("Khong tim thay phuong tien voi mau " +mauXe);
            }
        }
    }

    
}
