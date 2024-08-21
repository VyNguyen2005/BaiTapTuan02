/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT01_KeThua;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieudai = sc.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieurong = sc.nextDouble();
        ChuNhat hcn = new ChuNhat(chieudai, chieurong);
        hcn.xuat();
        
        System.out.print("Nhap canh hinh vuong: ");
        double canh = sc.nextDouble();
        Vuong hv = new Vuong(canh);
        hv.xuat();
    }
}
