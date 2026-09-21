import java.util.*;
public class J08015{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            HashMap<Long, Long> map = new HashMap<>();
            int[] a = new int[10004];
            long cnt = 0;
            for(int i = 0 ;i<n;i++){
                long x = sc.nextLong();
                long kq = k-x;
                if(map.containsKey(kq)){
                    cnt+=map.get(kq);
                }
                map.put(x, map.getOrDefault(x,0L)+1);
            }
            System.out.println(cnt);
        }
    }
}