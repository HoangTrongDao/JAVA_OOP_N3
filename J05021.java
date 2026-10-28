import java.util.*;
class MSV{
    private String ma;
    private String ten;
    private String lop;
    private String email;
    public String getMa(){
        return ma;
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        lop = sc.nextLine().trim();
        email = sc.nextLine().trim();
    }
    @Override
    public String toString(){
        return ma+ " "+ ten +" "+lop +" "+ email;
    }
}
public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MSV> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            if (!sc.hasNextLine()) break;
            MSV hs = new MSV();
            hs.nhap(sc);
            ds.add(hs);
        }

        ds.sort((a, b) -> a.getMa().compareTo(b.getMa()));

        for (MSV hs : ds) {
            System.out.println(hs);
        }

        sc.close();
    }
}