import java.util.UUID;

public class SBIBank implements Bank{
    private int balance;
    private String name;
    private int roi;
    private String password;
    private String accountNumber;

    public SBIBank(int balance, String name, String password){
        this.balance = balance;
        this.name = name;
        this.password = password;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public SBIBank(String name, String password){
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getRoi() {
        return roi;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int checkBalance() {
        return balance;
    }

    @Override
    public boolean addMoney(int money) {
        this.balance += money;
        return true;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance < money) return false;

        this.balance -= money;
        return true;
    }

    @Override
    public int getROI() {
        return roi;
    }

    @Override
    public int totalInterest(int loanAmount , int totalYear) {

        return loanAmount + totalYear;
    }
}
