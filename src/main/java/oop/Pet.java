package oop;

public class Pet {
    //fields or instance variables
    private String name;
    private Breed breed;//composition
    private float weight;
    private boolean isMale;
    private byte age;
    private Address address;//aggregation

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (!address.equals(null)){
            this.address = address;
        }else {
            System.out.println("ERROR: invalid entry for address!");
        }
    }

    //properties (special methods - setters and getters)
    public Breed getBreed() {
        return breed;
    }

    //we can have data validation in the setters
    public void setBreed(Breed breed) {
        if (!breed.equals(null)){
            this.breed = breed;
        }else {
            System.out.println("Error: Invalid entry for breed");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }else {
            System.out.println("Error: Invalid entry for weight");
        }

    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("Error: Invalid entry for age");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: Invalid entry for name");
        }
    }

    //methods i.e. actions
    public void eat(){
        System.out.printf("%s is eating", name);
    }

    public void sad(){
        System.out.printf("%s is sad", name);
    }

    public void poop(){
        System.out.printf("%s is pooping", name);
    }

    public void printDetails(){
        System.out.printf("Dog name is %s. it weights %.2f. It is %d year(s) old. The dog is %s. " +
                        "And the dog is located in %s\n",
                name, weight, age, getSex(), address.toString());
    }

    public void makeSomeNoise(){
        System.out.printf("%s is making some noise", name);
    }

    //method overloading
    public void makeSomeNoise(boolean isLoud){
        if (isLoud){
            System.out.printf("%s is making loud noises", name);
        }else {
            System.out.printf("%s is making some noise", name);
        }
    }

    //internal method
    private String getSex(){
        if (isMale){
            return "male";
        }else {
            return "female";
        }
    }

    //constructor type II
    public Pet(String name, float weight, Breed breed, boolean isMale, byte age, Address address){
        setName(name);
        setWeight(weight);
        setBreed(breed);
        setMale(isMale);
        setAge(age);
        setAddress(address);
    }
    public Pet(){

    }
}
