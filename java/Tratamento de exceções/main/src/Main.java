import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method1();
        System.out.println("fim do programa");
    }


    public static void method1(){
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }
    public static void method2() {
        System.out.println("*** METHOD2 START ***");
        Scanner sc = new Scanner(System.in);

        try {

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (InputMismatchException a) {
            System.out.println("Deve ser digitado o numero da posição");
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Deve ser digitado um valor dentro do limite");
            b.printStackTrace();
            sc.next();
        }

        System.out.println("*** METHOD2 END ***");
        sc.close();
    }
}