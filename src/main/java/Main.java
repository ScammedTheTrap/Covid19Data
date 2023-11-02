import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        try {
            System.out.println(fileHandler.restoreData());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
