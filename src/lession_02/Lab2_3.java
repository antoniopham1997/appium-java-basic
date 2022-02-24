package lession_02;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Input your height (m):");
        double height = scanner.nextDouble();

        double BMI = weight / (height*2);

        if(BMI<=18.5) {
            System.out.println("Underweight, you should increase your weight to: " + (2*18.5*height));
        } if(BMI>18.5 && BMI<=24.9) {
            System.out.println("Normal weight, keep your weight!");
        } if(BMI>=24.9 && BMI<=29.9) {
            System.out.println("Overweight,you should decrease your weight to: " + (2*24.9*height));
        } if (BMI>29.9) {
            System.out.println("Obesity, you should decrease your weight to: " + (2*24.9*height));
        }

    }
}
