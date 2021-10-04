package oose.ooad.trackandtrace.single;

public class Application {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker("HAN R26");
        DispatchListener dispatchListener = new DispatchListener(tracker);

        tracker.attach(new MobileListener("0612345678"));
        tracker.attach(new EmailAlertListener("piet@han.nl"));

        tracker.updateLocation(ParcelLocation.ACKNOWLEDGED);
        tracker.updateLocation(ParcelLocation.SHIPPED);
        tracker.updateLocation(ParcelLocation.TRANSITION);
        tracker.updateLocation(ParcelLocation.DISPATCH);

        while(tracker.getLocation() != ParcelLocation.DELIVERY) {
            // Wait if dispatch handling would have been done on a different thread
            // observers are generally synchronous though, unlike pub/sub
        }
        tracker.detach(dispatchListener);
        tracker.updateLocation(ParcelLocation.DELIVERED);
    }
}
