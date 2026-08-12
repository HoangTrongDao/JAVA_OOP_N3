import java.util.Scanner;
public class Bai6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        int kq = a+b;
        System.out.println("tong hai so a + b la: " + kq);
    }
}