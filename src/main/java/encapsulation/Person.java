package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: invalid input for person name");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money >= 0){
            this.money = money;
        }else {
            System.out.println("ERROR: Invalid entry for money!");
        }
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if (this.money >= product.getPrice()){
            bagOfProducts.add(product);// we are adding the product to the bag
            setMoney(this.money - product.getPrice());//we are paying
            System.out.printf("%s bought %s\n", this.name, product.getName());//printing to the console
        }else {
            System.out.printf("%s can't afford %s\n", name, product.getName());//printing to the console
        }
    }

    public void printItemsFromTheBag(){
        if (bagOfProducts.size() == 0){
            System.out.printf("%s Nothing bought\n", name);
            return;
        }

        String productNamesInTheBag = "";
        for (Product product : bagOfProducts){
            if (bagOfProducts.size() > 1){
                productNamesInTheBag += product.getName() + ", ";
            }else{
                productNamesInTheBag += product.getName();
            }
        }

        if(bagOfProducts.size() > 1){
            productNamesInTheBag = trimEnd(productNamesInTheBag);
        }

        System.out.printf("%s - %s\n", name, productNamesInTheBag);
    }

    //internal method
    private String trimEnd(String items){
        items = items.trim(); //remove the empty space at the end
        items = items.substring(0, items.length() - 1);//removes the last , of the string
        return items;
    }
}
