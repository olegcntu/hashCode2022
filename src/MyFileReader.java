import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyFileReader {


    public int countOfClient() throws IOException {

        FileReader fileReader = new FileReader("C:/Users/PC/Desktop/d_difficult.in.txt");
        Scanner scanner = new Scanner(fileReader);

        int result = Integer.parseInt(scanner.nextLine());
        fileReader.close();


        return result;
    }

    public Set<String> dishList() throws FileNotFoundException {

        Set<String> allIng = new HashSet<>();

        FileReader fileReader = new FileReader("C:/Users/PC/Desktop/d_difficult.in.txt");
        Scanner scanner = new Scanner(fileReader);

        int i = 1;

        while (scanner.hasNextLine()) {
            if (i % 2 == 0) {
                String st = scanner.nextLine();
                String[] subStr = st.split(" ");
                for (int a = 1; a < subStr.length; a++) {
                    allIng.add(subStr[a]);
                }
            } else {
                i++;
                scanner.nextLine();
                continue;
            }
            i++;
        }
        return allIng;
    }

    public ArrayList<TreeSet<String>> like(int i) throws FileNotFoundException {

        ArrayList<TreeSet<String>> result=new ArrayList<>();

        FileReader fileReader = new FileReader("C:/Users/PC/Desktop/d_difficult.in.txt");
        Scanner scanner = new Scanner(fileReader);

        if(i==0){scanner.nextLine();i++;}
        while (scanner.hasNextLine()) {
            TreeSet<String> like = new TreeSet<>();

            if (i % 2 == 0) {
                String st = scanner.nextLine();
                String[] subStr = st.split(" ");
                for (int a = 1; a < subStr.length; a++) {
                    like.add(subStr[a]);
                }
                result.add(like);

            } else {
                i++;
                scanner.nextLine();
                continue;
            }
            i++;
        }
        return result;
    }

}

