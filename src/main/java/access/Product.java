package access;

public class Product {
    //can be accessed from anywhere
    public String publicName;

    //can be accessed from current class, outside class in the same package and subclass (child class) from different package
    protected String protectedName;

    //current class ot subclass withing the current package
    String defaultName;

    //only in the current class
    private String privateName;

    public final int finalInteger = 5;

    //only in the current class
    private void privateMethod(){
        System.out.println("Calling private method");
    }

    //current class ot subclass withing the current package
    void defaultMethod(){
        System.out.println("Calling default method");
    }

    //can be accessed from current class, outside class in the same package and subclass (child class) from different package
    protected void protectedMethod(){
        System.out.println("Calling protected method");
    }

    public void publicMethod(){
        System.out.println("Calling public method");
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.privateName = "we can change this only in the current class";
        System.out.println(product.privateName);//because we are in the current class

        product.privateMethod();
    }

    public final void finalMethod(){
        System.out.println("I cannot be changed");
    }
}
