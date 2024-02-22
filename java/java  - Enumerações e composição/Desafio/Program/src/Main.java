    import entities.Client;
    import entities.Order;
    import entities.OrderItem;
    import entities.Product;
    import entities.enums.OrderStatus;


    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Scanner;
    import java.util.Date;

    public class Main {
        public static void main(String[] args) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter cliente data:");
            System.out.print("Name: ");
            String tempName = sc.nextLine();
            System.out.print("Email: ");
            String tempEmail = sc.nextLine();
            System.out.print("Birth date (DD/MM/YYYY): ");
            String tempBirthDay = sc.nextLine();
            Date birthDay = sdf.parse(tempBirthDay);
            Client client = new Client(tempName, tempEmail, birthDay);
            System.out.println("\n");

            System.out.println("Enter oder data: ");
            System.out.print("Status: ");
            OrderStatus status = OrderStatus.valueOf(sc.nextLine());

            System.out.print("How may items to this order? ");
            Order order = new Order(new Date(), status, client);
            int quantity = sc.nextInt();
            for (int i = 1; i <= quantity; i++) {
                System.out.println("Enter # " + i + " item data");
                System.out.print("Product name: ");
                sc.nextLine();
                String tempNameProduct = sc.nextLine();
                System.out.print("Product price: ");
                Double tempPrice = sc.nextDouble();
                System.out.print("Quantity: ");
                Integer tempQuantity = sc.nextInt();
                Product product = new Product(tempNameProduct, tempPrice);

                OrderItem lista = new OrderItem(tempQuantity, tempPrice, product);
                order.addItem(lista);

            }

            System.out.println("\nORDER SUMMARY");
            System.out.println(order);

            sc.close();
        }
    }