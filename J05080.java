import java.util.*;
class HP2{
    private String mamon;
    private String mon;
    private int id;
    private String gv;
    public HP2(){
        mamon="";
        mon="";
        id=0;
        gv="";
    }
    public String getMon(){
        return mon;
    }
    public String getMamon(){
        return mamon;
    }
    public String getGv(){
        return gv;
    }
    public int getId(){
        return id;
    }
    public void nhap(Scanner sc){
        mamon = sc.nextLine().trim();
        mon = sc.nextLine().trim();
        id = Integer.parseInt(sc.nextLine().trim());
        gv = sc.nextLine().trim();
    }
    @Override 
    public String toString(){
        return mamon + " " + mon + " " + String.format("%02d", id);
    }
}
public class J05080{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<HP2> ds= new ArrayList<>();
        for(int i=0;i<n;i++){
            HP2 x = new HP2();
            x.nhap(sc);
            ds.add(x);
        }
        ds.sort((a, b) -> {
            if (!a.getMamon().equals(b.getMamon())) {
                return a.getMamon().compareTo(b.getMamon());
            }
            return Integer.compare(a.getId(), b.getId());
        });
        int q = Integer.parseInt(sc.nextLine().trim());
         while (q-- > 0) {
            String ten = sc.nextLine().trim();
            System.out.println("Danh sach cho giang vien " + ten + ":");
            
            for (HP2 x : ds) {
                if (x.getGv().equals(ten)) {
                    System.out.println(x);
                }
            }
        }
        sc.close(); 
    }
}