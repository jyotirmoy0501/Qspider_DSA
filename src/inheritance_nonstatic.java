class Doctor{
    String name="rr";
    int age=23;
    void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class inheritance_nonstatic extends Doctor {
   int v=10;
    void S1(){
        System.out.println("hello"+v);
        System.out.println(age);
    }
public static void main(String[] args){
        inheritance_nonstatic c= new inheritance_nonstatic();
        c.show();
        c.S1();
        System.out.println(c.name);
}
}
