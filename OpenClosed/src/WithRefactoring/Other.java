package WithRefactoring;

public class Other extends Account{
    public Other(double balance, String name, String accountType) {
        super(balance, name, accountType);
    }

    @Override
    public double getBalance() {
        return balance * 0.15;
    }
}
