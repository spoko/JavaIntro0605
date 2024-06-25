package operators;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        printUserDetails(-1);
        printUserDetails(0);
        printUserDetails(2);
        printUserDetails(3);
        printUserDetails(12);
        printUserDetails(13);
        printUserDetails(19);
        printUserDetails(20);
        printUserDetails(65);
        printUserDetails(66);
        printUserDetails(130);
        printUserDetails(131);

        printDayOfTheWeek(2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int enteredAge = scanner.nextInt();
        printUserDetails(enteredAge);

    }

    public static void printUserDetails(int age){
        //0 - 2 baby
        //3 - 12 kid
        //13 - 19 teenager
        //20 - 65 adult
        //66 - 130 retired

        if (age < 0){
            System.out.println("ERROR: Invalid entry for age.");
            return;//this will stop execution of the following statements
        }

        if (age >= 0 && age <= 2){
            System.out.printf("Entered age was %d. That age correspond to baby.\n", age);
        } else if (age >= 3 && age <=12) {
            System.out.printf("Entered age was %d. That age correspond to kid.\n", age);
        } else if (age >= 13 && age <= 19) {
            System.out.printf("Entered age was %d. That age correspond to teenager.\n", age);
        } else if (age >= 20 && age <= 65) {
            System.out.printf("Entered age was %d. That age correspond to adult.\n", age);
        } else if (age >= 66 && age <= 130) {
            System.out.printf("Entered age was %d. That age correspond to retired.\n", age);
        } else {
            System.out.println("Vampire!!!");
        }
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 1:
                System.out.printf("The entered value was %d. The selected day is Monday\n", day);
                break;
            case 2:
                System.out.printf("The entered value was %d. The selected day is Tuesday\n", day);
                break;
            case 3:
                System.out.printf("The entered value was %d. The selected day is Wednesday\n", day);
                break;
            case 4:
                System.out.printf("The entered value was %d. The selected day is Thursday\n", day);
                break;
            case 5:
                System.out.printf("The entered value was %d. The selected day is Friday\n", day);
                break;
            case 6:
                System.out.printf("The entered value was %d. The selected day is Saturday\n", day);
                break;
            case 7:
                System.out.printf("The entered value was %d. The selected day is Sunday\n", day);
                break;
            default:
                System.out.printf("Entered %d. Invalid selection\n", day);
        }
    }
}
