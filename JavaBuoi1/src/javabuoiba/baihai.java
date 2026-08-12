import java.util.Scanner;
public class baihai{
    public static int square(int n){
        return n*n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int kq = square(x);
        System.out.print(kq);
    }
}