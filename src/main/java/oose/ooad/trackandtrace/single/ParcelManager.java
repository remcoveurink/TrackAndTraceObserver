package oose.ooad.trackandtrace.single;

public class ParcelManager extends ParcelManagerInterface {
    public void updateLocation(ParcelLocation parcelLocation) {
        currentParcelLocation = parcelLocation;
        notifyListeners();
    }

    public ParcelLocation getLocation() {
        return currentParcelLocation;
    }
}
