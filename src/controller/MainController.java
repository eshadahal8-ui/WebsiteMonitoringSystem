package controller;

public class MainController {

    private int controllerID;

    public MainController(int controllerID) {
        this.controllerID = controllerID;
    }

    public void handleRegistration() {
        System.out.println("Handling registration.");
    }

    public void handleNewSubscription() {
        System.out.println("Handling new subscription.");
    }

    public void processUpdates() {
        System.out.println("Processing updates.");
    }

    public void handleNotification() {
        System.out.println("Handling notification.");
    }
}
