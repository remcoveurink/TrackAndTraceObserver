package oose.ooad.trackandtrace.single;

public class DispatchListener implements ParcelLocationListener {
    private final ParcelTracker manager;

    public DispatchListener(ParcelTracker manager) {
        this.manager = manager;
        this.manager.attach(this);
    }

    @Override
    public void update(ParcelLocation parcelLocation) {
        if(parcelLocation == ParcelLocation.DISPATCH) {
            String recipient = manager.getRecipient();
            //TODO: process recipient address routing
            manager.updateLocation(ParcelLocation.DELIVERY);
        }
    }
}
