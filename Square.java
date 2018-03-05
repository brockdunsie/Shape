public class Square extends Rectangle implements ShapeInterface, Printable{
    private int sides;
    public Square(int s){
        super(s,s);
        sides = s;

    }

    @Override
    public String toString() {
        return "Square(" + sides + ")";
    }

    @Override
    public double Perimeter() {
        return sides*4;
    }

    @Override
    public double Area() {
        return sides * sides;
    }

    @Override
    public void print() {
        System.out.println("* * * * * * * * * *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("*                 *");
        System.out.println("* * * * * * * * * *");
    }
}
