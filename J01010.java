import java.util.Scanner;
public class J01010{
    public static String cat(String s){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='0'||c=='1'){
                res.append(c);
            }
            else if(c=='9'||c=='8'){
                res.append(0);
            }
            else{
                return "INVALID";
            }
        }
        int i=0;
        while(i<res.length()&& res.charAt(i)=='0')
        {
            i++;
        }
         // Nếu toàn bộ là 0
        if (i == res.length()) {
            return "INVALID";
        }
        return res.substring(i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(cat(s));
        }
    }
}