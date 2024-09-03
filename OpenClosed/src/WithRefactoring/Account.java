package WithRefactoring;

public abstract class Account {
    protected double balance;
    protected String name;
    protected String  accountType;

    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    public abstract double getBalance();

    public double calculatedInterest() {
        switch (accountType) {
            case "current":
                return balance * 0.05;

                case "saving":
                    return balance * 0.10;
                    case "other":
                        return balance * 0.15;

        }
        return 0;
    }
}
