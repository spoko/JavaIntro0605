package staticdemo;

public class Car extends DriveCar { //extends FinalClass { we cannot extend Final Class
    //instance variable i.e. will be accessed using the instance i.e. object
    private String model;

    private static int counter;

    protected static final boolean FOUR_WHEEL_DRIVE;//constant value;
    protected final String FACTORY_NAME;//constant value;

    static {
        System.out.println("Executing static initializer...");
        FOUR_WHEEL_DRIVE = true;
    }

    public static int getCounter() {
        return counter;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (!model.isEmpty()){
            this.model = model;
        }else {
            System.out.println("ERROR: wrong input for model!");
        }
    }

    public Car(String model){
        System.out.println("Executing the constructor...");
        setModel(model);
        counter++;
        FACTORY_NAME = "VAG";
    }

    public final void driveForward(){
        System.out.println(this + " is moving forward.");
    }

    @Override
    public void flyForward() {
        System.out.println("Not ready yet");
    }
}
