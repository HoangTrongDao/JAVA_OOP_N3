import java.util.*;
public class bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for(int i=1;i<=n;i++)
        {
            if (i%2==1){
                for(int j=1;j<=i;j++){
                    System.out.print(x+" ");
                    x++;
                }
            }else{
                int start = x;
                for(int j=i;j>=1;j--){
                    System.out.print(start + j -1 +" ");
                }
                x+=i;
            }
            System.out.println();
        }
    }
}