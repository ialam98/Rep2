package Classes;

public class Account {
    private int accountNumber;
    private String name;
    double balance;
    String phoneNumber;
    String email;

    Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

//    Account() {
//    }




    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Add a positive balance");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void depositeMoney(double depositAmount) {
        balance = balance + depositAmount;
//        balance += depositAmount;
    }

    public void withdrawMoney(double withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
//        balance -= withdrawAmount;
        } else {
            System.out.println("You cannot withdraw money");

        }
    }
}
