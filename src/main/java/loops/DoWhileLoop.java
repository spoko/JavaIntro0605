package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        int someNumber = 8;

        do{
            System.out.printf("Current number is: %d\n", someNumber);
            someNumber++;
        }while (someNumber >= 10);
    }
}
