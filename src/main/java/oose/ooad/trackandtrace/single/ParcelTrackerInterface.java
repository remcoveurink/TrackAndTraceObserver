package oose.ooad.trackandtrace.single;

import java.util.ArrayList;

public class ParcelTrackerInterface {
    protected ArrayList<ParcelLocationListener> listeners = new ArrayList<>();
    protected ParcelLocation currentParcelLocation = ParcelLocation.UNKNOWN;

    public void attach(ParcelLocationListener listener) {
        this.listeners.add(listener);
    }

    public void detach(ParcelLocationListener listener) {
        this.listeners.remove(listener);
    }

    public void notifyListeners() {
        this.listeners.forEach((ParcelLocationListener listener)->{listener.update(currentParcelLocation);});
    }
}
