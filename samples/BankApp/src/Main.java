import model.Account;

public class Main {
//    public static void depositInAccount(Account account, double amountToDeposit) {
//        account.setBalance(account.getBalance() + amountToDeposit);
//    }
//
//    public static void withdrawInAccount(Account account, double amountToWithdraw) {
//        account.setBalance(account.getBalance() + amountToWithdraw);
//    }

    public static void main(String[] args) {
        Account acc1 = new Account("John", 300);
        Account acc2 = new Account("Martha", 300);

        // codigo ruim eh codigo dificil de extender, entender e mudar

        // deposit
        acc1.deposit(200);

        // withdraw
        acc1.withdraw(150);
    }
}