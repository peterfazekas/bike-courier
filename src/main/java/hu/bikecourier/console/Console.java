package hu.bikecourier.console;

import java.util.Scanner;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class Console {

    private final Scanner sc;

    public Console() {
        sc = new Scanner(System.in);
    }

    public int read() {
        return sc.nextInt();
    }
}
