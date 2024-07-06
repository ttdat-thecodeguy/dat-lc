package App.view;

import App.service.UserService;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class UserView {

    private final UserService userService;
    public static volatile UserView USER_VIEW;

    static {
        try {
            USER_VIEW = new UserView();
        } catch (Exception ignored) {}
    }

    public static UserView getInstance() throws NoSuchAlgorithmException {
        if (USER_VIEW == null) {
            USER_VIEW = new UserView();
        }
        return USER_VIEW;

    }

    private UserView () throws NoSuchAlgorithmException {
        userService = new UserService();
    }


    public boolean userLoginView (Scanner scanner) {
            System.out.println("Input your username and password: ");
            String username = scanner.next();
            String password = scanner.next();
            return userService.login(username, password);
    }

    public boolean userRegister (Scanner scanner) throws NoSuchAlgorithmException {
        System.out.println("Input your username and password: ");
        String username = scanner.next();
        String password = scanner.next();
        return userService.register(username, password);
    }
}
