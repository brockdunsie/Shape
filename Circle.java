public class Circle implements ShapeInterface {
    private final int radius;
    protected double circ;

    public Circle(int r){
        radius = r;
    }

    public double Circumference(){
        circ = 2 * Math.PI * radius;
        return circ;
    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }

    @Override
    public double Perimeter() {
        return Circumference();
    }

    @Override
    public double Area() {
        return radius * radius * Math.PI;
    }
}
