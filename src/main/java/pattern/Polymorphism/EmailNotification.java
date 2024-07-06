package pattern.Polymorphism;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("send email : " + message);
    }
}
