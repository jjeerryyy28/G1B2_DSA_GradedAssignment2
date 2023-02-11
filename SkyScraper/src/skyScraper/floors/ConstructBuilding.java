package skyScraper.floors;

import java.util.*;

/*
author: Prajwal Nikhar, Lovely Agrawal, Ashutosh Kesharwani, Manu Roy
 */
public class ConstructBuilding {

    public void calculateOrderOfConstruction(LinkedList<Integer> list, Queue<Integer> queue) {
        try {
            Queue<Integer> queue1 = new PriorityQueue<Integer>(Collections.reverseOrder());
            int day = 1;

            for (int floor : list) {
                if (floor < 0) {
                    throw new IllegalArgumentException("Floor size cannot be negative.");
                }
            }

            while (list.peek() != null) {
                if (list.getFirst() == queue.peek()) {

                    int top = queue.poll();
                    System.out.println();
                    System.out.print("Day: " + day + "\n" + top);
                    day++;
                    list.poll();
                    if (list.peek() == null) // to save the program from throwing null pointer exception
                        break;
                    while (queue1.peek() != null && queue1.peek() > list.peek()) {

                        System.out.print(" " + queue1.poll());
                        queue.poll();
                    }
                } else {
                    System.out.println();
                    System.out.print("Day: " + day + "\n");
                    day++;
                    queue1.add(list.poll());
                }
                continue;
            }
            if (queue1.peek() != null) {
                System.out.print(" ");
                while (queue1.peek() != null) {
                    System.out.print(queue1.poll() + " ");
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("An error has occurred: " + e.getMessage());
        }
    }
}