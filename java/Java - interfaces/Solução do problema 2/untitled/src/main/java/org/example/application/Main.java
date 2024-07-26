package org.example.application;

import org.example.entities.Contract;
import org.example.entities.Installment;
import org.example.service.ContractService;
import org.example.service.PaypalService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        try {
            System.out.print("Numero: ");
            Integer numero = sc.nextInt();
            sc.nextLine();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate data = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor do contrato: ");
            Double totalValor = sc.nextDouble();
            System.out.print("Entre com a quantidade de parcelas: ");
            int numerosParcelas = sc.nextInt();

            Contract contract = new Contract(numero, data, totalValor);

            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContratc(contract, numerosParcelas);

            System.out.println("Parcelas: ");
            for(Installment installment : contract.getInstallments()){
                System.out.println(installment);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}