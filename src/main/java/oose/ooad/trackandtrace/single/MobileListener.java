package oose.ooad.trackandtrace.single;

public class MobileListener implements ParcelLocationListener {
    private final String mobileNumber;

    public MobileListener(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(ParcelLocation parcelLocation) {
        System.out.println("send a notification to " + mobileNumber + " with current location: " + parcelLocation);
    }
}
