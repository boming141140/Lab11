import java.util.Date;
public class Account {
    private int id;
    private double balance, annualInterestRate;
    static int number = 0;
    private Date dateCreate;
    public Account() {
        number += 1;
        dateCreate = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreate = new Date();
        number += 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate()*balance;
    }

    public void withDraw(double amount) {
        if(amount > balance)
            System.out.println("Invalid withDraw Amount.");
        else
            balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(1, 1000);
        account1.setAnnualInterestRate(0.1);
        account2.setAnnualInterestRate(0.2);
        //ID
        System.out.printf("Account1 ID: %d\n", account1.getId());
        System.out.printf("Account2 ID: %d\n", account2.getId());
        //Balance
        System.out.printf("Account1 Balance: %f\n", account1.getBalance());
        System.out.printf("Account2 Balance: %f\n", account2.getBalance());
        //AnnualInterestRate
        System.out.printf("Account1 AnnualInterestRate: %f\n", account1.getAnnualInterestRate());
        System.out.printf("Account2 AnnualInterestRate: %f\n", account2.getAnnualInterestRate());
        //Date
        System.out.printf("Account1 Date: %s\n", account1.getDateCreate());
        System.out.printf("Account2 Date: %s\n", account2.getDateCreate());
        //MonthlyInterestRate
        System.out.printf("Account1 MonthlyInterest: %f\n", account1.getMonthlyInterestRate());
        System.out.printf("Account2 MonthlyInterest: %f\n", account2.getMonthlyInterestRate());
        //MonthlyInterest
        System.out.printf("Account1 MonthlyInterest: %f\n", account1.getMonthlyInterest());
        System.out.printf("Account2 MonthlyInterest: %f\n", account2.getMonthlyInterest());
        //Number of Account
        System.out.printf("Number of Account: %d\n", Account.number);
    }
}