package data.types;

public class Dog {
    //Instance variables i.e. characteristics
    String name;
    byte age;
    boolean isMale;

    //Class variable or static variables
    static String someCommonCharacteristic;

    //methods i.e. actions
    void printDogDetails(){
        System.out.printf("The name of the dog is %s. The age is %d.\n", name, age);
    }
}
