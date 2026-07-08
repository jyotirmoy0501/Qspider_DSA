class Simcard1 {
    String net;
    int number;

    Simcard1(String net,int number) {
       this.net =net;
        this.number =number;
    }
}

class Phone {
    String brand;
    double price;
    int camera;
    Simcard1 slot;
    Phone(String brand,double price,int camera) {
        this.brand=brand;
        this.price=price;
        this.camera=camera;
    }
    public void createsim(String net,int number){
    slot= new Simcard1(net,number);
    }
}
public class Lazy_instances_useconstructor {
    public static void main(String[] args) {

        Phone p = new Phone("samsung",20000,50);
        System.out.println(p.brand);
        p.createsim("jio",9999999);
        System.out.println(p.slot.number);
    }
}