import java.util.*;
public class J02009{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        Arrays.sort(a,(x,y)-> Integer.compare(x[0],y[0]));
        int dap_an = 0;
        for(int i =0;i<n;i++){
            dap_an = Math.max(dap_an, a[i][0]);
            dap_an += a[i][1];
        }
        System.out.print(dap_an);
        System.out.print("\n");
    }
}