package oop;

public class Test {
    public static void main(String[] args) {
        Dog morti = new Dog();
        Breed frenchBulldog = new Breed("French Bulldog",
                "playful, snoring, farting, small, dull, stubborn",
                "Stomach illness, lower back issues");
        //frenchBulldog.setPossibleIllnesses("Stomach illness, lower back issues");
        //frenchBulldog.setBreedName("French Bulldog");
        //frenchBulldog.setCharacteristics("playful, snoring, farting, small, dull, stubborn");

        morti.setWeight(3.56f);
        morti.setBreed(frenchBulldog);
        morti.setName("Morti");
        morti.setMale(true);
        morti.setWeight(12.00f);

        morti.printDetails();
    }
}
