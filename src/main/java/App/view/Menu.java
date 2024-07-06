package App.view;

public class Menu {
    public static void mainMenu () {
        System.out.println("====  Menu ====");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    public static void userMenu () {
        System.out.println("==== User  Menu ====");
        System.out.println("1. Product List");
        System.out.println("2. Order List");
        System.out.println("3. Buy Product");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    String paymentMethod = """
                          Payment Method Menu:
                          1. Credit Card
                          2. PayPal
                          3. Bitcoin
                          4. Exit
                          """;
 }
