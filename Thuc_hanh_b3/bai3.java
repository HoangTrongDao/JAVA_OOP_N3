import java.util.*;
class GV{
    private String ma;
    private String ten;
    private double hesoluong;
    private String loai;
    private int gio;
    private long linh;

    public GV(String ma, String ten, double hesoluong, String loai,int gio){
        this.ma = ma;
        this.ten = ten;
        this.hesoluong = hesoluong;
        this.loai = loai;
        this.gio=gio;
        tinhluong();
    }
    public double getHe(){
         if(loai.equals("A")){
                return 1.5;
            }
            else if(loai.equals("B")){
                return 1.2;
            }
            else {
                return 1.0;
            }
    }
    public void tinhluong(){
        double luong = hesoluong*3000*getHe();
        if (gio>=0 && gio<=100){
            luong = luong * 0.85;
        }
        else if(gio<=350){
            luong = luong *0.90;
        }
        else if(gio<500){
            luong = luong *0.95;
        }
        linh = Math.round(luong);
    }
    public String getTen(){
        String[] a = ten.trim().split("\\s+");
        return a[a.length-1];
    }
    public String getHo(){
        String[] a = ten.trim().split("\\s+");
        return a[0];
    }
    public void hienthi(){
        System.out.print(ma + " ");
        System.out.print(ten+ " ");
        System.out.print(hesoluong + " ");
        System.out.print(loai+ " ");
        System.out.print(gio+" ");
        System.out.println(linh);
    }

}
public class bai3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<GV> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i=1;i<=n;i++){
            String ma = String.format("PM%03d",i);
            String ten = sc.nextLine().trim();
            double hesoluong = Double.parseDouble(sc.nextLine().trim());
            String loai = sc.nextLine().trim();
            int gio = Integer.parseInt(sc.nextLine().trim());
            GV gv = new GV(ma,ten,hesoluong,loai,gio);
            ds.add(gv);
        }
        Collections.sort(ds,new Comparator<GV>(){
            @Override
            public int compare(GV a, GV b){
                int kq = a.getTen().compareTo(b.getTen());
                if (kq==0){
                    return a.getHo().compareTo(b.getHo());
                }
                return kq;
            }
        });
        for (GV gv:ds){
            {
                gv.hienthi();
            }
        }
        sc.close();
    }
}