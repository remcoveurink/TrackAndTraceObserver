package oose.ooad.trackandtrace.multiple;

import java.util.ArrayList;

public class ParcelTracker {
    private final ArrayList<ParcelLocationListener> listeners;
    private final int parcelNumber;
    private final String recipient;
    private ParcelLocation currentParcelLocation;

    public ParcelTracker(int parcelNumber, String recipient) {
        this.parcelNumber = parcelNumber;
        this.recipient = recipient;
        this.currentParcelLocation = ParcelLocation.UNKNOWN;
        this.listeners = new ArrayList<>();
        new DispatchListener(this); // prepare for processing when arriving at dispatch
    }

    public void attach(ParcelLocationListener listener) {
        this.listeners.add(listener);
    }

    public void detach(ParcelLocationListener listener) {
        this.listeners.remove(listener);
    }

    public void notifyListeners() {
        this.listeners.forEach((ParcelLocationListener listener)->{listener.update(parcelNumber, currentParcelLocation);});
    }

    public void updateLocation(ParcelLocation parcelLocation) {
        this.currentParcelLocation = parcelLocation;
        notifyListeners();
    }

    public String getRecipient() {
        return recipient;
    }
}
