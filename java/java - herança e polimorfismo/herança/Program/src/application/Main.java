package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Rafael", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Joelma", 1000.0, 100.0);

        //UpCasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "felipe", 1000.00, 0.0);
        Account acc3 = new SavingAccount(1004, "Ana", 0.0, 0.0);

        //DownCasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.00);


        System.out.println(acc4);
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan((100.00));
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");

        }

        Account acc6 = new Account(1005, "Rafoso", 20.00);
        acc6.withdraw(15.00);
        System.out.println(acc6.getHolder());
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingAccount(1006, "rafaaaa", 20.00, 10.00);
        acc7.withdraw(15.00);
        System.out.println(acc7.getHolder());
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "RafaEl", 20.00, 10.00);
        acc8.withdraw(15.00);
        System.out.println(acc8.getHolder());
        System.out.println(acc8.getBalance());
    }
}