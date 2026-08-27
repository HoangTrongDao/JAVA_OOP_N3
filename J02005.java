import java.util.Scanner;
public class J02005{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] trongA = new boolean[1000];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            trongA[x] = true; 
        }
        boolean[] tapGiao = new boolean[1000];
        for (int i = 0; i < m; i++) {
            int y = sc.nextInt();
            if (trongA[y]) {
                tapGiao[y] = true; 
            }
        }
        boolean coPhanTuDauTien = false;
        for (int i = 1; i < 1000; i++) {
            if (tapGiao[i]) {
                if (coPhanTuDauTien) {
                    System.out.print(" ");
                }
                System.out.print(i);
                coPhanTuDauTien = true;
            }
        }
        System.out.println(); 
        sc.close();
    }
}
