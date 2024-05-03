package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }
    }

    // public 메서드
    public int getBalance() {
        return balance;
    }
}
