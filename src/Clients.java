import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Clients {

    public Clients(Set<String> like, Set<String> disLike) {
        this.like = like;
        this.disLike = disLike;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "like=" + like +
                ", disLike=" + disLike +
                '}';
    }

    public Set<String> like = new HashSet<>();
    public Set<String> disLike = new HashSet<>();

    public static int countClient;
    public static Set<String> allIng = new HashSet<>();

    public static void see() {
        System.out.println(countClient);
        System.out.println(allIng);
    }
}
