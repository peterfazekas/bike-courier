package hu.bikecourier.model;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public enum Pay {
    FIRST(1, 500),
    SECOND(3, 700),
    THIRD(6, 900),
    FOURTH(11, 1400),
    FIFTH(21, 2000);

    private final int distance;
    private final int wage;

    Pay(final int distance, final int wage) {
        this.distance = distance;
        this.wage = wage;
    }

    public static Pay fromDistance(final int distance) {
        Pay actualPay = FIRST;
        for (Pay pay : Pay.values()) {
           if(distance >= pay.distance) {
               actualPay = pay;
           }
        }
        return actualPay;
    }

    public int getWage() {
        return wage;
    }
}
