/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.entity;

/**
 *
 * @author KP112068
 */
public class Account {
       private String username;
    private int balance;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
            return "Account [username=" + username + ", balance=" + balance + "]";
    }
} 
