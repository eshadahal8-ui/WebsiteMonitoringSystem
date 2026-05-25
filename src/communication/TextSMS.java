package communication;

public class TextSMS extends NotificationChannel {

    private String userPhone;

    public TextSMS(String userPhone) {
        this.userPhone = userPhone;
        this.channelName = "SMS";
    }

    @Override
    public void sendAlert(String msg) {
        System.out.println("Sending SMS to " + userPhone);
        System.out.println("Message: " + msg);
    }
}