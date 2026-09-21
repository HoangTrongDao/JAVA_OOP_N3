import java.util.*;
public class J02013 {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Bubble Sort
        for (int buoc = 1; buoc < n; buoc++) {
            boolean daDoi = false;
            for (int j = 0; j < n - buoc; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    daDoi = true;
                }
            }
            if (!daDoi) {
                break;
            }
            System.out.print("Buoc " + buoc + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (!daDoi) {
                break;
            }
        }
    }
}