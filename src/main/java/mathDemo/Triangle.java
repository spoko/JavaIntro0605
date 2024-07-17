package mathDemo;

public class Triangle {
    public static double calculateAreaOfTriangleByTwoSidesAndAngle(double a, double b, double angle){
        return (0.5 * a * b * Math.sin(Math.toRadians(angle)));//1/2*a*b*sin(Alfa)
    }

    public static void main(String[] args) {
        System.out.println(calculateAreaOfTriangleByTwoSidesAndAngle(3,5, 90));
    }
}
