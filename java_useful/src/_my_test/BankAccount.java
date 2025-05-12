package _my_test;

public class BankAccount {
    int accountNumber;
    String owner;
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    public String toString(){
        return "현재 잔액은 " + balance + " 입니다.";
    }
}

