package person;

public class MathUtil {

    public static final double PI=3.1415;

    public static double calculateCircleArea(double radius){
        if (radius<0){
            throw new IllegalArgumentException("radius must be >0");
        }
        double area = PI * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }

    public static int calculateFactorial(int n){
        if (n<0){
            throw new IllegalArgumentException("n must be >0");
        }
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
