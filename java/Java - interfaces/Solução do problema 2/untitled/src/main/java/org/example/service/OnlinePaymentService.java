package org.example.service;

public interface OnlinePaymentService {
    public Double paymentFee(Double amount);
    public Double interes(Double amount, Integer months);
}
