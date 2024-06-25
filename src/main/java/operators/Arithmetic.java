package operators;

public class Arithmetic {
    public static void main(String[] args) {
        //local variables
        int a = 9;
        int b = 2;
        int c = 10;
        double result;
        double num1 = 3.5;
        double num2 = 7.0;
        int result1;

        System.out.println(a % b);//1
        System.out.println(c++);//11
        System.out.println(c);

        //automatic (internal) cast from int to double
        result = a / b;
        System.out.println(result);

        //cast from double to int i.e. converting the values/ data types
        result1 = (int) (num1 + num2);
        System.out.println(result1);
    }
}
