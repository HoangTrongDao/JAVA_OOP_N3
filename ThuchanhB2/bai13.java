import java.util.*;
class sv implements Comparable<sv>{
    private String ten;
    private int bai;
    private long sub;
    public sv(String ten, int bai, long sub){
        this.ten = ten;
        this.bai = bai;
        this.sub = sub;
    }
    @Override
    public int compareTo(sv sv1){
        if(this.bai!=sv1.bai){
            return Integer.compare(sv1.bai,this.bai);
        }
        if(this.sub!=sv1.sub){
            return Long.compare(this.sub,sv1.sub);
        }
        return this.ten.compareTo(sv1.ten);
    }
    @Override
    public String toString(){
        return ten + " " + bai+ " " + sub; 
    }
}
public class bai13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<sv> ds = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine().trim();
            String[] s=sc.nextLine().trim().split("\\s+");
            int c = Integer.parseInt(s[0]);
            long t = Long.parseLong(s[1]);
            ds.add(new sv(ten,c,t));
        }
        Collections.sort(ds);
        for(sv sv1:ds){
            System.out.println(sv1);
        }
        sc.close();
    }
}