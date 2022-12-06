package com.mycompany.projectoop;

public class User {

    public int id;
    public String name;
    public String pin;
    public Number balance;
    public Number sumDeposit;
    public Number sumWithdraw;

    public User() {
    }

    public User(int id, String name, String pin, Number balance, Number sumDeposit, Number sumWithdraw) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        this.sumDeposit = sumDeposit;
        this.sumWithdraw = sumWithdraw;

    }
}
