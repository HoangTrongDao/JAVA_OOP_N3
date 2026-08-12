package javabuoiba;
public class Bai6{
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args){
        int a= 10;
        if(isEven(a)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}