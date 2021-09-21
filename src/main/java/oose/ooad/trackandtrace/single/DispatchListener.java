package oose.ooad.trackandtrace.single;

public class DispatchListener implements ParcelLocationListener {
    private ParcelManager manager;

    public DispatchListener(ParcelManager manager) {
        this.manager = manager;
    }

    @Override
    public void update(ParcelLocation parcelLocation) {
        if(parcelLocation == ParcelLocation.DISPATCH) {
            //TODO: process
            manager.updateLocation(ParcelLocation.DELIVERY);
        } else {
            // not relevant for dispatch
        }
    }
}
