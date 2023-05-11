package BankProgram;

import java.util.Objects;
import java.util.Scanner;

abstract class Bank {
    protected String name = "Welcome Abhishek";
    public abstract void balance();
    public abstract void credit();
    public abstract void debit();
}

class account extends Bank{
    Scanner s = new Scanner(System.in);
    @Override
    public void balance() {
        Data data = new Data();
        System.out.println("Balance : " + data.getBalance());
    }

    @Override
    public void credit() {
        int cr = s.nextInt();
        Data dataCredit = new Data();
        dataCredit.setCredit(cr);
        int updated = dataCredit.getBalance() + cr;
        dataCredit.setBalance(updated);
        System.out.println("Updated Balance : " + updated);
    }

    @Override
    public void debit() {
        int de = s.nextInt();
        Data dataDebit = new Data();
        dataDebit.setDebit(de);
        int updated = dataDebit.getBalance() - de;
        dataDebit.setBalance(updated);
        System.out.println("Updated Balance : " + updated);
    }
}

class Main{
    public static void main(String[] args) {
        account acc = new account();
        System.out.println(acc.name);
        acc.balance();
        Scanner s = new Scanner(System.in);
        System.out.println("What do you want to do : Credit or Debit (Type 'c' or 'd' accordingly)");


        String option = s.next();





        if (Objects.equals(option, "c")){
            System.out.print("Add Money : ");
            acc.credit();
        }
        else if (Objects.equals(option, "d")){
            System.out.print("Withdraw Money : ");
            acc.debit();
        }
        else {
            System.out.println("Wrong Entry, Repeat Task");
        }


    }
}
