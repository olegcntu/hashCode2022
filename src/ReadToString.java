import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadToString {

    public String fileToString() throws IOException {
        Path fileName = Path.of("C:/Users/PC/Desktop/d_difficult.in.txt");
        String actual = Files.readString(fileName);
        return actual;
    }

}
