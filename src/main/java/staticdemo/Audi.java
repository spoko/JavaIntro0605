package staticdemo;

public class Audi extends Car{

    public Audi(String model) {
        super(model);
    }

    //we cannot override final method
//    public void driveForward(){
//        System.out.println("Audi is moving forward");
//    }
}
