import java.util.*;
import java.time.*;
class NV{
    private static int id=1;
    private String ma;
    private String ten;
    private String gt;
    private LocalDate date;
    private String dc;
    private String mst;
    private LocalDate hd;
    private static final DateTimeFormatter FORMATTER =DateTimeFormatter.ofPattern("d/M/yyyy");
    public NV(){
        ma = String.format("%04d",id++);
        ten = "";
        gt = "";
        date = LocalDate.parse(birthDateStr,FORMATTER);
        dc = "";
        mst = "";
        hd = LocalDate.parse(birthDateStr,FORMATTER);
    }
    public String getMa(){
        return ma;
    }
    public String getDate(){
        return date;
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        gt = sc.nextLine().trim();
        date = sc.nextLine().trim();
        dc = sc.nextLine().trim();
        mst = sc.nextLine().trim();
        hd = sc.nextLine().trim();
    }

    @Override 
    public String toString(){
        return ma + " " + ten + " " + gt + " " + date + " " + dc +" "+mst +" "+hd;
    }
}
public class bai8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        while(n-->0){
            ArrayList<NV> ds = new ArrayList<>();
            NV nv = new NV();
            nv.nhap(sc);
            ds.add(nv);
            ds.sort((a,b)-> a.getDate().compareTo(b.getDate()));
            for (NV s : ds){
                System.out.println(s);
            }
        }
        sc.close();
    }
}