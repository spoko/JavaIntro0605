package data.types;

public class Test {
    public static void main(String[] args) {
        System.out.println(Dog.someCommonCharacteristic);//

        Dog.someCommonCharacteristic = "they are nice!";

        Dog frenchBulldog = new Dog();
        Dog dog2 = new Dog();
        frenchBulldog.name = "Morti";
        frenchBulldog.age = 3;
        frenchBulldog.isMale = true;

        System.out.println(frenchBulldog);
        System.out.println(frenchBulldog.name);
        System.out.println(frenchBulldog.age);
        System.out.println(frenchBulldog.isMale);
        System.out.println(frenchBulldog.someCommonCharacteristic);//they are nice

        System.out.println(dog2);
        System.out.println(dog2.name);
        System.out.println(dog2.someCommonCharacteristic);

        System.out.println("------------------");

        frenchBulldog.printDogDetails();
        dog2.printDogDetails();

    }
}
