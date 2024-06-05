package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Room number: ");
            int room = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy) ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/MM/yyyy) ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reserva = new Reservation(room, checkIn, checkOut);
            System.out.println("Reservation " + reserva);
            System.out.println();
            System.out.println("enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy) ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy) ");
            checkOut = sdf.parse(sc.next());


            reserva.updateDate(checkIn, checkOut);

            System.out.println("Reservation update" + reserva);
        } catch (ParseException e){
            System.out.println("Invalid date format");
        } catch (DomainException e){
            System.out.println("Erro in reservation " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Erro number of room invalid ");
        } catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();


    }
}