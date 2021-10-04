package oose.ooad.trackandtrace.single;

import java.util.ArrayList;

public abstract class ParcelTrackerInterface {
    protected ArrayList<ParcelLocationListener> listeners = new ArrayList<>();

    public void attach(ParcelLocationListener listener) {
        this.listeners.add(listener);
    }
    public void detach(ParcelLocationListener listener) {
        this.listeners.remove(listener);
    }
    public abstract void notifyListeners();
}
