import java.util.*;
class game implements Comparable<game>{
    private String ma;
    private String ten;
    private String gioVao;
    private String gioRa;
    private int tong;
    public game (String ma, String ten, String gioVao, String gioRa){
        this.ma=ma;
        this.ten=ten;
        this.gioVao=gioVao;
        this.gioRa=gioRa;
        this.tong=tinh();
    }
    private int tinh(){
        String[] vao = gioVao.split(":");
        String[] ra = gioRa.split(":");
        int phutVao = Integer.parseInt(vao[0])*60+Integer.parseInt(vao[1]);
        int phutRa=Integer.parseInt(ra[0])*60+Integer.parseInt(ra[1]);
        return phutRa-phutVao;
    }
    @Override
    public int compareTo(game o){
        return Integer.compare(o.tong,this.tong);
    }
    @Override
    public String toString(){
        int g = tong/60;
        int p = tong%60;
        return ma+" "+ten+" "+g+" gio "+ p +" phut ";
    }
}
public class bai9{  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<game> ds = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String gioVao=sc.nextLine().trim();
            String gioRa=sc.nextLine().trim();
            ds.add(new game(ma,ten,gioVao,gioRa));
        }
        Collections.sort(ds);
        for (game st:ds){
            System.out.println(st);
        }
        sc.close();
    }
}