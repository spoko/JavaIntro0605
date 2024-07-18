package inheritance;

import inheritance.interfaces.JuniorActions;
import inheritance.interfaces.SeniorActions;

public class Employee extends AnnualOperations implements JuniorActions, SeniorActions {
    private String name;
    private String startDate;
    private double salary;

    private final double MINIMAL_SALARY = 933.00;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: invalid entry for name");
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        if (!startDate.isEmpty()){
            this.startDate = startDate;
        }else {
            System.out.println("ERROR: invalid entry for start date");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > MINIMAL_SALARY){
            this.salary = salary;
        }else {
            System.out.println("ERROR: invalid salary");
        }
    }

    public Employee(String name, String startDate, double salary){
        setName(name);
        setStartDate(startDate);
        setSalary(salary);
    }

    @Override
    public void calculateAnnualBonus(boolean isTargetAchieved) {
        if(isTargetAchieved){
            System.out.println("Bonus is 2000");
        }else {
            System.out.println("Bonus is 500");
        }
    }

    @Override
    public void askQuestions() {
        System.out.printf("%s is asking questions\n", name);
    }

    @Override
    public void takeTrainings() {
        System.out.printf("%s is taking a training\n", name);
    }

    @Override
    public void giveHelp() {
        System.out.printf("%s is helping\n", name);
    }

    @Override
    public void planTrainings() {
        System.out.printf("%s is planing trainings\n", name);
    }

    @Override
    public void giveFeedback() {
        System.out.printf("%s is giving feedback\n", name);
    }
}
