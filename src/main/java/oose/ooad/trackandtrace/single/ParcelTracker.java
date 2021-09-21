package oose.ooad.trackandtrace.single;

public class ParcelTracker extends ParcelTrackerInterface {
    private String recipient;

    public ParcelTracker(String recipient) {
        this.recipient = recipient;
    }

    public void updateLocation(ParcelLocation parcelLocation) {
        currentParcelLocation = parcelLocation;
        notifyListeners();
    }

    public ParcelLocation getLocation() {
        return currentParcelLocation;
    }

    public String getRecipient() {
        return recipient;
    }
}
