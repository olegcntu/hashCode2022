import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {
    public void stringToFile(String result) throws IOException {

        Path fileName = Path.of("demo.txt");
        Files.writeString(fileName, result);
    }
}
