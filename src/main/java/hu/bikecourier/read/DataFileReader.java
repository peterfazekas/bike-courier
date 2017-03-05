package hu.bikecourier.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Peter_Fazekas on 2017.03.05..
 */
public class DataFileReader implements DataReader {

    private static final String PATH = "src\\main\\resources\\";

    private final String fileName;

    public DataFileReader(String fileName) {
        this.fileName = PATH + fileName;
    }

    public List<String> read() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            lines = reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
