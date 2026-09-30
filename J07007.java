import java.util.*;
import java.io.*;
public class J07007{
    public static void main(String[] args) throws IOException{
        File file = new File("VANBAN.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            s = s.toLowerCase();
            set.add(s);
        }
        for(String x : set){
                System.out.println(x);
        }
        sc.close();
    }
}