import java.util.*;
public class J02033{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < n && k > 0; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
                k--;
            }
        }
        int min1 = 0;
        for(int i=1;i<n;i++){
            if(Math.abs(a[i])<Math.abs(a[min1])){
                min1=i;
            }
        }
        if (k%2==1){
            a[min1]=-a[min1];
        }
        long sum = 0;
        for (int x:a){
            sum+=x;
        }
        System.out.println(sum);
    }
}