package homework.week02.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    public Account() {
    }

    public Account(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        if (money <= 0) {
            System.out.println("잘못된 금액입니다.");
            return;
        }
        
        if (this.balance < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        
        this.balance -= money;
    }

    public void showBalance() {
        System.out.println(this.balance);
    }

}
