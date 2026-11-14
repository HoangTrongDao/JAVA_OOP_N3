import java.util.*;
import java.time.*;
class NV{
    private static int id=1;
    private String ma;
    private String ten;
    private String gt;
    private String date;
    private String dc;
    private String mst;
    private String hd;
    public static String chuanhoa(String date){
        if (date == null ||date.trim().isEmpty()){
            return "";
        }
        String [] parts = date.trim().split("/");
        if(parts.length<3) return date;
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        if(day.length()==1){
            day = "0"+day;
        }
        if (month.length()==1){
            month = "0"+month;
        }
        return day + "/" + month + "/" + year;
    }
    public NV(){
        ma = String.format("%05d",id++);
        ten = "";
        gt = "";
        date = chuanhoa(date);
        dc = "";
        mst = "";
        hd = chuanhoa(hd);
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
public class bai82{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<NV> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            NV nv = new NV();
            nv.nhap(sc);
            ds.add(nv);
        }
        ds.sort((a,b)-> {
            String[] p1 = a.getDate().split("/");
            String s1 = p1[2]+p1[1]+p1[0];
            String[] p2 = b.getDate().split("/");
            String s2 = p2[2]+p2[1]+p2[0];
            return s1.compareTo(s2);
        });
        for (NV s : ds){
                System.out.println(s);
            }
        sc.close();
    }
}