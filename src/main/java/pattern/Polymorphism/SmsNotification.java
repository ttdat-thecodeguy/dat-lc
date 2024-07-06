package pattern.Polymorphism;

public class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.printf("Sms Notification %s \n", message);
    }
}
