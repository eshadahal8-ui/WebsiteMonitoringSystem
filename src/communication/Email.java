package communication;

public class Email extends NotificationChannel {

    private String userEmail;

    public Email(String userEmail) {
        this.userEmail = userEmail;
        this.channelName = "Email";
    }

    @Override
    public void sendAlert(String msg) {
        System.out.println("Sending Email to " + userEmail);
        System.out.println("Message: " + msg);
    }
}
