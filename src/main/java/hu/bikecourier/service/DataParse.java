package hu.bikecourier.service;

import hu.bikecourier.model.Ride;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class DataParse {

    private static final String SEPARATOR = " ";

    public List<Ride> parse (List<String> lines) {
        List<Ride> rides = new ArrayList<>();
        for (String line : lines) {
            rides.add(getRide(line));
        }
        return rides;
    }

    private Ride getRide(String line) {
        String[] items = line.split(SEPARATOR);
        return new Ride(Integer.parseInt(items[0]), Integer.parseInt(items[1]), Integer.parseInt(items[2]));
    }


}
