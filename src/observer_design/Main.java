package observer_design;

public class Main {

    public static void main(String[] args) {

        Website website = new Website("https://behappy.com");

        Notification user1 = new Notification("Esha");
        Notification user2 = new Notification("Zhang ling hee");

        website.addObserver(user1);
        website.addObserver(user2);

        website.websiteChanged();

    }
}

