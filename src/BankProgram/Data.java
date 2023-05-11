package BankProgram;

public class Data {
    private int credit;
    private int debit;
    private int balance = 50000;

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
