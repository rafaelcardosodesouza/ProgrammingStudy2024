package application;

import App.entities.Order;
import App.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1010, new Date(), OrderStatus.PROCESSING);
        System.out.println(order);
    }
}