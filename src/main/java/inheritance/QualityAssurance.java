package inheritance;

public class QualityAssurance extends Employee {
    private boolean isAutomation;

    public boolean isAutomation() {
        return isAutomation;
    }

    public void setAutomation(boolean automation) {
        isAutomation = automation;
    }

    public QualityAssurance(String name, String startDate, double salary, boolean isAutomation) {
        super(name, startDate, salary);
        setAutomation(isAutomation);
    }
}
