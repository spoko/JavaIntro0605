package inheritance;

public class Developer extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (!programingLanguage.isEmpty()){
            this.programingLanguage = programingLanguage;
        }else {
            System.out.println("ERROR: invalid entry for programing language");
        }
    }

    public Developer(String name, String startDate, double salary, String programingLanguage) {
        super(name, startDate, salary);
        setProgramingLanguage(programingLanguage);
    }

    public void calculateAnnualBonus(boolean isTargetAchieved){
        if(isTargetAchieved){
            System.out.println("Bonus is 1000");
        }else {
            System.out.println("Bonus is a minimal one 100");
        }
    }

    //method overload i.e. compile time polymorphism
    public void calculateAnnualBonus(boolean isTargetAchieved, double baseBonus){
        if(isTargetAchieved){
            System.out.println("Bonus is 1000 + " + baseBonus);
        }else {
            System.out.println("Bonus is " + baseBonus);
        }
    }
}
