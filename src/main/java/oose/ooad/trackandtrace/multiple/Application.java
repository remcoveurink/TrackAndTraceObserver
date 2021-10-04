package oose.ooad.trackandtrace.multiple;

public class Application {
    public static void main(String[] args) {
        ParcelManager manager = new ParcelManager();
        MobileListener mobileListener = new MobileListener("0687654321");

        int packageNr = manager.createNewParcel("HAN R26");
        manager.attach(packageNr, new EmailAlertListener("gebruiker1@han.nl"));
        manager.attach(packageNr, new MobileListener("0612345678"));
        manager.attach(packageNr, mobileListener);

//        int packageNr2 = manager.createNewParcel("HAN R31");
//        manager.attach(packageNr2, new EmailAlertListener("beheerder@han.nl"));
//        manager.attach(packageNr2, mobileListener);

        manager.updateLocation(packageNr, ParcelLocation.ACKNOWLEDGED);
//        manager.updateLocation(packageNr2, ParcelLocation.ACKNOWLEDGED);
        manager.updateLocation(packageNr, ParcelLocation.SHIPPED);
        manager.updateLocation(packageNr, ParcelLocation.TRANSITION);
        manager.updateLocation(packageNr, ParcelLocation.DISPATCH);
//        manager.updateLocation(packageNr2, ParcelLocation.SHIPPED);

        manager.updateLocation(packageNr, ParcelLocation.DELIVERED);
//        manager.updateLocation(packageNr2, ParcelLocation.DISPATCH);
//        manager.updateLocation(packageNr2, ParcelLocation.DELIVERED);
    }
}
