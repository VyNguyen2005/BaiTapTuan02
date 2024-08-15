/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        String id, name;
        int balance;

        Account myAccount = new Account("TK1", "Vy", 5000000);
        Scanner sc = new Scanner(System.in);   

        System.out.print("Nhap id tai khoan yourAccount: ");
        id = sc.nextLine();
        System.out.print("Nhap ten tai khoan yourAccount: ");
        name = sc.nextLine();
        System.out.print("Nhap so du tai khoan yourAccount: ");
        balance = sc.nextInt();
        
        Account yourAccount = new Account(id, name, balance);
        
        System.out.println("---THONG TIN TAI KHOAN BAN DAU---");
        ExportInfo(myAccount);
        System.out.println("");
        ExportInfo(yourAccount);
        
        System.out.print("\n--Thuc hien nap 2000000 2 tai khoan--");
        myAccount.credit(2000000);
        yourAccount.credit(2000000);
        
        System.out.print("\n--Thuc hien rut 3000000 trong tai khoan myAccount--");
        myAccount.debit(3000000);
        
        System.out.print("\n--Thuc hien chuyen 4000000 tu tai khoan yourAccount vao tai khoan myAccount--");
        yourAccount.tranferTo(myAccount, 4000000);
        System.out.println("");
        System.out.println("---THONG TIN TAI KHOAN SAU KHI THUC HIEN GIAO DICH---");
        ExportInfo(myAccount);
        System.out.println("");
        ExportInfo(yourAccount);
    }
    public static void ExportInfo(Account account){
        System.out.print("Id = " +account.getId() + ", Name = " +account.getName() + ", Balance = " +account.getBalance());
    }
}
