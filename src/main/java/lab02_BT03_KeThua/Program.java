/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT03_KeThua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author nguye
 */
public class Program {

    public static ArrayList<SinhVien> danhsachSinhVien = new ArrayList<>();
    
    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        int luachon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CHUONG TRINH QUAN LI SINH VIEN");
            System.out.println("-------------------------------");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.println("-------------------------------");
            System.out.print("Nhap yeu cau cua ban: ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    NhapDS();
                    break;
                case 2:
                    XuatDS();
                    break;
                case 3:
                    XuatDSGioi();
                    break;
                case 4:
                    SapXepTheoDiem();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!!!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
                    break;
            }
        } while (luachon != 5);
    }

    private static void NhapDS() {
        String tieptuc="";
        do {
            SinhVien sv = null;
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Thuc hien nhap danh sach sinh vien IT va Biz");
            int chon;
            System.out.print("Ban muon nhap thong tin sinh vien (1. IT) - (2. Biz): ");
            chon = sc1.nextInt();
            if (chon == 1) {
                System.out.print("Nhap ho ten sinh vien IT: ");
                String hotenIT = sc2.nextLine();
                System.out.print("Nhap diem Java: ");
                double diemJava = sc1.nextDouble();
                System.out.print("Nhap diem Css: ");
                double diemCss = sc1.nextDouble();
                System.out.print("Nhap diem Html: ");
                double diemHtml = sc1.nextDouble();
                sv = new SinhVienIT(hotenIT, diemJava, diemCss, diemHtml);
            } else if (chon == 2) {
                System.out.print("Nhap ho ten sinh vien Biz: ");
                String hotenBiz = sc2.nextLine();
                System.out.print("Nhap diem Marketing: ");
                double diemMarketing = sc1.nextDouble();
                System.out.print("Nhap diem Sales: ");
                double diemSales = sc1.nextDouble();
                sv = new SinhVienBiz(hotenBiz, diemMarketing, diemSales);
            }
            else{
                System.out.print("Không hợp lệ. Yêu cầu nhập lại!");
                continue;
            }

            if (sv != null) {
                danhsachSinhVien.add(sv);
            }

            System.out.print("Ban co muon tiep tuc khong?(Yes(y)/No(n)): ");
            tieptuc = sc2.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));

        System.out.println("Ket thuc nhap danh sach sinh vien.");
    }

    private static void XuatDS() {
        for (SinhVien sinhVien : danhsachSinhVien) {
            sinhVien.xuat();
        }
    }

    private static void XuatDSGioi() {
        for (SinhVien sinhVien : danhsachSinhVien) {
            if (sinhVien.getDiem() < 9 && sinhVien.getDiem() >= 7.5) {
                sinhVien.xuat();
            }
        }
    }

    public static void SapXepTheoDiem() {
        
        danhsachSinhVien.sort((sv1, sv2) -> Double.compare(sv2.getDiem(), sv1.getDiem()));
        System.out.println("Danh sach sinh vien sau khi sap xep ");
        for (SinhVien sinhVien : danhsachSinhVien) {
            sinhVien.xuat();
        }
    }

}
