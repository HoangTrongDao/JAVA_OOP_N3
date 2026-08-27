import java.util.*;

public class J02016 {
    static boolean checkPytago(long[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * a[i];
        } 

        Arrays.sort(a);
        
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;      
            int r = i - 1; 
            while (l < r) {
                if (a[l] + a[r] == a[i]) {
                    return true; 
                }
                
                if (a[l] + a[r] < a[i]) {
                    l++; 
                } else {
                    r--; 
                }
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n]; 
                
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }
                if (checkPytago(a, n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
