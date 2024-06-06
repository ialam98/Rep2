package Classes;

public class SavingsAccount extends Account{
    int addInterest;

    int withDrawLimit = 5;
    SavingsAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }

////    public void addInterest (double InterestAmount) {
////        double balance2 = getBalance();
////        balance2 = balance2 + InterestAmount;
////        setBalance(balance2);
//    }
    public void addInterest (double InterestPercentage) {
        double balance2 = getBalance();
        double interestAmount = balance2 * (InterestPercentage/100);
        balance2 = balance2 + interestAmount;
        setBalance(balance2);
    }

}
