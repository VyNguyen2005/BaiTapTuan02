/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02_BT02_KeThua;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        double bankinh = sc.nextDouble();
        HinhTron htron = new HinhTron(bankinh);
        System.out.println("Hinh tron: Ban kinh: " +bankinh + ", Dien tich: " +htron.tinhDienTich() + ", Chu vi: " +htron.tinhChuVi());
        
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieucao = sc.nextDouble();
        HinhTru htru = new HinhTru(bankinh, chieucao);
        System.out.println("Hinh tron: Ban kinh: " +bankinh + ", The tich: " +htru.tinhTheTich()+ ", Dien tich: " +htru.tinhDienTich());
    }
}
