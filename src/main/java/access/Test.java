package access;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        product.publicName = "it`s public";
        product.protectedName = "same package";
        product.defaultName = "same package";
        System.out.println(product.publicName);

        product.publicMethod();
        product.protectedMethod();
        product.defaultMethod();

        //we cannot change this since it is final i.e. not changeable
        //product.finalInteger = 6;
    }
}
