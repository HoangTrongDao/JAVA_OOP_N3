    import java.util.Scanner;
    public class J01017 {
        public static boolean check(String s){
            for(int i=1;i<s.length();i++){
                long a=s.charAt(i-1)-'0';
                long b=s.charAt(i)-'0';
                if(Math.abs(a-b)!=1){
                    return false;
                }
            }
            return true;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();
            while(t-->0){
                String s = sc.next();
                if(check(s)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

            }
        }
    }
