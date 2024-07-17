package inheritance;

public class Employee {
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
}
