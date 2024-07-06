package App;

import App.view.Logo;
import App.view.Menu;
import App.view.UserView;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import static App.view.Logo.logo;
import static App.view.Menu.mainMenu;

public class Application {
    /*
    Requirement:
    - make a e-commere system using command line
    - some art and graphic using chat gpt generate
        -user
            uuid
            username
            password - hash by username + secretcode (app)
        -product
            uuid
            product_name
            price
        -order
            uuid
            product_list
            user_detail
            order_status
        user in register will be
     */
    private static UserView userView;
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(logo);
        userView = UserView.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            mainMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    boolean isLogin = userView.userLoginView(scanner);
                    if (isLogin) {
                        Menu.userMenu();
                        choice = scanner.nextInt();
                        boolean userOut = true;
                        while (userOut) {
                            switch (choice) {
                                default: {
                                    userOut = false;
                                    break;
                                }
                            }
                        }
                    } else {
                        exit = true;
                        System.out.println("Wrong username or password");
                    }
                    break;
                case 2:
                    userView.userRegister(scanner);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting the menu. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }

}
