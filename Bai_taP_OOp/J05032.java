import java.util.*;
class T{
    private String ten;
    private String date;
    
    public T(){
        ten = "";
        date = "";
    }

    public String getT(){
        return ten;
    }
    public String getD(){
        String[] p = date.split("/");
        return p[2]+"/"+p[1]+"/"+p[0];
    }
    public void nhap(Scanner sc){
        String[] parts = sc.nextLine().trim().split("\\s+");
        ten = parts[0];
        date = parts[1];
    }
}
public class J05032{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<T> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            T sv = new T();
            sv.nhap(sc);
            ds.add(sv);
        }
        ds.sort((a,b)-> a.getD().compareTo(b.getD()));
        System.out.println(ds.get(n-1).getT());
        System.out.println(ds.get(0).getT());
    }
}