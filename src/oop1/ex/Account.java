package oop1.ex;

public class Account {
    int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    public void showBalance() {
        System.out.println("잔고 : " + balance);
    }
}
