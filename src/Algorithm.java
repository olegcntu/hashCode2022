import java.util.*;

public class Algorithm {

    public String work(List<Clients> clients) {
        Set<String> like = new HashSet<>();
        Set<String> dis = new HashSet<>();

        for (Clients c : clients) {
            Set<String> curlikes = c.like;
            Set<String> curdis = c.disLike;

            for (String s : curlikes) {
                if (dis.contains(s)) {
                    dis.add(s);
                }
                else if (!dis.contains(s)) {
                    like.add(s);
                }
            }


            for (String d : curdis) {
                dis.add(d);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(like.size());
        sb.append(" ");
        for (String s : like) {
            sb.append(s);
            sb.append(" ");
        }
        String s = sb.toString();
        s = s.trim();
        System.out.println(s);
        return s;
    }
}
