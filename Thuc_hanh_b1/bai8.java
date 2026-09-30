import java.util.*;
public class bai8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n= sc.nextInt();
            int[] a=new int[100004];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int[] chan = new int[100004];
            int[] le=new int[n];
            int dc=0;
            int dl=0;
            boolean[] daco=new boolean[10004];
            for(int i=0;i<n;i++){
                if(!daco[a[i]]){
                    daco[a[i]]=true;
                if(a[i]%2==0){
                    chan[dc]=a[i];
                    dc++;
                }
                else{
                    le[dl]=a[i];
                    dl++;
                }
                }
            }
            Arrays.sort(chan,0,dc);
            Arrays.sort(le,0,dl);
            for(int i=0;i<dc;i++){
                System.out.print(chan[i]+" ");
            }
            System.out.println();
            for(int i=dl-1;i>=0;i--){
                System.out.print(le[i]+" ");
            }
            System.out.println();
        }
    }
}