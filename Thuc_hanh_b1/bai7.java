import java.util.*;
public class bai7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] a = new int[1000005];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] newA = new int[n+1];
        for(int i=0;i<newA.length;i++){
            if(i<k){
                newA[i]=a[i];
            }
            else if(i==k){
                newA[i]=m;
            }
            else{
                newA[i]=a[i-1];
            }
        }
        for(int i=0;i<k;i++){
            for(int j = i+1;j<=k;j++){
                if(newA[i]>newA[j]){
                    int tam = newA[i];
                    newA[i]=newA[j];
                    newA[j]=tam;
                }
            }
        }
        for(int x : newA){
            System.out.print(x+" ");
        }
        System.out.println();
        }
    }
}