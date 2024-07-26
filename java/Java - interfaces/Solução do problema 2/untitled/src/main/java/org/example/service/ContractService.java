package org.example.service;

import org.example.entities.Contract;
import org.example.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }


    public void processContratc(Contract contract, int months) {

        double basicQouta = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getData().plusMonths(i);

            double interest = onlinePaymentService.interes(basicQouta, i);
            double fee = onlinePaymentService.paymentFee(basicQouta + interest);

            double quota = basicQouta + fee + interest;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }


}
