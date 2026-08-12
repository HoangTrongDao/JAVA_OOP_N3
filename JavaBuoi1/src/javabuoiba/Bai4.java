package javabuoiba;
import java.util.Scanner;
public class Bai4{
    public static int max(int a, int  b){
        if (a>b){
            return a;
        }
        return b;
    }
    public static void main(String[] args){
        int a=7;
        int b=10;
        System.out.println(max(a,b));
    }
}