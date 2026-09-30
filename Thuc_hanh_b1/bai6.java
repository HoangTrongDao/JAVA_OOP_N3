import java.util.*;
public class bai6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a= new int[100005];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                for(int j=i+1;j<m;j++){
                    if(a[i]>a[j]){
                        int tam=a[i];
                        a[i]=a[j];
                        a[j]=tam;
                    }
                }
            }
            for(int i=m;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    if(a[i]<a[j]){
                        int tam=a[i];
                        a[i]=a[j];
                        a[j]=tam;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}