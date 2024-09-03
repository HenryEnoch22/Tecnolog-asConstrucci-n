package WithRefactoring;

public class Main {
    public static void main(String[] args) {
        Account currentAcount =  new CurrentAcount(100, "Mag", "current");
        Account savingAccount = new SavingAccount(100, "Mag", "saving");
        Account otherAccount = new Other(100, "Mag", "other");

        System.out.println("Current balance: " + currentAcount.getBalance());
    }
}
