import java.io.*;
import java.util.*;
public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
            new FileInputStream("DATA.IN")
        );
        HashMap<Integer, Integer> map = new HashMap<>();
        try {
            while (true) {
                int n = in.readInt();

                if (map.containsKey(n)) {
                    map.put(n, map.get(n) + 1);
                } else {
                    map.put(n, 1);
                }
            }
        } catch (EOFException e) {
        }
        for (int n : map.keySet()) {
            System.out.println(n + " " + map.get(n));
        }
        in.close();
    }
}