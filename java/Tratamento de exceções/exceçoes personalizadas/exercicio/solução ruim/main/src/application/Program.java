package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int room = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy) ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out date (dd/MM/yyyy) ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else  {
            Reservation reserva = new Reservation(room, checkIn, checkOut);
            System.out.println("Reservation " + reserva);
            System.out.println();
            System.out.println("enter data to update the reservation");
            System.out.print("Check-in date (dd/MM/yyyy) ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy) ");
            checkOut = sdf.parse(sc.next());



            String error = reserva.updateDate(checkIn, checkOut);
            if( error != null) {
                System.out.println("Error reservation: " + error);
            } else{
                System.out.println("Reservation update" + reserva);
            }

        }

        sc.close();




    }
}