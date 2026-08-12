package javabuoiba;
import java.util.Scanner;
public class Bai9{
    public static int reverse(int n)
    {
        int kq=0;
        while(n!=0){
            int so = n%10;
            kq = kq*10+so;
            n/=10;
        }
        return kq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}