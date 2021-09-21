package oose.ooad.trackandtrace.multiple;

public class DispatchListener implements ParcelLocationListener {
    private ParcelTracker parcelTracker;

    public DispatchListener(ParcelTracker parcelTracker) {
        this.parcelTracker = parcelTracker;
        this.parcelTracker.attach(this);
    }

    @Override
    public void update(int parcelNumber, ParcelLocation parcelLocation) {
        if(parcelLocation == ParcelLocation.DISPATCH) {
            String recipient = parcelTracker.getRecipient();
            //TODO: process recipient address routing
            parcelTracker.updateLocation(ParcelLocation.DELIVERY);
        }
    }
}
