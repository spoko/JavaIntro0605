package loops;

public class WhileLoop {

    public static void main(String[] args) {
        printFactorial(5);
        printFactorial(0);
        printFactorial(1);

        System.out.println("-------");

        printPositiveNumbersToN(5);
    }

    //method that will print n! (calculates factorial)
    public static void printFactorial(int n){
        if (n < 0){
            System.out.println("ERROR: Invalid entry!");
            return;
        }

        //local variables
        int iterator = n;
        int factorial = 1;

        //while loop
        while (iterator > 0){
            factorial *= iterator;
            iterator--;
        }

        System.out.printf("You have entered %d. %d! = %d\n", n, n, factorial);
    }

    //write a method that prints numbers up to n (a given number)
    public static void printPositiveNumbersToN(int n){
        if (n < 0){
            System.out.println("ERROR: Invalid entry!");
            return;
        }

        int counter = 0;

        while (counter != n + 1){
            System.out.println(counter);
            counter++;
        }
    }
}
