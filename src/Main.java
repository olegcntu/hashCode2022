import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadToString readToString = new ReadToString();
        String allSt = readToString.fileToString();
        StringWork  stringWork=new StringWork(allSt);

        Clients.countClient = stringWork.countOfClient(allSt);
        Clients.allIng = stringWork.dishList();
        List<Clients> clients = new ArrayList<>();

        List<TreeSet<String>> like = stringWork.like(1);
        List<TreeSet<String>> disLike = stringWork.like(2);


        for (int i = 0; i < Clients.countClient; i++) {
            clients.add(new Clients(like.get(i), disLike.get(i)));
        }

        for (int i = 0; i < Clients.countClient; i++) {
            System.out.println(clients.get(i));
            ;
        }
        Algorithm alg = new Algorithm();
        new FileWriter().stringToFile(alg.work(clients));


    }
}
