///using constructor
public class oops3 {

    String name;
    int age;
    String place;

    public oops3(String n, int r, String place) {
        name = n;
        age = r;
        this.place = place;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {

        oops3 c = new oops3("Rahul", 22, "Delhi");

        System.out.println(c.getName());
    }
}