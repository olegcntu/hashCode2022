import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        MyFileReader f = new MyFileReader();
        Clients.countClient = f.countOfClient();
        Clients.allIng = f.dishList();
        Clients.see();

       List<Clients> clients=new ArrayList<>();
       List<TreeSet<String>> like=f.like(1);
       List<TreeSet<String>> disLike=f.like(0);

        for(int i=0;i<Clients.countClient;i++){
            clients.add(new Clients(like.get(i),disLike.get(i)));
        }

        for(int i=0;i<Clients.countClient;i++){
            System.out.println(i+":  "+clients.get(i).toString());
        }




    }
}
