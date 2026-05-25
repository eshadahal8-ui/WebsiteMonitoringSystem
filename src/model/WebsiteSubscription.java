package model;

public class WebsiteSubscription {

    private int subID;
    private String checkFrequency;
    private String channelPreference;

    public WebsiteSubscription(int subID, String checkFrequency, String channelPreference) {
        this.subID = subID;
        this.checkFrequency = checkFrequency;
        this.channelPreference = channelPreference;
    }

    public void create() {
        System.out.println("Subscription created.");
    }

    public void modify() {
        System.out.println("Subscription modified.");
    }

    public void cancel() {
        System.out.println("Subscription cancelled.");
    }
}