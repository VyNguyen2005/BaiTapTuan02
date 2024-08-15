/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        
        double length, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        width = sc.nextDouble();
        Rectangle r2 = new Rectangle(length, width);
        
        System.out.println("---THONG TIN HINH CHU NHAT---");
        System.out.println("HINH CHU NHAT THU 1");
        ExportInfo(r1);
        System.out.println("");
        System.out.println("HINH CHU NHAT THU 2");
        ExportInfo(r2);
    }
    public static void ExportInfo(Rectangle r){
        System.out.print("Chieu dai = " +r.getLength() + ", Chieu rong = " +r.getWidth() + " Dien tich = " +r.findArea() + ", Chu vi = " +r.findPerimeter());
        
    }
}

