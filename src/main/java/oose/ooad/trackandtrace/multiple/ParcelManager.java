package oose.ooad.trackandtrace.multiple;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ParcelManager {
    private Map<Integer, ParcelTracking> parcelLocationManagers = new HashMap<>();
    private Random randomParcelNumberGenerator = new Random();
    private DispatchListener dispatch = new DispatchListener(this);

    public int createNewParcelTracking() {
        int parcelNumber = getUniqueParcelNumber();
        ParcelTracking parcelTracking = new ParcelTracking(parcelNumber);
        parcelTracking.attach(dispatch);
        parcelLocationManagers.put(parcelNumber, parcelTracking);
        return parcelNumber;
    }

    public void attach(int parcelNumber, ParcelLocationListener listener) {
        parcelLocationManagers.get(parcelNumber).attach(listener);
    }

    public void detach(int parcelNumber, ParcelLocationListener listener) {
        parcelLocationManagers.get(parcelNumber).detach(listener);
    }

    public void updateLocation(int packageNr, ParcelLocation parcelLocation) {
        this.parcelLocationManagers.get(packageNr).updateLocation(parcelLocation);
    }

    private int getUniqueParcelNumber() {
        int parcelNumber;
        do {
            parcelNumber = randomParcelNumberGenerator.nextInt(9999999);
        } while(parcelLocationManagers.containsKey(parcelNumber));
        return parcelNumber;
    }
}
