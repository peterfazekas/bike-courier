package hu.bikecourier.model;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class Ride {

    private final int dayNumber;
    private final int rideNumber;
    private final int distance;
    private final Pay pay;

    public Ride(int dayNumber, int rideNumber, int distance) {
        this.dayNumber = dayNumber;
        this.rideNumber = rideNumber;
        this.distance = distance;
        pay = Pay.fromDistance(distance);
    }

    public Integer getDayNumber() {
        return dayNumber;
    }

    public Integer getRideNumber() {
        return rideNumber;
    }

    public Integer getDistance() {
        return distance;
    }

    public Pay getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return dayNumber + ". nap " + rideNumber + ". út: " + pay.getWage() + " Ft";
    }
}
