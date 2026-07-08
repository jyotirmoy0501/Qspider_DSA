class emp {
    private String name;
    private int age;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setsalary(float salary){
        this.salary=salary;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        emp e= new emp();
        e.setName("Rahul");
        e.setAge(25);
        e.setsalary(2500);
        System.out.println(e.getName());
        System.out.println(e.getAge());
        System.out.println(e.getSalary());

    }
}
