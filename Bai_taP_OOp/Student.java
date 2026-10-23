import java.util.*;
class Stu{
    private String name;
    private int age;
    public Stu(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println(name+ " " + age);
    }
}
public class Student{
    public static void main(String args[]){
        Stu st = new Stu("",0);
        st.getInformation();
        st.display();
    }
}