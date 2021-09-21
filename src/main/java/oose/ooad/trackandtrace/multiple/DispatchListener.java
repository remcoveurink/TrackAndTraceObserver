package oose.ooad.trackandtrace.multiple;

public class DispatchListener implements ParcelLocationListener {
    private ParcelManager manager;

    public DispatchListener(ParcelManager manager) {
        this.manager = manager;
    }

    @Override
    public void update(int parcelNumber, ParcelLocation parcelLocation) {
        if(parcelLocation == ParcelLocation.DISPATCH) {
            //TODO: process
            manager.updateLocation(parcelNumber, ParcelLocation.DELIVERY);
        } else {
            // not relevant for dispatch
        }
    }
}
