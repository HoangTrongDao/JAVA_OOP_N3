import java.util.*;

class SP {
    private int a; 
    private int b; 
    public SP() {
        a = 0;
        b = 0;
    }
    public SP(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void nhap(Scanner sc) {
        this.a = sc.nextInt();
        this.b = sc.nextInt();
    }
    public SP tinhC(SP B) {
        // Tổng (A + B)
        int thucTong = this.a + B.a;
        int aoTong = this.b + B.b;
        int thucC = thucTong * this.a - aoTong * this.b;
        int aoC = thucTong * this.b + aoTong * this.a;

        return new SP(thucC, aoC);
    }
    public SP tinhD(SP B) {
        // Tổng (A + B)
        int thucTong = this.a + B.a;
        int aoTong = this.b + B.b;
        int thucD = thucTong * thucTong - aoTong * aoTong;
        int aoD = 2 * thucTong * aoTong;
        return new SP(thucD, aoD);
    }

    @Override
    public String toString() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + Math.abs(b) + "i";
        }
    }
}

public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        
        while (n-- > 0) {
            SP A = new SP();
            A.nhap(sc); 
            SP B = new SP();
            B.nhap(sc); 
            SP ketQuaC = A.tinhC(B);
            SP ketQuaD = A.tinhD(B);
            System.out.println(ketQuaC + ", " + ketQuaD);
        }
        sc.close();
    }
}
