class Simcard{
     String net ;
     int number;

}
class phone{
    String brand;
    double price;
    int camera;
    Simcard slot;
public void createSim(){
    slot =new Simcard();
}
}
public class Lazy_instances {
    public static void main(String[] args){
        phone p=new phone();
        System.out.println(p.slot);
        p.createSim();
        System.out.println(p.slot);
    }

}
