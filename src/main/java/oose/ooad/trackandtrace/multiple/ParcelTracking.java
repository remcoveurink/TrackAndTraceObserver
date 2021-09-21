package oose.ooad.trackandtrace.multiple;

import java.util.ArrayList;

public class ParcelTracking {
    private ArrayList<ParcelLocationListener> listeners = new ArrayList<>();
    private int parcelNumber;
    private ParcelLocation currentParcelLocation;

    public ParcelTracking(int parcelNumber) {
        this.parcelNumber = parcelNumber;
        this.currentParcelLocation = ParcelLocation.UNKNOWN;
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
}
