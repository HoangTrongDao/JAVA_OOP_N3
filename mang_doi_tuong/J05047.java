import java.util.*;
class H1{
    private String ten;
    private long sl;
    private long dongia;
    private static Map<String, Integer> demMa = new HashMap<>();
    private String ma;
    public H1(){
        ten = "";
        sl =0;
        dongia = 0;
    }
    public String kq(){
        String res = "";
        String[] tu = ten.trim().toUpperCase().split("\\s+");
        for(int i=0;i<tu.length-1;i++){
            res+= tu[i].charAt(0);
        }
        return res;
    }
    public long tienchietkhau(){
        if (sl>10){
            return dongia * sl * 5/100;
        }
        else if(8<=sl && sl<=10){
            return dongia * sl * 2/100;
        }
        else if(5<=sl && sl <8){
            return dongia * sl *1/100;
        }
        else{
            return 0;
        }
    }
    public long thanhtien(){
        return dongia*sl - tienchietkhau();
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        sl = Long.parseLong(sc.nextLine().trim());
        dongia = Long.parseLong(sc.nextLine().trim());
        String prefix = kq();
        int stt = demMa.getOrDefault(prefix, 0) + 1;
        demMa.put(prefix, stt);
        ma = prefix + String.format("%02d", stt);
    }
    @Override
    public String toString(){
        return ma+ " " + ten + " " +tienchietkhau() + " " + thanhtien();
    }
}
public class J05047{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<H1>  ds = new ArrayList();
        int n = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<n;i++){
            H1 nv = new H1();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a,b)-> Long.compare(b.tienchietkhau(),a.tienchietkhau()));
        
        for(H nv : ds){
                System.out.println(nv);
        }
        sc.close();
    }
}