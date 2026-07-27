interface car{
    public abstract void drive();
}
class Audi implements car{
    public void drive(){
        System.out.println("working");
    }
}
public class interfaceexample {
public static void main(String[] args){
    car c= new Audi();
    c.drive();
}
}
