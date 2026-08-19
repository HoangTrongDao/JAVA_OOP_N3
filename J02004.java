import java.util.Scanner;
public class J02004{
    public static boolean d_x(int[] a){
        int n = a.length;
        for(int i = 0; i<n/2;i++){
            if(a[i]!=a[n-i-1]){
                return false;    
            }
        }
        return true;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        // 2. Khởi tạo mảng
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
            if(d_x(a)){
                System.out.println("YES\n");
            }
            else{
                System.out.println("NO\n");
            }
        }   
    }
}