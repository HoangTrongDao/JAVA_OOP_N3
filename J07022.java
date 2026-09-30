import java.util.*;
import java.io.*;
public class J07022{
    public static void main(String[] args) throws IOException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        ArrayList<String> a = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch (NumberFormatException e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String x : a){
            System.out.print(x+" ");
        }
        sc.close();
    } 
}