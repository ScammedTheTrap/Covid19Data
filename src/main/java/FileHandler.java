import java.io.File;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File f = new File("Covid19Data.csv");

    public ArrayList<Covid19Data> restoreData() throws IOException {
        ArrayList<Covid19Data> covidData = new ArrayList<>();
        Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
        while (sc.hasNext()) {
            String linje = sc.nextLine();

            String[] attributes = linje.split(";");

            Covid19Data covid19Data = new Covid19Data(
                    (attributes[0]),
                    (attributes[1]),
                    Integer.parseInt(attributes[2]),
                    Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[4]),
                    Integer.parseInt(attributes[5]));

            covidData.add(covid19Data);

        }
        sc.close();
        return covidData;
    }

}
