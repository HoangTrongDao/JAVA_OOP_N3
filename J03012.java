import java.math.*;
import java.util.*;
public class J03012{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String soThuNhat = sc.next();
            String soThuHai = sc.next();
            int maxLen = Math.max(soThuNhat.length(), soThuHai.length());
            BigInteger a = new BigInteger(soThuNhat);
            BigInteger b = new BigInteger(soThuHai);
            BigInteger kq = (a.subtract(b)).abs();
            String output = kq.toString();
            StringBuilder sb = new StringBuilder(output);
            while (sb.length() < maxLen) {
                  sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}