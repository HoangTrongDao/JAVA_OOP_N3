import java.util.*;
public class J01020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            if (n==0){
                System.out.print("Impossible\n");
                continue;
            }
            boolean[] check = new boolean[10];
            long k = 0;
            long i = 1;
            long cnt = 0;
            while(k<10){
                cnt = n * i;
                long tmp = cnt;
                while(tmp>0){
                    int so = (int)(tmp%10);
                    if(!check[so]){
                        check[so]=true;
                        k++;                            
                    }
                    tmp/=10;    
                }
                i++;
            }
            System.out.print(cnt+"\n");
        }
        sc.close();
    }
}