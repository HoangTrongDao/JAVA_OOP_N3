import java.util.*;
class WordSet{
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        for(String x:a){
            set.add(x);
        }
    }
    public WordSet union(WordSet s){
        TreeSet<String> res = new TreeSet<>(set);
        res.addAll(s.set);
        return new WordSet(String.join(" ",res));
    }
    public  WordSet intersection(WordSet s){
        TreeSet<String> res = new TreeSet<>(set);
        res.retainAll(s.set);
        return new WordSet(String.join(" ",res));
    }
    @Override
    public String toString(){
        return String.join(" ",set);
    }
}
public class bai3{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}