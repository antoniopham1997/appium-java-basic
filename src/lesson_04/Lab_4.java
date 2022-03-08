package lesson_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(-2);
        list.add(100);
        list.add(-20);
        list.add(-1);
        list.add(0);

        int minNumber = list.get(0);
        int maxNumber = list.get(0);

        for (int number : list) {
            if (number < minNumber) {
                minNumber = number;
            } if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("=====MENU======");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Find a number");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select any option below: ");
        int selectedNumber = scanner.nextInt();

        switch (selectedNumber) {
            case 1:
                System.out.println("Please input your number: ");
                int addedNumber = scanner.nextInt();
                list = addNumber(list, addedNumber);
                System.out.print("The new list is: " + list);
                break;
            case 2:
                System.out.print("Your list is: " + list);
                break;
            case 3:
                System.out.println("Min number is: " + minNumber);
                break;
            case 4:
                System.out.println("Max number is: " + maxNumber);
                break;
            case 5:
                System.out.println("Please input the number what you want to find: ");
                int findNumber = scanner.nextInt();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == findNumber) {
                        System.out.println("Number's index in list is: " + i);
                    }
                }
        }
    }

    private static ArrayList<Integer> addNumber(ArrayList<Integer> list, int addedNumber) {
        list.add(addedNumber);
        return list;
    }
}
