package hu.bikecourier.service;

import hu.bikecourier.model.Ride;

import java.util.*;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class Rides {

    private static final int DAY_OF_WEEK = 7;
    private static final String NEW_LINE = "\r\n";
    private final List<Ride> rides;

    public Rides(List<Ride> rides) {
        this.rides = rides;
        sort();
    }

    private void sort() {
        Comparator<Ride> byDayAndRideNumber = (r1, r2) -> {
            int sameDay = r1.getDayNumber().compareTo(r2.getDayNumber());
            return sameDay == 0 ? r1.getRideNumber().compareTo(r2.getRideNumber()) : sameDay;
        };
        this.rides.sort(byDayAndRideNumber);
    }

    public String getFirstRideDistance() {
        int first = 0;
        return getRideDistance(first).toString();
    }

    public String getLastRideDistance() {
        int last = rides.size() - 1;
        return getRideDistance(last).toString();
    }

    private Integer getRideDistance(int index) {
        return rides.get(index).getDistance();
    }

    public int getTotalWage() {
        return rides.stream().mapToInt(i -> i.getPay().getWage()).sum();
    }

    public String getFreeDays() {
        StringBuilder sb = new StringBuilder();
        Integer[] week = buildWeekArray();
        for(int day = 0; day < DAY_OF_WEEK; day ++) {
            if (week[day] == 0) sb.append((day + 1) + " ");
        }
        return sb.toString();
    }

    public String getMaximumNumberOfRide() {
        Integer[] week = buildWeekArray();
        int max = Arrays.stream(week).max(Comparator.naturalOrder()).get();
        Integer day = Arrays.asList(week).indexOf(max) + 1;
        return day.toString();
    }

    private Integer[] buildWeekArray() {
        int[] week = new int[DAY_OF_WEEK];
        rides.forEach(i -> week[i.getDayNumber() - 1]++);
        return Arrays.stream(week).boxed().toArray(Integer[]::new);
    }

    public String getDailyDistances() {
        Map<Integer, Integer> dailyDistances = buildTreeMap();
        StringBuilder sb = new StringBuilder();
        dailyDistances.entrySet()
                .forEach(i -> sb.append(NEW_LINE + "   " + i.getKey() + ". nap " + i.getValue() + " km"));
        return sb.toString();
    }

    private Map<Integer, Integer> buildTreeMap() {
        Map<Integer, Integer> dailyDistances = new TreeMap<>();
        rides.forEach(i -> {
            int key = i.getDayNumber();
            int distance = dailyDistances.containsKey(key) ? dailyDistances.get(key) : 0;
            dailyDistances.put(key, distance + i.getDistance());
        });
        return dailyDistances;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        rides.forEach(i -> sb.append(i.toString() + NEW_LINE));
        return sb.toString();
    }
}
