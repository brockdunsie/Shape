public class ShapeMain {
    public static Rectangle re;
    public static Square sq;
    public static Circle ci;
    public static IsoscelesRightTriangle ir;
    public static double hype, circ;
    public static void main(String[]args){
        re = new Rectangle(6,3);
        sq = new Square(5);
        ci = new Circle(10);
        ir = new IsoscelesRightTriangle(20);

        System.out.println(re);
        System.out.println();
        System.out.println(sq);
        System.out.println();
        System.out.println(ci);
        System.out.println();
        System.out.println(ir);
        System.out.println();

        hype = ir.Hypotenuse();
        System.out.println("Hypotenuse is: " + hype);
        System.out.println();
        circ = ci.Circumference();
        System.out.println("Circumfrence is: " + circ);
    }
}
