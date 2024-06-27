package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] numbers = {4, 2, 7, 6, 2, 8};
        int [] numbers2 = new int[10];

        String [] cities = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String [] cities2 = new String[10];

        //random access of the elements:
        System.out.println(numbers[3]);
        numbers2[3] = 222;
        System.out.println(numbers2[3]);

        System.out.println(cities[3]);//Burgas
        System.out.println(cities2[9]);//null

        System.out.println(cities);//All cities
        printAllStringArrayValues(cities);
        System.out.println("---------------");
        printAllStringArrayValues(cities2);
        System.out.println("---------------");
        printAllIntegerArrayValues(numbers);
    }

    public static void printAllStringArrayValues(String [] array){
        for (int i = 0; i < array.length; i++){
            System.out.printf("Current index is: %d. Value on that position is: %s\n", i, array[i]);
        }
    }

    public static void printAllIntegerArrayValues(int [] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.printf("Current index is: %d. Value on that position is: %d\n", i, array[i]);
//        }
        for (int element : array){
            System.out.printf("Current element is: %d\n", element);
        }
    }
}
