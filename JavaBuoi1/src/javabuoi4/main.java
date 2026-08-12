package javabuoi4;
public class main{
   
    public static void main(String[] args)
    {
        dongvat dog = new dongvat();
        dog.name = "Mello";
        dog.age=12;
        System.out.println(dog.name);
        System.out.println(dog.age);
        
        Book sach = new Book();
        sach.title = "Clear code";
        sach.author = "Robert  C.martin";
        sach.year = 2008;
        System.out.println(sach.title);
        System.out.println(sach.author);
        System.out.println(sach.year);
        
        Student hs1 = new Student();
        Student hs2 = new Student();
        hs1.name = "Dao";
        hs2.name ="Trang";
        hs1.age = 20;
        hs2.age = 21;
        hs1.gpa = 3.2;
        hs2.gpa = 3.6;
        System.out.println(hs1.name);
        System.out.println(hs1.age);
        System.out.println(hs1.gpa);
        System.out.println(hs2.name);
        System.out.println(hs2.age);
        System.out.println(hs2.gpa);
        
        
        Student2  hs = new Student2("Dao",20,3.2);
        Student2  hs3 = new Student2("Trang",21,3.6);
         System.out.println(hs.name);
        System.out.println(hs.age);
        System.out.println(hs.gpa);
        System.out.println(hs3.name);
        System.out.println(hs3.age);
        System.out.println(hs3.gpa);
        
        Car xe1 = new Car("TOYOTA", "white", 2019);
        Car xe2 = new Car("VIOS","Black",2024);
        System.out.println("thong tin xe 1");
        System.out.println(xe1.brand);
        System.out.println(xe1.color);
       System.out.println(xe1.year);
         System.out.println("thong tin xe 2");
        System.out.println(xe2.brand);
        System.out.println(xe2.color);
       System.out.println(xe2.year);
       
       Rectangle r = new Rectangle();
       r.length = 5;
       r.width = 4;
       System.out.println("Dien tich hinh chu nhat la: "+r.area());
        
       Circle c = new Circle(5);
       System.out.println("Dien tich hinh tron la: " + c.area1());
       
       Hocsinh sv1= new Hocsinh("Trong","19",3.3);
       Hocsinh sv2= new Hocsinh("Trong manh","23",3.9);
       sv1.display();
       System.out.println();
       sv2.display();
       
       
    }
}