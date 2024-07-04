package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add(0, "Honda");

        //check available cars:
        System.out.println("Available cars are: " + cars);

        //"sell" cars:
        cars.remove("BMW");
        cars.remove(1);

        System.out.println("Cars left are: " + cars);
    }
}
