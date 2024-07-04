package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Plovdiv");
        cities.add(0,"Sofia");
        cities.add("Varna");

        System.out.printf("The cities are: %s and the total number of cities is: %d\n",
                cities, cities.size());
    }
}
