import java.util.*;
class Giangvien{
    String ma;
    String ten;
    double luong;
    String loai;

    Scanner sc = new Scanner(System.in);

    public Giangvien()
    {

    }
    public void input(){
        ma = sc.nextLine().trim();
        ten = sc.nextLine().trim();
        luong = Double.parseDouble(sc.nextLine().trim());
        loai = sc.nextLine().trim().toUpperCase();
    }

    public String getMon(){
        String m = ma.substring(0,2);
        if (m.equals("PM")){
            return "Cong nghe phan men";
        }
        else if(m.equals("HT")){
            return "He thong thong tin";
        }
        else if(m.equals("AT")){
            return "An toan thong tin";
        }
        else if (m.equals("MT")){
            return "Khoa hoc may tinh";
        }
        return "";
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
    public double tinh(){
            return luong * getHe() * 250000;
        }
    public void out(){
            System.out.println(ma + " " + ten + " " +loai + " " + String.format("%.0f",tinh()));
        }
}
public class bai2{
    public static void main(String[] args){
        Giangvien gv = new Giangvien();
        //input
        gv.input();
        gv.out();
    }
}