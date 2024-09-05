package Task3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {12, 2231, 321, 43, 32};
        int[] result = new int[array.length];

        Scanner scanner = new Scanner(System.in);

        try {
            Integer rotateIndex = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < array.length; i++) {
                int j = i + rotateIndex;
                if (j > array.length - 1) {
                    j = j - array.length;
                }
                result[i] = array[j];
            }

            System.out.println("Rotated array: " + Arrays.toString(result));

            LinkedList<Integer> list = new LinkedList<>();
            for (int num : result) {
                list.add(num);
            }

            list.addFirst(5439);
            list.addLast(1237);
            list.removeFirst();
            list.removeLast();

            System.out.println("Reversed array: ");
            ListIterator<Integer> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                System.out.print(iterator.previous() + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer for the rotation index.");
        }
    }
}




//V10.
//Array Rotation: Write a Java program that takes an array of integers and rotates it by a given number of positions. Your program should prompt the user to enter the array size and the elements of the array, and then the number of positions to rotate the array. Finally, your program should output the rotated array.
//Make LinkedList from the result array and perform the following operations: a) Add an element to the beginning of the list; b) Add an element to the end of the list; c) Remove the first element from the list; d) Remove the last element from the list; e) Print the elements of the list in reverse order;
//Make up the situation for NumberFormatException. Catch it and display the explanation for your custom case.
