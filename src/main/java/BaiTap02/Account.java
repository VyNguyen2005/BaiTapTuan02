/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitap02;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void credit(int amount){
        if(amount > 0 ){
            balance = balance + amount;
            System.out.print("\nBan da nap " +amount + " ");
        }
        else{
            System.out.print("\nSo tien nap vao khong hop le");
        }
    }
    public void debit(int amount){
        if(amount > balance){
            System.out.print("\nSo du khong du. Giao dich rut tien that bai");
        }
        else{
            balance -= amount;
            System.out.print("\nBan da rut " +amount + " ");
        }
    }
    public void tranferTo(Account other, int amount){
        if(amount > balance){
            System.out.print("\nSo du khong du. Giao dich chuyen tien that bai");
        }
        else{
            balance -= amount;
            other.balance += amount;
            System.out.print("\nBan da chuyen " +amount + " ");
        }
    }
}
