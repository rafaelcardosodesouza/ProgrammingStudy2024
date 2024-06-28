package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import javax.print.attribute.standard.RequestingUserName;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(retirada, retorno, new Vehicle(modelo));

        System.out.print("Entre com preço por hora: ");
        Double pricePerHour = sc.nextDouble();

        System.out.print("Entre com preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("Fatura: ");
        System.out.println("Pagamento Basico: R$ " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: R$ " + cr.getInvoice().getTax());
        System.out.println("Pagamento Total: R$ " + cr.getInvoice().getTotalPayment());


        sc.close();
    }
}
