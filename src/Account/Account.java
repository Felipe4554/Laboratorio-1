package Account;

import Usuarios.Customer;

public abstract class Account {
    private String number;
    private double balance;
    private Customer customer;
    private boolean active;

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isActive() {
        return active;
    }

    public Account(String number, double balance, Customer customer, boolean active) {
        this.number = number;
        this.balance = balance;
        this.customer = customer;
        this.active = true;
    }

    public Account(String number, Customer customer, boolean active) {
        this.number = number;
        this.balance = 0;
        this.customer = customer;
        this.active = true;
    }
    
    public boolean deposit(double amount) {
        
        return false;
        
    }
    
    public boolean withdraw(double amount) {
        
        return false;
        
    }
    
    public boolean transfer(Account destination, double amount) {
        
        return false;
        
    }
}
