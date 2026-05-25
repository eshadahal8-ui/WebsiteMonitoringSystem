package model;

import java.util.Date;

public class Notification {

    private int notificationID;
    private String message;
    private Date dataSent;

    public Notification(int notificationID, String message) {
        this.notificationID = notificationID;
        this.message = message;
        this.dataSent = new Date();
    }

    public void send() {
        System.out.println("Notification sent: " + message);
    }
}