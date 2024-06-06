package Classes;

import javax.crypto.spec.PSource;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account(224455, "Iftekhar");

//        account.accountNumber = 123;
//        account.name = "Iftekhar";
//        account.balance = 50;
//        account.balance = account.balance+70;
//
//        System.out.println(account.balance);
//        account.withdrawMoney(50.5);
//        System.out.println("Remaining balance is :" + account.balance);
//        account.setAccountNumber(224455);
//        System.out.println(account.getAccountNumber());
//        account.setBalance(50);
//        System.out.println(account.getBalance());
//        System.out.println(account.getName());
//
//        account.depositeMoney(500);
//        System.out.println(account.getBalance());

        account.withdrawMoney((600));
        System.out.println(account.balance);

        System.out.println(account.getName());

        CheckingAccount CAccount = new CheckingAccount(438997, "checkingaccount"); {
        }

        SavingsAccount SAccount = new SavingsAccount(345655, "Ifty") ;
        SAccount.setBalance(500);
        System.out.println(SAccount.getBalance());
        SAccount.addInterest(5);
        System.out.println(SAccount.getBalance());
        SAccount.withdrawMoney(50);
        SAccount.withdrawMoney(50);
        SAccount.withdrawMoney(50);
        System.out.println(SAccount.getBalance());
        System.out.println("**********");
        SAccount.withdrawMoney(50);
        System.out.println(SAccount.getBalance());


    }
}
