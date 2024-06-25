public class AreaCalculator {

    private static final double PI = 3.14159;

    public static double area (double radius){
        if (radius < 0) return -1.0;
        return PI * radius * radius;
    }

    public static double area (double x, double y){
        if (x < 0 || y < 0) return -1.0;
        return x * y;
    }

    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(4,5));

    }
}
