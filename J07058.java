import java.util.*;
import java.io.*;
class MT{
    private String ma;
    private String ten;
    private String thi;
    public MT(){
        ma="";
        ten="";
        thi="";
    }
    public void nhap(Scanner sc){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        thi = sc.nextLine().trim();
    }
    public String getMa(){
        return ma;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + thi;
    }
}
public class J07058{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MT> ds = new ArrayList<>();
        for(int i=1;i<=n;i++){
            MT mt=new MT();
            mt.nhap(sc);
            ds.add(mt);
        }
        ds.sort((a,b)-> a.getMa().compareTo(b.getMa()));
        for(MT mt:ds){
            System.out.println(mt);
        }
        sc.close();
    }
}
