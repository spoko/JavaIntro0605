package inheritance;

public abstract class AnnualOperations {

    public void receivePositiveFeedback(){
        System.out.println("You did a great job! But there is not enough budget for a salary rise!");
    }

    public final void receiveNegativeFeedback(){
        System.out.println("You shall perform better in future!");
    }

    public abstract void calculateAnnualBonus(boolean isTargetAchieved);


}
