package methods;

public class MethodsDemo {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("------");
        printPositiveNumbersToN(10);
        System.out.println("------");
        printPositiveNumbersToN(a);
        System.out.println("------");
        System.out.println(getTheSecret());
        System.out.println("------");
        System.out.println(sum(5,6));
        System.out.println("------");
        System.out.println(sum(sum(4,6,7), sum(2,6)));
    }
    //this is a static method that won`t return value. it will just print in the console
    public static void printPositiveNumbersToN(int n){
        if (n < 0){
            System.out.println("ERROR: Invalid entry! Shall be positive!");
            return;
        }

        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }

    public static String getTheSecret(){
        //local variable
        String theSecret = "BlahBlah";
        return theSecret;
    }

    //it will return sum of two integers
    public static int sum(int a, int b){
        return a + b;
    }

    //method overload
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}
