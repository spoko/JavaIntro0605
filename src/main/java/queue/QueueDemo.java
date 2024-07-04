package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> cars = new LinkedList<>();

        cars.offer("BMW");
        cars.offer("Honda");
        cars.offer("Mercedes");
        cars.offer("Volvo");

        System.out.println(cars);

        System.out.println(cars.poll());
    }
}
