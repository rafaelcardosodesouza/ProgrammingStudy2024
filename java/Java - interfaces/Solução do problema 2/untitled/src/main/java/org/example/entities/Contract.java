package org.example.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract extends Installment{
    private Integer number;
    private LocalDate data;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate data, Double totalValue) {
        this.number = number;
        this.data = data;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
