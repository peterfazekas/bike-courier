package hu.bikecourier.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class DataFileLogger implements DataLogger {

    private static final String PATH = "src\\main\\resources\\";

    private final String fileName;

    public DataFileLogger(String fileName) {
        this.fileName = PATH + fileName;
    }

    @Override
    public void println(String text) {
        try (PrintWriter file = new PrintWriter(new FileWriter(fileName))){
            file.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
