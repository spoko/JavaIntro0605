package first.demo;

import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args) {
        //prints in the standard output i.e. the console
        System.out.println("Hello what`s your name?");

        //scanner variable from Scanner class which is used for reading stuff from the console
        Scanner scanner = new Scanner(System.in);

        //reading the whole line from the console as String
        String userName = scanner.nextLine();

        //prints...
        System.out.println("Hello " + userName + "! Nice to meet you!");

        //prints...
        System.out.println("What age are you?");

        //reading a number from the console
        int userAge = scanner.nextInt();

        //prints...
        System.out.println("What a wonderful age it is " + userAge + "!");
    }
}
