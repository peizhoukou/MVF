/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Administrator
 */
public class Customer extends User {
    
    private double balance;
    private OrderHistory orderhistory;

    public Customer(double balance, int userId, String userName, String address, String password, String Phone, String email) {
        super(userId, userName, address, password, Phone, email);
        this.balance = balance;
    }

    public Customer(double balance) {
        this.balance = balance;
    }

    public Customer() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" + "balance=" + balance + '}';
    }
    
    
    
}
