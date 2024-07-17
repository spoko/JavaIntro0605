package staticdemo;

public class Test {
    public static void main(String[] args) {
        //Car.counter = 10;//we can access static variable even without an object from the class

        //before we create a car
        System.out.println("Cars build: " + Car.getCounter());
        Car tesla = new Car("Model S");
        //tesla.counter = 20;
        System.out.println("Cars build: " + Car.getCounter());

        Car tesla2 = new Car("Model Y");
        //tesla2.counter = 30;
        System.out.println("Cars build: " + Car.getCounter());

        System.out.println(tesla.getModel());
        System.out.println(tesla2.getModel());

        //System.out.println(tesla.getCounter());//30
        //System.out.println(tesla2.getCounter());//30
        //System.out.println(Car.getCounter());//30
    }
}
