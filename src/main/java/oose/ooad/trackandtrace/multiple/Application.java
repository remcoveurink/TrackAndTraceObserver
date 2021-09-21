package oose.ooad.trackandtrace.multiple;

public class Application {
    public static void main(String[] args) {
        ParcelManager manager = new ParcelManager();
        MobileListener mobileListener = new MobileListener("0687654321");

        int packageNr = manager.createNewParcelTracking();
        manager.attach(packageNr, new EmailAlertListener("gebruiker1@han.nl"));
        manager.attach(packageNr, new MobileListener("0612345678"));
//        manager.addParcelListener(packageNr, mobileListener);

//        int packageNr2 = manager.createNewParcelTracking();
//        manager.addParcelListener(packageNr2, new EmailAlertListener("beheerder@han.nl"));
//        manager.addParcelListener(packageNr2, mobileListener);

        manager.updateLocation(packageNr, ParcelLocation.ACKNOWLEDGED);
//        manager.updateLocation(packageNr2, Location.ACKNOWLEDGED);
        manager.updateLocation(packageNr, ParcelLocation.SHIPPED);
        manager.updateLocation(packageNr, ParcelLocation.DISPATCH);
//        manager.updateLocation(packageNr2, Location.SHIPPED);

        manager.updateLocation(packageNr, ParcelLocation.DELIVERED);
//        manager.updateLocation(packageNr2, Location.DISPATCH);
//        manager.updateLocation(packageNr2, Location.DELIVERED);
    }
}
