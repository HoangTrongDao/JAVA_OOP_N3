import java.util.*;
import java.text.Normalizer;
import java.io.*;
public class bai122{
    static String boDau(String s){
        s = Normalizer.normalize(s,Normalizer.Form.NFD);
        s = s.replaceAll("\\s+", " ");
        return s;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = null;
        try{
            sc = new Scanner(new File("DANHSACH.in"));
        } catch (FileNotFoundException e){
            sc= new Scanner(System.in);
        }
        HashMap<String, Integer> dem= new HashMap<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                continue;
            }
            s=s.toLowerCase();
            s=s.replaceAll("\\s+"," ");
            s=boDau(s);
            String[] a= s.split(" ");
            String email=a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                email+=a[i].charAt(0);
            }
            if(!dem.containsKey(email)){
                dem.put(email,1);
                System.out.println(email+"@ptit.edu.vn");
            }else{
                int stt=dem.get(email)+1;
                dem.put(email,stt);
                System.out.println(email+stt+"@ptit.edu.vn");
            }
        }
        sc.close();
    }
}