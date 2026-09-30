import java.util.*;
import java.io.*;
public class J07002{
    public static void main(String[] args) throws IOException{
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        long tong = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
                tong+=n;
            }
            catch (NumberFormatException e){
                
            }
        }
        System.out.println(tong);
        sc.close();
    }
}