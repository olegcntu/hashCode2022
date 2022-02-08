import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StringWork {
    private String st;

    public StringWork(String st) {
        this.st = st;
    }

    public  int countOfClient(String st) {
        int result;
        String resultSt = st.split("\n")[0];
        result = Integer.parseInt(resultSt);
        return result;
    }


    public  Set<String> dishList()  {

        Set<String> allIng = new HashSet<>();
        String row[] = st.split("\n");

        for (int i = 1; i < row.length; i = i + 2) {

            String word[] = row[i].split(" ");

            for (int j = 1; j < word.length; j++) {
                allIng.add(word[j]);
            }
        }

        return allIng;
    }

    public  ArrayList<TreeSet<String>> like(int param) {

        String[] rowArr = st.split("\n");

        ArrayList<TreeSet<String>> result = new ArrayList<>();

        for (int i = param; i < rowArr.length; i=i+2) {
            TreeSet<String> like = new TreeSet<>();

            String[] word = rowArr[i].split(" ");
            for (int j = 1; j < word.length; j++) {
                like.add(word[j]);
            }
            result.add(like);
        }

        return result;
    }

}
