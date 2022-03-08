package lesson_06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myPassword = "password123";
        int attempt = 3;

        for (int i = 0; i < attempt; i++) {
            System.out.println("Please input your password: ");
            String inputPassword = scanner.next();
            if (inputPassword.equals(myPassword)) {
                System.out.println("Login successfully!");
                break;
            } else {
                System.out.println("Password is incorrect");
            }
        }
    }
}
