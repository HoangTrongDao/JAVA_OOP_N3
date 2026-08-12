package javabuoiba;
import java.util.Scanner;
public class Bai3{
    public static int tong(int a, int b){
        int tong = a+b;
        return tong;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(tong(a,b));
    }
}