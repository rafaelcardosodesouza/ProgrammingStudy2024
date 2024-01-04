import java.util.Scanner;
import java.time.LocalDateTime;

import resources.*;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);

        LocalDateTime timeNow = LocalDateTime.now();
        String formattedTime = String.format("%02d:%02d", timeNow.getHour(), timeNow.getMinute());

        System.out.println("Welcome, choose the desired option below");
        System.out.println(formattedTime);

        Cashier cash = new Cashier();
        Validation validation = new Validation();
        TicketSale ticketSale = new TicketSale();

        do {
            System.out.println("\n1 - Ticket Sale\n2 - Validation\n3 - Cashier\n0 - Leave");
            System.out.print("-> ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("-> ");
                sc.next();
            }
            op = sc.nextInt();

            switch (op) {
                case 1: {
                    cash.cashMethod();
                    break;
                }
                case 2: {
                    validation.validationMethod();
                    break;
                }
                case 3: {
                    ticketSale.ticketMethod();
                    break;
                }
                case 0: {
                    System.out.println("Check-out");
                    break;
                }
                default: {
                    System.out.println("Value invalid input. Please enter a valid number.");
                    break;

                }
            }
        } while (op != 0);
    }
}