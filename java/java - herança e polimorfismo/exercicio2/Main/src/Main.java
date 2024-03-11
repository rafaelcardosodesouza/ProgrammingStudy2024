import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ArrayList<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c | u | i): ");
            String typeProduct = String.valueOf(sc.nextLine().charAt(0));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double prince = sc.nextDouble();

            if (typeProduct.equals("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                Product product = new UsedProduct(name, prince, date);
                productList.add(product);
            } else if (typeProduct.equals("i")) {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, prince, customsFee);
                productList.add(product);

            } else {
                Product product = new Product(name, prince);
                productList.add(product);
            }
           sc.nextLine();
        }
        System.out.println("\n");
        for(Product product : productList){
            System.out.println(product.priceTag());

        }

        sc.close();
    }
}