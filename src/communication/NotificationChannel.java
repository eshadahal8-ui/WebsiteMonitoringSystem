package communication;

public abstract class NotificationChannel {

    protected String channelName;

    public abstract void sendAlert(String msg);
}