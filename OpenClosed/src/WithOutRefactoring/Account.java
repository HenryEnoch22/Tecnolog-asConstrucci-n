package WithOutRefactoring;

public class Account {
    private double balance;
    private String name;
    private String  accountType;

    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public double calculatedInterest() {
        if(accountType == "current") {
            return balance * 0.2;
        }else{
            return balance * 0.3;
        }
    }
}
