package pattern.Polymorphism;

public class App {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();
        notification.send("hello you");
    }
}
