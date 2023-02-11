package skyScraper.driver;

import skyScraper.floors.ConstructBuilding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Driver {

    public static void main(String[] args) {

        ConstructBuilding skyConstruction = new ConstructBuilding();
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;

            System.out.print("Enter total no of floors in the building: ");
            int floors = scanner.nextInt();
            System.out.println();
            LinkedList<Integer> list = new LinkedList<Integer>();
            Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            for (i = 1; i <= floors; i++) {

                System.out.print("Enter floor size of day " + i + ": ");
                list.add(scanner.nextInt());
            }
            for (i = 0; i < floors; i++) {

                queue.add(list.get(i));
            }

            System.out.println("The order of construction is as follows:");
            skyConstruction.calculateOrderOfConstruction(list, queue);
            scanner.close();
        }
    }
}