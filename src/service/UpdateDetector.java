package service;

public class UpdateDetector {

    private int checkInterval;

    public UpdateDetector(int checkInterval) {
        this.checkInterval = checkInterval;
    }

    public boolean scanWebsite(String url) {
        System.out.println("Scanning website: " + url);
        return true;
    }

    public boolean hasChanged() {
        System.out.println("Website change detected.");
        return true;
    }
}