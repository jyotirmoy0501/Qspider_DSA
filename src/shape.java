abstract class Shapes {

    abstract void circle(double r);

    abstract void square(double s);

    abstract void rectangle(double l, double b);
}

class Calculate extends Shapes {

    @Override
    void circle(double r) {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    @Override
    void square(double s) {
        double area = s * s;
        System.out.println("Area of Square = " + area);
    }

    @Override
    void rectangle(double l, double b) {
        double area = l * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class shape {
    public static void main(String[] args) {

        Calculate obj = new Calculate();

        obj.circle(7);
        obj.square(5);
        obj.rectangle(8, 4);
    }
}