public class IsoscelesRightTriangle implements ShapeInterface, Printable {
    private final int leg;
    private double hypo;
    public IsoscelesRightTriangle(int l){
        leg = l;
    }

    public double Hypotenuse(){
        hypo = Math.sqrt(leg^2)*(leg^2);
        return hypo;
    }

    @Override
    public String toString() {
        return "IsocelesRightTriangle(" + leg + ")";
    }

    @Override
    public double Perimeter() {
        return leg + leg + Math.sqrt(leg^2 + leg^2);
    }

    @Override
    public double Area() {
        return leg * leg / 2;
    }

    @Override
    public void print() {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("*   *");
        System.out.println("*     *");
        System.out.println("*       *");
        System.out.println("* * * * * *");


    }
}
