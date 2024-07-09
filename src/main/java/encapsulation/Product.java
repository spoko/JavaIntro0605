package encapsulation;

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: invalid input for product name");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0){
            this.price = price;
        }else {
            System.out.println("ERROR: Invalid entry for price!");
        }
    }

    public Product(String name, int price){
        setName(name);
        setPrice(price);
    }
}
