class Stu {

    String name;
    int roll;
    int section;

    void setData(String n, int r, int s) {
        name = n;
        roll = r;
        section = s;
    }

    void display() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(section);
    }
}

public class oppusingmethod {

    public static void main(String[] args) {

        Stu c = new Stu();

        c.setData("Rahul", 23, 1);
        c.display();
    }
}