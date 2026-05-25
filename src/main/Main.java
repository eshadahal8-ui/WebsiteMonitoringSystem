package main;

import model.*;
import communication.*;
import service.*;
import controller.*;
import gui.*;

public class Main {

    public static void main(String[] args) {

        User user = new User(1, "Esha", "esha@gmail.com", "1234");
        user.register();
        user.login();

        Website website = new Website("https://behappy.com");

        WebsiteSubscription subscription =
                new WebsiteSubscription(1, "Daily", "Email");

        subscription.create();

        UpdateDetector detector = new UpdateDetector(10);
        detector.scanWebsite(website.getURL());

        if(detector.hasChanged()) {

            Notification notification =
                    new Notification(1, "Website updated!");

            notification.send();

            Email email = new Email("esha@gmail.com");
            email.sendAlert("Website updated!");

            TextSMS sms = new TextSMS("+49123456789");
            sms.sendAlert("Website updated!");
        }

        MainController controller = new MainController(100);
        controller.processUpdates();

        UserInterface ui = new UserInterface();
        ui.showMenu();
    }
}
