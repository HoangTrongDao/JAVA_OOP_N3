import java.util.*;

public class J02011  {

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

        for (int buoc = 1; buoc < n; buoc++) {

            int min = buoc - 1;
            for (int j = buoc; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, buoc - 1, min);
            System.out.print("Buoc " + buoc + ": ");

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.println();
        }
    }
}