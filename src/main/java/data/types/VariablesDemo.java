package data.types;

public class VariablesDemo {
    //Instance variables
    static String id;
    static int age2;
    public static void main(String[] args) {
        //local variables
        byte age = 20;
        int salary = 2000;
        String name = "Bai Ivan";

        System.out.println(age);
        System.out.println(id);
        System.out.println(age2);
    }

    public static void printHello(){
        //local variable
        String greeting = "Hello, ";
        System.out.println(greeting);
        System.out.println(id);
    }
}
