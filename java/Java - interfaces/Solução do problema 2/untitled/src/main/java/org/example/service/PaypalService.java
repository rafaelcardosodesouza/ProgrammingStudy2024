package org.example.service;

public class PaypalService implements OnlinePaymentService{
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interes(Double amount, Integer months) {
        return amount * 0.01 * months;
    }
}
