package oose.ooad.trackandtrace.multiple;

public class EmailAlertListener implements ParcelLocationListener {
    private String mailAddress;

    public EmailAlertListener(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public void update(int parcelNumber, ParcelLocation parcelLocation) {
        System.out.println("send a mail to " + mailAddress + " with current location: " + parcelLocation + " for parcel: " + parcelNumber);
    }
}
