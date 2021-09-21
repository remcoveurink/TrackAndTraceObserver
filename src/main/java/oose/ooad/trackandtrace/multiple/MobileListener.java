package oose.ooad.trackandtrace.multiple;

public class MobileListener implements ParcelLocationListener {
    private String mobileNumber;

    public MobileListener(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(int parcelNumber, ParcelLocation parcelLocation) {
        System.out.println("send a notification to " + mobileNumber + " with current location: " + parcelLocation
                + " for parcel: " + parcelNumber);
    }
}
