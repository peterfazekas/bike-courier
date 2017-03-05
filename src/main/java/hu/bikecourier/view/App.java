package hu.bikecourier.view;

import hu.bikecourier.console.Console;
import hu.bikecourier.logger.DataFileLogger;
import hu.bikecourier.logger.DataLogger;
import hu.bikecourier.model.Pay;
import hu.bikecourier.read.DataFileReader;
import hu.bikecourier.read.DataReader;
import hu.bikecourier.service.DataParse;
import hu.bikecourier.service.Rides;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class App {

    private final DataReader read;
    private final DataParse data;
    private final Rides rides;
    private final Console console;
    private final DataLogger log;

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    public App() {
        read = new DataFileReader("tavok.txt");
        data = new DataParse();
        rides = new Rides(data.parse(read.read()));
        log = new DataFileLogger("dijazas.txt");
        console = new Console();
    }

    private void println() {
        System.out.println("2. feladat: A hét első fuvarja " + rides.getFirstRideDistance() + " km volt.");
        System.out.println("3. feladat: A hét utolsó fuvarja " + rides.getLastRideDistance() + " km volt.");
        System.out.println("4. feladat: A futár a hét következő napjain tartott szabadnapot: " + rides.getFreeDays());
        System.out.println("5. feladat: A hét " + rides.getMaximumNumberOfRide() + ". napján volt a legtöbb fuvar.");
        System.out.println("6. feladat: A futár a heti tekerése: " + rides.getDailyDistances());
        System.out.print(  "7. feladat: Adja meg a kívánt távolságot [d]: ");
        Pay pay = Pay.fromDistance(console.read());
        System.out.println("   A megadott távolság után " + pay.getWage() + " Ft fizetés jár!");
        System.out.println("9. feladat: A futár a heti munkabére: " + rides.getTotalWage() + " Ft");
        log.println(rides.toString());
    }
}
