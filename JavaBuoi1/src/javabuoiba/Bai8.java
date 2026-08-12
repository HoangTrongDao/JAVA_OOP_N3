package javabuoiba;
import java.util.Scanner;
public class Bai8{
    public static int factorial(int a){
        if(a==0){
            return 1;   
        }
        int giai_thua=1;
        for(int i=1;i<=a;i++){
            giai_thua*=i;
        }
        return giai_thua;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(factorial(x));
    }
}