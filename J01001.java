import java.util.Scanner;
public class J01001{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rong = sc.nextInt();
        int dai = sc.nextInt();
        if(rong<=0 || dai<=0){
            System.out.print("0\n");
        }
        else{
            int chu_vi= (dai+rong)*2;
            int dientic=dai*rong;
            System.out.print(chu_vi);
            System.out.print(" ");
            System.out.print(dientic);
        }
    }
}