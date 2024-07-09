package oop;

public class Cat extends Pet{
    public Cat(String name, float weight, Breed breed, boolean isMale, byte age, Address address) {
        super(name, weight, breed, isMale, age, address);
    }
    //fields or instance variables

    //methods i.e. actions
    public void meow(){
        System.out.printf("%s is meowing", getName());
    }
}
