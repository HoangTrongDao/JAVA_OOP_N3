import java.io.*;
import java.util.*;
public class J07004{
    public static void main(String args[]) throws IOException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(int n:map.keySet()){
            System.out.println(n+" "+map.get(n));
        }
        sc.close();
    }
}