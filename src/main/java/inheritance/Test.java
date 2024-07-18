package inheritance;

public class Test {
    public static void main(String[] args) {
        //AnnualOperations operations = new AnnualOperations();

        QualityAssurance ibro = new QualityAssurance("Ibro", "2010/01/01", 2000.00,
                true);

        Developer ivo = new Developer("Ivo", "2000/01/01", 2350, "Java");

        ibro.askQuestions();
        ibro.giveHelp();

        ivo.planTrainings();
        ivo.askQuestions();

        ibro.calculateAnnualBonus(true);
        ivo.calculateAnnualBonus(true);
        ivo.calculateAnnualBonus(true, 500.00);
    }
}
