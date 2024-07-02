package oop;

public class Breed {
    private String breedName;
    private String characteristics;
    private String possibleIllnesses;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        if (!breedName.isEmpty()){
            this.breedName = breedName;
        }else {
            System.out.println("Error: invalid entry for breed name");
        }
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if (!breedName.isEmpty()){
            this.characteristics = characteristics;
        }else {
            System.out.println("Error: invalid entry for characteristics");
        }
    }

    public String getPossibleIllnesses() {
        return possibleIllnesses;
    }

    public void setPossibleIllnesses(String possibleIllnesses) {
        if (!possibleIllnesses.isEmpty()){
            this.possibleIllnesses = breedName;
        }else {
            System.out.println("Error: invalid entry for possible illnesses");
        }
    }

    //constructors
    public Breed(String breedName, String characteristics, String possibleIllnesses){
        setBreedName(breedName);
        setCharacteristics(characteristics);
        setPossibleIllnesses(possibleIllnesses);
    }

    //default constructor
//    public Breed(){
//
//    }
}
