package javabuoi2
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng đầu dòng
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // In dãy tăng
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // In dãy giảm
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            Systme.out.printnln();
            
        }
    }
}