import java.util.*;
class HS{
    private static int stt=1;
    private String id;
    private String ten;
    private double diem;
    private int hang;
    public HS(){
        id = "HS"+String.format("%02d",stt++);
        ten = "";
        diem = 0.0;
    }
    public double getDiem(){
        return diem;
    }
    public void setHang(int hang) {
        this.hang = hang;
    }
    public int getHang() {
        return hang;
    }
    public String xeploai(){
        if (diem<5){
            return "Yeu";
        }
        else if(diem<7){
            return "Trung Binh";
        }
        else if(diem<9){
            return "Kha";
        }
        else{
            return "Gioi";
        }
    }
    public void nhap(Scanner sc){
        ten = sc.nextLine().trim();
        diem = Double.parseDouble(sc.nextLine().trim());
    }
    @Override
    public String toString() {
        return id + " " + ten + " " + String.format("%.1f", diem) + " " + xeploai() + " " + hang;
    }

}
public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HS> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            HS hs = new HS();
            hs.nhap(sc);
            ds.add(hs);
        }

        ArrayList<HS> sorted = new ArrayList<>(ds);
        sorted.sort((a, b) -> Double.compare(b.getDiem(), a.getDiem()));
        for (int i = 0; i < sorted.size(); i++) {
            if (i == 0) {
                sorted.get(i).setHang(1);
            } else if (sorted.get(i).getDiem() == sorted.get(i - 1).getDiem()) {
                sorted.get(i).setHang(sorted.get(i - 1).getHang());
            } else {
                sorted.get(i).setHang(i + 1);
            }
        }
        for (HS hs : ds) {
            System.out.println(hs);
        }
    }
}