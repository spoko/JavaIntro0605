package enumsDemo;

public class Test {
    public static void main(String[] args) {
        printMonthOfTheYear(MonthsOfTheYear.JANUARY);
    }
    public static void printMonthOfTheYear(Enum<MonthsOfTheYear> mont){
        System.out.println("Current month is " + mont + ".");
    }
}
