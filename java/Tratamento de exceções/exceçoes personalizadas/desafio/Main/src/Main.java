import model.entities.Account;
import model.exceptions.DomainException;
import java.util.Locale;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = sc.nextDouble();

            Account account = new Account(number, name, balance, limit);


            System.out.print("Enter amount for withdrawn: ");
            Double amountWithdrawn = sc.nextDouble();

            account.withdraw(amountWithdrawn);
            System.out.println();
            System.out.printf("New Balance: %.2f%n", account.getBalance());

        } catch (DomainException e) {
            System.out.println("Withdraw error:" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro number invalid");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}