package WithRefactoring;

public class CurrentAcount extends Account{
    public CurrentAcount(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return balance * 0.2;
    }


}
