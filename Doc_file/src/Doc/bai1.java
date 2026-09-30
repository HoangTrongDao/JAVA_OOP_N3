package Doc;
import java.util.*;
import java.io.*;
public class bai1 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner (new File("A.txt"));
        PrintWriter out = new PrintWriter(new File("B.txt"));
        while(in.hasNextLine()){
            out.println(in.nextLine());
        }
        out.close();
    }
}
