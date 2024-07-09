package oop;

public class Test {
    public static void main(String[] args) {
        Dog morti = new Dog();
        Breed frenchBulldog = new Breed("French Bulldog",
                "playful, snoring, farting, small, dull, stubborn",
                "Stomach illness, lower back issues");
        Address caneCorsoAddress = new Address("Bulgaria", "Razgrad", 7200,
                "Hristo Smirnenski 10");
        Address newTestAddress = new Address(caneCorsoAddress);
        newTestAddress.setLocation("different than cane corso location");

        morti.setWeight(3.56f);
        morti.setBreed(frenchBulldog);
        morti.setName("Morti");
        morti.setMale(true);
        morti.setWeight(12.00f);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        morti.setAddress(newTestAddress);
        morti.printDetails();
        System.out.println("----");
        dog1.setAddress(newTestAddress);
        dog1.printDetails();
        System.out.println("----");
        dog2.setAddress(newTestAddress);
        dog2.printDetails();

        //creating a new dog with constructors with parameters (type II)
        Breed caneCorso = new Breed("Cane Corso", "Big body, big ears", "none");

        newTestAddress.setLocation("different than cane corso location");

        Dog arni = new Dog("Anrni", 50f, caneCorso, true,  (byte) 8,
                caneCorsoAddress,true);

        System.out.println("----");
        arni.printDetails();
    }
}
