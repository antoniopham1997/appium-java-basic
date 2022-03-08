package lesson_05;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args) {
        System.out.println("=====MENU======");
        System.out.println("1. Input student info");
        System.out.println("2. Find Student by ID");
        System.out.println("0. Exit!");

        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int studentID;
        String studentName = null;
        HashMap<Integer, String> map = new HashMap<>();

        while (!isExit) {
            System.out.println("Please select any option below: ");
            int selectedNumber = scanner.nextInt();
            switch (selectedNumber) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    do {
                        System.out.println("Please input student ID: ");
                        studentID = scanner.nextInt();
                    } while (map.containsKey(studentID));
                    scanner.nextLine();
                    System.out.println("Please input student name: ");
                    studentName = scanner.nextLine();
                    map.put(studentID,studentName);
                    break;
                case 2:
                    System.out.println("Please input student ID you want to find: ");
                    studentID = scanner.nextInt();
                    if (map.equals(studentID)) {
                        System.out.println("Student name is: " + studentName);
                    }
                    break;
            }
        }
    }
}
