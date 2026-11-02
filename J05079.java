import java.util.*;
class HP1{
    private String mamon;
    private String tenmon;
    private int nhom;
    private String gv;
    public HP1(){
        mamon="";
        tenmon="";
        nhom = 0;
        gv="";
    }
    public String getMaMon() {
        return mamon;
    }

    public String getTenMon() {
        return tenmon;
    }

    public int getNhomLop() {
        return nhom;
    }

    public String getTenGiangVien() {
        return  gv;
    }
    public void nhap(Scanner sc){
        mamon= sc.nextLine().trim();
        tenmon= sc.nextLine().trim();
        nhom= Integer.parseInt(sc.nextLine().trim());
        gv=sc.nextLine();
    }
    @Override
    public String toString(){
       return String.format("%02d", nhom) + " " + gv;
    }
}
public class J05079{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<HP1> ds = new    ArrayList<>();
        for(int i=0;i<n;i++){
            HP1 x = new HP1();
            x.nhap(sc);
            ds.add(x);
        }
        Collections.sort(ds, new Comparator<HP1>() {
            public int compare(HP1 o1, HP1 o2) {
                return Integer.compare(o1.getNhomLop(), o2.getNhomLop());
            }
        });
        int m = Integer.parseInt(sc.nextLine().trim()); 
        for (int i = 0; i < m; i++) {
            String maMonCanTim = sc.nextLine().trim();
            String tenMonHienThi = "";
            for (HP1 x : ds) {
                if (x.getMaMon().equals(maMonCanTim)) {
                    tenMonHienThi = x.getTenMon();
                    break;
                }
            }
            System.out.println("Danh sach nhom lop mon " + tenMonHienThi + ":");
            for (HP1 x : ds) {
                if (x.getMaMon().equals(maMonCanTim)) {
                    System.out.println(x);
                }
            }
        }
        sc.close();
    }
}