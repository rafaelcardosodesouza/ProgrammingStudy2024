import entitis.Circle;
import entitis.Color;
import entitis.Rectangle;
import entitis.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list= new ArrayList<>();


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i < n+1; i++) {
            System.out.println("Shape #" + i +" data: ");
            System.out.print("Rectangle or Circle (R or C): ");
            char ch = sc.next().charAt(0);
            ch = Character.toLowerCase(ch);
            System.out.print("Color (BLACK | BLUE | RED): ");
            Color color = Color.valueOf(sc.next());
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            } if(ch == 'c'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS");
        for(Shape x : list){
            System.out.printf("%.2f%n", x.area());
        }

        sc.close();
    }
}