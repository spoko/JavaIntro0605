package oop;

public class Dog extends Pet{//Dog inherits from Pet because Dog IS A Pet
    //fields or instance variables
    private boolean hasTail;//specific characteristics for a Dog

    //constructor type I
    public Dog(){
        super();
        setWeight(1);
        setName("sharo");
        setMale(true);
        setAge((byte) 1);
    }

    public Dog(String name, float weight, Breed breed, boolean isMale, byte age,
               Address address, boolean hasTail){
        super(name, weight, breed, isMale, age, address);
        this.hasTail = hasTail;
    }

    //methods i.e. actions
    public void bark(){
        System.out.printf("%s is barking", getName());
    }

    //method override
    public void printDetails(){
        super.printDetails();
        System.out.printf(hasTail());
    }

    //internal method
    private String hasTail(){
        if (hasTail){
            return getName() + " has tail.";
        }else {
            return getName() + " doesn't have tail.";
        }
    }
}