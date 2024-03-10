import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        sc.nextLine();
        for (int i = 1; i < n + 1; i++) {
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced? (y/n) ");
            String outsourced = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Valuer per hour: ");
            Double valuePerHour = sc.nextDouble();

            if ("y".equals(outsourced)) {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }
            sc.nextLine();
        }
        System.out.println("\n");
        System.out.println("PAYMENTS");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        sc.close();
    }
}