import java.util.*;

public class J01013 {

    static final int MAX = 2000000;
    static long[] f = new long[MAX + 1];
    static int[] spf = new int[MAX + 1];

    public static void main(String[] args) {

        for (int i = 2; i <= MAX; i++) {
            if (spf[i] == 0) { 
                spf[i] = i;

                if ((long) i * i <= MAX) {
                    for (int j = i * i; j <= MAX; j += i) {
                        if (spf[j] == 0) {
                            spf[j] = i;
                        }
                    }
                }
            }
        }
        f[1] = 0;

        for (int i = 2; i <= MAX; i++) {
            f[i] = f[i / spf[i]] + spf[i];
        }

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        long sum = 0;

        while (t-- > 0) {
            int a = sc.nextInt();
            sum += f[a];
        }

        System.out.println(sum);

        sc.close();
    }
}