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
}
