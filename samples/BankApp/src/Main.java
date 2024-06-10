import exception.InsuficientFundsException;
import exception.InvalidAccountException;
import model.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account("John", 300);
        Account acc2 = new Account("Martha", 300);

        // codigo ruim eh codigo dificil de extender, entender e mudar

        try {
            // deposit
            acc1.deposit(200);

            // withdraw
            acc1.withdraw(150);

            // transfer
            acc1.transfer(175, acc2);
        } catch (InsuficientFundsException e) {
            System.out.println("there is a problem with your funds... " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.out.println("your account seems to be invalid... " + e.getMessage());
        }

        System.out.println(acc1);
        System.out.println(acc2);
    }
}