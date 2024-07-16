package access2;

import access.Product;

public class ProductExtended extends Product {

    //we cannot override final method
//    public void finalMethod(){
//        System.out.println("Changed");
//    }
    public static void main(String[] args) {
        ProductExtended product = new ProductExtended();

        product.publicName = "it`s public";
        product.publicMethod();

        product.protectedName = "because we`ve extended Product class";
        product.protectedMethod();
    }
}
