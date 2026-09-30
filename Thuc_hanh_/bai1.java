import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();

            int tic = 1;
            int tong = 0;

            for (int i = 0; i < s.length(); i++) {

                int x = s.charAt(i) - '0';

                if (x == 0) {
                    continue;
                }

                if (x % 2 != 0) {
                    tic *= x;
                } else {
                    tong += x;
                }
            }

            if (tong == 0) {
                System.out.println("INVALID");
            } else {
                double kq = (double) tic / tong;
                System.out.printf("%.6f\n", kq);
            }
        }
    }
}