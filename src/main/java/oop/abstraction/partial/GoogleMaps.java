package oop.abstraction.partial;

import java.util.ArrayList;
import java.util.List;

public class GoogleMaps extends MapUtils {
    // LOGIC SPECIFIC TO GOOGLE GOES HERE!
    public List<Integer> getCoordinates() {
        return new ArrayList<Integer>();
    }

    @Override
    public String getSatelliteView() {
        return null;
    }
}
