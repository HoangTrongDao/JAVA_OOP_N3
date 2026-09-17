import java.math.BigInteger;
import java.util.*;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            if (sc.hasNext()) {
                String soThuNhat = sc.next();
                String soThuHai = sc.next();
                BigInteger a = new BigInteger(soThuNhat);
                BigInteger b = new BigInteger(soThuHai);
                BigInteger ucln = a.gcd(b);
                System.out.println(ucln);
            }
        }
        sc.close();
    }
}
