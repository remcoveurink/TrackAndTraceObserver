package oose.ooad.trackandtrace.single;

public class Application {
    public static void main(String[] args) {
        ParcelManager manager = new ParcelManager();
        manager.attach(new DispatchListener(manager));

        manager.attach(new MobileListener("0612345678"));
        manager.attach(new EmailAlertListener("piet@han.nl"));

        manager.updateLocation(ParcelLocation.ACKNOWLEDGED);
        manager.updateLocation(ParcelLocation.SHIPPED);
        manager.updateLocation(ParcelLocation.DISPATCH);

        manager.updateLocation(ParcelLocation.DELIVERED);
    }
}
