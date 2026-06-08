package observer_design;

public class Notification implements Observer {

    private String name;

    public Notification(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(name + " received notification.");
        System.out.println("Message: " + message);

    }
}

