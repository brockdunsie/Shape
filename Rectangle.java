public class Rectangle implements ShapeInterface, Printable {
    private final int length, width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    @Override
    public String toString() {
        return "Rectangle(" + length + " x " + width + ")";
    }

    @Override
    public double Perimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public void print() {
        System.out.println("* * * * * * * * * *");
        System.out.println("*                 *");
        System.out.println("* * * * * * * * * *");
    }
}
