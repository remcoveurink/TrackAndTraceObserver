package oose.ooad.trackandtrace.single;

public class ParcelTracker extends ParcelTrackerInterface {
    private String recipient;
    protected ParcelLocation currentParcelLocation = ParcelLocation.UNKNOWN;

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

    @Override
    public void notifyListeners() {
        this.listeners.forEach((ParcelLocationListener listener)->{listener.update(currentParcelLocation);});
    }
}
