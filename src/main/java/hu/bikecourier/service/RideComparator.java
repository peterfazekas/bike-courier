package hu.bikecourier.service;

import hu.bikecourier.model.Ride;

import java.util.Comparator;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class RideComparator implements Comparator<Ride> {
    @Override
    public int compare(Ride r1, Ride r2) {
        int sameDay = r1.getDayNumber().compareTo(r2.getDayNumber());
        return sameDay == 0 ? r1.getRideNumber().compareTo(r2.getRideNumber()) : sameDay;
    }
}
