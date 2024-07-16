package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        product.publicMethod();
        product.publicName = "it`s public";
    }
}
