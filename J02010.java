import java.util.*;
public class J02010{
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1;i++){
            for(int j = i+1;j<n;j++){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            for(int j = 0;j<n;j++){
                System.out.print(a[j]);
                if(j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}