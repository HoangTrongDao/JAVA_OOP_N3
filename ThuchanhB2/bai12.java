import java.util.*;
class gv implements Comparable<gv>{
    private static int NUM_gv=0;
    private String ma;
    private String ten;
    private String mon;
    public gv(){
        NUM_gv++;
        this.ma=String.format("GV%02d",NUM_gv);

    }
    private String vt(String bm){
        String[] words = bm.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String tu:words){
            if(!tu.isEmpty()){
                sb.append(Character.toUpperCase(tu.charAt(0)));
            }
        }
        return sb.toString();
    }
    public void nhap(Scanner sc){
        this.ten = sc.nextLine();
        String boMonGoc = sc.nextLine().trim();
        this.mon=vt(boMonGoc);
    }
    public String getTen(){
        String[] words=this.ten.split("\\s+");
        return words[words.length-1];
    }
    @Override
    public int compareTo(gv o){
        int compt=this.getTen().compareTo(o.getTen());
        if(compt!=0){
            return compt;
        }
        return this.ma.compareTo(o.ma);
    }
    @Override
    public String toString(){
        return this.ma+ " "+this.ten+" "+this.mon;
    }
}
public class bai12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<gv> ds=new ArrayList<>();
        for(int i=0;i<n;i++){
            gv nv1 = new gv();
            nv1.nhap(sc);
            ds.add(nv1);
        }
        Collections.sort(ds);
        for(gv nv1:ds){
            System.out.println(nv1);
        }
        sc.close();
    }
}